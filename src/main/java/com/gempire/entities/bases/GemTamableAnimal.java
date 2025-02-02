package com.gempire.entities.bases;

import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;

public abstract class GemTamableAnimal extends Animal implements GemOwnableEntity {
    protected static final EntityDataAccessor<Byte> DATA_FLAGS_ID = SynchedEntityData.defineId(GemTamableAnimal.class, EntityDataSerializers.BYTE);
    protected static final EntityDataAccessor<Integer> DATA_OWNER_ID = SynchedEntityData.defineId(GemTamableAnimal.class, EntityDataSerializers.INT);
    private boolean orderedToSit;

    protected GemTamableAnimal(EntityType<? extends GemTamableAnimal> p_21803_, Level p_21804_) {
        super(p_21803_, p_21804_);
        this.reassessTameGoals();
    }

    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(DATA_FLAGS_ID, (byte)0);
        this.entityData.define(DATA_OWNER_ID, 0);
    }

    public void addAdditionalSaveData(CompoundTag p_21819_) {
        super.addAdditionalSaveData(p_21819_);
        p_21819_.putInt("Owner", this.getOwnerID());

        p_21819_.putBoolean("Sitting", this.orderedToSit);
    }

    public void readAdditionalSaveData(CompoundTag p_21815_) {
        super.readAdditionalSaveData(p_21815_);
        int id = p_21815_.getInt("Owner");
        try {
            this.setOwnerID(id);
            this.setTame(true);
        } catch (Throwable throwable) {
            this.setTame(false);
        }

        this.orderedToSit = p_21815_.getBoolean("Sitting");
        this.setInSittingPose(this.orderedToSit);
    }

    public boolean canBeLeashed(Player p_21813_) {
        return !this.isLeashed();
    }

    protected void spawnTamingParticles(boolean p_21835_) {
        ParticleOptions particleoptions = ParticleTypes.HEART;
        if (!p_21835_) {
            particleoptions = ParticleTypes.SMOKE;
        }

        for(int i = 0; i < 7; ++i) {
            double d0 = this.random.nextGaussian() * 0.02D;
            double d1 = this.random.nextGaussian() * 0.02D;
            double d2 = this.random.nextGaussian() * 0.02D;
            this.level().addParticle(particleoptions, this.getRandomX(1.0D), this.getRandomY() + 0.5D, this.getRandomZ(1.0D), d0, d1, d2);
        }

    }

    public void handleEntityEvent(byte p_21807_) {
        if (p_21807_ == 7) {
            this.spawnTamingParticles(true);
        } else if (p_21807_ == 6) {
            this.spawnTamingParticles(false);
        } else {
            super.handleEntityEvent(p_21807_);
        }

    }

    public boolean isTame() {
        return (this.entityData.get(DATA_FLAGS_ID) & 4) != 0;
    }

    public void setTame(boolean p_21836_) {
        byte b0 = this.entityData.get(DATA_FLAGS_ID);
        if (p_21836_) {
            this.entityData.set(DATA_FLAGS_ID, (byte)(b0 | 4));
        } else {
            this.entityData.set(DATA_FLAGS_ID, (byte)(b0 & -5));
        }

        this.reassessTameGoals();
    }

    protected void reassessTameGoals() {
    }

    public boolean isInSittingPose() {
        return (this.entityData.get(DATA_FLAGS_ID) & 1) != 0;
    }

    public void setInSittingPose(boolean p_21838_) {
        byte b0 = this.entityData.get(DATA_FLAGS_ID);
        if (p_21838_) {
            this.entityData.set(DATA_FLAGS_ID, (byte)(b0 | 1));
        } else {
            this.entityData.set(DATA_FLAGS_ID, (byte)(b0 & -2));
        }

    }

    @Nullable
    public int getOwnerID() {
        return this.entityData.get(DATA_OWNER_ID);
    }

    public void setOwnerID(int p_21817_) {
        this.entityData.set(DATA_OWNER_ID, p_21817_);
    }

    public void tame(EntityGem p_21829_) {
        this.setTame(true);
        this.setOwnerID(p_21829_.getGemID());
    }

    public boolean canAttack(LivingEntity p_21822_) {
        return this.isOwnedBy(p_21822_) ? false : super.canAttack(p_21822_);
    }

    public boolean isOwnedBy(LivingEntity entity) {
        if (entity instanceof EntityGem) return ((EntityGem) entity).getGemID() == this.getOwnerID();
        else return false;
    }

    public boolean wantsToAttack(LivingEntity p_21810_, LivingEntity p_21811_) {
        return true;
    }

    public void die(DamageSource p_21809_) {
        // FORGE: Super moved to top so that death message would be cancelled properly
        super.die(p_21809_);
    }

    public boolean isOrderedToSit() {
        return this.orderedToSit;
    }

    public void setOrderedToSit(boolean p_21840_) {
        this.orderedToSit = p_21840_;
    }
}
