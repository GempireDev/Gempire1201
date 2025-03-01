package com.gempire.blocks;

import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.Random;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

import net.minecraft.world.level.block.state.BlockState;

public class ChromaBlock extends DirectionalBlock implements SimpleWaterloggedBlock {
    protected static final VoxelShape CRYSTAL_VERTICAL_AABB = Block.box(1.0D, 0.0D, 1.0D, 15.0D, 16.0D, 15.0D);
    protected static final VoxelShape CRYSTAL_NS_AABB = Block.box(1D, 1.0D, 0D, 15.0D, 15.0D, 16);
    protected static final VoxelShape CRYSTAL_EW_AABB = Block.box(0.0D, 1D, 1D, 16.0D, 15.0D, 15);
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    public int colour;

    public ChromaBlock(Properties properties, int color) {
        super(properties);
        this.colour = color;
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.UP).setValue(WATERLOGGED, false));
    }

    public BlockState rotate(BlockState state, Rotation rot) {
        return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
    }

    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.setValue(FACING, mirrorIn.mirror(state.getValue(FACING)));
    }

    public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
        switch(state.getValue(FACING).getAxis()) {
            case X:
            default:
                return CRYSTAL_EW_AABB;
            case Z:
                return CRYSTAL_NS_AABB;
            case Y:
                return CRYSTAL_VERTICAL_AABB;
        }
    }

    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Direction direction = context.getClickedFace();
        BlockState blockstate = context.getLevel().getBlockState(context.getClickedPos().relative(direction.getOpposite()));
        return blockstate.is(this) && blockstate.getValue(FACING) == direction ? this.defaultBlockState().setValue(FACING, direction.getOpposite()).setValue(WATERLOGGED, false) : this.defaultBlockState().setValue(FACING, direction).setValue(WATERLOGGED, false);
    }

    public BlockState updateShape(BlockState stateIn, Direction facing, BlockState facingState, LevelAccessor worldIn, BlockPos currentPos, BlockPos facingPos) {
        return !stateIn.canSurvive(worldIn, currentPos) ? Blocks.AIR.defaultBlockState() : super.updateShape(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }

    public boolean canSurvive(BlockState state, LevelReader worldIn, BlockPos pos) {
        Direction direction = state.getValue(FACING);
        if (state.getBlock() == this) { //Forge: This function is called during world gen and placement, before this block is set, so if we are not 'here' then assume it's the pre-check.
            if (direction == Direction.UP) {
                if (worldIn.getBlockState(pos.below()).isFaceSturdy(worldIn, pos.below(), Direction.UP)) {
                    return super.canSurvive(state, worldIn, pos);
                }
            }
            if(direction == Direction.DOWN){
                if(worldIn.getBlockState(pos.above()).isFaceSturdy(worldIn, pos.below(), Direction.DOWN)){
                    return super.canSurvive(state, worldIn, pos);
                }
            }
            if(direction == Direction.NORTH){
                if(worldIn.getBlockState(pos.south()).isFaceSturdy(worldIn, pos.below(), Direction.NORTH)){
                    return super.canSurvive(state, worldIn, pos);
                }
            }
            if(direction == Direction.EAST){
                if(worldIn.getBlockState(pos.west()).isFaceSturdy(worldIn, pos.below(), Direction.EAST)){
                    return super.canSurvive(state, worldIn, pos);
                }
            }
            if(direction == Direction.SOUTH){
                if(worldIn.getBlockState(pos.north()).isFaceSturdy(worldIn, pos.below(), Direction.SOUTH)){
                    return super.canSurvive(state, worldIn, pos);
                }
            }
            if(direction == Direction.WEST){
                if(worldIn.getBlockState(pos.east()).isFaceSturdy(worldIn, pos.below(), Direction.WEST)){
                    return super.canSurvive(state, worldIn, pos);
                }
            }
        }
        return false;
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING,WATERLOGGED);
    }

    public PushReaction getPistonPushReaction(BlockState state) {
        return PushReaction.DESTROY;
    }

    public boolean isPathfindable(BlockState state, BlockGetter worldIn, BlockPos pos, PathComputationType type) {
        return false;
    }

    @Override
    public int getExpDrop(BlockState state, net.minecraft.world.level.LevelReader world, RandomSource randomSource, BlockPos pos, int fortune, int silktouch) {
        return silktouch == 0 ? 1 + randomSource.nextInt(5) : 0;
    }

    public FluidState getFluidState(BlockState p_54377_) {
        return p_54377_.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(p_54377_);
    }

    @Override
    public void animateTick(BlockState stateIn, Level level, BlockPos pos, RandomSource rand) {
        Direction direction = stateIn.getValue(FACING);
        double d0 = (double)pos.getX() + 1 - (double)(rand.nextFloat());
        double d1 = (double)pos.getY() + 1 - (double)(rand.nextFloat());
        double d2 = (double)pos.getZ() + 1 - (double)(rand.nextFloat());
        double d3 = (double)(0.4F - (rand.nextFloat() + rand.nextFloat()) * 0.4F);
        if (rand.nextInt(5) == 0) {
            level.addParticle(ParticleTypes.END_ROD, d0 + (double)direction.getStepX() * d3, d1 + (double)direction.getStepY() * d3, d2 + (double)direction.getStepZ() * d3, rand.nextGaussian() * 0.005D, rand.nextGaussian() * 0.005D, rand.nextGaussian() * 0.005D);
        }
        super.animateTick(stateIn, level, pos, rand);
    }
}
