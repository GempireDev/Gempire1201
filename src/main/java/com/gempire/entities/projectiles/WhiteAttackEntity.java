package com.gempire.entities.projectiles;

import com.gempire.init.ModEffects;
import com.gempire.init.ModEntities;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractHurtingProjectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;

public class WhiteAttackEntity extends AbstractHurtingProjectile {
    public int tick = 0;
    public WhiteAttackEntity(EntityType<? extends WhiteAttackEntity> entity, Level world) {
        super(entity, world);
    }

    public WhiteAttackEntity(Level p_36903_, LivingEntity p_36904_) {
        super(ModEntities.WHITE_ATTACK.get(), p_36903_);
        this.setOwner(p_36904_);
    }

    protected void onHit(HitResult result) {
        super.onHit(result);
                /*
                AreaEffectCloud areaeffectcloud = new AreaEffectCloud(this.level(), this.getX(), this.getY(), this.getZ());
                Entity entity = this.getOwner();
                if (entity instanceof LivingEntity) {
                    areaeffectcloud.setOwner((LivingEntity)entity);
                }

                areaeffectcloud.setParticle(ParticleTypes.DRAGON_BREATH);
                areaeffectcloud.setRadius(3.0F);
                areaeffectcloud.setDuration(600);
                areaeffectcloud.setRadiusPerTick((7.0F - areaeffectcloud.getRadius()) / (float)areaeffectcloud.getDuration());
                areaeffectcloud.addEffect(new MobEffectInstance(MobEffects.HARM, 1, 1));


                this.level().levelEvent(2006, this.blockPosition(), this.isSilent() ? -1 : 1);
                this.level().addFreshEntity(areaeffectcloud);
                */

        /*
                LifeReturnOrb acidSpit = new LifeReturnOrb(this.level(), (LivingEntity) this.getOwner());
                acidSpit.setPos(this.getX(), this.getY() + 2, this.getZ());
                if (result instanceof EntityHitResult) {
                    System.out.println("entity hit");
                    acidSpit.healing = true;
                    ((EntityHitResult) result).getEntity().hurt(this.damageSources().mobAttack((LivingEntity) this.getOwner()), 8);
                }
                double d4 = this.getOwner().getEyeY() - (double) 1.1F;
                double d1 = this.getOwner().getX() - this.getX();
                double d2 = d4 - acidSpit.getY();
                double d3 = this.getOwner().getZ() - this.getZ();
                float f = Mth.sqrt((float) (d1 * d1 + d3 * d3)) * 0.2F;
                acidSpit.shoot(d1, d2 + (double) f, d3, 1.6F, 6.0F);
                this.level().addFreshEntity(acidSpit);
                System.out.println("life return");


         */
        if (result instanceof EntityHitResult) {
            ((EntityHitResult) result).getEntity().hurt(this.damageSources().mobAttack((LivingEntity) this.getOwner()), 2);
            ((EntityHitResult) result).getEntity().hurt(((EntityHitResult) result).getEntity().damageSources().magic(), 2.0F);
            if (((EntityHitResult) result).getEntity() instanceof LivingEntity) {
                LivingEntity entity = (LivingEntity) ((EntityHitResult) result).getEntity();
                if (!entity.hasEffect(ModEffects.SHADE.get())) {
                    entity.addEffect(new MobEffectInstance(ModEffects.BLINDING_LIGHT.get(), 50, 0));
                }
            }
        }
        this.discard();
    }

    public boolean isPickable() {
        return false;
    }

    @Override
    public void tick() {
        super.tick();
        if (!this.level().isClientSide) tick++;
        if (this.getDeltaMovement().equals(new Vec3(0, 0, 0)) || tick >= 400) {
            this.kill();
        }
    }

    public boolean hurt(DamageSource p_36910_, float p_36911_) {
        return false;
    }

    protected ParticleOptions getTrailParticle() {
        return ParticleTypes.END_ROD;
    }

    protected boolean shouldBurn() {
        return false;
    }

    @Override
    public void addAdditionalSaveData(CompoundTag tag) {
        super.addAdditionalSaveData(tag);
        tag.putInt("ticks", tick);
    }

    @Override
    public void load(CompoundTag tag) {
        super.load(tag);
        tick = tag.getInt("ticks");
    }
}
