package com.gempire.client.block.model;

import com.gempire.Gempire;
import com.gempire.tileentities.BlueAltarTE;
import com.gempire.tileentities.BlueIceStatueTE;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BlueIceStatueModel extends GeoModel<BlueIceStatueTE> {
    @Override
    public ResourceLocation getModelResource(BlueIceStatueTE geoAnimatable) {
        return new ResourceLocation(Gempire.MODID, "geo/block/ice_statue.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BlueIceStatueTE geoAnimatable) {
        return new ResourceLocation(Gempire.MODID, "textures/block/blue_ice_statue.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BlueIceStatueTE geoAnimatable) {
        return new ResourceLocation(Gempire.MODID, "animations/block/statue.animation.json");
    }
}
