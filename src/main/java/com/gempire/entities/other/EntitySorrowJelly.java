package com.gempire.entities.other;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Mth;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.animal.Squid;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.constant.DefaultAnimations;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.util.GeckoLibUtil;

import java.util.Random;

public class EntitySorrowJelly extends WaterAnimal implements GeoEntity {

    private float tx;
    private float ty;
    private float tz;
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

    public static final EntityDataAccessor<Float> SCALE = SynchedEntityData.defineId(EntitySorrowJelly.class, EntityDataSerializers.FLOAT);

    public EntitySorrowJelly(EntityType<? extends WaterAnimal> p_33002_, Level p_33003_) {
        super(p_33002_, p_33003_);
        this.entityData.define(EntitySorrowJelly.SCALE, .75f);
    }

    public float getScale(){
        return this.entityData.get(EntitySorrowJelly.SCALE);
    }

    public void setScale(float value){
        this.entityData.set(EntitySorrowJelly.SCALE, value);
    }

    public float generateScale() {
        Random r = new Random();
        return .75f + (r.nextFloat(.5F) - 0.25f);
    }

    @Nullable
    @Override
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor accessor, DifficultyInstance instance, MobSpawnType type, @Nullable SpawnGroupData data, @Nullable CompoundTag tag) {
        setScale(generateScale());
        System.out.println("scale "+getScale());
        return super.finalizeSpawn(accessor, instance, type, data, tag);
    }

    @Override
    public void load(CompoundTag tag) {
        setScale(tag.getFloat("scale"));
        super.load(tag);
    }

    @Override
    public void addAdditionalSaveData(CompoundTag tag) {
        tag.putFloat("scale", getScale());
        super.addAdditionalSaveData(tag);
    }

    public static AttributeSupplier.Builder registerAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 15.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.3D)
                .add(Attributes.ATTACK_DAMAGE, 2.0D)
                .add(Attributes.ATTACK_SPEED, 1.0D);
    }

    public void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(5, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.2D));
        this.goalSelector.addGoal(3, new JellyRandomMovementGoal(this));
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar registrar) {
        registrar.add(DefaultAnimations.genericSwimIdleController(this));
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }

    @Override
    public void tick() {
        if (this.isEyeInFluid(FluidTags.WATER)) {
            this.setDeltaMovement(this.getDeltaMovement().add(0.0, 0.002, 0.0));
            if (!this.level().isClientSide) {
                this.setDeltaMovement((double)(this.tx * 1), (double)(this.ty *1), (double)(this.tz * 1));
            }
        } else {
            this.hurt(this.damageSources().drown(), 1);
        }
        super.tick();
    }

    public void setMovementVector(float p_29959_, float p_29960_, float p_29961_) {
        this.tx = p_29959_;
        this.ty = p_29960_;
        this.tz = p_29961_;
    }

    public boolean hasMovementVector() {
        return this.tx != 0.0F || this.ty != 0.0F || this.tz != 0.0F;
    }

    class JellyRandomMovementGoal extends Goal {
        private final EntitySorrowJelly jelly;

        public JellyRandomMovementGoal(EntitySorrowJelly p_30004_) {
            this.jelly = p_30004_;
        }

        public boolean canUse() {
            return true;
        }

        public void tick() {
            int $$0 = this.jelly.getNoActionTime();
            if ($$0 > 100) {
                this.jelly.setMovementVector(0.0F, 0.0F, 0.0F);
            } else if (this.jelly.getRandom().nextInt(reducedTickDelay(50)) == 0 || !this.jelly.wasTouchingWater || !this.jelly.hasMovementVector()) {
                float $$1 = this.jelly.getRandom().nextFloat() * 6.2831855F;
                float $$2 = Mth.cos($$1) * 0.2F;
                float $$3 = -0.1F + this.jelly.getRandom().nextFloat() * 0.2F;
                float $$4 = Mth.sin($$1) * 0.2F;
                this.jelly.setMovementVector($$2, $$3, $$4);
            }

        }
    }
}
