package com.gempire.blocks;

import com.gempire.entities.bases.EntityGem;
import com.gempire.events.GemFormEvent;
import com.gempire.init.ModBlocks;
import com.gempire.init.ModEntities;
import com.gempire.items.ItemGem;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.registries.RegistryObject;

public class EssenceBlock extends LiquidBlock {
    public EssenceBlock(RegistryObject<FlowingFluid> p_54694_, Properties p_54695_) {
        super(p_54694_, p_54695_);
    }

    int timer = 0;

    public boolean readData(CompoundTag compound, boolean sludge) {
        String[] strings = compound.getString("crackShatter").split(",");
        if (!sludge) return Boolean.parseBoolean(strings[0]);
        return Integer.parseInt(strings[3]) >= 5;
    }

    public void writeData(CompoundTag compound, boolean sludge) {
        String[] strings = compound.getString("crackShatter").split(",");
        String string = strings[0] + "," + strings[1] + "," + strings[2] + "," + 0 + "," + strings[4];
        if (!sludge)  string = false + "," + strings[1] + "," + strings[2] + "," + strings[3] + "," + strings[4];
        compound.putString("crackShatter", string);
    }

    @Override
    public void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) {
        if (entity instanceof ItemEntity) {
            if ((((ItemEntity) entity).getItem()).getItem() instanceof ItemGem) {
                if (state.getBlock() == ModBlocks.PINK_ESSENCE_BLOCK.get()) {
                    ItemGem itemGem = (ItemGem) (((ItemEntity) entity).getItem()).getItem();
                    ItemStack stack = ((ItemEntity) entity).getItem();
                    if ((itemGem).checkTags(stack)) {
                        if (readData(stack.getTag(), false)) {
                            writeData(stack.getTag(), false);
                        }
                    }
                } else if (state.getBlock() == ModBlocks.WHITE_ESSENCE_BLOCK.get()) {
                    ItemGem itemGem = (ItemGem) (((ItemEntity) entity).getItem()).getItem();
                    ItemStack stack = ((ItemEntity) entity).getItem();
                    if ((itemGem).checkTags(stack)) {
                        if (readData(stack.getTag(), true)) {
                            writeData(stack.getTag(), true);
                        }
                    }
                }
            } else if ((((ItemEntity) entity).getItem()).getItem() == Items.STONE_BUTTON&& state.getBlock() != ModBlocks.WHITE_ESSENCE_BLOCK.get()) {
                if (!level.isClientSide) {
                    if (timer == 60) {
                        EntityGem gem = ModEntities.PEBBLE.get().create(level);
                        if (state.getBlock() == ModBlocks.BLUE_ESSENCE_BLOCK.get()) gem = ModEntities.SHALE.get().create(level);
                        if (state.getBlock() == ModBlocks.YELLOW_ESSENCE_BLOCK.get()) gem = ModEntities.MICA.get().create(level);
                        gem.finalizeSpawn((ServerLevelAccessor) level, level.getCurrentDifficultyAt(entity.blockPosition()), MobSpawnType.TRIGGERED, null, null);
                        gem.setMovementType((byte) 2);
                        gem.setPos(pos.getX() + 0.5, pos.getY() + 1.0, pos.getZ() + 0.5);
                        gem.setHealth(gem.getMaxHealth());
                        gem.GUARD_POS = gem.getOnPos().above();
                        gem.clearFire();
                        gem.removeAllEffects();
                        gem.setDeltaMovement(0, 0, 0);
                        gem.fallDistance = 0;
                        GemFormEvent event = new GemFormEvent(gem, gem.blockPosition());
                        MinecraftForge.EVENT_BUS.post(event);
                        level.addFreshEntity(gem);
                        System.out.println(gem.getGemPlacementE());
                        System.out.println(gem.getOutfitVariant() + " and " + gem.getInsigniaVariant());
                        entity.remove(Entity.RemovalReason.DISCARDED);
                        if (gem.getRandom().nextInt(9) == 0) {
                            level.setBlockAndUpdate(pos, Blocks.AIR.defaultBlockState());
                        }
                        timer = 0;
                    } else {
                        timer++;
                    }
                }
            } else if ((((ItemEntity) entity).getItem()).getItem() == Items.NAUTILUS_SHELL && state.getBlock() == ModBlocks.WHITE_ESSENCE_BLOCK.get()) {
                if (!level.isClientSide) {
                    if (timer == 60) {
                        EntityGem gem = ModEntities.NACRE.get().create(level);
                        gem.finalizeSpawn((ServerLevelAccessor) level, level.getCurrentDifficultyAt(entity.blockPosition()), MobSpawnType.TRIGGERED, null, null);
                        gem.setMovementType((byte) 2);
                        gem.setPos(pos.getX() + 0.5, pos.getY() + 1.0, pos.getZ() + 0.5);
                        gem.setHealth(gem.getMaxHealth());
                        gem.GUARD_POS = gem.getOnPos().above();
                        gem.clearFire();
                        gem.removeAllEffects();
                        gem.setDeltaMovement(0, 0, 0);
                        gem.fallDistance = 0;
                        GemFormEvent event = new GemFormEvent(gem, gem.blockPosition());
                        MinecraftForge.EVENT_BUS.post(event);
                        level.addFreshEntity(gem);
                        System.out.println(gem.getGemPlacementE());
                        System.out.println(gem.getOutfitVariant() + " and " + gem.getInsigniaVariant());
                        entity.remove(Entity.RemovalReason.DISCARDED);
                        if (gem.getRandom().nextInt(9) == 0) {
                            level.setBlockAndUpdate(pos, Blocks.AIR.defaultBlockState());
                        }
                        timer = 0;
                    } else {
                        timer++;
                    }
                }
            }
        }
        super.entityInside(state, level, pos, entity);
    }
}
