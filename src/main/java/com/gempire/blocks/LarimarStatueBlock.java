package com.gempire.blocks;

import com.gempire.init.ModBlocks;
import com.gempire.init.ModTE;
import com.gempire.tileentities.*;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.animal.Wolf;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.AABB;
import org.checkerframework.checker.units.qual.A;

import javax.annotation.Nullable;
import java.util.List;

public class LarimarStatueBlock extends HorizontalDirectionalBlock implements EntityBlock {

    public LarimarStatueBlock(Properties p_49795_) {
        super(p_49795_);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.ENTITYBLOCK_ANIMATED;
    }

    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    public BlockState rotate(BlockState state, Rotation rot) {
        return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
    }

    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    public PushReaction getPistonPushReaction(BlockState state) {
        return PushReaction.DESTROY;
    }

    @Override
    public boolean isRandomlyTicking(BlockState p_49921_) {
        return true;
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        if (state.getBlock() == ModBlocks.PRIMED_ICE_STATUE.get()) return new IceStatueTE(pos, state);
        if (state.getBlock() == ModBlocks.PRIMED_PACKED_ICE_STATUE.get()) return new PackedIceStatueTE(pos, state);
        if (state.getBlock() == ModBlocks.PRIMED_BLUE_ICE_STATUE.get()) return new BlueIceStatueTE(pos, state);
        return new DrainedIceStatueTE(pos, state);
    }

    @Nullable
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level p_152180_, BlockState p_152181_, BlockEntityType<T> p_152182_) {
        return p_152182_ == ModTE.ICE_STATUE_TE.get() ? IceStatueTE::tick : p_152182_ == ModTE.PACKED_ICE_STATUE_TE.get() ? PackedIceStatueTE::tick : p_152182_ == ModTE.BLUE_ICE_STATUE_TE.get() ? BlueIceStatueTE::tick : p_152182_ == ModTE.DRAINED_ICE_STATUE_TE.get() ? DrainedIceStatueTE::tick : null;
    }
}
