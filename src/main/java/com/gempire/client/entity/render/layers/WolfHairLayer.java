package com.gempire.client.entity.render.layers;

import com.gempire.client.entity.model.ModelBeastmasterWolf;
import com.gempire.entities.other.EntityBeastmasterWolf;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;


public class WolfHairLayer<E extends EntityBeastmasterWolf, M extends ModelBeastmasterWolf<E>> extends RenderLayer<EntityBeastmasterWolf, ModelBeastmasterWolf<EntityBeastmasterWolf>> {
    private RenderLayerParent<EntityBeastmasterWolf, ModelBeastmasterWolf<EntityBeastmasterWolf>> gemRenderer;

    public WolfHairLayer(RenderLayerParent<EntityBeastmasterWolf, ModelBeastmasterWolf<EntityBeastmasterWolf>> entityRendererIn) {
        super(entityRendererIn);
        this.gemRenderer = entityRendererIn;
    }

    @Override
    public void render(PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn, EntityBeastmasterWolf entityBeastmasterWolf, float v, float v1, float v2, float v3, float v4, float v5) {
        int gemColor = entityBeastmasterWolf.getHairColor();
        float r = ((gemColor & 16711680) >> 16) / 255f;
        float g = ((gemColor & 65280) >> 8) / 255f;
        float b = ((gemColor & 255) >> 0) / 255f;
        VertexConsumer builder = bufferIn.getBuffer(RenderType.entityCutoutNoCull(new ResourceLocation("gempire:textures/entity/wolf/hair.png")));
        this.getParentModel().setupAnim(entityBeastmasterWolf, v, v1, v2, v3, v4);
        this.getParentModel().renderToBuffer(poseStack, builder, packedLightIn, OverlayTexture.NO_OVERLAY, r, g, b, 1.0F);
    }
}
