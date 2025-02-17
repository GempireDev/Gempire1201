package com.gempire.entities.ai;

import com.gempire.entities.bases.EntityGem;
import com.gempire.entities.gems.EntityTourmaline;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;
import net.minecraft.world.phys.Vec3;

import java.util.List;

public class EntityAITameGem extends Goal {
    public EntityGem follower;
    public double speed;
    EntityGem gemToTame;
    public EntityAITameGem(EntityGem entityIn, double speedIn) {
        this.follower = entityIn;
        this.speed = speedIn;
    }

    @Override
    public boolean canUse() {
        List<EntityGem> list = this.follower.level().getEntitiesOfClass(EntityGem.class, this.follower.getBoundingBox().inflate(30.0D, 15.0D, 30.0D));
        if (follower.getOwned()) {
            if (gemToTame == null || !gemToTame.getOwned()) {
                for (EntityGem entity : list) {
                        if (!entity.getOwned()) {
                            gemToTame = entity;
                        }
                }
            }
        }
        double maxDistance = Double.MAX_VALUE;
        double newDistance = this.follower.distanceToSqr(gemToTame.getX(), gemToTame.getY(), gemToTame.getZ());
        if (newDistance <= maxDistance) {
            maxDistance = newDistance;
        }
        return this.gemToTame != null && this.follower.getMovementType() == 4 && !gemToTame.getOwned();
    }

    @Override
    public boolean canContinueToUse() {
        return this.gemToTame != null && !this.follower.getNavigation().isDone() &&
                this.follower.distanceToSqr(gemToTame.getX(), gemToTame.getY(), gemToTame.getZ()) > Math.pow(4, 2) && this.follower.getMovementType() == 4;
    }

    @Override
    public void start(){
        follower.getNavigation().moveTo(gemToTame, 1);
        follower.lookAt(gemToTame,90F,90F);
        if (follower.distanceToSqr(gemToTame) < Math.pow(2, 1)) {
            if (follower.getRebelled() && !gemToTame.getRebelled())
            {
                gemToTame.rebel();
                gemToTame = null;
            }
            else if (!gemToTame.getRebelled())
            {
                gemToTame.OWNERS.addAll(follower.OWNERS);
                gemToTame.playSound(gemToTame.getInstrument());
                follower.playSound(follower.getInstrument());
                gemToTame = null;
            }
        }
        super.start();
    }

    @Override
    public void stop() {
        this.gemToTame = null;
        this.follower.getNavigation().stop();
        this.follower.setPathfindingMalus(BlockPathTypes.WATER, 0);
    }
}