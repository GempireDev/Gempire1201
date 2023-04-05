package com.gempire.init;

import com.gempire.Gempire;
import com.gempire.entities.ai.EntityAiFollowSpinel;
import com.gempire.entities.bases.EntityGem;
import com.gempire.entities.gems.*;
import com.gempire.entities.gems.starter.EntityMica;
import com.gempire.entities.gems.starter.EntityNacre;
import com.gempire.entities.gems.starter.EntityPebble;
import com.gempire.entities.gems.starter.EntityShale;
import com.gempire.items.ItemGem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.event.entity.item.ItemEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Gempire.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EventHandler {

    @SubscribeEvent
    public void OnEntitySpawn(EntityJoinLevelEvent event){
        if(event.getEntity() instanceof LivingEntity) {
            if (event.getEntity().getClassification(true) == MobCategory.MONSTER) {
                Mob entity = (Mob) event.getEntity();
                entity.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(entity, EntityGem.class, 1, false, false, (p_234199_0_) -> {
                    return !(p_234199_0_ instanceof EntityAgate);
                }));
                if (entity instanceof PathfinderMob) {
                    entity.goalSelector.addGoal(1, new AvoidEntityGoal<>((PathfinderMob) entity, EntityAgate.class, 6.0F, 1.0D, 1.2D));
                }
            }
            else if (event.getEntity().getClassification(true) == MobCategory.CREATURE)
            {
                if (event.getEntity() instanceof EntityGem)
                {
                }
                else
                {
                    Mob entity = (Mob) event.getEntity();
                    entity.goalSelector.addGoal(3, new EntityAiFollowSpinel((Mob) event.getEntity(), 1.1D));
                }
            }
        }
    }

}
