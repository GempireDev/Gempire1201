package com.gempire.entities.ai;

import com.gempire.entities.bases.EntityGem;
import com.gempire.entities.bases.GemTamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.target.TargetGoal;
import net.minecraft.world.entity.ai.targeting.TargetingConditions;

import java.util.EnumSet;
import java.util.List;

public class GemHurtTargetGoal extends TargetGoal {
    private final GemTamableAnimal tameAnimal;
    private LivingEntity ownerLastHurt;
    private int timestamp;

    public GemHurtTargetGoal(GemTamableAnimal p_26114_) {
        super(p_26114_, false);
        this.tameAnimal = p_26114_;
        this.setFlags(EnumSet.of(Flag.TARGET));
    }

    public boolean canUse() {
        if (this.tameAnimal.isTame() && !this.tameAnimal.isOrderedToSit()) {
            List<EntityGem> list = this.tameAnimal.level().getEntitiesOfClass(EntityGem.class, this.tameAnimal.getBoundingBox().inflate(14.0D, 8.0D, 14.0D));
            EntityGem $$0 = null;
            for (EntityGem gem : list) {
                if (tameAnimal.getOwnerID() == gem.getGemID())$$0 = gem;
            }
            if ($$0 == null) {
                return false;
            } else {
                this.ownerLastHurt = $$0.getLastHurtMob();
                int $$1 = $$0.getLastHurtMobTimestamp();
                return $$1 != this.timestamp && this.canAttack(this.ownerLastHurt, TargetingConditions.DEFAULT) && this.tameAnimal.wantsToAttack(this.ownerLastHurt, $$0);
            }
        } else {
            return false;
        }
    }

    public void start() {
        this.mob.setTarget(this.ownerLastHurt);
        List<EntityGem> list = this.tameAnimal.level().getEntitiesOfClass(EntityGem.class, this.tameAnimal.getBoundingBox().inflate(14.0D, 8.0D, 14.0D));
        EntityGem $$0 = null;
        for (EntityGem gem : list) {
            if (tameAnimal.getOwnerID() == gem.getGemID())$$0 = gem;
        }
        if ($$0 != null) {
            this.timestamp = $$0.getLastHurtMobTimestamp();
        }

        super.start();
    }
}
