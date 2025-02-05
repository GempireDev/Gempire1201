package com.gempire.entities.ai;

import com.gempire.entities.bases.EntityGem;
import com.gempire.entities.other.EntityCrawler;
import com.gempire.entities.other.EntityShambler;
import com.gempire.init.ModSounds;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;

public class EntityAIShamblerAttackGoal extends MeleeAttackGoal {
    private EntityShambler entity;

    public EntityAIShamblerAttackGoal(PathfinderMob pMob, double pSpeedModifier, boolean pFollowingTargetEvenIfNotSeen) {
        super(pMob, pSpeedModifier, pFollowingTargetEvenIfNotSeen);
        entity = ((EntityShambler) pMob);
    }

    @Override
    protected void checkAndPerformAttack(LivingEntity pEnemy, double pDistToEnemySqr) {
        if (pDistToEnemySqr <= this.getAttackReachSqr(pEnemy) && this.getTicksUntilNextAttack() <= 0 && entity != null && pEnemy instanceof EntityGem) {
            entity.level().playLocalSound(entity.getOnPos().above(), ModSounds.SHAMBLER_ATTACK.get(), SoundSource.HOSTILE, 1.0F, 1.0F, false);
            if (((EntityGem) pEnemy).getSludgeAmount() >= 5) {
                stop();
            }
        }

        super.checkAndPerformAttack(pEnemy, pDistToEnemySqr);
    }

    @Override
    public void tick() {
        super.tick();
    }


    @Override
    public void stop() {

        super.stop();
    }

}
