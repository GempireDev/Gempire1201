package com.gempire.client.block.render;

import com.gempire.client.block.model.BlueAltarModel;
import com.gempire.client.block.model.IceStatueModel;
import com.gempire.tileentities.BlueAltarTE;
import com.gempire.tileentities.IceStatueTE;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class IceStatueRenderer extends GeoBlockRenderer<IceStatueTE> {

    public IceStatueRenderer(BlockEntityRendererProvider.Context m) {
        super(new IceStatueModel());
    }
}
