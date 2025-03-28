package com.gempire.commands.impl;

import com.gempire.commands.CommandBase;
import com.gempire.entities.bases.EntityGem;
import com.mojang.brigadier.Command;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.commands.arguments.ResourceLocationArgument;
//import net.minecraft.commands.arguments.ResourceOrTagKeyArgument;
import net.minecraft.commands.arguments.ResourceOrTagKeyArgument;
import net.minecraft.commands.synchronization.SuggestionProviders;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.phys.AABB;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.UUID;

public class CommandGempireLocateBiome extends CommandBase {
    public static final SimpleCommandExceptionType FAILED_EXCEPTION = new SimpleCommandExceptionType(Component.translatable("commands.gempire.nounderstand"));

    private static final DynamicCommandExceptionType ERROR_BIOME_INVALID = new DynamicCommandExceptionType((p_207534_) -> {
        return Component.translatable("commands.gempire.nounderstand", p_207534_);
    });

    public CommandGempireLocateBiome(String name, int permissionLevel, boolean enabled) {
        super(name, permissionLevel, enabled);
    }

    @Override
    public LiteralArgumentBuilder<CommandSourceStack> setExecution() {
        this.builder = this.builder.then(Commands.argument("biome", ResourceOrTagKeyArgument.resourceOrTagKey(Registries.BIOME)).executes(source -> execute(source.getSource(), ResourceOrTagKeyArgument.getResourceOrTagKey(source, "biome", Registries.BIOME, ERROR_BIOME_INVALID))));
        return this.builder;
    }

    public int execute(CommandSourceStack source, ResourceOrTagKeyArgument.Result<Biome> biome) throws CommandSyntaxException {
        BlockPos pos = new BlockPos((int) source.getPosition().x, (int) source.getPosition().y, (int) source.getPosition().z);
        AABB aabb = source.getPlayerOrException().getBoundingBox().inflate(12.0D);
        EntityGem nephrite = null;
        List<EntityGem> gems = source.getLevel().getEntitiesOfClass(EntityGem.class, aabb);
        for(EntityGem gem : gems){
            if(gem.canLocateStructures()){
                if(gem.isOwner(source.getPlayerOrException())){
                    if(!gem.isOnStructureCooldown()){
                        nephrite = gem;
                    } else {
                        source.getPlayerOrException().sendSystemMessage(Component.translatable("She's too tired!"));
                    }
                }
            }
        }
        if(nephrite != null){
            nephrite.runFindCommand(source, source.getPlayerOrException(), null, biome, true);
            return Command.SINGLE_SUCCESS;
        }
        else{
            source.getPlayerOrException().sendSystemMessage(Component.translatable("commands.gempire.nounderstand"));
            throw CommandGempireLocateBiome.FAILED_EXCEPTION.create();
        }
    }
}
