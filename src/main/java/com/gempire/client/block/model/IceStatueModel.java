package com.gempire.client.block.model;

import com.gempire.Gempire;
import com.gempire.tileentities.BlueAltarTE;
import com.gempire.tileentities.IceStatueTE;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class IceStatueModel extends GeoModel<IceStatueTE> {
    @Override
    public ResourceLocation getModelResource(IceStatueTE geoAnimatable) {
        return new ResourceLocation(Gempire.MODID, "geo/block/ice_statue.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(IceStatueTE geoAnimatable) {
        return new ResourceLocation(Gempire.MODID, "textures/block/ice_statue.png");
    }

    @Override
    public ResourceLocation getAnimationResource(IceStatueTE geoAnimatable) {
        return new ResourceLocation(Gempire.MODID, "animations/block/statue.animation.json");
    }
}
