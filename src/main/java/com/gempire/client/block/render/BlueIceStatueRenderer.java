package com.gempire.client.block.render;

import com.gempire.client.block.model.BlueAltarModel;
import com.gempire.client.block.model.BlueIceStatueModel;
import com.gempire.tileentities.BlueAltarTE;
import com.gempire.tileentities.BlueIceStatueTE;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class BlueIceStatueRenderer extends GeoBlockRenderer<BlueIceStatueTE> {

    public BlueIceStatueRenderer(BlockEntityRendererProvider.Context m) {
        super(new BlueIceStatueModel());
    }
}
