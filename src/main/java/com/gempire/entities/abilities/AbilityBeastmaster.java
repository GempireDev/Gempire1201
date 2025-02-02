package com.gempire.entities.abilities;

import com.gempire.entities.abilities.base.Ability;
import com.gempire.entities.abilities.interfaces.IIdleAbility;
import com.gempire.entities.other.EntityBeastmasterWolf;
import com.gempire.init.ModEntities;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.Wolf;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DyeColor;

import java.util.ArrayList;
import java.util.List;

public class AbilityBeastmaster extends Ability implements IIdleAbility {

    public AbilityBeastmaster() {
        super("beastmaster", 1);
    }

    @Override
    public Component getName() {
        return Component.translatable("ability.gempire.beastmaster");
    }

    @Override
    public void execute() {
        List<Wolf> list = this.holder.level().getEntitiesOfClass(Wolf.class, this.holder.getBoundingBox().inflate(14.0D, 8.0D, 14.0D));
        List<EntityBeastmasterWolf> owned = this.holder.level().getEntitiesOfClass(EntityBeastmasterWolf.class, this.holder.getBoundingBox().inflate(14.0D, 8.0D, 14.0D));
        owned.removeIf(entityBeastmasterWolf -> entityBeastmasterWolf.getOwnerID() != this.holder.getGemID());
        for (Wolf wolf : list) {
                if (!wolf.isTame()) {
                    if (holder.getOwned()) {
                            if (holder.abilityTicks == 0) {
                                holder.getNavigation().moveTo(wolf, 1);
                                holder.lookAt(wolf, 90F, 90F);
                                if (holder.distanceToSqr(wolf) < Math.pow(2, 1)) {
                                    EntityBeastmasterWolf beastmasterWolf = new EntityBeastmasterWolf(holder.level(), holder);
                                    beastmasterWolf.setPos(wolf.getOnPos().above().getCenter());
                                    beastmasterWolf.setHealth(beastmasterWolf.getMaxHealth());
                                    wolf.remove(Entity.RemovalReason.DISCARDED);
                                    beastmasterWolf.setSkinColor(holder.getSkinColor());
                                    beastmasterWolf.setGemColor(holder.getGemColor());
                                    beastmasterWolf.setHairColor(holder.getHairColor());
                                    holder.level().addFreshEntity(beastmasterWolf);
                                    holder.abilityTicks = 20 * 30;
                                }
                            }
                    }
                } else if (holder.getRebelled()) {
                    if (holder.abilityTicks == 0) {
                        if (!wolf.isTame()) {
                            holder.getNavigation().moveTo(wolf, 1);
                            holder.lookAt(wolf, 90F, 90F);
                            if (holder.distanceToSqr(wolf) < Math.pow(2, 1)) {
                                List<Player> list2 = this.holder.level().getEntitiesOfClass(Player.class, this.holder.getBoundingBox().inflate(14.0D, 8.0D, 14.0D));
                                if (!list2.isEmpty()) {
                                    wolf.setAggressive(true);
                                    wolf.setTarget(list2.get(0));
                                    holder.abilityTicks = 20 * 30;
                                }
                            }
                        }
                    }
            }
        }
    }
}
