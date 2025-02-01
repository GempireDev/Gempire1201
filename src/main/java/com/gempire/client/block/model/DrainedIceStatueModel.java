package com.gempire.client.block.model;

import com.gempire.Gempire;
import com.gempire.tileentities.DrainedIceStatueTE;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class DrainedIceStatueModel extends GeoModel<DrainedIceStatueTE> {
    @Override
    public ResourceLocation getModelResource(DrainedIceStatueTE geoAnimatable) {
        return new ResourceLocation(Gempire.MODID, "geo/block/ice_statue.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(DrainedIceStatueTE geoAnimatable) {
        return new ResourceLocation(Gempire.MODID, "textures/block/drained_ice_statue.png");
    }

    @Override
    public ResourceLocation getAnimationResource(DrainedIceStatueTE geoAnimatable) {
        return new ResourceLocation(Gempire.MODID, "animations/block/statue.animation.json");
    }
}
