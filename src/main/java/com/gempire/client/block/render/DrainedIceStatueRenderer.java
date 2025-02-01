package com.gempire.client.block.render;

import com.gempire.client.block.model.DrainedIceStatueModel;
import com.gempire.tileentities.DrainedIceStatueTE;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class DrainedIceStatueRenderer extends GeoBlockRenderer<DrainedIceStatueTE> {

    public DrainedIceStatueRenderer(BlockEntityRendererProvider.Context m) {
        super(new DrainedIceStatueModel());
    }
}
