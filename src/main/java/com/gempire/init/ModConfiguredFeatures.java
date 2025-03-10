package com.gempire.init;

import com.gempire.Gempire;
import com.gempire.init.ModBlocks;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

import static net.minecraft.data.worldgen.features.FeatureUtils.register;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> CRYSTAL_KEY = registerKey("crystal");

    public static final ResourceKey<ConfiguredFeature<?, ?>> DISTANT_KEY = registerKey("distant");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SHADED_KEY = registerKey("shaded");
    public static final ResourceKey<ConfiguredFeature<?, ?>> VERDANT_PINE_KEY = registerKey("verdant_pine");
    public static final ResourceKey<ConfiguredFeature<?, ?>> KALEIDOSCOPE_KEY = registerKey("kaleidoscope");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TUNGSTEN_ORE_KEY = registerKey("tungsten_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> THULITE_ORE_KEY = registerKey("thulite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANATASE_ORE_KEY = registerKey("anatase_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ELECTRUM_ORE_KEY = registerKey("electrum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PLATINUM_ORE_KEY = registerKey("platinum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PYRITE_ORE_KEY = registerKey("pyrite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SHOCK_BERRY_KEY = registerKey("patch_shock_berry");

    public static final Supplier<List<OreConfiguration.TargetBlockState>> TUNGSTEN_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new TagMatchTest(ModTags.Blocks.DESOLATE_ORE_REPLACEABLES), ModBlocks.PEGMATITE_TUNGSTEN_ORE.get().defaultBlockState()),
            OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), ModBlocks.TUNGSTEN_ORE.get().defaultBlockState()),
            OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), ModBlocks.DEEPSLATE_TUNGSTEN_ORE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> THULITE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new TagMatchTest(ModTags.Blocks.DESOLATE_ORE_REPLACEABLES), ModBlocks.THULITE_ORE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> ANATASE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new TagMatchTest(ModTags.Blocks.DESOLATE_ORE_REPLACEABLES), ModBlocks.ANATASE_ORE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> ELECTRUM_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new TagMatchTest(ModTags.Blocks.DESOLATE_ORE_REPLACEABLES), ModBlocks.ELECTRUM_ORE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> PLATINUM_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new TagMatchTest(ModTags.Blocks.DESOLATE_ORE_REPLACEABLES), ModBlocks.PLATINUM_ORE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> PYRITE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new TagMatchTest(ModTags.Blocks.DESOLATE_ORE_REPLACEABLES), ModBlocks.PYRITE_ORE.get().defaultBlockState())));
    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        HolderGetter<PlacedFeature> placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        register(context, TUNGSTEN_ORE_KEY, Feature.ORE, new OreConfiguration(TUNGSTEN_ORES.get(), 12));
        register(context, THULITE_ORE_KEY, Feature.ORE, new OreConfiguration(THULITE_ORES.get(), 3));
        register(context, ANATASE_ORE_KEY, Feature.ORE, new OreConfiguration(ANATASE_ORES.get(), 3));
        register(context, ELECTRUM_ORE_KEY, Feature.ORE, new OreConfiguration(ELECTRUM_ORES.get(), 3));
        register(context, PLATINUM_ORE_KEY, Feature.ORE, new OreConfiguration(PLATINUM_ORES.get(), 3));
        register(context, PYRITE_ORE_KEY, Feature.ORE, new OreConfiguration(PYRITE_ORES.get(), 12));
        /*register(context, CRYSTAL_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CRYSTAL_LOG.get()),
                new StraightTrunkPlacer(5, 4, 3),
                BlockStateProvider.simple(ModBlocks.CRYSTAL_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),
                new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, DISTANT_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.DISTANT_LOG.get()),
                new StraightTrunkPlacer(5, 4, 3),
                BlockStateProvider.simple(ModBlocks.DISTANT_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),
                new TwoLayersFeatureSize(1, 0, 2)).build());*/
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Gempire.MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
