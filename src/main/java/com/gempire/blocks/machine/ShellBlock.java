package com.gempire.blocks.machine;

import com.gempire.blocks.SimpleWhiteEssenceloggedBlock;
import com.gempire.init.ModFluids;
import com.gempire.init.ModTE;
import com.gempire.tileentities.ShellTE;
import net.minecraft.world.Container;
import net.minecraft.world.Containers;
import net.minecraft.world.entity.player.Player;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;

import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.network.NetworkHooks;

public class ShellBlock extends BaseEntityBlock implements EntityBlock, SimpleWhiteEssenceloggedBlock {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final IntegerProperty STAGE = IntegerProperty.create("stage", 0, 2);

    public ShellBlock(Properties builder) {
        super(builder);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(STAGE, 0).setValue(WATERLOGGED, false));
    }


    @SuppressWarnings("deprecation")
    @Override
    public InteractionResult use(BlockState state, Level worldIn, BlockPos pos, Player player, InteractionHand handIn, BlockHitResult hit) {
        if (worldIn.isClientSide){
            return InteractionResult.SUCCESS;
        } else {
            BlockEntity te = worldIn.getBlockEntity(pos);
            if(te instanceof ShellTE){
                NetworkHooks.openScreen((ServerPlayer) player, (ShellTE)te, pos);
                return InteractionResult.CONSUME;
            } else {
                return InteractionResult.PASS;
            }
        }
    }

    @SuppressWarnings("deprecation")
    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
        return Block.box(3D, 0D, 3D, 12D, 12D, 12D);
    }

    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite()).setValue(STAGE, 0);
    }

    public BlockState rotate(BlockState state, Rotation rot) {
        return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
    }

    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING,WATERLOGGED,STAGE);
    }

    @Override
    public void onRemove(BlockState state, Level worldIn, BlockPos pos, BlockState newState, boolean isMoving) {
        if (!state.is(newState.getBlock())) {
            BlockEntity blockentity = worldIn.getBlockEntity(pos);
            if (blockentity instanceof Container) {
                Containers.dropContents(worldIn, pos, (Container)blockentity);
                worldIn.updateNeighbourForOutputSignal(pos, this);
            }
            super.onRemove(state, worldIn, pos, newState, isMoving);
        }
    }

    public static int getDirectionFacingValue(BlockEntity te){
        BlockState block = te.getLevel().getBlockEntity(te.getBlockPos()).getBlockState();
        return switch (block.getValue(FACING)) {
            case EAST -> 5;
            case NORTH -> 2;
            case WEST -> 4;
            case SOUTH -> 3;
            default -> 5;
        };
    }

    public static Direction getDirectionFromValue(int value){
        return switch (value) {
            case 5 -> Direction.EAST;
            case 2 -> Direction.NORTH;
            case 4 -> Direction.WEST;
            case 3 -> Direction.SOUTH;
            default -> Direction.EAST;
        };
    }

    public static int getAdjustedDirectionValue(int facing, int svalue){
        if (facing == 3){
            return svalue;
        }
        else if (facing == 5){
            return switch (svalue) {
                case 5 -> 2;
                case 2 -> 4;
                case 4 -> 3;
                case 3 -> 5;
                default -> 2;
            };
        }
        else if (facing == 2){
            return switch (svalue) {
                case 5 -> 4;
                case 2 -> 3;
                case 4 -> 5;
                case 3 -> 2;
                default -> 4;
            };
        }
        else if (facing == 4){
            return switch (svalue) {
                case 5 -> 3;
                case 2 -> 5;
                case 4 -> 2;
                case 3 -> 4;
                default -> 3;
            };
        }
        return 2;
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new ShellTE(pos, state);
    }

    @Nullable
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level p_152180_, BlockState p_152181_, BlockEntityType<T> p_152182_) {
        return p_152182_ == ModTE.SHELL_TE.get() ? ShellTE::tick : null;
    }

    public PushReaction getPistonPushReaction(BlockState p_60584_) {
        return PushReaction.IGNORE;
    }

    public FluidState getFluidState(BlockState p_54377_) {
        return p_54377_.getValue(WATERLOGGED) ? ModFluids.WHITE_ESSENCE.get().getSource(false) : super.getFluidState(p_54377_);
    }
}
