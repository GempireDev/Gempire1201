package com.gempire.entities.gems;

import com.gempire.config.GempireServerConfigs;
import com.gempire.entities.abilities.*;
import com.gempire.entities.abilities.base.Ability;
import com.gempire.entities.ai.*;
import com.gempire.entities.bases.EntityGem;
import com.gempire.entities.other.EntityAbomination;
import com.gempire.entities.other.EntityCrawler;
import com.gempire.entities.other.EntityShambler;
import com.gempire.entities.bases.EntityVaryingGem;
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
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;

import java.util.ArrayList;

public class EntityTopaz extends EntityVaryingGem {

    public EntityTopaz(EntityType<? extends PathfinderMob> type, Level worldIn) {
        super(type, worldIn);
    }

    public static AttributeSupplier.Builder registerAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 40.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.33D)
                .add(Attributes.ATTACK_DAMAGE, 6.0D)
                .add(Attributes.ATTACK_SPEED, .25D)
                .add(Attributes.ATTACK_KNOCKBACK, 1D)
                .add(Attributes.KNOCKBACK_RESISTANCE, 2D);
    }

    @Override
    public Float baseXScale() {
        return .7F;
    }

    @Override
    public Float baseYScale() {
        return .75F;
    }

    @Override
    public Float baseZScale() {
        return .7F;
    }

    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(9, new FloatGoal(this));
        this.goalSelector.addGoal(6, new PanicGoal(this, 1.1D));
        this.goalSelector.addGoal(7, new LookAtPlayerGoal(this, Player.class, 4.0F));
        this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(8, new EntityAIWander(this, 1.0D));
        this.goalSelector.addGoal(8, new EntityAIStay(this, 1.0D));
        this.goalSelector.addGoal(7, new EntityAIFollowGarnet(this, 0.7D));
        this.goalSelector.addGoal(7, new EntityAIFollowAssigned(this, 1.0D));
        this.goalSelector.addGoal(7, new EntityAIFollowOwner(this, 1.0D));
        this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.1D, false));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, EntityGem.class, 1, false, false, this::checkRebel));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, EntityAbomination.class, 1, false, false, this::checkNotSludged));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, EntityShambler.class, 1, false, false, this::checkNotSludged));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, EntityCrawler.class, 1, false, false, this::checkNotSludged));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Mob.class, 1, false, false, (p_234199_0_) -> p_234199_0_.getClassification(true) == MobCategory.MONSTER));
        this.targetSelector.addGoal(1, new OwnerHurtByTargetGemGoal(this));
        this.targetSelector.addGoal(2, new OwnerHurtTargetGemGoal(this));
        this.goalSelector.addGoal(1, new EntityAISludged(this, 0.6));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, EntityGem.class, 1, false, false, this::checkBothSludged));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class, 1, false, false, this::checkSludged));
        this.goalSelector.addGoal(1, new AvoidEntityGoal<>(this, EntityGem.class, 6.0F, 1.0D, 1.2D, this::checkElseSludged));
   }
    @Override
    public SoundEvent getInstrument()
    {
        return SoundEvents.NOTE_BLOCK_IRON_XYLOPHONE.get();
    }
    @Override

    public int generateSkinVariant() {
        return 0;
    }

    @Override
    public int generateHairVariant() {
        return 0;
    }

    @Override
    public boolean UsesUniqueNames() {
        return false;
    }

    @Override
    public int[] NeglectedColors() {
        return new int[]{
                1,2,3,5,7,8,9,10,12,13,14,15,16,17
        };
    }

    @Override
    public String NameFromColor(byte i) {
        String name = "";
        switch(i){
            case 4:
                name = "yellow_topaz";
                break;
            case 6:
                name = "pink_topaz";
                break;
            case 11:
                name = "blue_topaz";
                break;
            default:
                name = "white_topaz";
                break;
        }
        return name;
    }

    @Override
    public GemPlacements[] getPlacements() {
        return new GemPlacements[]{
                GemPlacements.BACK, GemPlacements.BACK_OF_HEAD, GemPlacements.CHEST, GemPlacements.FOREHEAD, GemPlacements.LEFT_CHEEK,
                GemPlacements.LEFT_EAR, GemPlacements.LEFT_EYE, GemPlacements.LEFT_HAND, GemPlacements.LEFT_SHOULDER,
                GemPlacements.BELLY, GemPlacements.NOSE, GemPlacements.RIGHT_CHEEK, GemPlacements.RIGHT_EAR, GemPlacements.RIGHT_EYE,
                GemPlacements.RIGHT_HAND, GemPlacements.RIGHT_SHOULDER, GemPlacements.TOP_OF_HEAD, GemPlacements.RIGHT_KNEE, GemPlacements.RIGHT_KNEE,
        };
    }

    @Override
    public int generateOutfitVariant() {
        return 0;
    }

    @Override
    public int generateInsigniaVariant() {
        return this.getGemPlacement() != 17 ? this.getOutfitVariant() : 1;
    }

    public int generateRebelInsigniaVariant() {
        return this.getGemPlacement() != 17 ? this.getRebelOutfitVariant() : 1;
    }

    @Override
    public int generateVisorVariant() {
        return this.random.nextInt(2);
    }

    @Override
    public boolean hasSkinColorVariant() {
        return true;
    }

    @Override
    public boolean generateIsEmotional() {
        return GempireServerConfigs.OUTBURSTS.get();
    }

    @Override
    public byte EmotionThreshold() {
        return 15;
    }

    @Override
    public boolean canChangeUniformColorByDefault() {
        return true;
    }

    @Override
    public boolean canChangeInsigniaColorByDefault() {
        return true;
    }

    public ArrayList<Ability> possibleAbilities(){
        ArrayList<Ability> arrayList = new ArrayList<>();
        arrayList.add(new AbilityZilch());
        arrayList.add(new AbilityTank());
        arrayList.add(new AbilityBeefcake());
        arrayList.add(new AbilityPowerhouse());
        arrayList.add(new AbilityUnhinged());
        arrayList.add(new AbilityStern());
        arrayList.add(new AbilityBerserker());
        arrayList.add(new AbilityParalysis());
        return arrayList;
    }

    public ArrayList<Ability> definiteAbilities(){
        ArrayList<Ability> arrayList = new ArrayList<>();
        arrayList.add(new AbilityKnockback());
        arrayList.add(new AbilityIntimidation());
        return arrayList;
    }

    @Override
    public int baseFocus() {
        return 5;
    }

    @Override
    public boolean hasOutfitPlacementVariant() {
        return true;
    }

    @Override
    public int[] outfitPlacementVariants() {
        return new int[]{
                17
        };
    }

    public int generateHardness() {
        return 8;
    }

    @Override
    public int exitHoleSize() {
        return 3;
    }
}
