package com.gempire.tileentities;

import com.gempire.client.block.render.PackedIceStatueRenderer;
import com.gempire.init.ModTE;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.Connection;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import software.bernie.geckolib.animatable.GeoBlockEntity;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.util.GeckoLibUtil;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Objects;

public class PackedIceStatueTE extends BlockEntity implements GeoBlockEntity {

    int timer;
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
    public PackedIceStatueTE(BlockPos pos, BlockState state) {
        super(ModTE.PACKED_ICE_STATUE_TE.get(), pos, state);
        timer = 2400;
    }

    @Override
    public void load(CompoundTag nbt) {
        timer = nbt.getInt("timer");
        super.load(nbt);
    }

    @Override
    public void saveAdditional(CompoundTag compound) {
        compound.putInt("timer", timer);
        super.saveAdditional(compound);
    }

    public static <T extends BlockEntity> void tick(Level level, BlockPos pos, BlockState state, T be) {
        if (be instanceof PackedIceStatueTE) {
            if (((PackedIceStatueTE) be).timer != 0) {
                ((PackedIceStatueTE) be).timer--;
                List<LivingEntity> list = level.getEntitiesOfClass(LivingEntity.class, new AABB(pos).inflate(14.0D, 8.0D, 14.0D));
                for (LivingEntity entity : list) {
                    if (entity.getClassification(true) == MobCategory.MONSTER) {
                        entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 100,1));
                    }
                }
            } else {
                level.playLocalSound(pos, SoundEvents.GLASS_BREAK, SoundSource.BLOCKS, 1, 1, false);
                level.setBlockAndUpdate(pos, Blocks.AIR.defaultBlockState());
            }
        }
    }


    public static BlockPos direction(int i){
        switch (i){
            case 1:
                return BlockPos.ZERO.south();
            case 2:
                return BlockPos.ZERO.above();
            case 3:
                return BlockPos.ZERO.west();
            case 4:
                return BlockPos.ZERO.below();
            case 5:
                return BlockPos.ZERO.east();
            default:
                return BlockPos.ZERO.north();
        }
    }

    @Override
    public void onDataPacket(Connection net, ClientboundBlockEntityDataPacket pkt) {
        //Debug
        System.out.println("[DEBUG]:Client recived tile sync packet");
        this.load(Objects.requireNonNull(pkt.getTag()));
    }

    @Nullable
    @Override
    public ClientboundBlockEntityDataPacket getUpdatePacket() {
        //Debug
        System.out.println("[DEBUG]:Server sent tile sync packet");
        return ClientboundBlockEntityDataPacket.create(this);
    }
    @Nonnull
    @Override
    public CompoundTag getUpdateTag() {
        CompoundTag compound = new CompoundTag();
        this.saveAdditional(compound);
        return compound;
    }
    @Override
    public void handleUpdateTag(CompoundTag tag) {
        System.out.println("[DEBUG]:Handling tag on chunk load");
        this.load(tag);
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }
}
