package com.gempire.items;

import com.gempire.entities.bases.EntityGem;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import net.minecraft.world.item.Item.Properties;

public class ItemRejuvenator extends Item {

    public ItemRejuvenator(Properties properties){
        super(properties);
    }


    public void poofGem(LivingEntity pTarget, LivingEntity pAttacker) {
        if (pTarget.isAlive()){
            if (pTarget instanceof EntityGem) {
                ((EntityGem) pTarget).poof(DamageSource.sting(pAttacker));
                if (pAttacker instanceof Player) {
                    ((Player) pAttacker).getCooldowns().addCooldown(this, 100);
                }
            }
        }
    }

    @Override
    public InteractionResult interactLivingEntity(ItemStack item, Player player, LivingEntity entity, InteractionHand hand) {
        if (!player.getCooldowns().isOnCooldown(this)) {
            poofGem(entity, player);
            player.getCooldowns().addCooldown(this, 200);
        }
        return super.interactLivingEntity(item, player, entity, hand);
    }
}
