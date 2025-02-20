package com.gempire.client.entity.render;

import com.gempire.Gempire;
import com.gempire.client.entity.model.ModelAbomination;
import com.gempire.client.entity.model.ModelRobonoid;
import com.gempire.entities.other.EntityAbomination;
import com.gempire.entities.other.EntityRobonoid;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class RenderRobonoid extends GeoEntityRenderer<EntityRobonoid> {

    public RenderRobonoid(EntityRendererProvider.Context renderManager) {
        super(renderManager, new ModelRobonoid());
        this.shadowRadius = 0.3F;
    }


    @Override
    public ResourceLocation getTextureLocation(EntityRobonoid animatable) {
        return new ResourceLocation(Gempire.MODID, "textures/entity/robonoid.png");
    }
}
