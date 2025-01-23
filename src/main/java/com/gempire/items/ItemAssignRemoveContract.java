package com.gempire.items;

import com.gempire.entities.bases.EntityGem;
import net.minecraft.ChatFormatting;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;
import java.util.UUID;

public class ItemAssignRemoveContract extends Item {
    public ItemAssignRemoveContract(Properties properties) {
        super(properties);
    }

    public void execute(ItemStack itemStack, Player player, LivingEntity entity)
    {
        {
            ((EntityGem) entity).ASSIGNED_ID = UUID.fromString("00000000-0000-0000-0000-000000000000");
            ((EntityGem) entity).setAssigned(false);
            ((EntityGem) entity).setAssignedGem(null);
            ((EntityGem) entity).setAssignedUtil(null, null, null);
            player.sendSystemMessage(Component.translatable("Removed assignment status from ").append(entity.getName()));
        }
    }

    public InteractionResult interactLivingEntity(ItemStack itemStack, Player player, LivingEntity entity, InteractionHand hand) {
        if ((entity instanceof EntityGem)) {
            if (((EntityGem) entity).getOwned()) {
                if (!entity.level().isClientSide && entity.isAlive()) {
                    if (((EntityGem) entity).OWNERS.contains(player.getUUID())) {
                        execute(itemStack, player, entity);
                    } else {
                        player.sendSystemMessage(Component.translatable("Not Owner"));
                    }
                }
            }
            return InteractionResult.sidedSuccess(player.level().isClientSide);
        } else {
            return InteractionResult.PASS;
        }
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        if (!world.isClientSide) {
            if (player.isCrouching()) {
                ItemStack itemStack = player.getItemInHand(hand);
                player.sendSystemMessage(Component.translatable("Cleared Gem"));
            }
        }
        return super.use(world, player, hand);
    }
}
