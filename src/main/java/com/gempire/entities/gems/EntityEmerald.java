package com.gempire.entities.gems;

import com.gempire.config.GempireServerConfigs;
import com.gempire.entities.abilities.*;
import com.gempire.entities.abilities.base.Ability;
import com.gempire.entities.ai.*;
import com.gempire.entities.bases.EntityGem;
import com.gempire.entities.other.EntityAbomination;
import com.gempire.entities.other.EntityCrawler;
import com.gempire.entities.other.EntityShambler;
import com.gempire.util.GemPlacements;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;

import java.util.ArrayList;

public class EntityEmerald extends EntityGem implements RangedAttackMob {
    //TODO: IMPLEMENT EMERALD. Barters with Villagers and other trader type NPCs.
    public EntityEmerald(EntityType<? extends PathfinderMob> type, Level worldIn) {
        super(type, worldIn);
    }


    public static AttributeSupplier.Builder registerAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 75.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.4D)
                .add(Attributes.ATTACK_DAMAGE, 4.0D)
                .add(Attributes.ATTACK_SPEED, 0.5D);
    }

    @Override
    public Float baseXScale() {
        return 1.25F;
    }

    @Override
    public Float baseYScale() {
        return 1.35F;
    }

    @Override
    public Float baseZScale() {
        return 1.25F;
    }
    @Override
    public SoundEvent getInstrument()
    {
        return SoundEvents.NOTE_BLOCK_BIT.get();
    }
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(7, new FloatGoal(this));
        this.goalSelector.addGoal(6, new PanicGoal(this, 1.1D));
        this.goalSelector.addGoal(7, new LookAtPlayerGoal(this, Player.class, 4.0F));
        this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(7, new EntityAIFollowAssigned(this, 1.0D));
        this.goalSelector.addGoal(7, new EntityAIWander(this, 1.0D));
        this.goalSelector.addGoal(7, new EntityAIStay(this, 1.0D));
        this.goalSelector.addGoal(7, new EntityAIFollowOwner(this, 1.0D));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, EntityGem.class, 1, false, false, this::checkRebel));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, EntityAbomination.class, 1, false, false, this::checkNotSludged));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, EntityShambler.class, 1, false, false, this::checkNotSludged));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, EntityCrawler.class, 1, false, false, this::checkNotSludged));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Mob.class, 1, false, false, (p_234199_0_) -> p_234199_0_.getClassification(true) == MobCategory.MONSTER));
        this.goalSelector.addGoal(4, new MeleeAttackGoal(this, 1.1D, false));
        this.targetSelector.addGoal(1, new OwnerHurtByTargetGemGoal(this));
        this.targetSelector.addGoal(2, new OwnerHurtTargetGemGoal(this));
        this.goalSelector.addGoal(1, new EntityAISludged(this, 0.6));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, EntityGem.class, 1, false, false, this::checkBothSludged));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class, 1, false, false, this::checkSludged));
        this.goalSelector.addGoal(1, new AvoidEntityGoal<>(this, EntityGem.class, 6.0F, 1.0D, 1.2D, this::checkElseSludged));
   }

    @Override
    public int generateSkinVariant() {
        return 0;
    }

    @Override
    public GemPlacements[] getPlacements() {
        return new GemPlacements[] {
                GemPlacements.FOREHEAD, GemPlacements.LEFT_EYE, GemPlacements.RIGHT_EYE, GemPlacements.NOSE, GemPlacements.LEFT_CHEEK, GemPlacements.RIGHT_CHEEK, GemPlacements.CHEST, GemPlacements.BACK, GemPlacements.BELLY, GemPlacements.LEFT_SHOULDER,
                GemPlacements.RIGHT_SHOULDER, GemPlacements.LEFT_ARM, GemPlacements.RIGHT_ARM, GemPlacements.LEFT_HAND, GemPlacements.RIGHT_HAND, GemPlacements.LEFT_PALM, GemPlacements.RIGHT_PALM, GemPlacements.LEFT_THIGH, GemPlacements.RIGHT_THIGH, GemPlacements.LEFT_KNEE,
                GemPlacements.RIGHT_KNEE, GemPlacements.LEFT_ANKLE, GemPlacements.RIGHT_ANKLE };
    }
    @Override
    public int generateHairVariant() {
        return this.random.nextInt(6);
    }

    @Override
    public int generateInsigniaColor() {
        return 13;
    }

    @Override
    public int generateOutfitColor() {
        return 13;
    }

    @Override
    public boolean hasOutfitPlacementVariant() {
        return false;
    }

    @Override
    public int[] outfitPlacementVariants() {
        return new int[]{
                11, 17
        };
    }

    public ArrayList<Ability> possibleAbilities(){
        ArrayList<Ability> arrayList = new ArrayList<>();
        arrayList.add(new AbilityZilch());
        arrayList.add(new AbilityTank());
        arrayList.add(new AbilityBeefcake());
        arrayList.add(new AbilityPowerhouse());
        arrayList.add(new AbilityUnhinged());
        arrayList.add(new AbilityArcher());
        arrayList.add(new AbilityNegotiator());
        return arrayList;
    }
    public ArrayList<Ability> definiteAbilities(){
        ArrayList<Ability> arrayList = new ArrayList<>();
        arrayList.add(new AbilityElectrokinesis());
        arrayList.add(new AbilityRecall());
        return arrayList;
    }

    public int generateSkinColorVariant() {
        return 0;
    }

    @Override
    public boolean generateIsEmotional() {
        return GempireServerConfigs.OUTBURSTS.get();
    }

    @Override
    public byte EmotionThreshold() {
        return 10;
    }

    public boolean canChangeUniformColorByDefault() {
        return true;
    }

    public boolean canChangeInsigniaColorByDefault(){
        return true;
    }

    @Override
    public boolean fireImmune(){
        return false;
    }

    public boolean hasSkinColorVariant(){
        return false;
    }

    public int generateOutfitVariant(){
        return this.random.nextInt(2);
    }

    public int generateInsigniaVariant(){
            return this.getOutfitVariant();
    }

    public int generateRebelInsigniaVariant() {
        return this.getRebelOutfitVariant();
    }


    @Override
    public int baseFocus() {
        return 7;
    }


    public int generateHardness() {
        return 8;
    }

    @Override
    public int generateVisorVariant() {
        return this.random.nextInt(3);
    }



    @Override
    public int getColor() {
        return 5;
    }

    @Override
    public int exitHoleSize() {
        return 4;
    }
}
