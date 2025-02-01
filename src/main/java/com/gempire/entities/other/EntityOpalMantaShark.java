package com.gempire.entities.other;

import com.gempire.entities.abilities.AbilityParalysis;
import com.gempire.entities.abilities.base.Ability;
import com.gempire.entities.bases.BaseMantaShark;
import com.gempire.entities.bases.EntityGem;
import com.gempire.entities.projectiles.OpalProjectileEntity;
import com.gempire.entities.projectiles.WaterOrbEntity;
import com.gempire.init.ModEffects;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

import java.util.Random;

public class EntityOpalMantaShark extends BaseMantaShark implements RangedAttackMob {

    public EntityOpalMantaShark(EntityType<? extends WaterAnimal> p_33002_, Level p_33003_) {
        super(p_33002_, p_33003_);
    }

    public static AttributeSupplier.Builder registerAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 15.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.7D)
                .add(Attributes.ATTACK_DAMAGE, 2.0D)
                .add(Attributes.ATTACK_SPEED, 1.0D);
    }

    public void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(5, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(3, new RandomSwimmingGoal(this, 1.0D, 10));
        this.goalSelector.addGoal(1, new RangedAttackGoal(this, 1.25D, 30, 60, 10.0F));
        this.targetSelector.addGoal(1, new HurtByTargetGoal(this, new Class[0]));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class, true));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, EntityGem.class, true));
    }


    @Override
    public void performRangedAttack(LivingEntity target, float v) {
        OpalProjectileEntity waterOrb = new OpalProjectileEntity(this.level(), this);
        double d0 = target.getEyeY() - (double) 1.1F;
        double d1 = target.getX() - this.getX();
        double d2 = d0 - waterOrb.getY();
        double d3 = target.getZ() - this.getZ();
        float f = Mth.sqrt((float) (d1 * d1 + d3 * d3)) * 0.2F;
        waterOrb.shoot(d1, d2 + (double) f, d3, 1.6F, 6.0F);
        this.playSound(SoundEvents.LARGE_AMETHYST_BUD_BREAK, 1.0F, 0.4F / (this.getRandom().nextFloat() * 0.4F + 0.8F));
        this.level().addFreshEntity(waterOrb);
    }
}
