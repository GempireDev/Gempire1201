package com.gempire.init;

import com.gempire.Gempire;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Gempire.MODID);

    public static final RegistryObject<CreativeModeTab> GEMPIRE_GEMSTONES = CREATIVE_MODE_TABS.register("gempire_gemstones",
    () -> CreativeModeTab.builder().title(Component.translatable("itemGroup.gempire_gemstones"))
            // Set icon of creative tab
            .icon(() -> new ItemStack(ModItems.RUBY_GEM.get()))
            .displayItems((params, populator) -> {
                populator.accept(ModItems.AQUAMARINE_GEM.get());
                populator.accept(ModItems.NEPHRITE_GEM.get());
                populator.accept(ModItems.BISMUTH_GEM.get());
                populator.accept(ModItems.NACRE_GEM.get());
                populator.accept(ModItems.PEBBLE_GEM.get());
                populator.accept(ModItems.SHALE_GEM.get());
                populator.accept(ModItems.MICA_GEM.get());
                populator.accept(ModItems.PERIDOT_GEM.get());
                populator.accept(ModItems.RUTILE_GEM.get());
                populator.accept(ModItems.BIXBITE_GEM.get());
                populator.accept(ModItems.EMERALD_GEM.get());
                populator.accept(ModItems.RUBY_GEM.get());
                populator.accept(ModItems.LAPIS_GEM.get());
                populator.accept(ModItems.LARIMAR_GEM.get());
                populator.accept(ModItems.MORGANITE_GEM.get());
                populator.accept(ModItems.OBSIDIAN_GEM.get());

                populator.accept(ModItems.PINK_SAPPHIRE_GEM.get());
                populator.accept(ModItems.ORANGE_SAPPHIRE_GEM.get());
                populator.accept(ModItems.YELLOW_SAPPHIRE_GEM.get());
                populator.accept(ModItems.LIME_SAPPHIRE_GEM.get());
                populator.accept(ModItems.GREEN_SAPPHIRE_GEM.get());
                populator.accept(ModItems.CYAN_SAPPHIRE_GEM.get());
                populator.accept(ModItems.LIGHT_BLUE_SAPPHIRE_GEM.get());
                populator.accept(ModItems.BLUE_SAPPHIRE_GEM.get());
                populator.accept(ModItems.PURPLE_SAPPHIRE_GEM.get());
                populator.accept(ModItems.MAGENTA_SAPPHIRE_GEM.get());
                populator.accept(ModItems.BROWN_SAPPHIRE_GEM.get());
                populator.accept(ModItems.LIGHT_GRAY_SAPPHIRE_GEM.get());
                populator.accept(ModItems.GRAY_SAPPHIRE_GEM.get());
                populator.accept(ModItems.BLACK_SAPPHIRE_GEM.get());

                populator.accept(ModItems.PINK_SAPPHIRE_GEM.get());
                populator.accept(ModItems.ORANGE_SAPPHIRE_GEM.get());
                populator.accept(ModItems.YELLOW_SAPPHIRE_GEM.get());
                populator.accept(ModItems.LIME_SAPPHIRE_GEM.get());
                populator.accept(ModItems.GREEN_SAPPHIRE_GEM.get());
                populator.accept(ModItems.CYAN_SAPPHIRE_GEM.get());
                populator.accept(ModItems.LIGHT_BLUE_SAPPHIRE_GEM.get());
                populator.accept(ModItems.BLUE_SAPPHIRE_GEM.get());
                populator.accept(ModItems.PURPLE_SAPPHIRE_GEM.get());
                populator.accept(ModItems.MAGENTA_SAPPHIRE_GEM.get());
                populator.accept(ModItems.BROWN_SAPPHIRE_GEM.get());
                populator.accept(ModItems.LIGHT_GRAY_SAPPHIRE_GEM.get());
                populator.accept(ModItems.GRAY_SAPPHIRE_GEM.get());
                populator.accept(ModItems.BLACK_SAPPHIRE_GEM.get());
                populator.accept(ModItems.WHITE_SAPPHIRE_GEM.get());

                populator.accept(ModItems.PINK_ZIRCON_GEM.get());
                populator.accept(ModItems.RED_ZIRCON_GEM.get());
                populator.accept(ModItems.ORANGE_ZIRCON_GEM.get());
                populator.accept(ModItems.YELLOW_ZIRCON_GEM.get());
                populator.accept(ModItems.LIME_ZIRCON_GEM.get());
                populator.accept(ModItems.GREEN_ZIRCON_GEM.get());
                populator.accept(ModItems.CYAN_ZIRCON_GEM.get());
                populator.accept(ModItems.LIGHT_BLUE_ZIRCON_GEM.get());
                populator.accept(ModItems.BLUE_ZIRCON_GEM.get());
                populator.accept(ModItems.PURPLE_ZIRCON_GEM.get());
                populator.accept(ModItems.MAGENTA_ZIRCON_GEM.get());
                populator.accept(ModItems.BROWN_ZIRCON_GEM.get());
                populator.accept(ModItems.LIGHT_GRAY_ZIRCON_GEM.get());
                populator.accept(ModItems.GRAY_ZIRCON_GEM.get());
                populator.accept(ModItems.BLACK_ZIRCON_GEM.get());
                populator.accept(ModItems.WHITE_ZIRCON_GEM.get());

                populator.accept(ModItems.PINK_PEARL_GEM.get());
                populator.accept(ModItems.RED_PEARL_GEM.get());
                populator.accept(ModItems.ORANGE_PEARL_GEM.get());
                populator.accept(ModItems.YELLOW_PEARL_GEM.get());
                populator.accept(ModItems.LIME_PEARL_GEM.get());
                populator.accept(ModItems.GREEN_PEARL_GEM.get());
                populator.accept(ModItems.CYAN_PEARL_GEM.get());
                populator.accept(ModItems.LIGHT_BLUE_PEARL_GEM.get());
                populator.accept(ModItems.BLUE_PEARL_GEM.get());
                populator.accept(ModItems.PURPLE_PEARL_GEM.get());
                populator.accept(ModItems.MAGENTA_PEARL_GEM.get());
                populator.accept(ModItems.BROWN_PEARL_GEM.get());
                populator.accept(ModItems.LIGHT_GRAY_PEARL_GEM.get());
                populator.accept(ModItems.GRAY_PEARL_GEM.get());
                populator.accept(ModItems.BLACK_PEARL_GEM.get());
                populator.accept(ModItems.WHITE_PEARL_GEM.get());

                populator.accept(ModItems.PINK_SPINEL_GEM.get());
                populator.accept(ModItems.RED_SPINEL_GEM.get());
                populator.accept(ModItems.ORANGE_SPINEL_GEM.get());
                populator.accept(ModItems.YELLOW_SPINEL_GEM.get());
                populator.accept(ModItems.LIME_SPINEL_GEM.get());
                populator.accept(ModItems.GREEN_SPINEL_GEM.get());
                populator.accept(ModItems.CYAN_SPINEL_GEM.get());
                populator.accept(ModItems.LIGHT_BLUE_SPINEL_GEM.get());
                populator.accept(ModItems.BLUE_SPINEL_GEM.get());
                populator.accept(ModItems.PURPLE_SPINEL_GEM.get());
                populator.accept(ModItems.MAGENTA_SPINEL_GEM.get());
                populator.accept(ModItems.BROWN_SPINEL_GEM.get());
                populator.accept(ModItems.LIGHT_GRAY_SPINEL_GEM.get());
                populator.accept(ModItems.GRAY_SPINEL_GEM.get());
                populator.accept(ModItems.BLACK_SPINEL_GEM.get());
                populator.accept(ModItems.WHITE_SPINEL_GEM.get());

                populator.accept(ModItems.PINK_TOPAZ_GEM.get());
                populator.accept(ModItems.YELLOW_TOPAZ_GEM.get());
                populator.accept(ModItems.BLUE_TOPAZ_GEM.get());
                populator.accept(ModItems.WHITE_TOPAZ_GEM.get());

                populator.accept(ModItems.SPODUMENE_SPODUMENE_GEM.get());
                populator.accept(ModItems.KUNZITE_SPODUMENE_GEM.get());
                populator.accept(ModItems.HIDDENITE_SPODUMENE_GEM.get());
                populator.accept(ModItems.TRIPHANE_SPODUMENE_GEM.get());
                populator.accept(ModItems.BLUE_SPODUMENE_SPODUMENE_GEM.get());

                populator.accept(ModItems.ANDALUSITE_GARNET_GEM.get());
                populator.accept(ModItems.BEKILY_GARNET_GEM.get());
                populator.accept(ModItems.GRAPE_GARNET_GEM.get());
                populator.accept(ModItems.BLUE_GARNET_GEM.get());
                populator.accept(ModItems.GROSSULARITE_GARNET_GEM.get());
                populator.accept(ModItems.DEMANTOID_GARNET_GEM.get());
                populator.accept(ModItems.HESSONITE_GARNET_GEM.get());
                populator.accept(ModItems.IMPERIAL_GARNET_GEM.get());
                populator.accept(ModItems.KATOITE_GARNET_GEM.get());
                populator.accept(ModItems.IRIDESCENT_ANDRADITE_GARNET_GEM.get());
                populator.accept(ModItems.KIMZEYITE_GARNET_GEM.get());
                populator.accept(ModItems.LEUCO_GARNET_GEM.get());
                populator.accept(ModItems.MELANITE_GARNET_GEM.get());
                populator.accept(ModItems.PYROPE_GARNET_GEM.get());
                populator.accept(ModItems.RHODOLITE_GARNET_GEM.get());
                populator.accept(ModItems.TOPAZOLITE_GARNET_GEM.get());
                populator.accept(ModItems.UMBALITE_GARNET_GEM.get());

                populator.accept(ModItems.AMETHYST_QUARTZ_GEM.get());
                populator.accept(ModItems.ANGEL_AURA_QUARTZ_QUARTZ_GEM.get());
                populator.accept(ModItems.BLUE_AVENTURINE_QUARTZ_GEM.get());
                populator.accept(ModItems.CARNELIAN_QUARTZ_GEM.get());
                populator.accept(ModItems.CHALCEDONY_QUARTZ_GEM.get());
                populator.accept(ModItems.CHERT_QUARTZ_GEM.get());
                populator.accept(ModItems.MILKY_QUARTZ_QUARTZ_GEM.get());
                populator.accept(ModItems.FLINT_QUARTZ_GEM.get());
                populator.accept(ModItems.CITRINE_QUARTZ_GEM.get());
                populator.accept(ModItems.CHERRY_QUARTZ_QUARTZ_GEM.get());
                populator.accept(ModItems.DUMORTIERITE_QUARTZ_QUARTZ_GEM.get());
                populator.accept(ModItems.LACE_AMETHYST_QUARTZ_GEM.get());
                populator.accept(ModItems.HELIOTROPE_QUARTZ_GEM.get());
                populator.accept(ModItems.ONYX_QUARTZ_GEM.get());
                populator.accept(ModItems.PRASIOLITE_QUARTZ_GEM.get());
                populator.accept(ModItems.ROSE_QUARTZ_QUARTZ_GEM.get());
                populator.accept(ModItems.SMOKY_QUARTZ_QUARTZ_GEM.get());
                populator.accept(ModItems.TIGERS_EYE_QUARTZ_GEM.get());

                populator.accept(ModItems.BIGGS_JASPER_GEM.get());
                populator.accept(ModItems.BLACK_JASPER_GEM.get());
                populator.accept(ModItems.BLUE_SNAKESKIN_JASPER_GEM.get());
                populator.accept(ModItems.BUTTERFLY_JASPER_GEM.get());
                populator.accept(ModItems.GOLDEN_JASPER_GEM.get());
                populator.accept(ModItems.FLAME_JASPER_GEM.get());
                populator.accept(ModItems.KAMBABA_JASPER_GEM.get());
                populator.accept(ModItems.IMPERIAL_JASPER_GEM.get());
                populator.accept(ModItems.MATRIX_JASPER_GEM.get());
                populator.accept(ModItems.MOOKAITE_JASPER_GEM.get());
                populator.accept(ModItems.OCEAN_JASPER_GEM.get());
                populator.accept(ModItems.PICASSO_JASPER_GEM.get());
                populator.accept(ModItems.RAINFOREST_JASPER_GEM.get());
                populator.accept(ModItems.RIPPLE_JASPER_GEM.get());
                populator.accept(ModItems.ROYAL_PLUME_JASPER_GEM.get());
                populator.accept(ModItems.ZEBRA_JASPER_GEM.get());
                populator.accept(ModItems.RED_STRIPED_JASPER_GEM.get());

                populator.accept(ModItems.ACHROITE_TOURMALINE_GEM.get());
                populator.accept(ModItems.ADACHIITE_TOURMALINE_GEM.get());
                populator.accept(ModItems.CANARY_TOURMALINE_GEM.get());
                populator.accept(ModItems.WATERMELON_TOURMALINE_GEM.get());
                populator.accept(ModItems.CONGO_TOURMALINE_GEM.get());
                populator.accept(ModItems.DRAVITE_TOURMALINE_GEM.get());
                populator.accept(ModItems.INDICOLITE_TOURMALINE_GEM.get());
                populator.accept(ModItems.MAGENTA_TOURMALINE_GEM.get());
                populator.accept(ModItems.PARAIBA_TOURMALINE_GEM.get());
                populator.accept(ModItems.OLENITE_TOURMALINE_GEM.get());
                populator.accept(ModItems.POVONDRAITE_TOURMALINE_GEM.get());
                populator.accept(ModItems.PUMPKIN_TOURMALINE_GEM.get());
                populator.accept(ModItems.ROSSMANITE_TOURMALINE_GEM.get());
                populator.accept(ModItems.SCHORL_TOURMALINE_GEM.get());
                populator.accept(ModItems.RUBELLITE_TOURMALINE_GEM.get());
                populator.accept(ModItems.SIBERITE_TOURMALINE_GEM.get());
                populator.accept(ModItems.VERDELITE_TOURMALINE_GEM.get());

                populator.accept(ModItems.BLUE_LACE_AGATE_GEM.get());
                populator.accept(ModItems.BOTSWANA_AGATE_GEM.get());
                populator.accept(ModItems.DENDRITIC_AGATE_GEM.get());
                populator.accept(ModItems.GRAPE_AGATE_GEM.get());
                populator.accept(ModItems.IRIS_AGATE_GEM.get());
                populator.accept(ModItems.DRAGONS_VEIN_AGATE_GEM.get());
                populator.accept(ModItems.ELLENSBURG_BLUE_AGATE_GEM.get());
                populator.accept(ModItems.ROSE_AGATE_GEM.get());
                populator.accept(ModItems.ORCA_AGATE_GEM.get());
                populator.accept(ModItems.HOLLY_BLUE_AGATE_GEM.get());
                populator.accept(ModItems.LAKE_SUPERIOR_AGATE_GEM.get());
                populator.accept(ModItems.SAKURA_AGATE_GEM.get());
                populator.accept(ModItems.TAWNY_AGATE_GEM.get());
                populator.accept(ModItems.TREE_AGATE_GEM.get());
                populator.accept(ModItems.TURRITELLA_AGATE_GEM.get());
                populator.accept(ModItems.WATER_AGATE_GEM.get());
                populator.accept(ModItems.WINGATE_PASS_PLUME_AGATE_GEM.get());
            }).build()
        );

    public static final RegistryObject<CreativeModeTab> GEMPIRE_ITEMS = CREATIVE_MODE_TABS.register("gempire_items",
            () -> CreativeModeTab.builder().title(Component.translatable("itemGroup.gempire_items"))
            // Set icon of creative tab
            .icon(() -> new ItemStack(ModItems.PINK_CHROMA.get()))
            // Add default items to tab
            .displayItems((params, populator) -> {
                populator.accept(ModItems.RED_CHROMA.get());
                populator.accept(ModItems.ORANGE_CHROMA.get());
                populator.accept(ModItems.YELLOW_CHROMA.get());
                populator.accept(ModItems.LIME_CHROMA.get());
                populator.accept(ModItems.GREEN_CHROMA.get());
                populator.accept(ModItems.CYAN_CHROMA.get());
                populator.accept(ModItems.LIGHT_BLUE_CHROMA.get());
                populator.accept(ModItems.BLUE_CHROMA.get());
                populator.accept(ModItems.PURPLE_CHROMA.get());
                populator.accept(ModItems.MAGENTA_CHROMA.get());
                populator.accept(ModItems.PINK_CHROMA.get());
                populator.accept(ModItems.WHITE_CHROMA.get());
                populator.accept(ModItems.LIGHT_GRAY_CHROMA.get());
                populator.accept(ModItems.GRAY_CHROMA.get());
                populator.accept(ModItems.BLACK_CHROMA.get());
                populator.accept(ModItems.BROWN_CHROMA.get());
                populator.accept(ModItems.SPECIAL_CHROMA.get());

                populator.accept(ModItems.RED_SHARDS.get());
                populator.accept(ModItems.ORANGE_SHARDS.get());
                populator.accept(ModItems.YELLOW_SHARDS.get());
                populator.accept(ModItems.LIME_SHARDS.get());
                populator.accept(ModItems.GREEN_SHARDS.get());
                populator.accept(ModItems.CYAN_SHARDS.get());
                populator.accept(ModItems.LIGHT_BLUE_SHARDS.get());
                populator.accept(ModItems.BLUE_SHARDS.get());
                populator.accept(ModItems.PURPLE_SHARDS.get());
                populator.accept(ModItems.MAGENTA_SHARDS.get());
                populator.accept(ModItems.PINK_SHARDS.get());
                populator.accept(ModItems.WHITE_SHARDS.get());
                populator.accept(ModItems.LIGHT_GRAY_SHARDS.get());
                populator.accept(ModItems.GRAY_SHARDS.get());
                populator.accept(ModItems.BLACK_SHARDS.get());
                populator.accept(ModItems.BROWN_SHARDS.get());
                populator.accept(ModItems.SPECIAL_SHARDS.get());

                populator.accept(ModItems.FUCHSIA_SHARDS.get());
                populator.accept(ModItems.AMBER_SHARDS.get());
                populator.accept(ModItems.COBALT_SHARDS.get());
                populator.accept(ModItems.ALABASTER_SHARDS.get());

                populator.accept(ModItems.OPALIZED_TOOTH.get());

                populator.accept(ModItems.PRISMATIC_GLASS_SHARDS.get());
                populator.accept(ModItems.PURIFIED_PRISMATIC_GLASS.get());
                populator.accept(ModItems.PRISMATIC_FLASK.get());
                populator.accept(ModItems.PRISMATIC_SHEARS.get());

                populator.accept(ModItems.SHARE_CONTRACT.get());
                populator.accept(ModItems.TRANSFER_CONTRACT.get());
                populator.accept(ModItems.ASSIGN_CONTRACT.get());

                populator.accept(ModItems.RAW_TUNGSTEN.get());
                populator.accept(ModItems.TUNGSTEN_INGOT.get());
                populator.accept(ModItems.TUNGSTEN_NUGGET.get());
                populator.accept(ModItems.GEM_SCRAP.get());
                populator.accept(ModItems.GEM_ALLOY.get());
                populator.accept(ModItems.PRISMATIC_INGOT.get());
                populator.accept(ModItems.PRISMATIC_UPGRADE_SMITHING_TEMPLATE.get());

                populator.accept(ModItems.RAW_PYRITE.get());
                populator.accept(ModItems.PYRITE_INGOT.get());

                populator.accept(ModItems.RAW_THULITE.get());
                populator.accept(ModItems.THULITE_INGOT.get());
                populator.accept(ModItems.THULITE_NUGGET.get());
                populator.accept(ModItems.RAW_ANATASE.get());
                populator.accept(ModItems.ANATASE_INGOT.get());
                populator.accept(ModItems.ANATASE_NUGGET.get());
                populator.accept(ModItems.RAW_ELECTRUM.get());
                populator.accept(ModItems.ELECTRUM_INGOT.get());
                populator.accept(ModItems.ELECTRUM_NUGGET.get());
                populator.accept(ModItems.RAW_PLATINUM.get());
                populator.accept(ModItems.PLATINUM_INGOT.get());
                populator.accept(ModItems.PLATINUM_NUGGET.get());
                populator.accept(ModItems.SELENITE_CHUNK.get());

                populator.accept(ModItems.GEM_SLUSH_BUCKET.get());

                populator.accept(ModItems.PINK_ESSENCE_BUCKET.get());
                populator.accept(ModItems.BLUE_ESSENCE_BUCKET.get());
                populator.accept(ModItems.YELLOW_ESSENCE_BUCKET.get());
                populator.accept(ModItems.WHITE_ESSENCE_BUCKET.get());
                populator.accept(ModItems.CONGEALED_PINK_ESSENCE.get());
                populator.accept(ModItems.CONGEALED_BLUE_ESSENCE.get());
                populator.accept(ModItems.CONGEALED_YELLOW_ESSENCE.get());
                populator.accept(ModItems.CONGEALED_WHITE_ESSENCE.get());

                populator.accept(ModItems.STRAWBERRY.get());
                populator.accept(ModItems.PINCULE_FRUIT.get());
                populator.accept(ModItems.COBALT_KELP.get());
                populator.accept(ModItems.DRIED_COBALT_KELP.get());
                populator.accept(ModBlocks.AQUATIC_FIBRE.get());
                populator.accept(ModBlocks.TALL_AQUATIC_FIBRE.get());

                populator.accept(ModItems.RAW_MANTAWING.get());
                populator.accept(ModItems.COOKED_MANTAWING.get());
                populator.accept(ModItems.RAW_OPALIZED_MANTAWING.get());
                populator.accept(ModItems.COOKED_OPALIZED_MANTAWING.get());
                populator.accept(ModItems.RAW_CRYSTAL_SHANK.get());
                populator.accept(ModItems.COOKED_CRYSTAL_SHANK.get());

                populator.accept(ModItems.BLUE_CRYSTAL_APPLE_TOAST.get());
                populator.accept(ModItems.PINK_CRYSTAL_APPLE_TOAST.get());
                populator.accept(ModItems.PURPLE_CRYSTAL_APPLE_TOAST.get());
                populator.accept(ModItems.PINCULE_FRUIT_TOAST.get());
                populator.accept(ModItems.STRAWBERRY_TOAST.get());

                populator.accept(ModItems.CRYSTAL_SHANK_BREAD.get());
                populator.accept(ModItems.MANTAWING_BREAD.get());
                populator.accept(ModItems.OPALIZED_MANTAWING_BREAD.get());

                populator.accept(ModItems.SHADED_APPLE_COOKIE.get());
                populator.accept(ModItems.SHOCK_BERRY_COOKIE.get());
                populator.accept(ModItems.CALMING_JELLY_COOKIE.get());
                populator.accept(ModItems.ALIEN_FLOWER_COOKIE.get());

                populator.accept(ModItems.REMNANTS_MUSIC_DISC.get());
                populator.accept(ModItems.FRAGMENTS_MUSIC_DISC.get());

                populator.accept(ModItems.SLUDGE_GLOB.get());

                populator.accept(ModItems.CHROMA_CATALYST.get());
                populator.accept(ModItems.SPEED_BOOSTER.get());
                populator.accept(ModItems.PRIME_BOOST.get());
                populator.accept(ModItems.PRIMED_SLATE.get());
                populator.accept(ModItems.SLATE.get());
                populator.accept(ModItems.WARP_CORE.get());
                populator.accept(ModItems.WARP_SEED.get());

                populator.accept(ModItems.INACTIVE_AQUAMARINE_BASE.get());
                populator.accept(ModItems.INACTIVE_NEPHRITE_BASE.get());
                populator.accept(ModItems.INACTIVE_BISMUTH_BASE.get());
                populator.accept(ModItems.INACTIVE_PERIDOT_BASE.get());
                populator.accept(ModItems.INACTIVE_RUTILE_BASE.get());
                populator.accept(ModItems.INACTIVE_BIXBITE_BASE.get());
                populator.accept(ModItems.INACTIVE_EMERALD_BASE.get());
                populator.accept(ModItems.INACTIVE_RUBY_BASE.get());
                populator.accept(ModItems.INACTIVE_LAPIS_BASE.get());
                populator.accept(ModItems.INACTIVE_LARIMAR_BASE.get());
                populator.accept(ModItems.INACTIVE_MORGANITE_BASE.get());
                populator.accept(ModItems.INACTIVE_OBSIDIAN_BASE.get());
                populator.accept(ModItems.INACTIVE_SAPPHIRE_BASE.get());
                populator.accept(ModItems.INACTIVE_SAPPHIRE_BASE.get());
                populator.accept(ModItems.INACTIVE_ZIRCON_BASE.get());
                populator.accept(ModItems.INACTIVE_SPINEL_BASE.get());
                populator.accept(ModItems.INACTIVE_TOPAZ_BASE.get());
                populator.accept(ModItems.INACTIVE_SPODUMENE_BASE.get());
                populator.accept(ModItems.INACTIVE_GARNET_BASE.get());
                populator.accept(ModItems.INACTIVE_QUARTZ_BASE.get());
                populator.accept(ModItems.INACTIVE_JASPER_BASE.get());
                populator.accept(ModItems.INACTIVE_TOURMALINE_BASE.get());
                populator.accept(ModItems.INACTIVE_AGATE_BASE.get());

                populator.accept(ModItems.PALADIN_FLOWER.get());
                populator.accept(ModItems.GUARDIAN_TEAR.get());
                populator.accept(ModItems.HUNTRESS_DAGGER.get());
                populator.accept(ModItems.EMPRESS_STAR.get());
                /*populator.accept(ModItems.IRIDESCENT_FLOWER.get());
                populator.accept(ModItems.MIRRORED_TEAR.get());
                populator.accept(ModItems.GILDED_DAGGER.get());
                populator.accept(ModItems.PRISMATIC_STAR.get());
                populator.accept(ModItems.INACTIVE_PALADIN_GEM.get());
                populator.accept(ModItems.INACTIVE_GUARDIAN_GEM.get());
                populator.accept(ModItems.INACTIVE_HUNTRESS_GEM.get());
                populator.accept(ModItems.INACTIVE_EMPRESS_GEM.get());
*/
                populator.accept(ModItems.BLUE_CRYSTAL_APPLE.get());
                populator.accept(ModItems.PURPLE_CRYSTAL_APPLE.get());
                populator.accept(ModItems.PINK_CRYSTAL_APPLE.get());

                populator.accept(ModItems.ALIEN_FLOWER.get());
                populator.accept(ModItems.CALMING_JELLY.get());
                populator.accept(ModItems.SHOCK_BERRY.get());
                populator.accept(ModItems.SHADED_APPLE.get());

                //populator.accept(ModItems.WARP_CORE.get());
            }).build()
    );
    public static final RegistryObject<CreativeModeTab> GEMPIRE_BLOCKS = CREATIVE_MODE_TABS.register("gempire_blocks",
            () -> CreativeModeTab.builder().title(Component.translatable("itemGroup.gempire_blocks"))
            // Set icon of creative tab
            .icon(() -> new ItemStack(ModItems.DRAINED_RED_STONE_2.get()))
            // Add default items to tab
            .displayItems((params, populator) -> {
                populator.accept(ModBlocks.DRAINED_RED_SOIL.get());
                populator.accept(ModBlocks.DRAINED_RED_SAND.get());
                populator.accept(ModBlocks.DRAINED_RED_STONE_2.get());
                populator.accept(ModBlocks.DRAINED_RED_STONE_LIGHT_STAIRS.get());
                populator.accept(ModBlocks.DRAINED_RED_STONE_LIGHT_SLAB.get());
                populator.accept(ModBlocks.DRAINED_BANDED_RED_STONE.get());
                populator.accept(ModBlocks.DRAINED_RED_STONE_STAIRS.get());
                populator.accept(ModBlocks.DRAINED_RED_STONE_SLAB.get());
                populator.accept(ModBlocks.DRAINED_RED_STONE.get());
                populator.accept(ModBlocks.DRAINED_RED_STONE_DARK_STAIRS.get());
                populator.accept(ModBlocks.DRAINED_RED_STONE_DARK_SLAB.get());
                populator.accept(ModBlocks.DRAINED_YELLOW_SOIL.get());
                populator.accept(ModBlocks.DRAINED_SAND.get());
                populator.accept(ModBlocks.DRAINED_YELLOW_STONE_2.get());
                populator.accept(ModBlocks.DRAINED_YELLOW_STONE_LIGHT_STAIRS.get());
                populator.accept(ModBlocks.DRAINED_YELLOW_STONE_LIGHT_SLAB.get());
                populator.accept(ModBlocks.DRAINED_BANDED_YELLOW_STONE.get());
                populator.accept(ModBlocks.DRAINED_YELLOW_STONE_STAIRS.get());
                populator.accept(ModBlocks.DRAINED_YELLOW_STONE_SLAB.get());
                populator.accept(ModBlocks.DRAINED_YELLOW_STONE.get());
                populator.accept(ModBlocks.DRAINED_YELLOW_STONE_DARK_STAIRS.get());
                populator.accept(ModBlocks.DRAINED_YELLOW_STONE_DARK_SLAB.get());
                populator.accept(ModBlocks.DRAINED_BLUE_SOIL.get());
                populator.accept(ModBlocks.DRAINED_BLUE_SAND.get());
                populator.accept(ModBlocks.DRAINED_BLUE_STONE_2.get());
                populator.accept(ModBlocks.DRAINED_BLUE_STONE_LIGHT_STAIRS.get());
                populator.accept(ModBlocks.DRAINED_BLUE_STONE_LIGHT_SLAB.get());
                populator.accept(ModBlocks.DRAINED_BANDED_BLUE_STONE.get());
                populator.accept(ModBlocks.DRAINED_BLUE_STONE_STAIRS.get());
                populator.accept(ModBlocks.DRAINED_BLUE_STONE_SLAB.get());
                populator.accept(ModBlocks.DRAINED_BLUE_STONE.get());
                populator.accept(ModBlocks.DRAINED_BLUE_STONE_DARK_STAIRS.get());
                populator.accept(ModBlocks.DRAINED_BLUE_STONE_DARK_SLAB.get());
                populator.accept(ModBlocks.DRAINED_PURPLE_SOIL.get());
                populator.accept(ModBlocks.DRAINED_PURPLE_SAND.get());
                populator.accept(ModBlocks.DRAINED_PURPLE_STONE_2.get());
                populator.accept(ModBlocks.DRAINED_PURPLE_STONE_LIGHT_STAIRS.get());
                populator.accept(ModBlocks.DRAINED_PURPLE_STONE_LIGHT_SLAB.get());
                populator.accept(ModBlocks.DRAINED_BANDED_PURPLE_STONE.get());
                populator.accept(ModBlocks.DRAINED_PURPLE_STONE_STAIRS.get());
                populator.accept(ModBlocks.DRAINED_PURPLE_STONE_SLAB.get());
                populator.accept(ModBlocks.DRAINED_PURPLE_STONE.get());
                populator.accept(ModBlocks.DRAINED_PURPLE_STONE_DARK_STAIRS.get());
                populator.accept(ModBlocks.DRAINED_PURPLE_STONE_DARK_SLAB.get());
                populator.accept(ModBlocks.DRAINED_GREY_SOIL.get());
                populator.accept(ModBlocks.DRAINED_GREY_SAND.get());
                populator.accept(ModBlocks.DRAINED_GREY_STONE_2.get());
                populator.accept(ModBlocks.DRAINED_GREY_STONE_LIGHT_STAIRS.get());
                populator.accept(ModBlocks.DRAINED_GREY_STONE_LIGHT_SLAB.get());
                populator.accept(ModBlocks.DRAINED_BANDED_GREY_STONE.get());
                populator.accept(ModBlocks.DRAINED_GREY_STONE_STAIRS.get());
                populator.accept(ModBlocks.DRAINED_GREY_STONE_SLAB.get());
                populator.accept(ModBlocks.DRAINED_GREY_STONE.get());
                populator.accept(ModBlocks.DRAINED_GREY_STONE_DARK_STAIRS.get());
                populator.accept(ModBlocks.DRAINED_GREY_STONE_DARK_SLAB.get());
                populator.accept(ModBlocks.DRAINED_ICE.get());
                populator.accept(ModBlocks.DRAINED_LOG_CRACKED.get());
                populator.accept(ModBlocks.DRAINED_LOG.get());

                populator.accept(ModBlocks.DRAINED_RED_POLISHED_STONE_LIGHT.get());
                populator.accept(ModBlocks.DRAINED_RED_POLISHED_STONE_LIGHT_STAIRS.get());
                populator.accept(ModBlocks.DRAINED_RED_POLISHED_STONE_LIGHT_SLAB.get());
                populator.accept(ModBlocks.DRAINED_RED_POLISHED_STONE.get());
                populator.accept(ModBlocks.DRAINED_RED_POLISHED_STONE_STAIRS.get());
                populator.accept(ModBlocks.DRAINED_RED_POLISHED_STONE_SLAB.get());
                populator.accept(ModBlocks.DRAINED_RED_POLISHED_STONE_DARK.get());
                populator.accept(ModBlocks.DRAINED_RED_POLISHED_STONE_DARK_STAIRS.get());
                populator.accept(ModBlocks.DRAINED_RED_POLISHED_STONE_DARK_SLAB.get());
                populator.accept(ModBlocks.DRAINED_YELLOW_POLISHED_STONE_LIGHT.get());
                populator.accept(ModBlocks.DRAINED_YELLOW_POLISHED_STONE_LIGHT_STAIRS.get());
                populator.accept(ModBlocks.DRAINED_YELLOW_POLISHED_STONE_LIGHT_SLAB.get());
                populator.accept(ModBlocks.DRAINED_YELLOW_POLISHED_STONE.get());
                populator.accept(ModBlocks.DRAINED_YELLOW_POLISHED_STONE_STAIRS.get());
                populator.accept(ModBlocks.DRAINED_YELLOW_POLISHED_STONE_SLAB.get());
                populator.accept(ModBlocks.DRAINED_YELLOW_POLISHED_STONE_DARK.get());
                populator.accept(ModBlocks.DRAINED_YELLOW_POLISHED_STONE_DARK_STAIRS.get());
                populator.accept(ModBlocks.DRAINED_YELLOW_POLISHED_STONE_DARK_SLAB.get());
                populator.accept(ModBlocks.DRAINED_BLUE_POLISHED_STONE_LIGHT.get());
                populator.accept(ModBlocks.DRAINED_BLUE_POLISHED_STONE_LIGHT_STAIRS.get());
                populator.accept(ModBlocks.DRAINED_BLUE_POLISHED_STONE_LIGHT_SLAB.get());
                populator.accept(ModBlocks.DRAINED_BLUE_POLISHED_STONE.get());
                populator.accept(ModBlocks.DRAINED_BLUE_POLISHED_STONE_STAIRS.get());
                populator.accept(ModBlocks.DRAINED_BLUE_POLISHED_STONE_SLAB.get());
                populator.accept(ModBlocks.DRAINED_BLUE_POLISHED_STONE_DARK.get());
                populator.accept(ModBlocks.DRAINED_BLUE_POLISHED_STONE_DARK_STAIRS.get());
                populator.accept(ModBlocks.DRAINED_BLUE_POLISHED_STONE_DARK_SLAB.get());
                populator.accept(ModBlocks.DRAINED_PURPLE_POLISHED_STONE_LIGHT.get());
                populator.accept(ModBlocks.DRAINED_PURPLE_POLISHED_STONE_LIGHT_STAIRS.get());
                populator.accept(ModBlocks.DRAINED_PURPLE_POLISHED_STONE_LIGHT_SLAB.get());
                populator.accept(ModBlocks.DRAINED_PURPLE_POLISHED_STONE.get());
                populator.accept(ModBlocks.DRAINED_PURPLE_POLISHED_STONE_STAIRS.get());
                populator.accept(ModBlocks.DRAINED_PURPLE_POLISHED_STONE_SLAB.get());
                populator.accept(ModBlocks.DRAINED_PURPLE_POLISHED_STONE_DARK.get());
                populator.accept(ModBlocks.DRAINED_PURPLE_POLISHED_STONE_DARK_STAIRS.get());
                populator.accept(ModBlocks.DRAINED_PURPLE_POLISHED_STONE_DARK_SLAB.get());
                populator.accept(ModBlocks.DRAINED_GREY_POLISHED_STONE_LIGHT.get());
                populator.accept(ModBlocks.DRAINED_GREY_POLISHED_STONE_LIGHT_STAIRS.get());
                populator.accept(ModBlocks.DRAINED_GREY_POLISHED_STONE_LIGHT_SLAB.get());
                populator.accept(ModBlocks.DRAINED_GREY_POLISHED_STONE.get());
                populator.accept(ModBlocks.DRAINED_GREY_POLISHED_STONE_STAIRS.get());
                populator.accept(ModBlocks.DRAINED_GREY_POLISHED_STONE_SLAB.get());
                populator.accept(ModBlocks.DRAINED_GREY_POLISHED_STONE_DARK.get());
                populator.accept(ModBlocks.DRAINED_GREY_POLISHED_STONE_DARK_STAIRS.get());
                populator.accept(ModBlocks.DRAINED_GREY_POLISHED_STONE_DARK_SLAB.get());

                populator.accept(ModBlocks.DRAINED_RED_GLAZED_TILE.get());
                populator.accept(ModBlocks.DRAINED_RED_GLASS.get());
                populator.accept(ModBlocks.DRAINED_RED_GLASS_PANE.get());
                populator.accept(ModBlocks.DRAINED_RED_STONE_BRICKS_CHISELED.get());
                populator.accept(ModBlocks.DRAINED_RED_STONE_BRICKS_LIGHT.get());
                populator.accept(ModBlocks.DRAINED_RED_STONE_BRICKS_CRACKED_LIGHT.get());
                populator.accept(ModBlocks.DRAINED_RED_STONE_BRICK_LIGHT_STAIRS.get());
                populator.accept(ModBlocks.DRAINED_RED_STONE_BRICK_LIGHT_SLAB.get());
                populator.accept(ModBlocks.DRAINED_RED_STONE_BRICK_LIGHT_WALL.get());
                populator.accept(ModBlocks.DRAINED_RED_STONE_BRICKS.get());
                populator.accept(ModBlocks.DRAINED_RED_STONE_BRICKS_CRACKED.get());
                populator.accept(ModBlocks.DRAINED_RED_STONE_BRICK_STAIRS.get());
                populator.accept(ModBlocks.DRAINED_RED_STONE_BRICK_SLAB.get());
                populator.accept(ModBlocks.DRAINED_RED_STONE_BRICK_WALL.get());
                populator.accept(ModBlocks.DRAINED_RED_STONE_BRICKS_DARK.get());
                populator.accept(ModBlocks.DRAINED_RED_STONE_BRICKS_CRACKED_DARK.get());
                populator.accept(ModBlocks.DRAINED_RED_STONE_BRICK_DARK_STAIRS.get());
                populator.accept(ModBlocks.DRAINED_RED_STONE_BRICK_DARK_SLAB.get());
                populator.accept(ModBlocks.DRAINED_RED_STONE_BRICK_DARK_WALL.get());
                populator.accept(ModBlocks.DRAINED_YELLOW_GLAZED_TILE.get());
                populator.accept(ModBlocks.DRAINED_YELLOW_GLASS.get());
                populator.accept(ModBlocks.DRAINED_YELLOW_GLASS_PANE.get());
                populator.accept(ModBlocks.DRAINED_YELLOW_STONE_BRICKS_CHISELED.get());
                populator.accept(ModBlocks.DRAINED_YELLOW_STONE_BRICKS_LIGHT.get());
                populator.accept(ModBlocks.DRAINED_YELLOW_STONE_BRICKS_CRACKED_LIGHT.get());
                populator.accept(ModBlocks.DRAINED_YELLOW_STONE_BRICK_LIGHT_STAIRS.get());
                populator.accept(ModBlocks.DRAINED_YELLOW_STONE_BRICK_LIGHT_SLAB.get());
                populator.accept(ModBlocks.DRAINED_YELLOW_STONE_BRICK_LIGHT_WALL.get());
                populator.accept(ModBlocks.DRAINED_YELLOW_STONE_BRICKS.get());
                populator.accept(ModBlocks.DRAINED_YELLOW_STONE_BRICKS_CRACKED.get());
                populator.accept(ModBlocks.DRAINED_YELLOW_STONE_BRICK_STAIRS.get());
                populator.accept(ModBlocks.DRAINED_YELLOW_STONE_BRICK_SLAB.get());
                populator.accept(ModBlocks.DRAINED_YELLOW_STONE_BRICK_WALL.get());
                populator.accept(ModBlocks.DRAINED_YELLOW_STONE_BRICKS_DARK.get());
                populator.accept(ModBlocks.DRAINED_YELLOW_STONE_BRICKS_CRACKED_DARK.get());
                populator.accept(ModBlocks.DRAINED_YELLOW_STONE_BRICK_DARK_STAIRS.get());
                populator.accept(ModBlocks.DRAINED_YELLOW_STONE_BRICK_DARK_SLAB.get());
                populator.accept(ModBlocks.DRAINED_YELLOW_STONE_BRICK_DARK_WALL.get());
                populator.accept(ModBlocks.DRAINED_BLUE_GLAZED_TILE.get());
                populator.accept(ModBlocks.DRAINED_BLUE_GLASS.get());
                populator.accept(ModBlocks.DRAINED_BLUE_GLASS_PANE.get());
                populator.accept(ModBlocks.DRAINED_BLUE_STONE_BRICKS_CHISELED.get());
                populator.accept(ModBlocks.DRAINED_BLUE_STONE_BRICKS_LIGHT.get());
                populator.accept(ModBlocks.DRAINED_BLUE_STONE_BRICKS_CRACKED_LIGHT.get());
                populator.accept(ModBlocks.DRAINED_BLUE_STONE_BRICK_LIGHT_STAIRS.get());
                populator.accept(ModBlocks.DRAINED_BLUE_STONE_BRICK_LIGHT_SLAB.get());
                populator.accept(ModBlocks.DRAINED_BLUE_STONE_BRICK_LIGHT_WALL.get());
                populator.accept(ModBlocks.DRAINED_BLUE_STONE_BRICKS.get());
                populator.accept(ModBlocks.DRAINED_BLUE_STONE_BRICKS_CRACKED.get());
                populator.accept(ModBlocks.DRAINED_BLUE_STONE_BRICK_STAIRS.get());
                populator.accept(ModBlocks.DRAINED_BLUE_STONE_BRICK_SLAB.get());
                populator.accept(ModBlocks.DRAINED_BLUE_STONE_BRICK_WALL.get());
                populator.accept(ModBlocks.DRAINED_BLUE_STONE_BRICKS_DARK.get());
                populator.accept(ModBlocks.DRAINED_BLUE_STONE_BRICKS_CRACKED_DARK.get());
                populator.accept(ModBlocks.DRAINED_BLUE_STONE_BRICK_DARK_STAIRS.get());
                populator.accept(ModBlocks.DRAINED_BLUE_STONE_BRICK_DARK_SLAB.get());
                populator.accept(ModBlocks.DRAINED_BLUE_STONE_BRICK_DARK_WALL.get());
                populator.accept(ModBlocks.DRAINED_PURPLE_GLAZED_TILE.get());
                populator.accept(ModBlocks.DRAINED_PURPLE_GLASS.get());
                populator.accept(ModBlocks.DRAINED_PURPLE_GLASS_PANE.get());
                populator.accept(ModBlocks.DRAINED_PURPLE_STONE_BRICKS_CHISELED.get());
                populator.accept(ModBlocks.DRAINED_PURPLE_STONE_BRICKS_LIGHT.get());
                populator.accept(ModBlocks.DRAINED_PURPLE_STONE_BRICKS_CRACKED_LIGHT.get());
                populator.accept(ModBlocks.DRAINED_PURPLE_STONE_BRICK_LIGHT_STAIRS.get());
                populator.accept(ModBlocks.DRAINED_PURPLE_STONE_BRICK_LIGHT_SLAB.get());
                populator.accept(ModBlocks.DRAINED_PURPLE_STONE_BRICK_LIGHT_WALL.get());
                populator.accept(ModBlocks.DRAINED_PURPLE_STONE_BRICKS.get());
                populator.accept(ModBlocks.DRAINED_PURPLE_STONE_BRICKS_CRACKED.get());
                populator.accept(ModBlocks.DRAINED_PURPLE_STONE_BRICK_STAIRS.get());
                populator.accept(ModBlocks.DRAINED_PURPLE_STONE_BRICK_SLAB.get());
                populator.accept(ModBlocks.DRAINED_PURPLE_STONE_BRICK_WALL.get());
                populator.accept(ModBlocks.DRAINED_PURPLE_STONE_BRICKS_DARK.get());
                populator.accept(ModBlocks.DRAINED_PURPLE_STONE_BRICKS_CRACKED_DARK.get());
                populator.accept(ModBlocks.DRAINED_PURPLE_STONE_BRICK_DARK_STAIRS.get());
                populator.accept(ModBlocks.DRAINED_PURPLE_STONE_BRICK_DARK_SLAB.get());
                populator.accept(ModBlocks.DRAINED_PURPLE_STONE_BRICK_DARK_WALL.get());
                populator.accept(ModBlocks.DRAINED_GREY_GLAZED_TILE.get());
                populator.accept(ModBlocks.DRAINED_GREY_GLASS.get());
                populator.accept(ModBlocks.DRAINED_GREY_GLASS_PANE.get());
                populator.accept(ModBlocks.DRAINED_GREY_STONE_BRICKS_CHISELED.get());
                populator.accept(ModBlocks.DRAINED_GREY_STONE_BRICKS_LIGHT.get());
                populator.accept(ModBlocks.DRAINED_GREY_STONE_BRICKS_CRACKED_LIGHT.get());
                populator.accept(ModBlocks.DRAINED_GREY_STONE_BRICK_LIGHT_STAIRS.get());
                populator.accept(ModBlocks.DRAINED_GREY_STONE_BRICK_LIGHT_SLAB.get());
                populator.accept(ModBlocks.DRAINED_GREY_STONE_BRICK_LIGHT_WALL.get());
                populator.accept(ModBlocks.DRAINED_GREY_STONE_BRICKS.get());
                populator.accept(ModBlocks.DRAINED_GREY_STONE_BRICKS_CRACKED.get());
                populator.accept(ModBlocks.DRAINED_GREY_STONE_BRICK_STAIRS.get());
                populator.accept(ModBlocks.DRAINED_GREY_STONE_BRICK_SLAB.get());
                populator.accept(ModBlocks.DRAINED_GREY_STONE_BRICK_WALL.get());
                populator.accept(ModBlocks.DRAINED_GREY_STONE_BRICKS_DARK.get());
                populator.accept(ModBlocks.DRAINED_GREY_STONE_BRICKS_CRACKED_DARK.get());
                populator.accept(ModBlocks.DRAINED_GREY_STONE_BRICK_DARK_STAIRS.get());
                populator.accept(ModBlocks.DRAINED_GREY_STONE_BRICK_DARK_SLAB.get());
                populator.accept(ModBlocks.DRAINED_GREY_STONE_BRICK_DARK_WALL.get());

                populator.accept(ModItems.RED_CHROMA_CRYSTAL.get());
                populator.accept(ModItems.ORANGE_CHROMA_CRYSTAL.get());
                populator.accept(ModItems.YELLOW_CHROMA_CRYSTAL.get());
                populator.accept(ModItems.LIME_CHROMA_CRYSTAL.get());
                populator.accept(ModItems.GREEN_CHROMA_CRYSTAL.get());
                populator.accept(ModItems.CYAN_CHROMA_CRYSTAL.get());
                populator.accept(ModItems.LIGHT_BLUE_CHROMA_CRYSTAL.get());
                populator.accept(ModItems.BLUE_CHROMA_CRYSTAL.get());
                populator.accept(ModItems.PURPLE_CHROMA_CRYSTAL.get());
                populator.accept(ModItems.MAGENTA_CHROMA_CRYSTAL.get());
                populator.accept(ModItems.PINK_CHROMA_CRYSTAL.get());
                populator.accept(ModItems.WHITE_CHROMA_CRYSTAL.get());
                populator.accept(ModItems.LIGHT_GRAY_CHROMA_CRYSTAL.get());
                populator.accept(ModItems.GRAY_CHROMA_CRYSTAL.get());
                populator.accept(ModItems.BLACK_CHROMA_CRYSTAL.get());
                populator.accept(ModItems.BROWN_CHROMA_CRYSTAL.get());

                populator.accept(ModItems.ICE_SPIKE.get());

                populator.accept(ModItems.POWER_CRYSTAL_BLOCK_ITEM.get());
                populator.accept(ModItems.POWER_CRYSTAL_BLOCK_TIER_2_ITEM.get());
                populator.accept(ModItems.TANK_BLOCK_ITEM.get());
                populator.accept(ModItems.DRILL_BLOCK_ITEM.get());
                populator.accept(ModItems.SHELL_BLOCK_ITEM.get());
                populator.accept(ModItems.INCUBATOR_BLOCK_ITEM.get());
                populator.accept(ModItems.PEDISTAL.get());

                populator.accept(ModItems.CONGEALED_PINK_ESSENCE_BLOCK.get());
                populator.accept(ModItems.CONGEALED_BLUE_ESSENCE_BLOCK.get());
                populator.accept(ModItems.CONGEALED_YELLOW_ESSENCE_BLOCK.get());
                populator.accept(ModItems.CONGEALED_WHITE_ESSENCE_BLOCK.get());

                populator.accept(ModItems.STRAWBERRY_BLOCK.get());

                populator.accept(ModBlocks.PRISMATIC_BLOCK.get());
                populator.accept(ModBlocks.TUNGSTEN_BLOCK.get());
                populator.accept(ModBlocks.RAW_TUNGSTEN_BLOCK.get());
                populator.accept(ModBlocks.TUNGSTEN_ORE.get());
                populator.accept(ModBlocks.DEEPSLATE_TUNGSTEN_ORE.get());
                populator.accept(ModBlocks.PEGMATITE_TUNGSTEN_ORE.get());

                populator.accept(ModBlocks.PYRITE_BLOCK.get());
                populator.accept(ModBlocks.RAW_PYRITE_BLOCK.get());
                populator.accept(ModBlocks.PYRITE_ORE.get());

                populator.accept(ModBlocks.THULITE_BLOCK.get());
                populator.accept(ModBlocks.RAW_THULITE_BLOCK.get());
                populator.accept(ModBlocks.THULITE_ORE.get());

                populator.accept(ModBlocks.ANATASE_BLOCK.get());
                populator.accept(ModBlocks.RAW_ANATASE_BLOCK.get());
                populator.accept(ModBlocks.ANATASE_ORE.get());

                populator.accept(ModBlocks.ELECTRUM_BLOCK.get());
                populator.accept(ModBlocks.RAW_ELECTRUM_BLOCK.get());
                populator.accept(ModBlocks.ELECTRUM_ORE.get());

                populator.accept(ModBlocks.PLATINUM_BLOCK.get());
                populator.accept(ModBlocks.RAW_PLATINUM_BLOCK.get());
                populator.accept(ModBlocks.PLATINUM_ORE.get());

                populator.accept(ModBlocks.PYRITE_BLOCK.get());
                populator.accept(ModBlocks.GEODE_CRYSTAL_BLOCK.get());

                populator.accept(ModBlocks.RYOLITE_BLOCK.get());
                populator.accept(ModBlocks.RYOLITE_STAIRS.get());
                populator.accept(ModBlocks.RYOLITE_SLAB.get());
                populator.accept(ModBlocks.RYOLITE_WALL.get());
                populator.accept(ModBlocks.POLISHED_RYOLITE_BLOCK.get());
                populator.accept(ModBlocks.POLISHED_RYOLITE_STAIRS.get());
                populator.accept(ModBlocks.POLISHED_RYOLITE_SLAB.get());
                populator.accept(ModBlocks.POLISHED_RYOLITE_WALL.get());

                populator.accept(ModBlocks.PEGMATITE.get());
                populator.accept(ModBlocks.PEGMATITE_STAIRS.get());
                populator.accept(ModBlocks.PEGMATITE_SLAB.get());
                populator.accept(ModBlocks.PEGMATITE_WALL.get());
                populator.accept(ModBlocks.COBBLED_PEGMATITE.get());
                populator.accept(ModBlocks.COBBLED_PEGMATITE_STAIRS.get());
                populator.accept(ModBlocks.COBBLED_PEGMATITE_SLAB.get());
                populator.accept(ModBlocks.COBBLED_PEGMATITE_WALL.get());
                populator.accept(ModBlocks.SCHIST_BLOCK.get());
                populator.accept(ModBlocks.SCHIST_STAIRS.get());
                populator.accept(ModBlocks.SCHIST_SLAB.get());
                populator.accept(ModBlocks.SCHIST_WALL.get());
                populator.accept(ModBlocks.POLISHED_SCHIST_BLOCK.get());
                populator.accept(ModBlocks.POLISHED_SCHIST_STAIRS.get());
                populator.accept(ModBlocks.POLISHED_SCHIST_SLAB.get());
                populator.accept(ModBlocks.POLISHED_SCHIST_WALL.get());

                populator.accept(ModBlocks.SELENITE.get());
                populator.accept(ModBlocks.SELENITE_STAIRS.get());
                populator.accept(ModBlocks.SELENITE_SLAB.get());
                populator.accept(ModBlocks.SELENITE_WALL.get());
                populator.accept(ModBlocks.BUDDING_SELENITE.get());
                populator.accept(ModBlocks.SELENITE_CLUSTER.get());
                populator.accept(ModBlocks.ROUGH_SELENITE.get());
                populator.accept(ModBlocks.POLISHED_SELENITE.get());
                populator.accept(ModBlocks.POLISHED_SELENITE_STAIRS.get());
                populator.accept(ModBlocks.POLISHED_SELENITE_SLAB.get());
                populator.accept(ModBlocks.POLISHED_SELENITE_WALL.get());
                populator.accept(ModBlocks.PRIMED_SELENITE.get());

                populator.accept(ModBlocks.ABNORMAL_SAND.get());
                populator.accept(ModBlocks.ABNORMAL_SANDSTONE.get());
                populator.accept(ModBlocks.ABNORMAL_SANDSTONE_STAIRS.get());
                populator.accept(ModBlocks.ABNORMAL_SANDSTONE_SLAB.get());
                populator.accept(ModBlocks.ABNORMAL_SANDSTONE_WALL.get());
                populator.accept(ModBlocks.SMOOTH_ABNORMAL_SANDSTONE.get());
                populator.accept(ModBlocks.SMOOTH_ABNORMAL_SANDSTONE_STAIRS.get());
                populator.accept(ModBlocks.SMOOTH_ABNORMAL_SANDSTONE_SLAB.get());

                populator.accept(ModBlocks.PECULIAR_SAND.get());
                populator.accept(ModBlocks.PECULIAR_SANDSTONE.get());
                populator.accept(ModBlocks.PECULIAR_SANDSTONE_STAIRS.get());
                populator.accept(ModBlocks.PECULIAR_SANDSTONE_SLAB.get());
                populator.accept(ModBlocks.PECULIAR_SANDSTONE_WALL.get());
                populator.accept(ModBlocks.SMOOTH_PECULIAR_SANDSTONE.get());
                populator.accept(ModBlocks.SMOOTH_PECULIAR_SANDSTONE_STAIRS.get());
                populator.accept(ModBlocks.SMOOTH_PECULIAR_SANDSTONE_SLAB.get());

                populator.accept(ModBlocks.PINK_SAND.get());
                populator.accept(ModBlocks.PINK_SANDSTONE.get());
                populator.accept(ModBlocks.PINK_SANDSTONE_STAIRS.get());
                populator.accept(ModBlocks.PINK_SANDSTONE_SLAB.get());
                populator.accept(ModBlocks.PINK_SANDSTONE_WALL.get());
                populator.accept(ModBlocks.SMOOTH_PINK_SANDSTONE.get());
                populator.accept(ModBlocks.SMOOTH_PINK_SANDSTONE_STAIRS.get());
                populator.accept(ModBlocks.SMOOTH_PINK_SANDSTONE_SLAB.get());
                populator.accept(ModBlocks.CUT_PINK_SANDSTONE.get());
                populator.accept(ModBlocks.CUT_PINK_SANDSTONE_SLAB.get());
                populator.accept(ModBlocks.CHISELED_PINK_SANDSTONE.get());

                populator.accept(ModBlocks.MACADAM.get());

                populator.accept(ModItems.DESOLATE_GRASS.get());
                populator.accept(ModItems.DESOLATE_SOIL.get());

                populator.accept(ModItems.PINK_PINCULE.get());
                populator.accept(ModItems.ORANGE_PINCULE.get());
                populator.accept(ModItems.YELLOW_PINCULE.get());
                populator.accept(ModItems.GREEN_PINCULE.get());
                populator.accept(ModItems.BLUE_PINCULE.get());
                populator.accept(ModItems.PURPLE_PINCULE.get());

                populator.accept(ModBlocks.THULITE_CLUSTER.get());
                populator.accept(ModBlocks.THULITE_TOWER.get());

                populator.accept(ModBlocks.PHOSPHORUS_LAMP.get());

                populator.accept(ModBlocks.RED_PHOSPHORUS_LAMP.get());
                populator.accept(ModBlocks.ORANGE_PHOSPHORUS_LAMP.get());
                populator.accept(ModBlocks.YELLOW_PHOSPHORUS_LAMP.get());
                populator.accept(ModBlocks.LIME_PHOSPHORUS_LAMP.get());
                populator.accept(ModBlocks.GREEN_PHOSPHORUS_LAMP.get());
                populator.accept(ModBlocks.CYAN_PHOSPHORUS_LAMP.get());
                populator.accept(ModBlocks.LIGHT_BLUE_PHOSPHORUS_LAMP.get());
                populator.accept(ModBlocks.BLUE_PHOSPHORUS_LAMP.get());
                populator.accept(ModBlocks.PURPLE_PHOSPHORUS_LAMP.get());
                populator.accept(ModBlocks.MAGENTA_PHOSPHORUS_LAMP.get());
                populator.accept(ModBlocks.PINK_PHOSPHORUS_LAMP.get());
                populator.accept(ModBlocks.LIGHT_GRAY_PHOSPHORUS_LAMP.get());
                populator.accept(ModBlocks.GRAY_PHOSPHORUS_LAMP.get());
                populator.accept(ModBlocks.BLACK_PHOSPHORUS_LAMP.get());
                populator.accept(ModBlocks.BROWN_PHOSPHORUS_LAMP.get());

                populator.accept(ModBlocks.RUINED_MARBLE_BLOCK.get());
                populator.accept(ModBlocks.RUINED_MARBLE_STAIRS.get());
                populator.accept(ModBlocks.RUINED_MARBLE_SLAB.get());
                populator.accept(ModBlocks.CHISELED_RUINED_MARBLE_BLOCK.get());
                populator.accept(ModBlocks.RUINED_MARBLE_BRICK.get());
                populator.accept(ModBlocks.RUINED_MARBLE_PILLAR.get());
                populator.accept(ModBlocks.SMOOTH_RUINED_MARBLE_BLOCK.get());
                populator.accept(ModBlocks.SMOOTH_RUINED_MARBLE_STAIRS.get());
                populator.accept(ModBlocks.SMOOTH_RUINED_MARBLE_SLAB.get());

                populator.accept(ModBlocks.PRIMED_ICE.get());
                populator.accept(ModBlocks.PRIMED_PACKED_ICE.get());
                populator.accept(ModBlocks.PRIMED_BLUE_ICE.get());
                populator.accept(ModBlocks.PRIMED_DRAINED_ICE.get());

                populator.accept(ModItems.DISTANT_LOG.get());
                populator.accept(ModItems.STRIPPED_DISTANT_LOG.get());
                populator.accept(ModItems.DISTANT_WOOD.get());
                populator.accept(ModItems.STRIPPED_DISTANT_WOOD.get());
                populator.accept(ModItems.DISTANT_LEAVES.get());
                populator.accept(ModItems.DISTANT_SAPLING.get());
                populator.accept(ModItems.DISTANT_PLANKS.get());
                populator.accept(ModItems.DISTANT_SLAB.get());
                populator.accept(ModItems.DISTANT_STAIRS.get());
                populator.accept(ModItems.DISTANT_FENCE.get());
                populator.accept(ModItems.DISTANT_FENCE_GATE.get());
                populator.accept(ModItems.DISTANT_DOOR.get());
                populator.accept(ModItems.DISTANT_TRAPDOOR.get());
                populator.accept(ModItems.DISTANT_SIGN.get());
                populator.accept(ModItems.DISTANT_HANGING_SIGN.get());

                populator.accept(ModItems.VERDANT_PINE_LOG.get());
                populator.accept(ModItems.STRIPPED_VERDANT_PINE_LOG.get());
                populator.accept(ModItems.VERDANT_PINE_WOOD.get());
                populator.accept(ModItems.STRIPPED_VERDANT_PINE_WOOD.get());
                populator.accept(ModItems.VERDANT_PINE_LEAVES.get());
                populator.accept(ModItems.VERDANT_PINE_SAPLING.get());
                populator.accept(ModItems.VERDANT_PINE_PLANKS.get());
                populator.accept(ModItems.VERDANT_PINE_SLAB.get());
                populator.accept(ModItems.VERDANT_PINE_STAIRS.get());
                populator.accept(ModItems.VERDANT_PINE_FENCE.get());
                populator.accept(ModItems.VERDANT_PINE_FENCE_GATE.get());
                populator.accept(ModItems.VERDANT_PINE_DOOR.get());
                populator.accept(ModItems.VERDANT_PINE_TRAPDOOR.get());
                populator.accept(ModItems.VERDANT_PINE_SIGN.get());
                populator.accept(ModItems.VERDANT_PINE_HANGING_SIGN.get());

                populator.accept(ModItems.ASTER_LOG.get());
                populator.accept(ModItems.STRIPPED_ASTER_LOG.get());
                populator.accept(ModItems.ASTER_WOOD.get());
                populator.accept(ModItems.STRIPPED_ASTER_WOOD.get());
                populator.accept(ModItems.ASTER_PLANKS.get());
                populator.accept(ModItems.ASTER_SLAB.get());
                populator.accept(ModItems.ASTER_STAIRS.get());
                populator.accept(ModItems.ASTER_FENCE.get());
                populator.accept(ModItems.ASTER_FENCE_GATE.get());
                populator.accept(ModItems.ASTER_DOOR.get());
                populator.accept(ModItems.ASTER_TRAPDOOR.get());
                populator.accept(ModItems.ASTER_SIGN.get());
                populator.accept(ModItems.ASTER_HANGING_SIGN.get());

                populator.accept(ModItems.KALEIDOSCOPE_LOG.get());
                populator.accept(ModItems.STRIPPED_KALEIDOSCOPE_LOG.get());
                populator.accept(ModItems.KALEIDOSCOPE_WOOD.get());
                populator.accept(ModItems.STRIPPED_KALEIDOSCOPE_WOOD.get());
                populator.accept(ModItems.KALEIDOSCOPE_LEAVES.get());
                populator.accept(ModItems.KALEIDOSCOPE_SAPLING.get());
                populator.accept(ModItems.KALEIDOSCOPE_PLANKS.get());
                populator.accept(ModItems.KALEIDOSCOPE_SLAB.get());
                populator.accept(ModItems.KALEIDOSCOPE_STAIRS.get());
                populator.accept(ModItems.KALEIDOSCOPE_FENCE.get());
                populator.accept(ModItems.KALEIDOSCOPE_FENCE_GATE.get());
                populator.accept(ModItems.KALEIDOSCOPE_DOOR.get());
                populator.accept(ModItems.KALEIDOSCOPE_TRAPDOOR.get());
                populator.accept(ModItems.KALEIDOSCOPE_SIGN.get());
                populator.accept(ModItems.KALEIDOSCOPE_HANGING_SIGN.get());

                populator.accept(ModItems.SHADED_LOG.get());
                populator.accept(ModItems.STRIPPED_SHADED_LOG.get());
                populator.accept(ModItems.SHADED_WOOD.get());
                populator.accept(ModItems.STRIPPED_SHADED_WOOD.get());
                populator.accept(ModItems.SHADED_LEAVES.get());
                populator.accept(ModItems.SHADED_SAPLING.get());
                populator.accept(ModItems.SHADED_PLANKS.get());
                populator.accept(ModItems.SHADED_SLAB.get());
                populator.accept(ModItems.SHADED_STAIRS.get());
                populator.accept(ModItems.SHADED_FENCE.get());
                populator.accept(ModItems.SHADED_FENCE_GATE.get());
                populator.accept(ModItems.SHADED_DOOR.get());
                populator.accept(ModItems.SHADED_TRAPDOOR.get());
                populator.accept(ModItems.SHADED_SIGN.get());
                populator.accept(ModItems.SHADED_HANGING_SIGN.get());

                populator.accept(ModItems.CRYSTAL_LOG.get());
                populator.accept(ModItems.STRIPPED_CRYSTAL_LOG.get());
                populator.accept(ModItems.CRYSTAL_WOOD.get());
                populator.accept(ModItems.STRIPPED_CRYSTAL_WOOD.get());
                populator.accept(ModItems.CRYSTAL_LEAVES.get());
                populator.accept(ModItems.CRYSTAL_SAPLING.get());
                populator.accept(ModItems.CRYSTAL_PLANKS.get());
                populator.accept(ModItems.CRYSTAL_SLAB.get());
                populator.accept(ModItems.CRYSTAL_STAIRS.get());
                populator.accept(ModItems.CRYSTAL_FENCE.get());
                populator.accept(ModItems.CRYSTAL_FENCE_GATE.get());
                populator.accept(ModItems.CRYSTAL_DOOR.get());
                populator.accept(ModItems.CRYSTAL_TRAPDOOR.get());
                populator.accept(ModItems.CRYSTAL_SIGN.get());
                populator.accept(ModItems.CRYSTAL_HANGING_SIGN.get());

                populator.accept(ModItems.BARBATINE.get());
                populator.accept(ModItems.RED_BARBATINE.get());
                populator.accept(ModItems.ORANGE_BARBATINE.get());
                populator.accept(ModItems.YELLOW_BARBATINE.get());
                populator.accept(ModItems.LIME_BARBATINE.get());
                populator.accept(ModItems.GREEN_BARBATINE.get());
                populator.accept(ModItems.CYAN_BARBATINE.get());
                populator.accept(ModItems.LIGHT_BLUE_BARBATINE.get());
                populator.accept(ModItems.BLUE_BARBATINE.get());
                populator.accept(ModItems.PURPLE_BARBATINE.get());
                populator.accept(ModItems.MAGENTA_BARBATINE.get());
                populator.accept(ModItems.PINK_BARBATINE.get());
                populator.accept(ModItems.WHITE_BARBATINE.get());
                populator.accept(ModItems.LIGHT_GRAY_BARBATINE.get());
                populator.accept(ModItems.GRAY_BARBATINE.get());
                populator.accept(ModItems.BLACK_BARBATINE.get());
                populator.accept(ModItems.BROWN_BARBATINE.get());

                populator.accept(ModItems.RED_LATTICE.get());
                populator.accept(ModItems.ORANGE_LATTICE.get());
                populator.accept(ModItems.YELLOW_LATTICE.get());
                populator.accept(ModItems.LIME_LATTICE.get());
                populator.accept(ModItems.GREEN_LATTICE.get());
                populator.accept(ModItems.CYAN_LATTICE.get());
                populator.accept(ModItems.LIGHT_BLUE_LATTICE.get());
                populator.accept(ModItems.BLUE_LATTICE.get());
                populator.accept(ModItems.PURPLE_LATTICE.get());
                populator.accept(ModItems.MAGENTA_LATTICE.get());
                populator.accept(ModItems.PINK_LATTICE.get());
                populator.accept(ModItems.WHITE_LATTICE.get());
                populator.accept(ModItems.LIGHT_GRAY_LATTICE.get());
                populator.accept(ModItems.GRAY_LATTICE.get());
                populator.accept(ModItems.BLACK_LATTICE.get());
                populator.accept(ModItems.BROWN_LATTICE.get());

                populator.accept(ModItems.RED_DIAMOND_GLASS.get());
                populator.accept(ModItems.ORANGE_DIAMOND_GLASS.get());
                populator.accept(ModItems.YELLOW_DIAMOND_GLASS.get());
                populator.accept(ModItems.LIME_DIAMOND_GLASS.get());
                populator.accept(ModItems.GREEN_DIAMOND_GLASS.get());
                populator.accept(ModItems.CYAN_DIAMOND_GLASS.get());
                populator.accept(ModItems.LIGHT_BLUE_DIAMOND_GLASS.get());
                populator.accept(ModItems.BLUE_DIAMOND_GLASS.get());
                populator.accept(ModItems.PURPLE_DIAMOND_GLASS.get());
                populator.accept(ModItems.MAGENTA_DIAMOND_GLASS.get());
                populator.accept(ModItems.PINK_DIAMOND_GLASS.get());
                populator.accept(ModItems.WHITE_DIAMOND_GLASS.get());
                populator.accept(ModItems.LIGHT_GRAY_DIAMOND_GLASS.get());
                populator.accept(ModItems.GRAY_DIAMOND_GLASS.get());
                populator.accept(ModItems.BLACK_DIAMOND_GLASS.get());
                populator.accept(ModItems.BROWN_DIAMOND_GLASS.get());
                populator.accept(ModItems.PRISMATIC_DIAMOND_GLASS.get());

                populator.accept(ModItems.WHITE_IRIS.get());
                populator.accept(ModItems.PINK_THISTLE.get());
                populator.accept(ModItems.PANSIE.get());
                populator.accept(ModItems.ORCHID.get());
                populator.accept(ModItems.NASTURTIUMS.get());
                populator.accept(ModItems.HYDRANGEA_BUSH_WHITE.get());
                populator.accept(ModItems.HYDRANGEA_BUSH_PINK.get());
                populator.accept(ModItems.HYDRANGEA_BUSH_BLUE.get());
                populator.accept(ModItems.HYDRANGEA_BUSH_GREEN.get());
                populator.accept(ModItems.HYDRANGEA_BUSH_PURPLE.get());
                populator.accept(ModItems.CHRYSANTHEMUM.get());
                populator.accept(ModItems.BLUE_BELLS.get());
                populator.accept(ModBlocks.BLUE_PUFFBALL.get());
                populator.accept(ModBlocks.CROCOSMIA.get());
                populator.accept(ModBlocks.CLOVERS.get());

                populator.accept(ModBlocks.WARP_PAD.get());
                populator.accept(ModBlocks.GALAXY_WARP.get());
            }).build()
    );
    public static final RegistryObject<CreativeModeTab> GEMPIRE_TOOLS = CREATIVE_MODE_TABS.register("gempire_tools",
            () -> CreativeModeTab.builder().title(Component.translatable("itemGroup.gempire_tools"))
            // Set icon of creative tab
            .icon(() -> new ItemStack(ModItems.PRISMATIC_PICKAXE.get()))
            // Add default items to tab
            .displayItems((params, populator) -> {
                populator.accept(ModItems.PINK_DESTABILIZER.get());
                populator.accept(ModItems.BLUE_DESTABILIZER.get());
                populator.accept(ModItems.YELLOW_DESTABILIZER.get());
                populator.accept(ModItems.WHITE_DESTABILIZER.get());
                populator.accept(ModItems.PINK_REJUVENATOR.get());
                populator.accept(ModItems.BLUE_REJUVENATOR.get());
                populator.accept(ModItems.YELLOW_REJUVENATOR.get());
                populator.accept(ModItems.WHITE_REJUVENATOR.get());
                populator.accept(ModItems.CONFRACTOR.get());
                populator.accept(ModItems.GEM_WHISTLE.get());
                populator.accept(ModItems.PRISMATIC_AXE.get());
                populator.accept(ModItems.PRISMATIC_PICKAXE.get());
                populator.accept(ModItems.PRISMATIC_SWORD.get());
                populator.accept(ModItems.PRISMATIC_HOE.get());
                populator.accept(ModItems.PRISMATIC_SHOVEL.get());

                populator.accept(ModItems.PALADIN_AXE.get());
                populator.accept(ModItems.EMPRESS_BOW.get());
                populator.accept(ModItems.HUNTRESS_SWORD.get());
                populator.accept(ModItems.GUARDIAN_SHIELD.get());

                populator.accept(ModItems.THULITE_HELMET.get());
                populator.accept(ModItems.THULITE_CHESTPLATE.get());
                populator.accept(ModItems.THULITE_LEGGINGS.get());
                populator.accept(ModItems.THULITE_BOOTS.get());
                populator.accept(ModItems.ANATASE_HELMET.get());
                populator.accept(ModItems.ANATASE_CHESTPLATE.get());
                populator.accept(ModItems.ANATASE_LEGGINGS.get());
                populator.accept(ModItems.ANATASE_BOOTS.get());
                populator.accept(ModItems.ELECTRUM_HELMET.get());
                populator.accept(ModItems.ELECTRUM_CHESTPLATE.get());
                populator.accept(ModItems.ELECTRUM_LEGGINGS.get());
                populator.accept(ModItems.ELECTRUM_BOOTS.get());
                populator.accept(ModItems.PLATINUM_HELMET.get());
                populator.accept(ModItems.PLATINUM_CHESTPLATE.get());
                populator.accept(ModItems.PLATINUM_LEGGINGS.get());
                populator.accept(ModItems.PLATINUM_BOOTS.get());

                populator.accept(ModItems.PALADIN_HELMET.get());
                populator.accept(ModItems.PALADIN_CHESTPLATE.get());
                populator.accept(ModItems.PALADIN_LEGGINGS.get());
                populator.accept(ModItems.PALADIN_BOOTS.get());
                populator.accept(ModItems.GUARDIAN_HELMET.get());
                populator.accept(ModItems.GUARDIAN_CHESTPLATE.get());
                populator.accept(ModItems.GUARDIAN_LEGGINGS.get());
                populator.accept(ModItems.GUARDIAN_BOOTS.get());
                populator.accept(ModItems.HUNTRESS_HELMET.get());
                populator.accept(ModItems.HUNTRESS_CHESTPLATE.get());
                populator.accept(ModItems.HUNTRESS_LEGGINGS.get());
                populator.accept(ModItems.HUNTRESS_BOOTS.get());
                populator.accept(ModItems.EMPRESS_HELMET.get());
                populator.accept(ModItems.EMPRESS_CHESTPLATE.get());
                populator.accept(ModItems.EMPRESS_LEGGINGS.get());
                populator.accept(ModItems.EMPRESS_BOOTS.get());
            }).build()
        );


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
