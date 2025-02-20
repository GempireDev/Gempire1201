package com.gempire.entities.other;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.OwnableEntity;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.Level;
import net.minecraftforge.fluids.capability.templates.FluidTank;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.constant.DefaultAnimations;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.util.GeckoLibUtil;

import java.util.UUID;

public class EntityRobonoid extends PathfinderMob implements GeoEntity, OwnableEntity {
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
    UUID ownerID;

    public FluidTank pinkTank, blueTank, yellowTank, whiteTank;
    public boolean pinkOpen, blueOpen, yellowOpen, whiteOpen;

    public EntityRobonoid(EntityType<? extends PathfinderMob> p_21683_, Level p_21684_) {
        super(p_21683_, p_21684_);
        this.pinkTank = new FluidTank(1200);
        this.blueTank = new FluidTank(1200);
        this.yellowTank = new FluidTank(1200);
        this.whiteTank = new FluidTank(1200);
    }

    public static AttributeSupplier.Builder registerAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 5.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.3D)
                .add(Attributes.ATTACK_DAMAGE, 0.0D)
                .add(Attributes.ATTACK_SPEED, 0.0D);
    }

    @Override
    public void load(CompoundTag nbt) {
        this.pinkTank.readFromNBT(nbt.getCompound("pinkTank"));
        this.blueTank.readFromNBT(nbt.getCompound("blueTank"));
        this.yellowTank.readFromNBT(nbt.getCompound("yellowTank"));
        this.whiteTank.readFromNBT(nbt.getCompound("whiteTank"));
        this.pinkOpen = nbt.getBoolean("pinkOpen");
        this.blueOpen = nbt.getBoolean("blueOpen");
        this.yellowOpen = nbt.getBoolean("yellowOpen");
        this.whiteOpen = nbt.getBoolean("whiteOpen");
        this.ownerID = nbt.getUUID("ownerID");
        super.load(nbt);
    }

    @Override
    public void addAdditionalSaveData(CompoundTag compound) {
        compound.put("pinkTank", this.pinkTank.writeToNBT(new CompoundTag()));
        compound.put("blueTank", this.blueTank.writeToNBT(new CompoundTag()));
        compound.put("yellowTank", this.yellowTank.writeToNBT(new CompoundTag()));
        compound.put("whiteTank", this.whiteTank.writeToNBT(new CompoundTag()));
        compound.putBoolean("pinkOpen", this.pinkOpen);
        compound.putBoolean("blueOpen", this.blueOpen);
        compound.putBoolean("yellowOpen", this.yellowOpen);
        compound.putBoolean("whiteOpen", this.whiteOpen);
        compound.putUUID("ownerID", this.ownerID);
        super.addAdditionalSaveData(compound);
    }

    @Override
    public @Nullable UUID getOwnerUUID() {
        return ownerID;
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar registrar) {
        registrar.add(DefaultAnimations.genericWalkIdleController(this));
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }
}
