package com.gempire.init;

import com.gempire.Gempire;
import com.gempire.client.block.render.BlueIceStatueRenderer;
import com.gempire.tileentities.*;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTE {
    public static final DeferredRegister<BlockEntityType<?>> TILE_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Gempire.MODID);

    public static final RegistryObject<BlockEntityType<GemSeedTE>> GEM_SEED_TE = TILE_ENTITIES.register(
            "gem_seed_te", () -> BlockEntityType.Builder.of(GemSeedTE::new, ModBlocks.GEM_SEED_BLOCK.get()).build(null));


    public static final RegistryObject<BlockEntityType<BoardTE>> BOARD_TE = TILE_ENTITIES.register(
            "board_te", () -> BlockEntityType.Builder.of(BoardTE::new, ModBlocks.BOARD_BLOCK.get()).build(null));

    public static final RegistryObject<BlockEntityType<InjectorTE>> INJECTOR_TE = TILE_ENTITIES.register(
            "injector_te", () -> BlockEntityType.Builder.of(InjectorTE::new, ModBlocks.TANK_BLOCK.get()).build(null));

    public static final RegistryObject<BlockEntityType<WarpPadTE>> WARP_PAD_TE = TILE_ENTITIES.register(
            "warp_pad_te", () -> BlockEntityType.Builder.of(WarpPadTE::new, ModBlocks.WARP_PAD.get()).build(null));

    public static final RegistryObject<BlockEntityType<ShellTE>> SHELL_TE = TILE_ENTITIES.register(
            "shell_te", () -> BlockEntityType.Builder.of(ShellTE::new, ModBlocks.SHELL_BLOCK.get()).build(null));

    public static final RegistryObject<BlockEntityType<IncubatorTE>> INCUBATOR_TE = TILE_ENTITIES.register(
            "incubator_te", () -> BlockEntityType.Builder.of(IncubatorTE::new, ModBlocks.INCUBATOR_BLOCK.get()).build(null));

    public static final RegistryObject<BlockEntityType<PinkAltarTE>> PINK_ALTAR_TE = TILE_ENTITIES.register(
            "pink_altar_te", () -> BlockEntityType.Builder.of(PinkAltarTE::new, ModBlocks.PINK_ALTAR.get()).build(null));

    public static final RegistryObject<BlockEntityType<BlueAltarTE>> BLUE_ALTAR_TE = TILE_ENTITIES.register(
            "blue_altar_te", () -> BlockEntityType.Builder.of(BlueAltarTE::new, ModBlocks.BLUE_ALTAR.get()).build(null));

    public static final RegistryObject<BlockEntityType<YellowAltarTE>> YELLOW_ALTAR_TE = TILE_ENTITIES.register(
            "yellow_altar_te", () -> BlockEntityType.Builder.of(YellowAltarTE::new, ModBlocks.YELLOW_ALTAR.get()).build(null));

    public static final RegistryObject<BlockEntityType<WhiteAltarTE>> WHITE_ALTAR_TE = TILE_ENTITIES.register(
            "white_altar_te", () -> BlockEntityType.Builder.of(WhiteAltarTE::new, ModBlocks.WHITE_ALTAR.get()).build(null));

    public static final RegistryObject<BlockEntityType<IceStatueTE>> ICE_STATUE_TE = TILE_ENTITIES.register(
            "ice_statue_te", () -> BlockEntityType.Builder.of(IceStatueTE::new, ModBlocks.PRIMED_ICE_STATUE.get()).build(null));

    public static final RegistryObject<BlockEntityType<PackedIceStatueTE>> PACKED_ICE_STATUE_TE = TILE_ENTITIES.register(
            "packed_ice_statue_te", () -> BlockEntityType.Builder.of(PackedIceStatueTE::new, ModBlocks.PRIMED_PACKED_ICE_STATUE.get()).build(null));

    public static final RegistryObject<BlockEntityType<BlueIceStatueTE>> BLUE_ICE_STATUE_TE = TILE_ENTITIES.register(
            "blue_ice_statue_te", () -> BlockEntityType.Builder.of(BlueIceStatueTE::new, ModBlocks.PRIMED_BLUE_ICE_STATUE.get()).build(null));

    public static final RegistryObject<BlockEntityType<DrainedIceStatueTE>> DRAINED_ICE_STATUE_TE = TILE_ENTITIES.register(
            "drained_ice_statue_te", () -> BlockEntityType.Builder.of(DrainedIceStatueTE::new, ModBlocks.PRIMED_DRAINED_ICE_STATUE.get()).build(null));


    public static final RegistryObject<BlockEntityType<PedistalTE>> PEDISTAL_TE = TILE_ENTITIES.register(
            "pedistal_te", () -> BlockEntityType.Builder.of(PedistalTE::new, ModBlocks.PEDISTAL.get()).build(null));
    public static final RegistryObject<BlockEntityType<ModSignBlockEntity>> MOD_SIGN =
            TILE_ENTITIES.register("mod_sign", () ->
                    BlockEntityType.Builder.of(ModSignBlockEntity::new,
                            ModBlocks.DISTANT_SIGN.get(), ModBlocks.DISTANT_WALL_SIGN.get(), ModBlocks.KALEIDOSCOPE_SIGN.get(), ModBlocks.KALEIDOSCOPE_WALL_SIGN.get(), ModBlocks.SHADED_SIGN.get(), ModBlocks.SHADED_WALL_SIGN.get(), ModBlocks.CRYSTAL_SIGN.get(), ModBlocks.CRYSTAL_WALL_SIGN.get(), ModBlocks.ASTER_SIGN.get(), ModBlocks.ASTER_WALL_SIGN.get(), ModBlocks.VERDANT_PINE_SIGN.get(), ModBlocks.VERDANT_PINE_WALL_SIGN.get()).build(null));

    public static final RegistryObject<BlockEntityType<ModHangingSignBlockEntity>> MOD_HANGING_SIGN =
            TILE_ENTITIES.register("mod_hanging_sign", () ->
                    BlockEntityType.Builder.of(ModHangingSignBlockEntity::new,
                            ModBlocks.DISTANT_HANGING_SIGN.get(), ModBlocks.DISTANT_WALL_HANGING_SIGN.get(), ModBlocks.KALEIDOSCOPE_HANGING_SIGN.get(), ModBlocks.KALEIDOSCOPE_WALL_HANGING_SIGN.get(), ModBlocks.SHADED_HANGING_SIGN.get(), ModBlocks.SHADED_WALL_HANGING_SIGN.get(), ModBlocks.CRYSTAL_HANGING_SIGN.get(), ModBlocks.CRYSTAL_WALL_HANGING_SIGN.get(), ModBlocks.ASTER_HANGING_SIGN.get(), ModBlocks.ASTER_WALL_HANGING_SIGN.get(), ModBlocks.VERDANT_PINE_HANGING_SIGN.get(), ModBlocks.VERDANT_PINE_WALL_HANGING_SIGN.get()).build(null));

}
