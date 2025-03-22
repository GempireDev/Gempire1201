package com.gempire.entities.abilities;

import com.gempire.entities.abilities.base.Ability;
import com.gempire.entities.abilities.interfaces.IEffectAbility;
import com.gempire.entities.abilities.interfaces.IIdleAbility;
import com.gempire.init.ModItems;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import java.util.UUID;

public class AbilityAmphibian extends Ability implements IEffectAbility, IIdleAbility {

    public boolean tick;
    public int ticks = 0;
    public AbilityAmphibian(){
        super("amphibian", 4);
    }

    @Override
    public MobEffectInstance[] effects() {
        return new MobEffectInstance[]{
                new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 400, 0,false,false), new MobEffectInstance(MobEffects.WATER_BREATHING, 400, 0,false,false)
        };
    }

    @Override
    public boolean hasMultipleEffects() {
        return true;
    }

    @Override
    public MobEffectInstance effect() {
        return null;
    }

    @Override
    public Class<LivingEntity>[] applicableEntities() {
        return new Class[]{
                Player.class
        };
    }

    @Override
    public Component getName() {
        return Component.translatable("ability.gempire.amphibian");
    }

    @Override
    public void execute() {
        if (holder.getItemBySlot(EquipmentSlot.MAINHAND).getItem() == Items.HEART_OF_THE_SEA) {
            if (holder.getHealth() > 6) {
                tick = true;
                System.out.println("run");
            }
        } else {
            for (UUID uuid : holder.OWNERS) holder.level().getPlayerByUUID(uuid).sendSystemMessage(Component.translatable("messages.gempire.entity.spodumene_sore"));
        }
        if (tick) ticks++;
        if (ticks > 15) {
            tick = false;
            System.out.println("timer over");
            ticks = 0;
            holder.hurt(holder.damageSources().magic(), 6);
            holder.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(ModItems.SPODUMENE_PIECE.get()));
        }
    }
}
