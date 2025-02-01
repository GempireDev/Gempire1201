package com.gempire.client.block.model;

import com.gempire.Gempire;
import com.gempire.tileentities.PackedIceStatueTE;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class PackedIceStatueModel extends GeoModel<PackedIceStatueTE> {
    @Override
    public ResourceLocation getModelResource(PackedIceStatueTE geoAnimatable) {
        return new ResourceLocation(Gempire.MODID, "geo/block/ice_statue.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(PackedIceStatueTE geoAnimatable) {
        return new ResourceLocation(Gempire.MODID, "textures/block/packed_ice_statue.png");
    }

    @Override
    public ResourceLocation getAnimationResource(PackedIceStatueTE geoAnimatable) {
        return new ResourceLocation(Gempire.MODID, "animations/block/statue.animation.json");
    }
}
