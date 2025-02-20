package com.gempire.client.entity.model;

import com.gempire.Gempire;
import com.gempire.entities.other.EntityAbomination;
import com.gempire.entities.other.EntityRobonoid;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class ModelRobonoid extends GeoModel<EntityRobonoid> {
    @Override
    public ResourceLocation getModelResource(EntityRobonoid object) {
        return new ResourceLocation(Gempire.MODID, "geo/entity/robonoid.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(EntityRobonoid object) {
        return new ResourceLocation(Gempire.MODID, "textures/entity/robonoid.png");
    }

    @Override
    public ResourceLocation getAnimationResource(EntityRobonoid animatable) {
        return new ResourceLocation(Gempire.MODID, "animations/entity/robonoid.animation.json");
    }
}