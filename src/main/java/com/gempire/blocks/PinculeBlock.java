package com.gempire.blocks;

import com.gempire.init.ModBlocks;
import com.gempire.init.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.PlantType;
import net.minecraftforge.common.ToolAction;

import javax.annotation.Nullable;
import java.util.Iterator;

public class PinculeBlock extends CactusBlock {
    public PinculeBlock(Properties p_51136_) {
        super(p_51136_);
        this.registerDefaultState((BlockState)((BlockState)this.stateDefinition.any()).setValue(AGE, 0).setValue(FLOWERED, 0));
    }

    @Override
    public boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction facing, IPlantable plantable) {
        return plantable.getPlant(world, pos.relative(facing)).getBlock() instanceof PinculeBlock;
    }
    public static final IntegerProperty FLOWERED;

    public void randomTick(BlockState p_220913_, ServerLevel p_220914_, BlockPos p_220915_, RandomSource p_220916_) {
        BlockPos blockpos = p_220915_.above();
        BlockPos blockBelow = p_220915_.above();
        if (p_220914_.isEmptyBlock(blockpos)) {
            int i;
            for(i = 1; p_220914_.getBlockState(p_220915_.below(i)).is(this); ++i) {
            }

            if (i < 3) {
                int j = (Integer)p_220913_.getValue(AGE);
                if (ForgeHooks.onCropsGrowPre(p_220914_, blockpos, p_220913_, true)) {
                    if (j == 15) {
                        p_220914_.setBlockAndUpdate(blockpos, this.defaultBlockState());
                        BlockState blockstate = (BlockState)p_220913_.setValue(AGE, 0);
                        p_220914_.setBlock(p_220915_, blockstate, 4);
                        p_220914_.neighborChanged(blockstate, blockpos, this, p_220915_, false);
                    } else {
                        p_220914_.setBlock(p_220915_, (BlockState)p_220913_.setValue(AGE, j + 1), 4);
                    }

                    ForgeHooks.onCropsGrowPost(p_220914_, p_220915_, p_220913_);
                }
            }
        }
        if (p_220914_.getBlockState(blockBelow).getBlock() == p_220913_.getBlock() && p_220913_.getValue(FLOWERED) < 2) {
            int j = (Integer) p_220913_.getValue(AGE);
            if (ForgeHooks.onCropsGrowPre(p_220914_, blockpos, p_220913_, true)) {
                if (j == 15) {
                    BlockState blockstate = (BlockState) p_220913_.setValue(AGE, 0).setValue(FLOWERED, p_220913_.getValue(FLOWERED)+1);
                    p_220914_.setBlockAndUpdate(p_220915_, blockstate);
                    p_220914_.neighborChanged(blockstate, blockpos, this, p_220915_, false);
                } else {
                    p_220914_.setBlock(p_220915_, (BlockState) p_220913_.setValue(AGE, j + 1), 4);
                }

                ForgeHooks.onCropsGrowPost(p_220914_, p_220915_, p_220913_);
            }
        }

    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_51164_) {
        p_51164_.add(new Property[]{AGE, FLOWERED});
    }

    static {
        FLOWERED = IntegerProperty.create("flowered", 0, 2);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult result) {
        if (!level.isClientSide && player.getMainHandItem().is(Items.SHEARS)) {
            ItemStack stack = new ItemStack(ModItems.PINCULE_FRUIT.get(), player.getRandom().nextInt(2)+1);
            popResource(level, pos, stack);
            level.setBlockAndUpdate(pos, state.getBlock().withPropertiesOf(level.getBlockState(pos).setValue(FLOWERED, 1)));
        }

        return super.use(state, level, pos, player, hand, result);
    }
}
