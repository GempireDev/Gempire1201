package com.gempire.entities.gems.starter;

import com.gempire.entities.abilities.AbilityBrewEssence;
import com.gempire.entities.abilities.AbilityZilch;
import com.gempire.entities.abilities.base.Ability;
import com.gempire.entities.ai.*;
import com.gempire.entities.bases.EntityStarterGem;
import com.gempire.util.GemPlacements;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.animal.Cat;
import net.minecraft.world.entity.animal.Ocelot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

import net.minecraft.world.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;

import java.util.ArrayList;

public class EntityShale extends EntityStarterGem {

    public EntityShale(EntityType<? extends PathfinderMob> type, Level worldIn) {
        super(type, worldIn);
    }

    public static AttributeSupplier.Builder registerAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 10.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.3D)
                .add(Attributes.ATTACK_DAMAGE, 0);
    }

    @Override
    public Float baseXScale() {
        return .3F;
    }

    @Override
    public Float baseYScale() {
        return .3F;
    }

    @Override
    public Float baseZScale() {
        return .3F;
    }

    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.25D));
        this.goalSelector.addGoal(4, new AvoidEntityGoal<>(this, Cat.class, 3.0F, 1.25D, 1.0D));
        this.goalSelector.addGoal(4, new AvoidEntityGoal<>(this, Ocelot.class, 3.0F, 1.25D, 1.0D));
        this.goalSelector.addGoal(7, new LookAtPlayerGoal(this, Player.class, 6.0F));
        this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(7, new EntityAIFollowAssigned(this, 1.0D));
        this.goalSelector.addGoal(8, new EntityAIWander(this, 1.0D));
        this.goalSelector.addGoal(8, new EntityAIStay(this, 1.0D));
        this.goalSelector.addGoal(8, new EntityAIFollowOwner(this, 1.0D));
        this.goalSelector.addGoal(1, new AvoidEntityGoal<>(this, Mob.class, 6.0F, 1.0D, 1.2D, (mob)-> mob.getClassification(true)== MobCategory.MONSTER));
    }

    @Override
    public GemPlacements[] getPlacements() {
        GemPlacements[] placement = new GemPlacements[]{
                GemPlacements.BACK_OF_HEAD, GemPlacements.LEFT_EYE, GemPlacements.RIGHT_EYE, GemPlacements.BACK, GemPlacements.CHEST,
                GemPlacements.LEFT_THIGH, GemPlacements.RIGHT_THIGH, GemPlacements.LEFT_HAND, GemPlacements.RIGHT_HAND, GemPlacements.FOREHEAD
        };
        return placement;
    }

    public ArrayList<Ability> possibleAbilities(){
        ArrayList<Ability> arrayList = new ArrayList<>();
        arrayList.add(new AbilityZilch());
        return arrayList;
    }

    @Override
    public int generateAbilitySlots() {
        return 1;
    }

    public ArrayList<Ability> definiteAbilities(){
        ArrayList<Ability> arrayList = new ArrayList<>();
        arrayList.add(new AbilityBrewEssence());
        return arrayList;
    }
    @Override
    public boolean canOpenInventoryByDefault() {
        return true;
    }

    @Override
    public int generateVisorVariant() {
        return this.random.nextInt(1);
    }

    @Override
    public int getColor() {
        return 7;
    }

}
