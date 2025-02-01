package com.gempire.client.block.render;

import com.gempire.client.block.model.BlueAltarModel;
import com.gempire.client.block.model.PackedIceStatueModel;
import com.gempire.tileentities.BlueAltarTE;
import com.gempire.tileentities.PackedIceStatueTE;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class PackedIceStatueRenderer extends GeoBlockRenderer<PackedIceStatueTE> {

    public PackedIceStatueRenderer(BlockEntityRendererProvider.Context m) {
        super(new PackedIceStatueModel());
    }
}
