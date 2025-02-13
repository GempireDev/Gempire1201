package com.gempire.effect;

import com.gempire.entities.bosses.base.EntityAmberHuntress;
import com.gempire.entities.other.EntityHunter;
import com.gempire.init.ModEffects;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;

public class ElectrocutionEffect extends MobEffect {
    int duration = 0;

    public ElectrocutionEffect(MobEffectCategory mobEffectCategory, int color) {
        super(mobEffectCategory, color);
    }


    @Override
    public void applyEffectTick(LivingEntity entity, int pAmplifier) {
        if (!entity.level().isClientSide() && !entity.hasEffect(ModEffects.SHOCK_RESISTANCE.get()) && !(entity instanceof EntityAmberHuntress) && !(entity instanceof EntityHunter)) {
            ItemStack stack = entity.getMainHandItem();
            ItemEntity itemEntity = new ItemEntity(entity.level(), entity.getX(), entity.getY(), entity.getZ(), stack);
            itemEntity.setPickUpDelay(duration);
            entity.level().addFreshEntity(itemEntity);
            entity.setItemSlot(EquipmentSlot.MAINHAND, ItemStack.EMPTY);

            double x = entity.getX();
            double y = entity.getY();
            double z = entity.getZ();

            entity.teleportTo(x, y, z);
            entity.setDeltaMovement(0, 0, 0);
        }
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        duration = pDuration;
        return true;
    }
}
