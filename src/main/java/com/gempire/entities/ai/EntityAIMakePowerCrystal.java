package com.gempire.entities.ai;

import com.gempire.entities.gems.starter.EntityMica;
import com.gempire.entities.gems.starter.EntityPebble;
import com.gempire.init.ModBlocks;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.AbstractGlassBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Explosion;

public class EntityAIMakePowerCrystal extends Goal {
    public EntityMica follower;
    public BlockPos target;
    public double speed;

    public EntityAIMakePowerCrystal(EntityMica entityIn, double speedIn) {
        this.follower = entityIn;
        this.speed = speedIn;
    }

    @Override
    public boolean canUse() {
        if (follower.getItemBySlot(EquipmentSlot.MAINHAND).getItem() instanceof PickaxeItem) {
            BlockPos hopper = BlockPos.ZERO;
            boolean found = false;
            for (int x = -4; x < 5; x++) {
                for (int y = -2; y < 3; y++) {
                    for (int z = -4; z < 5; z++) {
                        if (!found) {
                            if (this.follower.level().getBlockState(this.follower.blockPosition().offset(x, y, z)).getBlock() == Blocks.REDSTONE_BLOCK) {
                                hopper = this.follower.blockPosition().offset(x, y, z);
                                found = true;
                            }
                        }
                    }
                }
            }
            if (found) {
                double maxDistance = Double.MAX_VALUE;
                double newDistance = this.follower.distanceToSqr(hopper.getX(), hopper.getY(), hopper.getZ());
                if (newDistance <= maxDistance) {
                    maxDistance = newDistance;
                    this.target = hopper;
                }
            }
        }
        return this.target != null && this.target != BlockPos.ZERO && follower.getItemBySlot(EquipmentSlot.MAINHAND).getItem() instanceof PickaxeItem;
    }

    @Override
    public boolean canContinueToUse() {
        return this.target != null && !this.follower.getNavigation().isDone() &&
                this.follower.distanceToSqr(target.getX(), target.getY(), target.getZ()) > Math.pow(4, 2) && follower.getItemBySlot(EquipmentSlot.MAINHAND).getItem() instanceof PickaxeItem;
    }

    @Override
    public void start(){
        super.start();
        this.follower.setPathfindingMalus(BlockPathTypes.WATER, 0);
        this.follower.getNavigation().moveTo(target.getX(), target.getY(), target.getZ(), this.speed);
        double distanceToTargetSqr = this.follower.distanceToSqr(target.getX(), target.getY(), target.getZ());
        if (distanceToTargetSqr < 4) {
            BlockState targetBlockState = this.follower.level().getBlockState(this.target);
            if (targetBlockState.getBlock() == Blocks.REDSTONE_BLOCK &&
                    this.follower.level().getBlockState(this.target.north()).getBlock() instanceof AbstractGlassBlock &&
                    this.follower.level().getBlockState(this.target.south()).getBlock() instanceof AbstractGlassBlock &&
                    this.follower.level().getBlockState(this.target.west()).getBlock() instanceof AbstractGlassBlock &&
                    this.follower.level().getBlockState(this.target.east()).getBlock() instanceof AbstractGlassBlock) {
                this.follower.level().explode(null, this.target.getX(), this.target.getY(), this.target.getZ(), .75f, Level.ExplosionInteraction.NONE);
                this.follower.level().setBlockAndUpdate(this.target, ModBlocks.POWER_CRYSTAL_BLOCK.get().defaultBlockState());
                this.follower.level().setBlockAndUpdate(this.target.north(), Blocks.AIR.defaultBlockState());
                this.follower.level().setBlockAndUpdate(this.target.south(), Blocks.AIR.defaultBlockState());
                this.follower.level().setBlockAndUpdate(this.target.west(), Blocks.AIR.defaultBlockState());
                this.follower.level().setBlockAndUpdate(this.target.east(), Blocks.AIR.defaultBlockState());
                follower.getItemBySlot(EquipmentSlot.MAINHAND).hurtAndBreak(1, follower, (p_43296_) -> p_43296_.broadcastBreakEvent(EquipmentSlot.MAINHAND));
            }
        }
    }

    @Override
    public void stop() {
        this.target = null;
        this.follower.getNavigation().stop();
        this.follower.setPathfindingMalus(BlockPathTypes.WATER, 0);
    }
}
