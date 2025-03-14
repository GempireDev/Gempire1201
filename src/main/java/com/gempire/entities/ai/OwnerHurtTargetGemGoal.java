package com.gempire.entities.ai;

import com.gempire.config.GempireServerConfigs;
import com.gempire.entities.bases.EntityGem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.target.TargetGoal;
import net.minecraft.world.entity.ai.targeting.TargetingConditions;
import net.minecraft.world.entity.player.Player;

import java.util.EnumSet;

public class OwnerHurtTargetGemGoal extends TargetGoal {
    private final EntityGem entityGem;
    private LivingEntity ownerLastHurt;
    private int timestamp;
    private Player player;
    boolean use = false;

    public OwnerHurtTargetGemGoal(EntityGem gem) {
        super(gem, false);
        this.entityGem = gem;
        this.setFlags(EnumSet.of(Goal.Flag.TARGET));
    }

    public boolean canUse() {
        if (!this.entityGem.getRebelled()) {
            if (this.entityGem.getSludgeAmount() < 5) {
                if (this.entityGem.getOwned()) {
                    if (entityGem.OWNERS.size() != 1) {
                        for (int i = 0; i < this.entityGem.OWNERS.size(); i++) {
                            player = this.entityGem.level().getPlayerByUUID(this.entityGem.OWNERS.get(i));
                            this.ownerLastHurt = player.getLastHurtMob();
                            int n = player.getLastHurtMobTimestamp();
                            if (!this.ownerLastHurt.is(player)) {
                                if (this.ownerLastHurt instanceof EntityGem) {
                                    if (((EntityGem) ownerLastHurt).getRebelled()) {
                                        if (n != this.timestamp && this.canAttack(this.ownerLastHurt, TargetingConditions.DEFAULT) && this.entityGem.wantsToAttack(this.ownerLastHurt, player)) {
                                            use = true;
                                        }
                                    } else return !((EntityGem) ownerLastHurt).isOwner(this.entityGem.OWNERS.get(i));
                                } else {
                                    if (n != this.timestamp && this.canAttack(this.ownerLastHurt, TargetingConditions.DEFAULT) && this.entityGem.wantsToAttack(this.ownerLastHurt, player)) {
                                        if (ownerLastHurt instanceof Player) {
                                            if (GempireServerConfigs.GEMS_ATTACK_PLAYERS.get() && !entityGem.OWNERS.contains(ownerLastHurt.getUUID())) {
                                                use = true;
                                                return true;
                                            } else {
                                                return false;
                                            }
                                        }
                                        use = true;
                                        return true;
                                    }
                                }
                            }
                        }
                    } else {
                        player = this.entityGem.level().getPlayerByUUID(this.entityGem.OWNERS.get(0));
                        if (this.player != null) {
                            this.ownerLastHurt = player.getLastHurtMob();
                            int n = player.getLastHurtMobTimestamp();
                            if (ownerLastHurt != null) {
                                if (!this.ownerLastHurt.is(player)) {
                                    if (this.ownerLastHurt instanceof EntityGem) {
                                        if (((EntityGem) ownerLastHurt).getRebelled()) {
                                            if (n != this.timestamp && this.canAttack(this.ownerLastHurt, TargetingConditions.DEFAULT) && this.entityGem.wantsToAttack(this.ownerLastHurt, player)) {
                                                use = true;
                                            }
                                        } else {
                                            return false;
                                        }
                                    } else {
                                        if (n != this.timestamp && this.canAttack(this.ownerLastHurt, TargetingConditions.DEFAULT) && this.entityGem.wantsToAttack(this.ownerLastHurt, player)) {
                                            if (ownerLastHurt instanceof Player) {
                                                if (GempireServerConfigs.GEMS_ATTACK_PLAYERS.get() && !entityGem.OWNERS.contains(ownerLastHurt.getUUID())) {
                                                    use = true;
                                                    return true;
                                                } else {
                                                    return false;
                                                }
                                            }
                                            use = true;
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    use = false;
                }
            }
        }
        return use;
    }

    public void start() {
        this.mob.setTarget(this.ownerLastHurt);
        Player player = null;
        for (int i = 0; i < this.entityGem.OWNERS.size(); i++) {
            player = this.entityGem.level().getPlayerByUUID(this.entityGem.OWNERS.get(i));
            this.timestamp = player.getLastHurtMobTimestamp();
        }
        super.start();
    }
}
