package com.gempire.init;

import com.gempire.Gempire;
import com.gempire.blocks.*;
import com.gempire.blocks.machine.*;
import com.gempire.worldgen.tree.*;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.BlockBehaviour;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Gempire.MODID);

    public static final RegistryObject<Block> BOARD_BLOCK = BLOCKS.register("board_block", () ->
            new BoardBlock(BlockBehaviour.Properties
                    .of()
                    .mapColor(MapColor.METAL)
                    .strength(3.0f, 6.0f)
                    .sound(SoundType.CHAIN)
                    .noOcclusion()
            )
    );
    public static final RegistryObject<Block> BLUE_ALTAR = BLOCKS.register("blue_altar", () ->
            new AltarBlock(BlockBehaviour.Properties.copy(Blocks.END_PORTAL_FRAME).noOcclusion()));

    public static final RegistryObject<Block> YELLOW_ALTAR = BLOCKS.register("yellow_altar", () ->
            new AltarBlock(BlockBehaviour.Properties.copy(Blocks.END_PORTAL_FRAME).noOcclusion()));

    public static final RegistryObject<Block> PINK_ALTAR = BLOCKS.register("pink_altar", () ->
            new AltarBlock(BlockBehaviour.Properties.copy(Blocks.END_PORTAL_FRAME).noOcclusion()));

    public static final RegistryObject<Block> WHITE_ALTAR = BLOCKS.register("white_altar", () ->
            new AltarBlock(BlockBehaviour.Properties.copy(Blocks.END_PORTAL_FRAME).noOcclusion()));

    public static final RegistryObject<Block> COBALT_KELP = BLOCKS.register("cobalt_kelp", () ->
            new DesolateKelpBlock(BlockBehaviour.Properties.copy(Blocks.KELP)));

    public static final RegistryObject<Block> COBALT_KELP_PLANT = BLOCKS.register("cobalt_kelp_plant", () ->
            new DesolateKelpPlantBlock(BlockBehaviour.Properties.copy(Blocks.KELP_PLANT)));

    public static final RegistryObject<Block> AQUATIC_FIBRE = BLOCKS.register("aquatic_fibre", () ->
            new AquaticFibreBlock(BlockBehaviour.Properties.copy(Blocks.SEAGRASS)));

    public static final RegistryObject<Block> TALL_AQUATIC_FIBRE = BLOCKS.register("tall_aquatic_fibre", () ->
            new TallAquaticFibreBlock(BlockBehaviour.Properties.copy(Blocks.TALL_SEAGRASS)));

    public static final RegistryObject<Block> MACADAM = BLOCKS.register("macadam", () ->
            new GravelBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL)));
    public static final RegistryObject<Block> DESOLATE_GRASS = BLOCKS.register("desolate_grass", () ->
            new DesolateGrass(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)));

    public static final RegistryObject<Block> DESOLATE_SOIL = BLOCKS.register("desolate_soil", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));

    public static final RegistryObject<Block> PINK_SAND = BLOCKS.register("pink_sand", () ->
            new SandBlock(16764894, BlockBehaviour.Properties.copy(Blocks.SAND)));

    public static final RegistryObject<Block> PINK_SANDSTONE = BLOCKS.register("pink_sandstone", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));

    public static final RegistryObject<Block> PINK_SANDSTONE_SLAB = BLOCKS.register("pink_sandstone_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB)));

    public static final RegistryObject<Block> PINK_SANDSTONE_STAIRS = BLOCKS.register("pink_sandstone_stairs", () ->
            new StairBlock(() -> ModBlocks.PINK_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS)));

    public static final RegistryObject<Block> PINK_SANDSTONE_WALL = BLOCKS.register("pink_sandstone_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL)));

    public static final RegistryObject<Block> SMOOTH_PINK_SANDSTONE = BLOCKS.register("smooth_pink_sandstone", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));

    public static final RegistryObject<Block> SMOOTH_PINK_SANDSTONE_SLAB = BLOCKS.register("smooth_pink_sandstone_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB)));

    public static final RegistryObject<Block> SMOOTH_PINK_SANDSTONE_STAIRS = BLOCKS.register("smooth_pink_sandstone_stairs", () ->
            new StairBlock(() -> ModBlocks.SMOOTH_PINK_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS)));

    public static final RegistryObject<Block> CUT_PINK_SANDSTONE = BLOCKS.register("cut_pink_sandstone", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));

    public static final RegistryObject<Block> CUT_PINK_SANDSTONE_SLAB = BLOCKS.register("cut_pink_sandstone_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB)));

    public static final RegistryObject<Block> CHISELED_PINK_SANDSTONE = BLOCKS.register("chiseled_pink_sandstone", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));


    public static final RegistryObject<Block> SCHIST_BLOCK = BLOCKS.register("schist_block", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE)));

    public static final RegistryObject<Block> SCHIST_SLAB = BLOCKS.register("schist_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB)));

    public static final RegistryObject<Block> SCHIST_STAIRS = BLOCKS.register("schist_stairs", () ->
            new StairBlock(() -> ModBlocks.SCHIST_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS)));

    public static final RegistryObject<Block> SCHIST_WALL = BLOCKS.register("schist_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL))
    );

    public static final RegistryObject<Block> POLISHED_SCHIST_BLOCK = BLOCKS.register( "polished_schist_block", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> POLISHED_SCHIST_SLAB = BLOCKS.register( "polished_schist_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB)));

    public static final RegistryObject<Block> POLISHED_SCHIST_STAIRS = BLOCKS.register( "polished_schist_stairs", () ->
            new StairBlock(() -> ModBlocks.POLISHED_SCHIST_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS)));

    public static final RegistryObject<Block> POLISHED_SCHIST_WALL = BLOCKS.register( "polished_schist_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL))
    );

    public static final RegistryObject<Block> PECULIAR_SAND = BLOCKS.register("peculiar_sand", () ->
            new SandBlock(11098145, BlockBehaviour.Properties.copy(Blocks.SAND)));

    public static final RegistryObject<Block> PECULIAR_SANDSTONE = BLOCKS.register("peculiar_sandstone", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));

    public static final RegistryObject<Block> PECULIAR_SANDSTONE_SLAB = BLOCKS.register("peculiar_sandstone_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB)));

    public static final RegistryObject<Block> PECULIAR_SANDSTONE_STAIRS = BLOCKS.register("peculiar_sandstone_stairs", () ->
            new StairBlock(() -> ModBlocks.PECULIAR_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS)));

    public static final RegistryObject<Block> PECULIAR_SANDSTONE_WALL = BLOCKS.register("peculiar_sandstone_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL)));

    public static final RegistryObject<Block> SMOOTH_PECULIAR_SANDSTONE = BLOCKS.register("smooth_peculiar_sandstone", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));

    public static final RegistryObject<Block> SMOOTH_PECULIAR_SANDSTONE_SLAB = BLOCKS.register("smooth_peculiar_sandstone_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB)));

    public static final RegistryObject<Block> SMOOTH_PECULIAR_SANDSTONE_STAIRS = BLOCKS.register("smooth_peculiar_sandstone_stairs", () ->
            new StairBlock(() -> ModBlocks.SMOOTH_PECULIAR_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS)));

    public static final RegistryObject<Block> ABNORMAL_SAND = BLOCKS.register("abnormal_sand", () ->
            new SandBlock(11098145, BlockBehaviour.Properties.copy(Blocks.SAND)));

    public static final RegistryObject<Block> ABNORMAL_SANDSTONE = BLOCKS.register("abnormal_sandstone", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));

    public static final RegistryObject<Block> ABNORMAL_SANDSTONE_SLAB = BLOCKS.register("abnormal_sandstone_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB)));

    public static final RegistryObject<Block> ABNORMAL_SANDSTONE_STAIRS = BLOCKS.register("abnormal_sandstone_stairs", () ->
            new StairBlock(() -> ModBlocks.ABNORMAL_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS)));

    public static final RegistryObject<Block> ABNORMAL_SANDSTONE_WALL = BLOCKS.register("abnormal_sandstone_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL)));

    public static final RegistryObject<Block> SMOOTH_ABNORMAL_SANDSTONE = BLOCKS.register("smooth_abnormal_sandstone", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));

    public static final RegistryObject<Block> SMOOTH_ABNORMAL_SANDSTONE_SLAB = BLOCKS.register("smooth_abnormal_sandstone_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB)));

    public static final RegistryObject<Block> SMOOTH_ABNORMAL_SANDSTONE_STAIRS = BLOCKS.register("smooth_abnormal_sandstone_stairs", () ->
            new StairBlock(() -> ModBlocks.SMOOTH_ABNORMAL_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS)));

    public static final RegistryObject<Block> PURPLE_PINCULE = BLOCKS.register("purple_pincule", () ->
            new PinculeBlock(BlockBehaviour.Properties.copy(Blocks.CACTUS)));

    public static final RegistryObject<Block> ORANGE_PINCULE = BLOCKS.register("orange_pincule", () ->
            new PinculeBlock(BlockBehaviour.Properties.copy(Blocks.CACTUS)));

    public static final RegistryObject<Block> YELLOW_PINCULE = BLOCKS.register("yellow_pincule", () ->
            new PinculeBlock(BlockBehaviour.Properties.copy(Blocks.CACTUS)));

    public static final RegistryObject<Block> GREEN_PINCULE = BLOCKS.register("green_pincule", () ->
            new PinculeBlock(BlockBehaviour.Properties.copy(Blocks.CACTUS)));

    public static final RegistryObject<Block> BLUE_PINCULE = BLOCKS.register("blue_pincule", () ->
            new PinculeBlock(BlockBehaviour.Properties.copy(Blocks.CACTUS)));

    public static final RegistryObject<Block> PINK_PINCULE = BLOCKS.register("pink_pincule", () ->
            new PinculeBlock(BlockBehaviour.Properties.copy(Blocks.CACTUS)));

    public static final RegistryObject<Block> PURIFIED_PRISMATIC_GLASS = BLOCKS.register("purified_prismatic_glass", () ->
            new GlassBlock(BlockBehaviour.Properties
                    .of()
                    .strength(0.3f, 0.3f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
            )
    );

    public static final RegistryObject<Block> GALAXY_WARP = BLOCKS.register("galaxy_warp", () ->
            new GalaxyWarpBlock(BlockBehaviour.Properties.copy(Blocks.END_PORTAL_FRAME)));

    public static final RegistryObject<Block> CRACKED_GALAXY_WARP = BLOCKS.register("cracked_galaxy_warp", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.END_PORTAL_FRAME)));

    public static final RegistryObject<LiquidBlock> PINK_ESSENCE_BLOCK = BLOCKS.register("pink_essence_block", () ->
            new EssenceBlock(ModFluids.PINK_ESSENCE, BlockBehaviour.Properties.copy(Blocks.WATER)));

    public static final RegistryObject<LiquidBlock> BLUE_ESSENCE_BLOCK = BLOCKS.register("blue_essence_block", () ->
            new EssenceBlock(ModFluids.BLUE_ESSENCE, BlockBehaviour.Properties.copy(Blocks.WATER)));

    public static final RegistryObject<LiquidBlock> YELLOW_ESSENCE_BLOCK = BLOCKS.register("yellow_essence_block", () ->
            new EssenceBlock(ModFluids.YELLOW_ESSENCE, BlockBehaviour.Properties.copy(Blocks.WATER)));

    public static final RegistryObject<LiquidBlock> WHITE_ESSENCE_BLOCK = BLOCKS.register("white_essence_block", () ->
            new EssenceBlock(ModFluids.WHITE_ESSENCE, BlockBehaviour.Properties.copy(Blocks.WATER)));

    public static final RegistryObject<Block> CONGEALED_WHITE_ESSENCE_BLOCK = BLOCKS.register("congealed_white_essence_block", () ->
            new SlimeBlock(BlockBehaviour.Properties.copy(Blocks.SLIME_BLOCK)));

    public static final RegistryObject<Block> CONGEALED_PINK_ESSENCE_BLOCK = BLOCKS.register("congealed_pink_essence_block", () ->
            new SlimeBlock(BlockBehaviour.Properties.copy(Blocks.SLIME_BLOCK)));

    public static final RegistryObject<Block> CONGEALED_YELLOW_ESSENCE_BLOCK = BLOCKS.register("congealed_yellow_essence_block", () ->
            new SlimeBlock(BlockBehaviour.Properties.copy(Blocks.SLIME_BLOCK)));

    public static final RegistryObject<Block> CONGEALED_BLUE_ESSENCE_BLOCK = BLOCKS.register("congealed_blue_essence_block", () ->
            new SlimeBlock(BlockBehaviour.Properties.copy(Blocks.SLIME_BLOCK)));

    public static final RegistryObject<Block> TUNGSTEN_ORE = BLOCKS.register("tungsten_ore", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));

    public static final RegistryObject<Block> DEEPSLATE_TUNGSTEN_ORE = BLOCKS.register("deepslate_tungsten_ore", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)));

    public static final RegistryObject<Block> PEGMATITE_TUNGSTEN_ORE = BLOCKS.register("pegmatite_tungsten_ore", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)));

    public static final RegistryObject<Block> TUNGSTEN_BLOCK = BLOCKS.register("tungsten_block", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> RAW_TUNGSTEN_BLOCK = BLOCKS.register("raw_tungsten_block", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK)));

    public static final RegistryObject<Block> PYRITE_ORE = BLOCKS.register("pyrite_ore", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE)));

    public static final RegistryObject<Block> RAW_PYRITE_BLOCK = BLOCKS.register("raw_pyrite_block", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.RAW_GOLD_BLOCK)));

    public static final RegistryObject<Block> THULITE_ORE = BLOCKS.register("thulite_ore", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).lightLevel((state) -> {
                return 5;
            })));

    public static final RegistryObject<Block> THULITE_BLOCK = BLOCKS.register("thulite_block", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> RAW_THULITE_BLOCK = BLOCKS.register("raw_thulite_block", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK)));

    public static final RegistryObject<Block> ELECTRUM_ORE = BLOCKS.register("electrum_ore", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).lightLevel((state) -> {
                return 5;
            })));

    public static final RegistryObject<Block> ELECTRUM_BLOCK = BLOCKS.register("electrum_block", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> RAW_ELECTRUM_BLOCK = BLOCKS.register("raw_electrum_block", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK)));

    public static final RegistryObject<Block> ANATASE_ORE = BLOCKS.register("anatase_ore", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).lightLevel((state) -> {
                return 5;
            })));

    public static final RegistryObject<Block> ANATASE_BLOCK = BLOCKS.register("anatase_block", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> RAW_ANATASE_BLOCK = BLOCKS.register("raw_anatase_block", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK)));

    public static final RegistryObject<Block> PLATINUM_ORE = BLOCKS.register("platinum_ore", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).lightLevel((state) -> {
                return 5;
            })));

    public static final RegistryObject<Block> PLATINUM_BLOCK = BLOCKS.register("platinum_block", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> RAW_PLATINUM_BLOCK = BLOCKS.register("raw_platinum_block", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK)));

    public static final RegistryObject<Block> PYRITE_BLOCK = BLOCKS.register("pyrite_block", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)));

    public static final RegistryObject<Block> GEODE_CRYSTAL_BLOCK = BLOCKS.register("geode_crystal_block", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));

    public static final RegistryObject<Block> RYOLITE_BLOCK = BLOCKS.register("ryolite_block", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> RYOLITE_SLAB = BLOCKS.register("ryolite_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB)));

    public static final RegistryObject<Block> RYOLITE_STAIRS = BLOCKS.register("ryolite_stairs", () ->
            new StairBlock(() -> ModBlocks.RYOLITE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS)));

    public static final RegistryObject<Block> RYOLITE_WALL = BLOCKS.register("ryolite_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL))
    );

    public static final RegistryObject<Block> POLISHED_RYOLITE_BLOCK = BLOCKS.register( "polished_ryolite_block", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> POLISHED_RYOLITE_SLAB = BLOCKS.register( "polished_ryolite_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB)));

    public static final RegistryObject<Block> POLISHED_RYOLITE_STAIRS = BLOCKS.register( "polished_ryolite_stairs", () ->
            new StairBlock(() -> ModBlocks.RYOLITE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS)));

    public static final RegistryObject<Block> POLISHED_RYOLITE_WALL = BLOCKS.register( "polished_ryolite_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL))
    );

    public static final RegistryObject<Block> PEGMATITE = BLOCKS.register("pegmatite", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> PEGMATITE_SLAB = BLOCKS.register("pegmatite_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB)));

    public static final RegistryObject<Block> PEGMATITE_STAIRS = BLOCKS.register("pegmatite_stairs", () ->
            new StairBlock(() -> ModBlocks.PEGMATITE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS)));

    public static final RegistryObject<Block> PEGMATITE_WALL = BLOCKS.register("pegmatite_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL))
    );

    public static final RegistryObject<Block> COBBLED_PEGMATITE = BLOCKS.register("cobbled_pegmatite", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

    public static final RegistryObject<Block> COBBLED_PEGMATITE_SLAB = BLOCKS.register("cobbled_pegmatite_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB)));

    public static final RegistryObject<Block> COBBLED_PEGMATITE_STAIRS = BLOCKS.register("cobbled_pegmatite_stairs", () ->
            new StairBlock(() -> ModBlocks.COBBLED_PEGMATITE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS)));

    public static final RegistryObject<Block> COBBLED_PEGMATITE_WALL = BLOCKS.register("cobbled_pegmatite_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL))
    );

    public static final RegistryObject<Block> PHOSPHORUS_LAMP = BLOCKS.register("phosphorus_lamp", () ->
            new PhosphorusBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)));

    public static final RegistryObject<Block> RED_PHOSPHORUS_LAMP = BLOCKS.register("red_phosphorus_lamp", () ->
            new PhosphorusBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)));

    public static final RegistryObject<Block> ORANGE_PHOSPHORUS_LAMP = BLOCKS.register("orange_phosphorus_lamp", () ->
            new PhosphorusBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)));

    public static final RegistryObject<Block> YELLOW_PHOSPHORUS_LAMP = BLOCKS.register("yellow_phosphorus_lamp", () ->
            new PhosphorusBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)));

    public static final RegistryObject<Block> LIME_PHOSPHORUS_LAMP = BLOCKS.register("lime_phosphorus_lamp", () ->
            new PhosphorusBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)));

    public static final RegistryObject<Block> GREEN_PHOSPHORUS_LAMP = BLOCKS.register("green_phosphorus_lamp", () ->
            new PhosphorusBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)));

    public static final RegistryObject<Block> CYAN_PHOSPHORUS_LAMP = BLOCKS.register("cyan_phosphorus_lamp", () ->
            new PhosphorusBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)));

    public static final RegistryObject<Block> LIGHT_BLUE_PHOSPHORUS_LAMP = BLOCKS.register("light_blue_phosphorus_lamp", () ->
            new PhosphorusBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)));

    public static final RegistryObject<Block> BLUE_PHOSPHORUS_LAMP = BLOCKS.register("blue_phosphorus_lamp", () ->
            new PhosphorusBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)));

    public static final RegistryObject<Block> PURPLE_PHOSPHORUS_LAMP = BLOCKS.register("purple_phosphorus_lamp", () ->
            new PhosphorusBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)));

    public static final RegistryObject<Block> MAGENTA_PHOSPHORUS_LAMP = BLOCKS.register("magenta_phosphorus_lamp", () ->
            new PhosphorusBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)));

    public static final RegistryObject<Block> PINK_PHOSPHORUS_LAMP = BLOCKS.register("pink_phosphorus_lamp", () ->
            new PhosphorusBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)));

    public static final RegistryObject<Block> LIGHT_GRAY_PHOSPHORUS_LAMP = BLOCKS.register("light_gray_phosphorus_lamp", () ->
            new PhosphorusBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)));

    public static final RegistryObject<Block> GRAY_PHOSPHORUS_LAMP = BLOCKS.register("gray_phosphorus_lamp", () ->
            new PhosphorusBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)));

    public static final RegistryObject<Block> BLACK_PHOSPHORUS_LAMP = BLOCKS.register("black_phosphorus_lamp", () ->
            new PhosphorusBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)));

    public static final RegistryObject<Block> BROWN_PHOSPHORUS_LAMP = BLOCKS.register("brown_phosphorus_lamp", () ->
            new PhosphorusBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)));

    public static final RegistryObject<Block> SELENITE_CLUSTER = BLOCKS.register("selenite_cluster", () ->
            new SeleniteClusterBlock(7, 3, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).sound(SoundType.STONE)));

    public static final RegistryObject<Block> BUDDING_SELENITE = BLOCKS.register("budding_selenite", () ->
            new BuddingSeleniteBlock(BlockBehaviour.Properties.copy(Blocks.BUDDING_AMETHYST).sound(SoundType.STONE)));

    public static final RegistryObject<Block> ROUGH_SELENITE = BLOCKS.register("rough_selenite", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK)));

    public static final RegistryObject<Block> SELENITE = BLOCKS.register("selenite", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK)));

    public static final RegistryObject<Block> SELENITE_SLAB = BLOCKS.register("selenite_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_SLAB)));

    public static final RegistryObject<Block> SELENITE_STAIRS = BLOCKS.register("selenite_stairs", () ->
            new StairBlock(() -> ModBlocks.SELENITE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.QUARTZ_STAIRS)));

    public static final RegistryObject<Block> SELENITE_WALL = BLOCKS.register("selenite_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL))
    );

    public static final RegistryObject<Block> POLISHED_SELENITE = BLOCKS.register("polished_selenite", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_QUARTZ)));

    public static final RegistryObject<Block> POLISHED_SELENITE_SLAB = BLOCKS.register("polished_selenite_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_SLAB)));

    public static final RegistryObject<Block> POLISHED_SELENITE_STAIRS = BLOCKS.register("polished_selenite_stairs", () ->
            new StairBlock(() -> ModBlocks.POLISHED_SELENITE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.QUARTZ_STAIRS)));

    public static final RegistryObject<Block> POLISHED_SELENITE_WALL = BLOCKS.register("polished_selenite_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL))
    );

    public static final RegistryObject<Block> PRIMED_SELENITE = BLOCKS.register("primed_selenite", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_QUARTZ)));

    public static final RegistryObject<Block> ALIEN_FLOWER = BLOCKS.register("alien_flower", () ->
            new FlowerBlock(ModEffects.FLORAL_PROTECTION, 100, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> WHITE_IRIS = BLOCKS.register("white_iris", () ->
            new FlowerBlock(MobEffects.DARKNESS, 100, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> PINK_THISTLE = BLOCKS.register("pink_thistle", () ->
            new FlowerBlock(MobEffects.HUNGER, 100, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> PANSIE = BLOCKS.register("pansie", () ->
            new FlowerBlock(MobEffects.WEAKNESS, 100, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> ORCHID = BLOCKS.register("orchid", () ->
            new FlowerBlock(MobEffects.ABSORPTION, 80, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> NASTURTIUMS = BLOCKS.register("nasturtiums", () ->
            new FlowerBlock(MobEffects.DIG_SLOWDOWN, 100, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> HYDRANGEA_BUSH_WHITE = BLOCKS.register("hydrangea_bush_white", () ->
            new FlowerBlock(MobEffects.REGENERATION, 60, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> HYDRANGEA_BUSH_PINK = BLOCKS.register("hydrangea_bush_pink", () ->
            new FlowerBlock(MobEffects.REGENERATION, 60, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> HYDRANGEA_BUSH_PURPLE = BLOCKS.register("hydrangea_bush_purple", () ->
            new FlowerBlock(MobEffects.REGENERATION, 60, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> HYDRANGEA_BUSH_GREEN = BLOCKS.register("hydrangea_bush_green", () ->
            new FlowerBlock(MobEffects.REGENERATION, 60, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> HYDRANGEA_BUSH_BLUE = BLOCKS.register("hydrangea_bush_blue", () ->
            new FlowerBlock(MobEffects.REGENERATION, 60, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> CROCOSMIA = BLOCKS.register("crocosmia", () ->
            new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.LILAC)));

    public static final RegistryObject<Block> CHRYSANTHEMUM = BLOCKS.register("chrysanthemum", () ->
            new FlowerBlock(ModEffects.PARALYSIS, 100, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> BLUE_PUFFBALL = BLOCKS.register("blue_puffball", () ->
            new FlowerBlock(MobEffects.INVISIBILITY, 100, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> BLUE_BELLS = BLOCKS.register("blue_bells", () ->
            new FlowerBlock(ModEffects.DREAD, 100, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> CLOVERS = BLOCKS.register("clovers", () ->
            new CloverBlock(BlockBehaviour.Properties.copy(Blocks.PINK_PETALS)));

    /*public static final RegistryObject<Block> CRYSTAL_CHEST = BLOCKS.register("crystal_chest", () ->
            new CrystalChestBlock(BlockBehaviour.Properties
                    .of().strength(2.5F)
                    .sound(SoundType.GLASS), () -> {
        return BlockEntityType.CHEST;
    }));*/

    public static final RegistryObject<Block> THULITE_TOWER = BLOCKS.register("thulite_tower", () ->
            new ClusterBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER)));

    public static final RegistryObject<Block> THULITE_CLUSTER = BLOCKS.register("thulite_cluster", () ->
            new ClusterBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER)));


    public static final RegistryObject<Block> CRYSTAL_LOG = BLOCKS.register("crystal_log", () ->
            new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));

    public static final RegistryObject<Block> STRIPPED_CRYSTAL_LOG = BLOCKS.register("stripped_crystal_log", () ->
            new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));

    public static final RegistryObject<Block> CRYSTAL_WOOD = BLOCKS.register("crystal_wood", () ->
            new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));

    public static final RegistryObject<Block> STRIPPED_CRYSTAL_WOOD = BLOCKS.register("stripped_crystal_wood", () ->
            new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));

    public static final RegistryObject<Block> CRYSTAL_LEAVES = BLOCKS.register("crystal_leaves", () ->
            new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });

    public static final RegistryObject<Block> CRYSTAL_SAPLING = BLOCKS.register("crystal_sapling", () ->
            new SaplingBlock(new CrystalTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> CRYSTAL_PLANKS = BLOCKS.register("crystal_planks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> CRYSTAL_SLAB = BLOCKS.register("crystal_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));

    public static final RegistryObject<Block> CRYSTAL_STAIRS = BLOCKS.register("crystal_stairs", () ->
            new StairBlock(() -> ModBlocks.CRYSTAL_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> CRYSTAL_SIGN = BLOCKS.register("crystal_sign", () ->
            new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.CRYSTAL));

    public static final RegistryObject<Block> CRYSTAL_HANGING_SIGN = BLOCKS.register("crystal_hanging_sign", () ->
            new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.CRYSTAL));

    public static final RegistryObject<Block> CRYSTAL_WALL_SIGN = BLOCKS.register("crystal_wall_sign", () ->
            new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.CRYSTAL));

    public static final RegistryObject<Block> CRYSTAL_WALL_HANGING_SIGN = BLOCKS.register("crystal_wall_hanging_sign", () ->
            new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.CRYSTAL));

    public static final RegistryObject<Block> CRYSTAL_FENCE = BLOCKS.register("crystal_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));

    public static final RegistryObject<Block> CRYSTAL_FENCE_GATE = BLOCKS.register("crystal_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> CRYSTAL_DOOR = BLOCKS.register("crystal_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), ModWoodTypes.CRYSTAL.setType()));

    public static final RegistryObject<Block> CRYSTAL_TRAPDOOR = BLOCKS.register("crystal_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), ModWoodTypes.CRYSTAL.setType()));


    public static final RegistryObject<Block> DISTANT_LOG = BLOCKS.register("distant_log", () ->
            new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));

    public static final RegistryObject<Block> STRIPPED_DISTANT_LOG = BLOCKS.register("stripped_distant_log", () ->
            new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));

    public static final RegistryObject<Block> DISTANT_WOOD = BLOCKS.register("distant_wood", () ->
            new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));

    public static final RegistryObject<Block> STRIPPED_DISTANT_WOOD = BLOCKS.register("stripped_distant_wood", () ->
            new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));

    public static final RegistryObject<Block> DISTANT_LEAVES = BLOCKS.register("distant_leaves", () ->
            new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });

    public static final RegistryObject<Block> DISTANT_SAPLING = BLOCKS.register("distant_sapling", () ->
            new SaplingBlock(new DistantTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> DISTANT_PLANKS = BLOCKS.register("distant_planks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
    });

    public static final RegistryObject<Block> DISTANT_SLAB = BLOCKS.register("distant_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));

    public static final RegistryObject<Block> DISTANT_STAIRS = BLOCKS.register("distant_stairs", () ->
            new StairBlock(() -> ModBlocks.DISTANT_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> DISTANT_SIGN = BLOCKS.register("distant_sign", () ->
            new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.DISTANT));

    public static final RegistryObject<Block> DISTANT_HANGING_SIGN = BLOCKS.register("distant_hanging_sign", () ->
            new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.DISTANT));

    public static final RegistryObject<Block> DISTANT_WALL_SIGN = BLOCKS.register("distant_wall_sign", () ->
            new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.DISTANT));

    public static final RegistryObject<Block> DISTANT_WALL_HANGING_SIGN = BLOCKS.register("distant_wall_hanging_sign", () ->
            new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.DISTANT));

    public static final RegistryObject<Block> DISTANT_FENCE = BLOCKS.register("distant_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));

    public static final RegistryObject<Block> DISTANT_FENCE_GATE = BLOCKS.register("distant_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> DISTANT_DOOR = BLOCKS.register("distant_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), ModWoodTypes.DISTANT.setType()));

    public static final RegistryObject<Block> DISTANT_TRAPDOOR = BLOCKS.register("distant_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), ModWoodTypes.DISTANT.setType()));

    public static final RegistryObject<Block> VERDANT_PINE_LOG = BLOCKS.register("verdant_pine_log", () ->
            new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));

    public static final RegistryObject<Block> STRIPPED_VERDANT_PINE_LOG = BLOCKS.register("stripped_verdant_pine_log", () ->
            new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));

    public static final RegistryObject<Block> VERDANT_PINE_WOOD = BLOCKS.register("verdant_pine_wood", () ->
            new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));

    public static final RegistryObject<Block> STRIPPED_VERDANT_PINE_WOOD = BLOCKS.register("stripped_verdant_pine_wood", () ->
            new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));

    public static final RegistryObject<Block> VERDANT_PINE_LEAVES = BLOCKS.register("verdant_pine_leaves", () ->
            new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });

    public static final RegistryObject<Block> VERDANT_PINE_SAPLING = BLOCKS.register("verdant_pine_sapling", () ->
            new SaplingBlock(new VerdantPineTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> VERDANT_PINE_PLANKS = BLOCKS.register("verdant_pine_planks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> VERDANT_PINE_SLAB = BLOCKS.register("verdant_pine_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));

    public static final RegistryObject<Block> VERDANT_PINE_STAIRS = BLOCKS.register("verdant_pine_stairs", () ->
            new StairBlock(() -> ModBlocks.VERDANT_PINE_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> VERDANT_PINE_SIGN = BLOCKS.register("verdant_pine_sign", () ->
            new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.VERDANT_PINE));

    public static final RegistryObject<Block> VERDANT_PINE_HANGING_SIGN = BLOCKS.register("verdant_pine_hanging_sign", () ->
            new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.VERDANT_PINE));

    public static final RegistryObject<Block> VERDANT_PINE_WALL_SIGN = BLOCKS.register("verdant_pine_wall_sign", () ->
            new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.VERDANT_PINE));

    public static final RegistryObject<Block> VERDANT_PINE_WALL_HANGING_SIGN = BLOCKS.register("verdant_pine_wall_hanging_sign", () ->
            new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.VERDANT_PINE));

    public static final RegistryObject<Block> VERDANT_PINE_FENCE = BLOCKS.register("verdant_pine_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));

    public static final RegistryObject<Block> VERDANT_PINE_FENCE_GATE = BLOCKS.register("verdant_pine_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> VERDANT_PINE_DOOR = BLOCKS.register("verdant_pine_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), ModWoodTypes.VERDANT_PINE.setType()));

    public static final RegistryObject<Block> VERDANT_PINE_TRAPDOOR = BLOCKS.register("verdant_pine_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), ModWoodTypes.VERDANT_PINE.setType()));

    public static final RegistryObject<Block> ASTER_LOG = BLOCKS.register("aster_log", () ->
            new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));

    public static final RegistryObject<Block> STRIPPED_ASTER_LOG = BLOCKS.register("stripped_aster_log", () ->
            new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));

    public static final RegistryObject<Block> ASTER_WOOD = BLOCKS.register("aster_wood", () ->
            new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));

    public static final RegistryObject<Block> STRIPPED_ASTER_WOOD = BLOCKS.register("stripped_aster_wood", () ->
            new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));

    public static final RegistryObject<Block> ASTER_PLANKS = BLOCKS.register("aster_planks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> ASTER_SLAB = BLOCKS.register("aster_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));

    public static final RegistryObject<Block> ASTER_STAIRS = BLOCKS.register("aster_stairs", () ->
            new StairBlock(() -> ModBlocks.ASTER_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> ASTER_SIGN = BLOCKS.register("aster_sign", () ->
            new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.ASTER));

    public static final RegistryObject<Block> ASTER_HANGING_SIGN = BLOCKS.register("aster_hanging_sign", () ->
            new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.ASTER));

    public static final RegistryObject<Block> ASTER_WALL_SIGN = BLOCKS.register("aster_wall_sign", () ->
            new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.ASTER));

    public static final RegistryObject<Block> ASTER_WALL_HANGING_SIGN = BLOCKS.register("aster_wall_hanging_sign", () ->
            new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.ASTER));

    public static final RegistryObject<Block> ASTER_FENCE = BLOCKS.register("aster_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));

    public static final RegistryObject<Block> ASTER_FENCE_GATE = BLOCKS.register("aster_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> ASTER_DOOR = BLOCKS.register("aster_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), ModWoodTypes.ASTER.setType()));

    public static final RegistryObject<Block> ASTER_TRAPDOOR = BLOCKS.register("aster_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), ModWoodTypes.ASTER.setType()));



    public static final RegistryObject<Block> KALEIDOSCOPE_LOG = BLOCKS.register("kaleidoscope_log", () ->
            new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));

    public static final RegistryObject<Block> STRIPPED_KALEIDOSCOPE_LOG = BLOCKS.register("stripped_kaleidoscope_log", () ->
            new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));

    public static final RegistryObject<Block> KALEIDOSCOPE_WOOD = BLOCKS.register("kaleidoscope_wood", () ->
            new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));

    public static final RegistryObject<Block> STRIPPED_KALEIDOSCOPE_WOOD = BLOCKS.register("stripped_kaleidoscope_wood", () ->
            new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));

    public static final RegistryObject<Block> KALEIDOSCOPE_LEAVES = BLOCKS.register("kaleidoscope_leaves", () ->
            new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });

    public static final RegistryObject<Block> KALEIDOSCOPE_SAPLING = BLOCKS.register("kaleidoscope_sapling", () ->
            new SaplingBlock(new KaleidoscopeTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> KALEIDOSCOPE_PLANKS = BLOCKS.register("kaleidoscope_planks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> KALEIDOSCOPE_SLAB = BLOCKS.register("kaleidoscope_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));

    public static final RegistryObject<Block> KALEIDOSCOPE_STAIRS = BLOCKS.register("kaleidoscope_stairs", () ->
            new StairBlock(() -> ModBlocks.KALEIDOSCOPE_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> KALEIDOSCOPE_SIGN = BLOCKS.register("kaleidoscope_sign", () ->
            new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.KALEIDOSCOPE));

    public static final RegistryObject<Block> KALEIDOSCOPE_HANGING_SIGN = BLOCKS.register("kaleidoscope_hanging_sign", () ->
            new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.KALEIDOSCOPE));

    public static final RegistryObject<Block> KALEIDOSCOPE_WALL_SIGN = BLOCKS.register("kaleidoscope_wall_sign", () ->
            new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.KALEIDOSCOPE));

    public static final RegistryObject<Block> KALEIDOSCOPE_WALL_HANGING_SIGN = BLOCKS.register("kaleidoscope_wall_hanging_sign", () ->
            new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.KALEIDOSCOPE));

    public static final RegistryObject<Block> KALEIDOSCOPE_FENCE = BLOCKS.register("kaleidoscope_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));

    public static final RegistryObject<Block> KALEIDOSCOPE_FENCE_GATE = BLOCKS.register("kaleidoscope_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> KALEIDOSCOPE_DOOR = BLOCKS.register("kaleidoscope_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), ModWoodTypes.KALEIDOSCOPE.setType()));

    public static final RegistryObject<Block> KALEIDOSCOPE_TRAPDOOR = BLOCKS.register("kaleidoscope_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), ModWoodTypes.KALEIDOSCOPE.setType()));

    public static final RegistryObject<Block> SHADED_LOG = BLOCKS.register("shaded_log", () ->
            new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));

    public static final RegistryObject<Block> STRIPPED_SHADED_LOG = BLOCKS.register("stripped_shaded_log", () ->
            new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));

    public static final RegistryObject<Block> SHADED_WOOD = BLOCKS.register("shaded_wood", () ->
            new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));

    public static final RegistryObject<Block> STRIPPED_SHADED_WOOD = BLOCKS.register("stripped_shaded_wood", () ->
            new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));

    public static final RegistryObject<Block> SHADED_LEAVES = BLOCKS.register("shaded_leaves", () ->
            new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });

    public static final RegistryObject<Block> SHADED_SAPLING = BLOCKS.register("shaded_sapling", () ->
            new SaplingBlock(new ShadedTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> SHADED_PLANKS = BLOCKS.register("shaded_planks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> SHADED_SLAB = BLOCKS.register("shaded_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));

    public static final RegistryObject<Block> SHADED_STAIRS = BLOCKS.register("shaded_stairs", () ->
            new StairBlock(() -> ModBlocks.SHADED_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> SHADED_SIGN = BLOCKS.register("shaded_sign", () ->
            new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.SHADED));

    public static final RegistryObject<Block> SHADED_HANGING_SIGN = BLOCKS.register("shaded_hanging_sign", () ->
            new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.SHADED));

    public static final RegistryObject<Block> SHADED_WALL_SIGN = BLOCKS.register("shaded_wall_sign", () ->
            new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.SHADED));

    public static final RegistryObject<Block> SHADED_WALL_HANGING_SIGN = BLOCKS.register("shaded_wall_hanging_sign", () ->
            new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.SHADED));

    public static final RegistryObject<Block> SHADED_FENCE = BLOCKS.register("shaded_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));

    public static final RegistryObject<Block> SHADED_FENCE_GATE = BLOCKS.register("shaded_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> SHADED_DOOR = BLOCKS.register("shaded_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), ModWoodTypes.SHADED.setType()));

    public static final RegistryObject<Block> SHADED_TRAPDOOR = BLOCKS.register("shaded_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), ModWoodTypes.SHADED.setType()));

    public static final RegistryObject<Block> BARBATINE = BLOCKS.register("barbatine", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> RED_BARBATINE = BLOCKS.register("red_barbatine", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> ORANGE_BARBATINE = BLOCKS.register("orange_barbatine", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> YELLOW_BARBATINE = BLOCKS.register("yellow_barbatine", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> LIME_BARBATINE = BLOCKS.register("lime_barbatine", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> GREEN_BARBATINE = BLOCKS.register("green_barbatine", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> CYAN_BARBATINE = BLOCKS.register("cyan_barbatine", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> LIGHT_BLUE_BARBATINE = BLOCKS.register("light_blue_barbatine", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> BLUE_BARBATINE = BLOCKS.register("blue_barbatine", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> PURPLE_BARBATINE = BLOCKS.register("purple_barbatine", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> MAGENTA_BARBATINE = BLOCKS.register("magenta_barbatine", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> PINK_BARBATINE = BLOCKS.register("pink_barbatine", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> WHITE_BARBATINE = BLOCKS.register("white_barbatine", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> LIGHT_GRAY_BARBATINE = BLOCKS.register("light_gray_barbatine", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> GRAY_BARBATINE = BLOCKS.register("gray_barbatine", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> BLACK_BARBATINE = BLOCKS.register("black_barbatine", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> BROWN_BARBATINE = BLOCKS.register("brown_barbatine", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));


    public static final RegistryObject<Block> RED_LATTICE = BLOCKS.register("red_lattice", () ->
            new LatticeBlock(BlockBehaviour.Properties.of().strength(0.3f, 0.3f)
                    .sound(SoundType.METAL).requiresCorrectToolForDrops().noOcclusion()));

    public static final RegistryObject<Block> ORANGE_LATTICE = BLOCKS.register("orange_lattice", () ->
            new LatticeBlock(BlockBehaviour.Properties.of().strength(0.3f, 0.3f)
                    .sound(SoundType.METAL).requiresCorrectToolForDrops().noOcclusion()));

    public static final RegistryObject<Block> YELLOW_LATTICE = BLOCKS.register("yellow_lattice", () ->
            new LatticeBlock(BlockBehaviour.Properties.of().strength(0.3f, 0.3f)
                    .sound(SoundType.METAL).requiresCorrectToolForDrops().noOcclusion()));

    public static final RegistryObject<Block> LIME_LATTICE = BLOCKS.register("lime_lattice", () ->
            new LatticeBlock(BlockBehaviour.Properties.of().strength(0.3f, 0.3f)
                    .sound(SoundType.METAL).requiresCorrectToolForDrops().noOcclusion()));

    public static final RegistryObject<Block> GREEN_LATTICE = BLOCKS.register("green_lattice", () ->
            new LatticeBlock(BlockBehaviour.Properties.of().strength(0.3f, 0.3f)
                    .sound(SoundType.METAL).requiresCorrectToolForDrops().noOcclusion()));

    public static final RegistryObject<Block> CYAN_LATTICE = BLOCKS.register("cyan_lattice", () ->
            new LatticeBlock(BlockBehaviour.Properties.of().strength(0.3f, 0.3f)
                    .sound(SoundType.METAL).requiresCorrectToolForDrops().noOcclusion()));

    public static final RegistryObject<Block> LIGHT_BLUE_LATTICE = BLOCKS.register("light_blue_lattice", () ->
            new LatticeBlock(BlockBehaviour.Properties.of().strength(0.3f, 0.3f)
                    .sound(SoundType.METAL).requiresCorrectToolForDrops().noOcclusion()));

    public static final RegistryObject<Block> BLUE_LATTICE = BLOCKS.register("blue_lattice", () ->
            new LatticeBlock(BlockBehaviour.Properties.of().strength(0.3f, 0.3f)
                    .sound(SoundType.METAL).requiresCorrectToolForDrops().noOcclusion()));

    public static final RegistryObject<Block> PURPLE_LATTICE = BLOCKS.register("purple_lattice", () ->
            new LatticeBlock(BlockBehaviour.Properties.of().strength(0.3f, 0.3f)
                    .sound(SoundType.METAL).requiresCorrectToolForDrops().noOcclusion()));

    public static final RegistryObject<Block> MAGENTA_LATTICE = BLOCKS.register("magenta_lattice", () ->
            new LatticeBlock(BlockBehaviour.Properties.of().strength(0.3f, 0.3f)
                    .sound(SoundType.METAL).requiresCorrectToolForDrops().noOcclusion()));

    public static final RegistryObject<Block> PINK_LATTICE = BLOCKS.register("pink_lattice", () ->
            new LatticeBlock(BlockBehaviour.Properties.of().strength(0.3f, 0.3f)
                    .sound(SoundType.METAL).requiresCorrectToolForDrops().noOcclusion()));

    public static final RegistryObject<Block> WHITE_LATTICE = BLOCKS.register("white_lattice", () ->
            new LatticeBlock(BlockBehaviour.Properties.of().strength(0.3f, 0.3f)
                    .sound(SoundType.METAL).requiresCorrectToolForDrops().noOcclusion()));

    public static final RegistryObject<Block> LIGHT_GRAY_LATTICE = BLOCKS.register("light_gray_lattice", () ->
            new LatticeBlock(BlockBehaviour.Properties.of().strength(0.3f, 0.3f)
                    .sound(SoundType.METAL).requiresCorrectToolForDrops().noOcclusion()));

    public static final RegistryObject<Block> GRAY_LATTICE = BLOCKS.register("gray_lattice", () ->
            new LatticeBlock(BlockBehaviour.Properties.of().strength(0.3f, 0.3f)
                    .sound(SoundType.METAL).requiresCorrectToolForDrops().noOcclusion()));

    public static final RegistryObject<Block> BLACK_LATTICE = BLOCKS.register("black_lattice", () ->
            new LatticeBlock(BlockBehaviour.Properties.of().strength(0.3f, 0.3f)
                    .sound(SoundType.METAL).requiresCorrectToolForDrops().noOcclusion()));

    public static final RegistryObject<Block> BROWN_LATTICE = BLOCKS.register("brown_lattice", () ->
            new LatticeBlock(BlockBehaviour.Properties.of().strength(0.3f, 0.3f)
                    .sound(SoundType.METAL).requiresCorrectToolForDrops().noOcclusion()));


    public static final RegistryObject<Block> RED_DIAMOND_GLASS = BLOCKS.register("red_diamond_glass", () ->
            new GlassBlock(BlockBehaviour.Properties
                    .of()
                    .strength(0.3f, 0.3f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
            )
    );

    public static final RegistryObject<Block> ORANGE_DIAMOND_GLASS = BLOCKS.register("orange_diamond_glass", () ->
            new GlassBlock(BlockBehaviour.Properties
                    .of()
                    .strength(0.3f, 0.3f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
            )
    );

    public static final RegistryObject<Block> YELLOW_DIAMOND_GLASS = BLOCKS.register("yellow_diamond_glass", () ->
            new GlassBlock(BlockBehaviour.Properties
                    .of()
                    .strength(0.3f, 0.3f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
            )
    );

    public static final RegistryObject<Block> LIME_DIAMOND_GLASS = BLOCKS.register("lime_diamond_glass", () ->
            new GlassBlock(BlockBehaviour.Properties
                    .of()
                    .strength(0.3f, 0.3f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
            )
    );

    public static final RegistryObject<Block> GREEN_DIAMOND_GLASS = BLOCKS.register("green_diamond_glass", () ->
            new GlassBlock(BlockBehaviour.Properties
                    .of()
                    .strength(0.3f, 0.3f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
            )
    );

    public static final RegistryObject<Block> CYAN_DIAMOND_GLASS = BLOCKS.register("cyan_diamond_glass", () ->
            new GlassBlock(BlockBehaviour.Properties
                    .of()
                    .strength(0.3f, 0.3f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
            )
    );

    public static final RegistryObject<Block> LIGHT_BLUE_DIAMOND_GLASS = BLOCKS.register("light_blue_diamond_glass", () ->
            new GlassBlock(BlockBehaviour.Properties
                    .of()
                    .strength(0.3f, 0.3f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
            )
    );

    public static final RegistryObject<Block> BLUE_DIAMOND_GLASS = BLOCKS.register("blue_diamond_glass", () ->
            new GlassBlock(BlockBehaviour.Properties
                    .of()
                    .strength(0.3f, 0.3f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
            )
    );

    public static final RegistryObject<Block> PURPLE_DIAMOND_GLASS = BLOCKS.register("purple_diamond_glass", () ->
            new GlassBlock(BlockBehaviour.Properties
                    .of()
                    .strength(0.3f, 0.3f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
            )
    );

    public static final RegistryObject<Block> MAGENTA_DIAMOND_GLASS = BLOCKS.register("magenta_diamond_glass", () ->
            new GlassBlock(BlockBehaviour.Properties
                    .of()
                    .strength(0.3f, 0.3f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
            )
    );

    public static final RegistryObject<Block> PINK_DIAMOND_GLASS = BLOCKS.register("pink_diamond_glass", () ->
            new GlassBlock(BlockBehaviour.Properties
                    .of()
                    .strength(0.3f, 0.3f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
            )
    );

    public static final RegistryObject<Block> WHITE_DIAMOND_GLASS = BLOCKS.register("white_diamond_glass", () ->
            new GlassBlock(BlockBehaviour.Properties
                    .of()
                    .strength(0.3f, 0.3f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
            )
    );

    public static final RegistryObject<Block> LIGHT_GRAY_DIAMOND_GLASS = BLOCKS.register("light_gray_diamond_glass", () ->
            new GlassBlock(BlockBehaviour.Properties
                    .of()
                    .strength(0.3f, 0.3f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
            )
    );

    public static final RegistryObject<Block> GRAY_DIAMOND_GLASS = BLOCKS.register("gray_diamond_glass", () ->
            new GlassBlock(BlockBehaviour.Properties
                    .of()
                    .strength(0.3f, 0.3f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
            )
    );

    public static final RegistryObject<Block> BLACK_DIAMOND_GLASS = BLOCKS.register("black_diamond_glass", () ->
            new GlassBlock(BlockBehaviour.Properties
                    .of()
                    .strength(0.3f, 0.3f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
            )
    );

    public static final RegistryObject<Block> BROWN_DIAMOND_GLASS = BLOCKS.register("brown_diamond_glass", () ->
            new GlassBlock(BlockBehaviour.Properties
                    .of()
                    .strength(0.3f, 0.3f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
            )
    );

    public static final RegistryObject<Block> PRISMATIC_DIAMOND_GLASS = BLOCKS.register("prismatic_diamond_glass", () ->
            new GlassBlock(BlockBehaviour.Properties
                    .of()
                    .strength(0.3f, 0.3f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
            )
    );


    public static final RegistryObject<Block> WHITE_CHROMA_CRYSTAL = BLOCKS.register("white_chroma_crystal", () ->
            new ChromaBlock(BlockBehaviour.Properties
                    .of()
                    .strength(3.0f, 6.0f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()

                    .lightLevel((state) -> {
                        return 9;
                    })
            , 0)
    );

    public static final RegistryObject<Block> ORANGE_CHROMA_CRYSTAL = BLOCKS.register("orange_chroma_crystal", () ->
            new ChromaBlock(BlockBehaviour.Properties
                    .of()
                    .strength(3.0f, 6.0f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()

                    .lightLevel((state) -> {
                        return 9;
                    })
                    , 1)
    );

    public static final RegistryObject<Block> MAGENTA_CHROMA_CRYSTAL = BLOCKS.register("magenta_chroma_crystal", () ->
            new ChromaBlock(BlockBehaviour.Properties
                    .of()
                    .strength(3.0f, 6.0f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()
                    .lightLevel((state) -> {
                        return 9;
                    })
                    , 2)
    );

    public static final RegistryObject<Block> LIGHT_BLUE_CHROMA_CRYSTAL = BLOCKS.register("light_blue_chroma_crystal", () ->
            new ChromaBlock(BlockBehaviour.Properties
                    .of()
                    .strength(3.0f, 6.0f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()
                    .lightLevel((state) -> {
                        return 9;
                    })
                    , 3)
    );

    public static final RegistryObject<Block> YELLOW_CHROMA_CRYSTAL = BLOCKS.register("yellow_chroma_crystal", () ->
            new ChromaBlock(BlockBehaviour.Properties
                    .of()
                    .strength(3.0f, 6.0f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()

                    .lightLevel((state) -> {
                        return 9;
                    })
                    , 4)
    );

    public static final RegistryObject<Block> LIME_CHROMA_CRYSTAL = BLOCKS.register("lime_chroma_crystal", () ->
            new ChromaBlock(BlockBehaviour.Properties
                    .of()
                    .strength(3.0f, 6.0f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()

                    .lightLevel((state) -> {
                        return 9;
                    })
                    , 5)
    );

    public static final RegistryObject<Block> PINK_CHROMA_CRYSTAL = BLOCKS.register("pink_chroma_crystal", () ->
            new ChromaBlock(BlockBehaviour.Properties
                    .of()
                    .strength(3.0f, 6.0f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()

                    .lightLevel((state) -> {
                        return 9;
                    })
                    , 6)
    );

    public static final RegistryObject<Block> GRAY_CHROMA_CRYSTAL = BLOCKS.register("gray_chroma_crystal", () ->
            new ChromaBlock(BlockBehaviour.Properties
                    .of()
                    .strength(3.0f, 6.0f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()

                    .lightLevel((state) -> {
                        return 9;
                    })
                    , 7)
    );

    public static final RegistryObject<Block> LIGHT_GRAY_CHROMA_CRYSTAL = BLOCKS.register("light_gray_chroma_crystal", () ->
            new ChromaBlock(BlockBehaviour.Properties
                    .of()
                    .strength(3.0f, 6.0f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()
                    .lightLevel((state) -> {
                        return 9;
                    })
                    , 8)
    );

    public static final RegistryObject<Block> CYAN_CHROMA_CRYSTAL = BLOCKS.register("cyan_chroma_crystal", () ->
            new ChromaBlock(BlockBehaviour.Properties
                    .of()
                    .strength(3.0f, 6.0f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()

                    .lightLevel((state) -> {
                        return 9;
                    })
                    , 9)
    );

    public static final RegistryObject<Block> PURPLE_CHROMA_CRYSTAL = BLOCKS.register("purple_chroma_crystal", () ->
            new ChromaBlock(BlockBehaviour.Properties
                    .of()
                    .strength(3.0f, 6.0f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()

                    .lightLevel((state) -> {
                        return 9;
                    })
                    , 10)
    );

    public static final RegistryObject<Block> BLUE_CHROMA_CRYSTAL = BLOCKS.register("blue_chroma_crystal", () ->
            new ChromaBlock(BlockBehaviour.Properties
                    .of()
                    .strength(3.0f, 6.0f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()

                    .lightLevel((state) -> {
                        return 9;
                    })
                    , 11)
    );

    public static final RegistryObject<Block> BROWN_CHROMA_CRYSTAL = BLOCKS.register("brown_chroma_crystal", () ->
            new ChromaBlock(BlockBehaviour.Properties
                    .of()
                    .strength(3.0f, 6.0f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()

                    .lightLevel((state) -> {
                        return 9;
                    })
                    , 12)
    );

    public static final RegistryObject<Block> GREEN_CHROMA_CRYSTAL = BLOCKS.register("green_chroma_crystal", () ->
            new ChromaBlock(BlockBehaviour.Properties
                    .of()
                    .strength(3.0f, 6.0f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()

                    .lightLevel((state) -> {
                        return 9;
                    })
                    , 13)
    );

    public static final RegistryObject<Block> RED_CHROMA_CRYSTAL = BLOCKS.register("red_chroma_crystal", () ->
            new ChromaBlock(BlockBehaviour.Properties
                    .of()
                    .strength(3.0f, 6.0f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()

                    .lightLevel((state) -> {
                        return 9;
                    })
                    , 14)
    );

    public static final RegistryObject<Block> BLACK_CHROMA_CRYSTAL = BLOCKS.register("black_chroma_crystal", () ->
            new ChromaBlock(BlockBehaviour.Properties
                    .of()
                    .strength(3.0f, 6.0f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()

                    .lightLevel((state) -> {
                        return 9;
                    })
                    , 15)
    );

    public static final RegistryObject<Block> ICE_SPIKE = BLOCKS.register("ice_spike", () ->
            new IceSpikeBlock(BlockBehaviour.Properties
                    .of()
                    .strength(3.0f, 6.0f)
                    .sound(SoundType.GLASS)

                    )
    );

    public static final RegistryObject<Block> PEDISTAL = BLOCKS.register("pedistal", () ->
            new PedistalBlock(BlockBehaviour.Properties.of().noOcclusion(),true)
            );

    public static final RegistryObject<Block> GEM_SEED_BLOCK = BLOCKS.register("gem_seed_block", () ->
            new GemSeedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(5.0f, 6.0f)
                    .sound(SoundType.STONE)
            )
    );

    public static final RegistryObject<Block> POWER_CRYSTAL_BLOCK = BLOCKS.register("power_crystal_block", () ->
            new PowerCrystalBlock(BlockBehaviour.Properties
                    .of()
                    .strength(3.0f, 6.0f)
                    .sound(SoundType.AMETHYST)
                    .lightLevel((state) -> {
                        return 10;
                    })
                    .noOcclusion()
            )
    );

    public static final RegistryObject<Block> POWER_CRYSTAL_BLOCK_TIER_2 = BLOCKS.register("power_crystal_block_tier_2", () ->
            new PowerCrystalBlock(BlockBehaviour.Properties
                    .of()
                    .strength(3.0f, 6.0f)
                    .sound(SoundType.AMETHYST)
                    .lightLevel((state) -> {
                        return 10;
                    })
                    .noOcclusion()
            )
    );

    public static final RegistryObject<Block> TANK_BLOCK = BLOCKS.register("tank_block", () ->
            new TankBlock(BlockBehaviour.Properties
                    .of()
                    .strength(3.0f, 6.0f)
                    .sound(SoundType.CHAIN)
                    .noOcclusion()
            )
    );

    public static final RegistryObject<Block> DRILL_BLOCK = BLOCKS.register("drill_block", () ->
            new DrillBlock(BlockBehaviour.Properties
                    .of()
                    .strength(3.0f, 6.0f)
                    .sound(SoundType.METAL)
                    .noOcclusion()
            )
    );

    public static final RegistryObject<Block> SHELL_BLOCK = BLOCKS.register("shell_block", () ->
            new ShellBlock(BlockBehaviour.Properties
                    .of()
                    .strength(3.0f, 6.0f)
                    .sound(SoundType.METAL)
                    .instabreak()
            )
    );

    public static final RegistryObject<Block> INCUBATOR_BLOCK = BLOCKS.register("incubator_block", () ->
            new IncubatorBlock(BlockBehaviour.Properties
                    .of()
                    .strength(3.0f, 6.0f)
                    .sound(SoundType.METAL)
                    .noOcclusion()
            )
    );

    public static final RegistryObject<Block> DRAINED_BLUE_SOIL = BLOCKS.register("drained_blue_soil", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(0.6f, 0.6f)
                    .sound(SoundType.GRAVEL)
                    
            )
    );

    public static final RegistryObject<Block> DRAINED_BLUE_SAND = BLOCKS.register("drained_blue_sand", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(0.6f, 0.6f)
                    .sound(SoundType.SAND)

            )
    );

    public static final RegistryObject<Block> PRISMATIC_BLOCK = BLOCKS.register("prismatic_block", () ->
            new Block(BlockBehaviour.Properties
                    .of()
                    .requiresCorrectToolForDrops()
                    .strength(4.6f, 4.6f)
                    .sound(SoundType.METAL)
            )
    );

    public static final RegistryObject<Block> DRAINED_BLUE_STONE = BLOCKS.register("drained_blue_stone", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );

    public static final RegistryObject<Block> DRAINED_BLUE_STONE_2 = BLOCKS.register("drained_blue_stone_2", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    
            )
    );

    public static final RegistryObject<Block> DRAINED_BANDED_BLUE_STONE = BLOCKS.register("drained_blue_stone_bands", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );

    public static final RegistryObject<Block> DRAINED_GREY_SOIL = BLOCKS.register("drained_grey_soil", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(0.6f, 0.6f)
                    .sound(SoundType.GRAVEL)
                    
            )
    );

    public static final RegistryObject<Block> DRAINED_GREY_SAND = BLOCKS.register("drained_grey_sand", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(0.6f, 0.6f)
                    .sound(SoundType.SAND)

            )
    );

    public static final RegistryObject<Block> DRAINED_GREY_STONE = BLOCKS.register("drained_grey_stone", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    
            )
    );

    public static final RegistryObject<Block> DRAINED_GREY_STONE_2 = BLOCKS.register("drained_grey_stone_2", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .requiresCorrectToolForDrops()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    
            )
    );

    public static final RegistryObject<Block> DRAINED_BANDED_GREY_STONE = BLOCKS.register("drained_grey_stone_bands", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    
            )
    );

    public static final RegistryObject<Block> DRAINED_PURPLE_SOIL = BLOCKS.register("drained_purple_soil", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(0.6f, 0.6f)
                    .sound(SoundType.GRAVEL)
                    
            )
    );

    public static final RegistryObject<Block> DRAINED_PURPLE_SAND = BLOCKS.register("drained_purple_sand", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(0.6f, 0.6f)
                    .sound(SoundType.SAND)

            )
    );

    public static final RegistryObject<Block> DRAINED_PURPLE_STONE = BLOCKS.register("drained_purple_stone", () ->
            new DrainedBlock(BlockBehaviour.Properties.of().requiresCorrectToolForDrops()
                    .strength(1.5f, 10f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> DRAINED_PURPLE_STONE_2 = BLOCKS.register("drained_purple_stone_2", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    
            )
    );

    public static final RegistryObject<Block> DRAINED_BANDED_PURPLE_STONE = BLOCKS.register("drained_purple_stone_bands", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    
            )
    );

    public static final RegistryObject<Block> DRAINED_RED_SOIL = BLOCKS.register("drained_red_soil", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(0.6f, 0.6f)
                    .sound(SoundType.GRAVEL)

            )
    );

    public static final RegistryObject<Block> DRAINED_RED_SAND = BLOCKS.register("drained_red_sand", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(0.6f, 0.6f)
                    .sound(SoundType.SAND)
                    
            )
    );

    public static final RegistryObject<Block> DRAINED_RED_STONE = BLOCKS.register("drained_red_stone", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .requiresCorrectToolForDrops()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    
            )
    );

    public static final RegistryObject<Block> DRAINED_RED_STONE_2 = BLOCKS.register("drained_red_stone_2", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .requiresCorrectToolForDrops()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    
            )
    );

    public static final RegistryObject<Block> DRAINED_BANDED_RED_STONE = BLOCKS.register("drained_red_stone_bands", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .requiresCorrectToolForDrops()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    
            )
    );

    public static final RegistryObject<Block> DRAINED_YELLOW_SOIL = BLOCKS.register("drained_yellow_soil", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(0.6f, 0.6f)
                    .sound(SoundType.GRAVEL)

            )
    );

    public static final RegistryObject<Block> DRAINED_SAND = BLOCKS.register("drained_sand", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(0.6f, 0.6f)
                    .sound(SoundType.SAND)
                    
            )
    );

    public static final RegistryObject<Block> DRAINED_YELLOW_STONE = BLOCKS.register("drained_yellow_stone", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    
            )
    );

    public static final RegistryObject<Block> DRAINED_YELLOW_STONE_2 = BLOCKS.register("drained_yellow_stone_2", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );

    public static final RegistryObject<Block> DRAINED_BANDED_YELLOW_STONE = BLOCKS.register("drained_yellow_stone_bands", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );

    public static final RegistryObject<Block> DRAINED_LOG = BLOCKS.register("drained_log", () ->
            new RotatedPillarBlock(Block.Properties
                    .of()
                    .strength(1.5f, 0.8f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
            )
    );
    public static final RegistryObject<Block> DRAINED_LOG_CRACKED = BLOCKS.register("drained_log_cracked", () ->
            new RotatedPillarBlock(Block.Properties
                    .of()
                    .strength(1.5f, 0.8f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
            )
    );
    public static final RegistryObject<Block> DRAINED_ICE = BLOCKS.register("drained_ice", () ->
            new RotatedPillarBlock(Block.Properties
                    .of()
                    .strength(1.5f, 0.8f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()
            )
    );

    public static final RegistryObject<Block> PRIMED_ICE = BLOCKS.register("primed_ice", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.ICE)));

    public static final RegistryObject<Block> PRIMED_PACKED_ICE = BLOCKS.register("primed_packed_ice", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_ICE)));

    public static final RegistryObject<Block> PRIMED_BLUE_ICE = BLOCKS.register("primed_blue_ice", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.BLUE_ICE)));

    public static final RegistryObject<Block> PRIMED_DRAINED_ICE = BLOCKS.register("primed_drained_ice", () ->
            new Block(BlockBehaviour.Properties.copy(ModBlocks.DRAINED_ICE.get())));

    public static final RegistryObject<Block> PRIMED_ICE_STATUE = BLOCKS.register("primed_ice_statue", () ->
            new LarimarStatueBlock(BlockBehaviour.Properties.copy(Blocks.ICE).noOcclusion()));

    public static final RegistryObject<Block> PRIMED_PACKED_ICE_STATUE = BLOCKS.register("primed_packed_ice_statue", () ->
            new LarimarStatueBlock(BlockBehaviour.Properties.copy(Blocks.PACKED_ICE).noOcclusion()));

    public static final RegistryObject<Block> PRIMED_BLUE_ICE_STATUE = BLOCKS.register("primed_blue_ice_statue", () ->
            new LarimarStatueBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_ICE).noOcclusion()));

    public static final RegistryObject<Block> PRIMED_DRAINED_ICE_STATUE = BLOCKS.register("primed_drained_ice_statue", () ->
            new LarimarStatueBlock(BlockBehaviour.Properties.copy(ModBlocks.PRIMED_DRAINED_ICE.get()).noOcclusion()));

    public static final RegistryObject<Block> DRAINED_BLUE_POLISHED_STONE = BLOCKS.register("drained_blue_polished_stone", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_BLUE_POLISHED_STONE_DARK = BLOCKS.register("drained_blue_polished_stone_dark", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_BLUE_POLISHED_STONE_DARK_SLAB = BLOCKS.register("drained_blue_polished_stone_dark_slab", () ->
            new SlabBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_BLUE_POLISHED_STONE_DARK_STAIRS = BLOCKS.register("drained_blue_polished_stone_dark_stairs", () ->
            new StairBlock(() -> ModBlocks.DRAINED_BLUE_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties
                            .of()
                            .strength(1.5f)
                            .requiresCorrectToolForDrops())

    );
    public static final RegistryObject<Block> DRAINED_BLUE_POLISHED_STONE_LIGHT = BLOCKS.register("drained_blue_polished_stone_light", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_BLUE_POLISHED_STONE_LIGHT_SLAB = BLOCKS.register("drained_blue_polished_stone_light_slab", () ->
            new SlabBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_BLUE_POLISHED_STONE_LIGHT_STAIRS = BLOCKS.register("drained_blue_polished_stone_light_stairs", () ->
            new StairBlock(() -> ModBlocks.DRAINED_BLUE_POLISHED_STONE_LIGHT.get().defaultBlockState(),
                    BlockBehaviour.Properties
                            .of()
                            .strength(1.5f)
                            .requiresCorrectToolForDrops())

    );
    public static final RegistryObject<Block> DRAINED_BLUE_POLISHED_STONE_SLAB = BLOCKS.register("drained_blue_polished_stone_slab", () ->
            new SlabBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_BLUE_POLISHED_STONE_STAIRS = BLOCKS.register("drained_blue_polished_stone_stairs", () ->
            new StairBlock(() -> ModBlocks.DRAINED_BLUE_POLISHED_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties
                            .of()
                            .strength(1.5f)
                            .requiresCorrectToolForDrops())

    );
    public static final RegistryObject<Block> DRAINED_BLUE_STONE_BRICK_DARK_SLAB = BLOCKS.register("drained_blue_stone_brick_dark_slab", () ->
            new SlabBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_BLUE_STONE_BRICK_DARK_STAIRS = BLOCKS.register("drained_blue_stone_brick_dark_stairs", () ->
            new StairBlock(() -> ModBlocks.DRAINED_BLUE_STONE_BRICKS_DARK.get().defaultBlockState(),
                    BlockBehaviour.Properties
                            .of()
                            .strength(1.5f)
                            .requiresCorrectToolForDrops())

    );
    public static final RegistryObject<Block> DRAINED_BLUE_STONE_BRICK_DARK_WALL = BLOCKS.register("drained_blue_stone_brick_dark_wall", () ->
            new WallBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
                    .dynamicShape()
            )
    );
    public static final RegistryObject<Block> DRAINED_BLUE_STONE_BRICK_LIGHT_SLAB = BLOCKS.register("drained_blue_stone_brick_light_slab", () ->
            new SlabBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_BLUE_STONE_BRICK_LIGHT_STAIRS = BLOCKS.register("drained_blue_stone_brick_light_stairs", () ->
            new StairBlock(() -> ModBlocks.DRAINED_BLUE_STONE_BRICKS_LIGHT.get().defaultBlockState(),
                    BlockBehaviour.Properties
                            .of()
                            .strength(1.5f)
                            .requiresCorrectToolForDrops())

    );
    public static final RegistryObject<Block> DRAINED_BLUE_STONE_BRICK_LIGHT_WALL = BLOCKS.register("drained_blue_stone_brick_light_wall", () ->
            new WallBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
                    .dynamicShape()

            )
    );
    public static final RegistryObject<Block> DRAINED_BLUE_STONE_BRICK_SLAB = BLOCKS.register("drained_blue_stone_brick_slab", () ->
            new SlabBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_BLUE_STONE_BRICK_STAIRS = BLOCKS.register("drained_blue_stone_brick_stairs", () ->
            new StairBlock(() -> ModBlocks.DRAINED_BLUE_STONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties
                            .of()
                            .strength(1.5f)
                            .requiresCorrectToolForDrops())

    );
    public static final RegistryObject<Block> DRAINED_BLUE_STONE_BRICK_WALL = BLOCKS.register("drained_blue_stone_brick_wall", () ->
            new WallBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
                    .dynamicShape()

            )
    );
    public static final RegistryObject<Block> DRAINED_BLUE_STONE_BRICKS = BLOCKS.register("drained_blue_stone_bricks", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_BLUE_STONE_BRICKS_LIGHT = BLOCKS.register("drained_blue_stone_bricks_light", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_BLUE_STONE_BRICKS_DARK = BLOCKS.register("drained_blue_stone_bricks_dark", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_BLUE_STONE_SLAB = BLOCKS.register("drained_blue_stone_slab", () ->
            new SlabBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_BLUE_STONE_DARK_SLAB = BLOCKS.register("drained_blue_stone_dark_slab", () ->
            new SlabBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_BLUE_STONE_LIGHT_SLAB = BLOCKS.register("drained_blue_stone_light_slab", () ->
            new SlabBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_BLUE_STONE_STAIRS = BLOCKS.register("drained_blue_stone_stairs", () ->
            new StairBlock(() -> ModBlocks.DRAINED_BLUE_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties
                            .of()
                            .strength(1.5f)
                            .requiresCorrectToolForDrops())

    );
    public static final RegistryObject<Block> DRAINED_BLUE_STONE_LIGHT_STAIRS = BLOCKS.register("drained_blue_stone_light_stairs", () ->
            new StairBlock(() -> ModBlocks.DRAINED_BLUE_STONE_2.get().defaultBlockState(),
                    BlockBehaviour.Properties
                            .of()
                            .strength(1.5f)
                            .requiresCorrectToolForDrops())

    );

    public static final RegistryObject<Block> DRAINED_BLUE_STONE_DARK_STAIRS = BLOCKS.register("drained_blue_stone_dark_stairs", () ->
            new StairBlock(() -> ModBlocks.DRAINED_BANDED_BLUE_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties
                            .of()
                            .strength(1.5f)
                            .requiresCorrectToolForDrops())

    );
    public static final RegistryObject<Block> DRAINED_BLUE_STONE_BRICKS_CHISELED = BLOCKS.register("drained_blue_stone_bricks_chiseled", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_BLUE_STONE_BRICKS_CRACKED = BLOCKS.register("drained_blue_stone_bricks_cracked", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_BLUE_STONE_BRICKS_CRACKED_LIGHT = BLOCKS.register("drained_blue_stone_bricks_cracked_light", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_BLUE_STONE_BRICKS_CRACKED_DARK = BLOCKS.register("drained_blue_stone_bricks_cracked_dark", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_BLUE_GLAZED_TILE = BLOCKS.register("drained_blue_glazed_tile", () ->
            new GlazedTerracottaBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_BLUE_GLASS = BLOCKS.register("drained_blue_glass", () ->
            new GlassBlock(BlockBehaviour.Properties
                    .of()
                    .strength(0.3f, 0.3f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
            )
    );
    public static final RegistryObject<Block> DRAINED_BLUE_GLASS_PANE = BLOCKS.register("drained_blue_glass_pane", () ->
            new IronBarsBlock(BlockBehaviour.Properties
                    .of()
                    .strength(0.3f, 0.3f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()

            )
    );

    public static final RegistryObject<Block> DRAINED_RED_POLISHED_STONE = BLOCKS.register("drained_red_polished_stone", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_RED_POLISHED_STONE_DARK = BLOCKS.register("drained_red_polished_stone_dark", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_RED_POLISHED_STONE_DARK_SLAB = BLOCKS.register("drained_red_polished_stone_dark_slab", () ->
            new SlabBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_RED_POLISHED_STONE_DARK_STAIRS = BLOCKS.register("drained_red_polished_stone_dark_stairs", () ->
            new StairBlock(() -> ModBlocks.DRAINED_RED_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties
                            .of()
                            .strength(1.5f)
                            .requiresCorrectToolForDrops())

    );
    public static final RegistryObject<Block> DRAINED_RED_POLISHED_STONE_LIGHT = BLOCKS.register("drained_red_polished_stone_light", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_RED_POLISHED_STONE_LIGHT_SLAB = BLOCKS.register("drained_red_polished_stone_light_slab", () ->
            new SlabBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_RED_POLISHED_STONE_LIGHT_STAIRS = BLOCKS.register("drained_red_polished_stone_light_stairs", () ->
            new StairBlock(() -> ModBlocks.DRAINED_RED_POLISHED_STONE_LIGHT.get().defaultBlockState(),
                    BlockBehaviour.Properties
                            .of()
                            .strength(1.5f)
                            .requiresCorrectToolForDrops())

    );
    public static final RegistryObject<Block> DRAINED_RED_POLISHED_STONE_SLAB = BLOCKS.register("drained_red_polished_stone_slab", () ->
            new SlabBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_RED_POLISHED_STONE_STAIRS = BLOCKS.register("drained_red_polished_stone_stairs", () ->
            new StairBlock(() -> ModBlocks.DRAINED_RED_POLISHED_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties
                            .of()
                            .strength(1.5f)
                            .requiresCorrectToolForDrops())

    );
    public static final RegistryObject<Block> DRAINED_RED_STONE_BRICK_DARK_SLAB = BLOCKS.register("drained_red_stone_brick_dark_slab", () ->
            new SlabBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_RED_STONE_BRICK_DARK_STAIRS = BLOCKS.register("drained_red_stone_brick_dark_stairs", () ->
            new StairBlock(() -> ModBlocks.DRAINED_RED_STONE_BRICKS_DARK.get().defaultBlockState(),
                    BlockBehaviour.Properties
                            .of()
                            .strength(1.5f)
                            .requiresCorrectToolForDrops())

    );
    public static final RegistryObject<Block> DRAINED_RED_STONE_BRICK_DARK_WALL = BLOCKS.register("drained_red_stone_brick_dark_wall", () ->
            new WallBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_RED_STONE_BRICK_LIGHT_SLAB = BLOCKS.register("drained_red_stone_brick_light_slab", () ->
            new SlabBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_RED_STONE_BRICK_LIGHT_STAIRS = BLOCKS.register("drained_red_stone_brick_light_stairs", () ->
            new StairBlock(() -> ModBlocks.DRAINED_RED_STONE_BRICKS_LIGHT.get().defaultBlockState(),
                    BlockBehaviour.Properties
                            .of()
                            .strength(1.5f)
                            .requiresCorrectToolForDrops())

    );
    public static final RegistryObject<Block> DRAINED_RED_STONE_BRICK_LIGHT_WALL = BLOCKS.register("drained_red_stone_brick_light_wall", () ->
            new WallBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_RED_STONE_BRICK_SLAB = BLOCKS.register("drained_red_stone_brick_slab", () ->
            new SlabBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_RED_STONE_BRICK_STAIRS = BLOCKS.register("drained_red_stone_brick_stairs", () ->
            new StairBlock(() -> ModBlocks.DRAINED_RED_STONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties
                            .of()
                            .strength(1.5f)
                            .requiresCorrectToolForDrops())

    );
    public static final RegistryObject<Block> DRAINED_RED_STONE_BRICK_WALL = BLOCKS.register("drained_red_stone_brick_wall", () ->
            new WallBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_RED_STONE_BRICKS = BLOCKS.register("drained_red_stone_bricks", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_RED_STONE_BRICKS_LIGHT = BLOCKS.register("drained_red_stone_bricks_light", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_RED_STONE_BRICKS_DARK = BLOCKS.register("drained_red_stone_bricks_dark", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_RED_STONE_SLAB = BLOCKS.register("drained_red_stone_slab", () ->
            new SlabBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_RED_STONE_DARK_SLAB = BLOCKS.register("drained_red_stone_dark_slab", () ->
            new SlabBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_RED_STONE_LIGHT_SLAB = BLOCKS.register("drained_red_stone_light_slab", () ->
            new SlabBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_RED_STONE_STAIRS = BLOCKS.register("drained_red_stone_stairs", () ->
            new StairBlock(() -> ModBlocks.DRAINED_RED_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties
                            .of()
                            .strength(1.5f)
                            .requiresCorrectToolForDrops())

    );
    public static final RegistryObject<Block> DRAINED_RED_STONE_LIGHT_STAIRS = BLOCKS.register("drained_red_stone_light_stairs", () ->
            new StairBlock(() -> ModBlocks.DRAINED_RED_STONE_2.get().defaultBlockState(),
                    BlockBehaviour.Properties
                            .of()
                            .strength(1.5f)
                            .requiresCorrectToolForDrops())

    );

    public static final RegistryObject<Block> DRAINED_RED_STONE_DARK_STAIRS = BLOCKS.register("drained_red_stone_dark_stairs", () ->
            new StairBlock(() -> ModBlocks.DRAINED_BANDED_RED_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties
                            .of()
                            .strength(1.5f)
                            .requiresCorrectToolForDrops())

    );
    public static final RegistryObject<Block> DRAINED_RED_STONE_BRICKS_CHISELED = BLOCKS.register("drained_red_stone_bricks_chiseled", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_RED_STONE_BRICKS_CRACKED = BLOCKS.register("drained_red_stone_bricks_cracked", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_RED_STONE_BRICKS_CRACKED_LIGHT = BLOCKS.register("drained_red_stone_bricks_cracked_light", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_RED_STONE_BRICKS_CRACKED_DARK = BLOCKS.register("drained_red_stone_bricks_cracked_dark", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_RED_GLAZED_TILE = BLOCKS.register("drained_red_glazed_tile", () ->
            new GlazedTerracottaBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_RED_GLASS = BLOCKS.register("drained_red_glass", () ->
            new GlassBlock(BlockBehaviour.Properties
                    .of()
                    .strength(0.3f, 0.3f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()

            )
    );
    public static final RegistryObject<Block> DRAINED_RED_GLASS_PANE = BLOCKS.register("drained_red_glass_pane", () ->
            new IronBarsBlock(BlockBehaviour.Properties
                    .of()
                    .strength(0.3f, 0.3f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()

            )
    );

    public static final RegistryObject<Block> DRAINED_YELLOW_POLISHED_STONE = BLOCKS.register("drained_yellow_polished_stone", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_YELLOW_POLISHED_STONE_DARK = BLOCKS.register("drained_yellow_polished_stone_dark", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_YELLOW_POLISHED_STONE_DARK_SLAB = BLOCKS.register("drained_yellow_polished_stone_dark_slab", () ->
            new SlabBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_YELLOW_POLISHED_STONE_DARK_STAIRS = BLOCKS.register("drained_yellow_polished_stone_dark_stairs", () ->
            new StairBlock(() -> ModBlocks.DRAINED_YELLOW_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties
                            .of()
                            .strength(1.5f)
                            .requiresCorrectToolForDrops())

    );
    public static final RegistryObject<Block> DRAINED_YELLOW_POLISHED_STONE_LIGHT = BLOCKS.register("drained_yellow_polished_stone_light", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_YELLOW_POLISHED_STONE_LIGHT_SLAB = BLOCKS.register("drained_yellow_polished_stone_light_slab", () ->
            new SlabBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_YELLOW_POLISHED_STONE_LIGHT_STAIRS = BLOCKS.register("drained_yellow_polished_stone_light_stairs", () ->
            new StairBlock(() -> ModBlocks.DRAINED_YELLOW_POLISHED_STONE_LIGHT.get().defaultBlockState(),
                    BlockBehaviour.Properties
                            .of()
                            .strength(1.5f)
                            .requiresCorrectToolForDrops())

    );
    public static final RegistryObject<Block> DRAINED_YELLOW_POLISHED_STONE_SLAB = BLOCKS.register("drained_yellow_polished_stone_slab", () ->
            new SlabBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_YELLOW_POLISHED_STONE_STAIRS = BLOCKS.register("drained_yellow_polished_stone_stairs", () ->
            new StairBlock(() -> ModBlocks.DRAINED_YELLOW_POLISHED_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties
                            .of()
                            .strength(1.5f)
                            .requiresCorrectToolForDrops())

    );
    public static final RegistryObject<Block> DRAINED_YELLOW_STONE_BRICK_DARK_SLAB = BLOCKS.register("drained_yellow_stone_brick_dark_slab", () ->
            new SlabBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_YELLOW_STONE_BRICK_DARK_STAIRS = BLOCKS.register("drained_yellow_stone_brick_dark_stairs", () ->
            new StairBlock(() -> ModBlocks.DRAINED_YELLOW_STONE_BRICKS_DARK.get().defaultBlockState(),
                    BlockBehaviour.Properties
                            .of()
                            .strength(1.5f)
                            .requiresCorrectToolForDrops())

    );
    public static final RegistryObject<Block> DRAINED_YELLOW_STONE_BRICK_DARK_WALL = BLOCKS.register("drained_yellow_stone_brick_dark_wall", () ->
            new WallBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_YELLOW_STONE_BRICK_LIGHT_SLAB = BLOCKS.register("drained_yellow_stone_brick_light_slab", () ->
            new SlabBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_YELLOW_STONE_BRICK_LIGHT_STAIRS = BLOCKS.register("drained_yellow_stone_brick_light_stairs", () ->
            new StairBlock(() -> ModBlocks.DRAINED_YELLOW_STONE_BRICKS_LIGHT.get().defaultBlockState(),
                    BlockBehaviour.Properties
                            .of()
                            .strength(1.5f)
                            .requiresCorrectToolForDrops())

    );
    public static final RegistryObject<Block> DRAINED_YELLOW_STONE_BRICK_LIGHT_WALL = BLOCKS.register("drained_yellow_stone_brick_light_wall", () ->
            new WallBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_YELLOW_STONE_BRICK_SLAB = BLOCKS.register("drained_yellow_stone_brick_slab", () ->
            new SlabBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_YELLOW_STONE_BRICK_STAIRS = BLOCKS.register("drained_yellow_stone_brick_stairs", () ->
            new StairBlock(() -> ModBlocks.DRAINED_YELLOW_STONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties
                            .of()
                            .strength(1.5f)
                            .requiresCorrectToolForDrops())

    );
    public static final RegistryObject<Block> DRAINED_YELLOW_STONE_BRICK_WALL = BLOCKS.register("drained_yellow_stone_brick_wall", () ->
            new WallBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_YELLOW_STONE_BRICKS = BLOCKS.register("drained_yellow_stone_bricks", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_YELLOW_STONE_BRICKS_LIGHT = BLOCKS.register("drained_yellow_stone_bricks_light", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_YELLOW_STONE_BRICKS_DARK = BLOCKS.register("drained_yellow_stone_bricks_dark", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_YELLOW_STONE_SLAB = BLOCKS.register("drained_yellow_stone_slab", () ->
            new SlabBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_YELLOW_STONE_DARK_SLAB = BLOCKS.register("drained_yellow_stone_dark_slab", () ->
            new SlabBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_YELLOW_STONE_LIGHT_SLAB = BLOCKS.register("drained_yellow_stone_light_slab", () ->
            new SlabBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_YELLOW_STONE_STAIRS = BLOCKS.register("drained_yellow_stone_stairs", () ->
            new StairBlock(() -> ModBlocks.DRAINED_YELLOW_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties
                            .of()
                            .strength(1.5f)
                            .requiresCorrectToolForDrops())

    );
    public static final RegistryObject<Block> DRAINED_YELLOW_STONE_LIGHT_STAIRS = BLOCKS.register("drained_yellow_stone_light_stairs", () ->
            new StairBlock(() -> ModBlocks.DRAINED_YELLOW_STONE_2.get().defaultBlockState(),
                    BlockBehaviour.Properties
                            .of()
                            .strength(1.5f)
                            .requiresCorrectToolForDrops())

    );

    public static final RegistryObject<Block> DRAINED_YELLOW_STONE_DARK_STAIRS = BLOCKS.register("drained_yellow_stone_dark_stairs", () ->
            new StairBlock(() -> ModBlocks.DRAINED_BANDED_YELLOW_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties
                            .of()
                            .strength(1.5f)
                            .requiresCorrectToolForDrops())

    );
    public static final RegistryObject<Block> DRAINED_YELLOW_STONE_BRICKS_CHISELED = BLOCKS.register("drained_yellow_stone_bricks_chiseled", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_YELLOW_STONE_BRICKS_CRACKED = BLOCKS.register("drained_yellow_stone_bricks_cracked", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_YELLOW_STONE_BRICKS_CRACKED_LIGHT = BLOCKS.register("drained_yellow_stone_bricks_cracked_light", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_YELLOW_STONE_BRICKS_CRACKED_DARK = BLOCKS.register("drained_yellow_stone_bricks_cracked_dark", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_YELLOW_GLAZED_TILE = BLOCKS.register("drained_yellow_glazed_tile", () ->
            new GlazedTerracottaBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_YELLOW_GLASS = BLOCKS.register("drained_yellow_glass", () ->
            new GlassBlock(BlockBehaviour.Properties
                    .of()
                    .strength(0.3f, 0.3f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()

            )
    );
    public static final RegistryObject<Block> DRAINED_YELLOW_GLASS_PANE = BLOCKS.register("drained_yellow_glass_pane", () ->
            new IronBarsBlock(BlockBehaviour.Properties
                    .of()
                    .strength(0.3f, 0.3f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()

            )
    );

    public static final RegistryObject<Block> DRAINED_PURPLE_POLISHED_STONE = BLOCKS.register("drained_purple_polished_stone", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_PURPLE_POLISHED_STONE_DARK = BLOCKS.register("drained_purple_polished_stone_dark", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_PURPLE_POLISHED_STONE_DARK_SLAB = BLOCKS.register("drained_purple_polished_stone_dark_slab", () ->
            new SlabBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_PURPLE_POLISHED_STONE_DARK_STAIRS = BLOCKS.register("drained_purple_polished_stone_dark_stairs", () ->
            new StairBlock(() -> ModBlocks.DRAINED_PURPLE_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties
                            .of()
                            .strength(1.5f)
                            .requiresCorrectToolForDrops())

    );
    public static final RegistryObject<Block> DRAINED_PURPLE_POLISHED_STONE_LIGHT = BLOCKS.register("drained_purple_polished_stone_light", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_PURPLE_POLISHED_STONE_LIGHT_SLAB = BLOCKS.register("drained_purple_polished_stone_light_slab", () ->
            new SlabBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_PURPLE_POLISHED_STONE_LIGHT_STAIRS = BLOCKS.register("drained_purple_polished_stone_light_stairs", () ->
            new StairBlock(() -> ModBlocks.DRAINED_PURPLE_POLISHED_STONE_LIGHT.get().defaultBlockState(),
                    BlockBehaviour.Properties
                            .of()
                            .strength(1.5f)
                            .requiresCorrectToolForDrops())

    );
    public static final RegistryObject<Block> DRAINED_PURPLE_POLISHED_STONE_SLAB = BLOCKS.register("drained_purple_polished_stone_slab", () ->
            new SlabBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_PURPLE_POLISHED_STONE_STAIRS = BLOCKS.register("drained_purple_polished_stone_stairs", () ->
            new StairBlock(() -> ModBlocks.DRAINED_PURPLE_POLISHED_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties
                            .of()
                            .strength(1.5f)
                            .requiresCorrectToolForDrops())

    );
    public static final RegistryObject<Block> DRAINED_PURPLE_STONE_BRICK_DARK_SLAB = BLOCKS.register("drained_purple_stone_brick_dark_slab", () ->
            new SlabBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_PURPLE_STONE_BRICK_DARK_STAIRS = BLOCKS.register("drained_purple_stone_brick_dark_stairs", () ->
            new StairBlock(() -> ModBlocks.DRAINED_PURPLE_STONE_BRICKS_DARK.get().defaultBlockState(),
                    BlockBehaviour.Properties
                            .of()
                            .strength(1.5f)
                            .requiresCorrectToolForDrops())

    );
    public static final RegistryObject<Block> DRAINED_PURPLE_STONE_BRICK_DARK_WALL = BLOCKS.register("drained_purple_stone_brick_dark_wall", () ->
            new WallBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_PURPLE_STONE_BRICK_LIGHT_SLAB = BLOCKS.register("drained_purple_stone_brick_light_slab", () ->
            new SlabBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_PURPLE_STONE_BRICK_LIGHT_STAIRS = BLOCKS.register("drained_purple_stone_brick_light_stairs", () ->
            new StairBlock(() -> ModBlocks.DRAINED_PURPLE_STONE_BRICKS_LIGHT.get().defaultBlockState(),
                    BlockBehaviour.Properties
                            .of()
                            .strength(1.5f)
                            .requiresCorrectToolForDrops())

    );
    public static final RegistryObject<Block> DRAINED_PURPLE_STONE_BRICK_LIGHT_WALL = BLOCKS.register("drained_purple_stone_brick_light_wall", () ->
            new WallBlock(BlockBehaviour.Properties.of().strength(1.5f, 10f).sound(SoundType.STONE).requiresCorrectToolForDrops()
            )
    );
    public static final RegistryObject<Block> DRAINED_PURPLE_STONE_BRICK_SLAB = BLOCKS.register("drained_purple_stone_brick_slab", () ->
            new SlabBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_PURPLE_STONE_BRICK_STAIRS = BLOCKS.register("drained_purple_stone_brick_stairs", () ->
            new StairBlock(() -> ModBlocks.DRAINED_PURPLE_STONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties
                            .of()
                            .strength(1.5f)
                            .requiresCorrectToolForDrops())

    );
    public static final RegistryObject<Block> DRAINED_PURPLE_STONE_BRICK_WALL = BLOCKS.register("drained_purple_stone_brick_wall", () ->
            new WallBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_PURPLE_STONE_BRICKS = BLOCKS.register("drained_purple_stone_bricks", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_PURPLE_STONE_BRICKS_LIGHT = BLOCKS.register("drained_purple_stone_bricks_light", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_PURPLE_STONE_BRICKS_DARK = BLOCKS.register("drained_purple_stone_bricks_dark", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_PURPLE_STONE_SLAB = BLOCKS.register("drained_purple_stone_slab", () ->
            new SlabBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_PURPLE_STONE_DARK_SLAB = BLOCKS.register("drained_purple_stone_dark_slab", () ->
            new SlabBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_PURPLE_STONE_LIGHT_SLAB = BLOCKS.register("drained_purple_stone_light_slab", () ->
            new SlabBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_PURPLE_STONE_STAIRS = BLOCKS.register("drained_purple_stone_stairs", () ->
            new StairBlock(() -> ModBlocks.DRAINED_PURPLE_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties
                            .of()
                            .strength(1.5f)
                            .requiresCorrectToolForDrops())

    );
    public static final RegistryObject<Block> DRAINED_PURPLE_STONE_LIGHT_STAIRS = BLOCKS.register("drained_purple_stone_light_stairs", () ->
            new StairBlock(() -> ModBlocks.DRAINED_PURPLE_STONE_2.get().defaultBlockState(),
                    BlockBehaviour.Properties
                            .of()
                            .strength(1.5f)
                            .requiresCorrectToolForDrops())

    );

    public static final RegistryObject<Block> DRAINED_PURPLE_STONE_DARK_STAIRS = BLOCKS.register("drained_purple_stone_dark_stairs", () ->
            new StairBlock(() -> ModBlocks.DRAINED_BANDED_PURPLE_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties
                            .of()
                            .strength(1.5f)
                            .requiresCorrectToolForDrops())

    );
    public static final RegistryObject<Block> DRAINED_PURPLE_STONE_BRICKS_CHISELED = BLOCKS.register("drained_purple_stone_bricks_chiseled", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_PURPLE_STONE_BRICKS_CRACKED = BLOCKS.register("drained_purple_stone_bricks_cracked", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_PURPLE_STONE_BRICKS_CRACKED_LIGHT = BLOCKS.register("drained_purple_stone_bricks_cracked_light", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_PURPLE_STONE_BRICKS_CRACKED_DARK = BLOCKS.register("drained_purple_stone_bricks_cracked_dark", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_PURPLE_GLAZED_TILE = BLOCKS.register("drained_purple_glazed_tile", () ->
            new GlazedTerracottaBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_PURPLE_GLASS = BLOCKS.register("drained_purple_glass", () ->
            new GlassBlock(BlockBehaviour.Properties
                    .of()
                    .strength(0.3f, 0.3f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()

            )
    );
    public static final RegistryObject<Block> DRAINED_PURPLE_GLASS_PANE = BLOCKS.register("drained_purple_glass_pane", () ->
            new IronBarsBlock(BlockBehaviour.Properties
                    .of()
                    .strength(0.3f, 0.3f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()

            )
    );

    public static final RegistryObject<Block> DRAINED_GREY_POLISHED_STONE = BLOCKS.register("drained_grey_polished_stone", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_GREY_POLISHED_STONE_DARK = BLOCKS.register("drained_grey_polished_stone_dark", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_GREY_POLISHED_STONE_DARK_SLAB = BLOCKS.register("drained_grey_polished_stone_dark_slab", () ->
            new SlabBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_GREY_POLISHED_STONE_DARK_STAIRS = BLOCKS.register("drained_grey_polished_stone_dark_stairs", () ->
            new StairBlock(() -> ModBlocks.DRAINED_GREY_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties
                            .of()
                            .strength(1.5f)
                            .requiresCorrectToolForDrops())

    );
    public static final RegistryObject<Block> DRAINED_GREY_POLISHED_STONE_LIGHT = BLOCKS.register("drained_grey_polished_stone_light", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_GREY_POLISHED_STONE_LIGHT_SLAB = BLOCKS.register("drained_grey_polished_stone_light_slab", () ->
            new SlabBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_GREY_POLISHED_STONE_LIGHT_STAIRS = BLOCKS.register("drained_grey_polished_stone_light_stairs", () ->
            new StairBlock(() -> ModBlocks.DRAINED_GREY_POLISHED_STONE_LIGHT.get().defaultBlockState(),
                    BlockBehaviour.Properties
                            .of()
                            .strength(1.5f)
                            .requiresCorrectToolForDrops())

    );
    public static final RegistryObject<Block> DRAINED_GREY_POLISHED_STONE_SLAB = BLOCKS.register("drained_grey_polished_stone_slab", () ->
            new SlabBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_GREY_POLISHED_STONE_STAIRS = BLOCKS.register("drained_grey_polished_stone_stairs", () ->
            new StairBlock(() -> ModBlocks.DRAINED_GREY_POLISHED_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties
                            .of()
                            .strength(1.5f)
                            .requiresCorrectToolForDrops())

    );
    public static final RegistryObject<Block> DRAINED_GREY_STONE_BRICK_DARK_SLAB = BLOCKS.register("drained_grey_stone_brick_dark_slab", () ->
            new SlabBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_GREY_STONE_BRICK_DARK_STAIRS = BLOCKS.register("drained_grey_stone_brick_dark_stairs", () ->
            new StairBlock(() -> ModBlocks.DRAINED_GREY_STONE_BRICKS_DARK.get().defaultBlockState(),
                    BlockBehaviour.Properties
                            .of()
                            .strength(1.5f)
                            .requiresCorrectToolForDrops())

    );
    public static final RegistryObject<Block> DRAINED_GREY_STONE_BRICK_DARK_WALL = BLOCKS.register("drained_grey_stone_brick_dark_wall", () ->
            new WallBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_GREY_STONE_BRICK_LIGHT_SLAB = BLOCKS.register("drained_grey_stone_brick_light_slab", () ->
            new SlabBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_GREY_STONE_BRICK_LIGHT_STAIRS = BLOCKS.register("drained_grey_stone_brick_light_stairs", () ->
            new StairBlock(() -> ModBlocks.DRAINED_GREY_STONE_BRICKS_LIGHT.get().defaultBlockState(),
                    BlockBehaviour.Properties
                            .of()
                            .strength(1.5f)
                            .requiresCorrectToolForDrops())

    );
    public static final RegistryObject<Block> DRAINED_GREY_STONE_BRICK_LIGHT_WALL = BLOCKS.register("drained_grey_stone_brick_light_wall", () ->
            new WallBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_GREY_STONE_BRICK_SLAB = BLOCKS.register("drained_grey_stone_brick_slab", () ->
            new SlabBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_GREY_STONE_BRICK_STAIRS = BLOCKS.register("drained_grey_stone_brick_stairs", () ->
            new StairBlock(() -> ModBlocks.DRAINED_GREY_STONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties
                            .of()
                            .strength(1.5f)
                            .requiresCorrectToolForDrops())

    );
    public static final RegistryObject<Block> DRAINED_GREY_STONE_BRICK_WALL = BLOCKS.register("drained_grey_stone_brick_wall", () ->
            new WallBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_GREY_STONE_BRICKS = BLOCKS.register("drained_grey_stone_bricks", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_GREY_STONE_BRICKS_LIGHT = BLOCKS.register("drained_grey_stone_bricks_light", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_GREY_STONE_BRICKS_DARK = BLOCKS.register("drained_grey_stone_bricks_dark", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_GREY_STONE_SLAB = BLOCKS.register("drained_grey_stone_slab", () ->
            new SlabBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_GREY_STONE_DARK_SLAB = BLOCKS.register("drained_grey_stone_dark_slab", () ->
            new SlabBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_GREY_STONE_LIGHT_SLAB = BLOCKS.register("drained_grey_stone_light_slab", () ->
            new SlabBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_GREY_STONE_STAIRS = BLOCKS.register("drained_grey_stone_stairs", () ->
            new StairBlock(() -> ModBlocks.DRAINED_GREY_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties
                            .of()
                            .strength(1.5f)
                            .requiresCorrectToolForDrops())

    );
    public static final RegistryObject<Block> DRAINED_GREY_STONE_LIGHT_STAIRS = BLOCKS.register("drained_grey_stone_light_stairs", () ->
            new StairBlock(() -> ModBlocks.DRAINED_GREY_STONE_2.get().defaultBlockState(),
                    BlockBehaviour.Properties
                            .of()
                            .strength(1.5f)
                            .requiresCorrectToolForDrops())

    );

    public static final RegistryObject<Block> DRAINED_GREY_STONE_DARK_STAIRS = BLOCKS.register("drained_grey_stone_dark_stairs", () ->
            new StairBlock(() -> ModBlocks.DRAINED_BANDED_GREY_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties
                            .of()
                            .strength(1.5f)
                            .requiresCorrectToolForDrops())

    );
    public static final RegistryObject<Block> DRAINED_GREY_STONE_BRICKS_CHISELED = BLOCKS.register("drained_grey_stone_bricks_chiseled", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_GREY_STONE_BRICKS_CRACKED = BLOCKS.register("drained_grey_stone_bricks_cracked", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_GREY_STONE_BRICKS_CRACKED_LIGHT = BLOCKS.register("drained_grey_stone_bricks_cracked_light", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_GREY_STONE_BRICKS_CRACKED_DARK = BLOCKS.register("drained_grey_stone_bricks_cracked_dark", () ->
            new DrainedBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_GREY_GLAZED_TILE = BLOCKS.register("drained_grey_glazed_tile", () ->
            new GlazedTerracottaBlock(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 10f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()

            )
    );
    public static final RegistryObject<Block> DRAINED_GREY_GLASS = BLOCKS.register("drained_grey_glass", () ->
            new GlassBlock(BlockBehaviour.Properties
                    .of()
                    .strength(0.3f, 0.3f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()

            )
    );
    public static final RegistryObject<Block> DRAINED_GREY_GLASS_PANE = BLOCKS.register("drained_grey_glass_pane", () ->
            new IronBarsBlock(BlockBehaviour.Properties
                    .of()
                    .strength(0.3f, 0.3f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()

            )
    );

    /*public static final RegistryObject<Block> WARP_CORE = BLOCKS.register("warp_core", () ->
            new Block(Block.Properties
                    .of()
                    .strength(3.0f, 4.0f)
                    .sound(SoundType.GLASS)
            )
    );*/

    public static final RegistryObject<Block> PALADIN_CASE = BLOCKS.register("paladin_case", () ->
            new FlowerCaseBlock(Block.Properties.of()
                    .strength(-1.0F, 3600000.0F).noLootTable()
                    .sound(SoundType.GLASS).noOcclusion().noParticlesOnBreak()
            )
    );

    public static final RegistryObject<Block> EMPTY_PALADIN_CASE = BLOCKS.register("empty_paladin_case", () ->
            new FlowerCaseBlock(Block.Properties.of()
                    .strength(-1.0F, 3600000.0F).noLootTable()
                    .sound(SoundType.GLASS).noOcclusion().noParticlesOnBreak()
            )
    );

    public static final RegistryObject<Block> DAGGER_STONE = BLOCKS.register("dagger_stone", () ->
            new DaggerStoneBlock(Block.Properties.of()
                    .strength(-1.0F, 3600000.0F).noLootTable()
                    .sound(SoundType.STONE).noOcclusion().noParticlesOnBreak()
            )
    );

    public static final RegistryObject<Block> GUARDIAN_VASE = BLOCKS.register("guardian_vase", () ->
            new VaseBlock(Block.Properties.of()
                    .strength(-1.0F, 3600000.0F).noLootTable()
                    .sound(SoundType.GLASS).noOcclusion().noParticlesOnBreak()
            )
    );

    public static final RegistryObject<Block> EMPTY_GUARDIAN_VASE = BLOCKS.register("empty_guardian_vase", () ->
            new VaseBlock(Block.Properties.of()
                    .strength(-1.0F, 3600000.0F).noLootTable()
                    .sound(SoundType.GLASS).noOcclusion().noParticlesOnBreak()
            )
    );

    public static final RegistryObject<Block> EMPRESS_CROWN = BLOCKS.register("empress_crown", () ->
            new CrownBlock(Block.Properties.of()
                    .strength(-1.0F, 3600000.0F).noLootTable()
                    .sound(SoundType.STONE).noOcclusion()
            )
    );

    public static final RegistryObject<Block> EMPTY_EMPRESS_CROWN = BLOCKS.register("empty_empress_crown", () ->
            new CrownBlock(Block.Properties.of()
                    .strength(-1.0F, 3600000.0F).noLootTable()
                    .sound(SoundType.STONE).noOcclusion()
            )
    );

    public static final RegistryObject<Block> WARP_PAD = BLOCKS.register("warp_pad", () ->
            new WarpPadBlock(Block.Properties.of()
                    .strength(3.0f, 4.0f)
                    .sound(SoundType.GLASS)
            )
    );

    public static final RegistryObject<Block> SHOCK_BERRY_BUSH = BLOCKS.register("shock_berry_bush", () ->
            new ShockBerryBushBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).randomTicks().noCollission().sound(SoundType.SWEET_BERRY_BUSH).pushReaction(PushReaction.DESTROY))
    );

    public static final RegistryObject<Block> STRAWBERRY_BLOCK = BLOCKS.register("strawberry_block", () ->
            new StrawberryBlock(Block.Properties.of()
                    .strength(1f)
                    .sound(SoundType.WART_BLOCK)
            )
    );

    public static final RegistryObject<Block> STRAWBERRY_STEM = BLOCKS.register("strawberry_stem", () ->
            new StemBlock((StemGrownBlock) STRAWBERRY_BLOCK.get(), ModItems.STRAWBERRY,
                    BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).noCollission().randomTicks()
                            .instabreak().sound(SoundType.HARD_CROP)));
    public static final RegistryObject<Block> ATTACHED_STRAWBERRY_STEM = BLOCKS.register("attached_strawberry_stem", () ->
            new AttachedStemBlock((StemGrownBlock) STRAWBERRY_BLOCK.get(), ModItems.STRAWBERRY,
                    BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).noCollission().randomTicks()
                            .instabreak().sound(SoundType.HARD_CROP)));

    public static final RegistryObject<Block> YELLOW_DESTAB_WALL = BLOCKS.register("yellow_destab_wall", () ->
            new DestabWallBlock(Block.Properties.of().strength(3.0f, 4.0f).sound(SoundType.GLASS).speedFactor(0.4F).noOcclusion().noCollission())
    );

    public static final RegistryObject<Block> PINK_DESTAB_WALL = BLOCKS.register("pink_destab_wall", () ->
            new DestabWallBlock(Block.Properties.of().strength(3.0f, 4.0f).sound(SoundType.GLASS).speedFactor(0.4F).noOcclusion().noCollission())
    );

    public static final RegistryObject<Block> BLUE_DESTAB_WALL = BLOCKS.register("blue_destab_wall", () ->
            new DestabWallBlock(Block.Properties.of().strength(3.0f, 4.0f).sound(SoundType.GLASS).speedFactor(0.4F).noOcclusion().noCollission())
    );

    public static final RegistryObject<Block> WHITE_DESTAB_WALL = BLOCKS.register("white_destab_wall", () ->
            new DestabWallBlock(Block.Properties.of().strength(3.0f, 4.0f).sound(SoundType.GLASS).speedFactor(0.4F).noOcclusion().noCollission())
    );

    public static final RegistryObject<Block> RUINED_MARBLE_BLOCK = BLOCKS.register("ruined_marble_block", () ->
            new Block(Block.Properties
                    .of()
                    .requiresCorrectToolForDrops()
                    .strength(1.5f, 6f)
                    .sound(SoundType.STONE)
            )
    );
    public static final RegistryObject<Block> SMOOTH_RUINED_MARBLE_BLOCK = BLOCKS.register("smooth_ruined_marble_block", () ->
            new Block(Block.Properties
                    .of()
                    .strength(1.5f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            )
    );
    public static final RegistryObject<Block> CHISELED_RUINED_MARBLE_BLOCK = BLOCKS.register("chiseled_ruined_marble_block", () ->
            new Block(Block.Properties
                    .of()
                    .strength(1.5f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            )
    );
    public static final RegistryObject<Block> RUINED_MARBLE_BRICK = BLOCKS.register("ruined_marble_brick", () ->
            new Block(Block.Properties
                    .of()
                    .strength(1.5f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            )
    );
    public static final RegistryObject<Block> RUINED_MARBLE_PILLAR = BLOCKS.register("ruined_marble_pillar", () ->
            new RotatedPillarBlock(Block.Properties
                    .of()
                    .requiresCorrectToolForDrops()
                    .strength(1.5f, 6f)
                    .sound(SoundType.STONE)
            )
    );
    public static final RegistryObject<Block> SMOOTH_RUINED_MARBLE_SLAB = BLOCKS.register("smooth_ruined_marble_slab", () ->
            new SlabBlock(Block.Properties
                    .of()
                    .strength(1.5f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            )
    );
    public static final RegistryObject<Block> RUINED_MARBLE_SLAB = BLOCKS.register("ruined_marble_slab", () ->
            new SlabBlock(Block.Properties
                    .of()
                    .requiresCorrectToolForDrops()
                    .strength(1.5f, 6f)
                    .sound(SoundType.STONE)
            )
    );
    public static final RegistryObject<Block> RUINED_MARBLE_STAIRS = BLOCKS.register("ruined_marble_stairs",
            () -> new StairBlock(() -> ModBlocks.RUINED_MARBLE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_RUINED_MARBLE_STAIRS = BLOCKS.register("smooth_ruined_marble_stairs",
            () -> new StairBlock(() -> ModBlocks.SMOOTH_RUINED_MARBLE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CHROMA_CLUSTER_CROP = BLOCKS.register("chroma_cluster_crop", () ->
            new ChromaClusterCropBlock(BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).randomTicks().strength(3.0f, 6.0f).sound(SoundType.GLASS).noOcclusion()));
}
