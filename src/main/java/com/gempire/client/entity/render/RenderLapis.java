package com.gempire.client.entity.render;

import com.gempire.Gempire;
import com.gempire.client.entity.model.ModelLapis;
import com.gempire.client.entity.model.ModelQuartz;
import com.gempire.client.entity.model.ModelRuby;
import com.gempire.client.entity.render.layers.*;
import com.gempire.entities.gems.EntityJasper;
import com.gempire.entities.gems.EntityLapis;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.ItemInHandLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.ChatFormatting;
import java.util.UUID;

public class RenderLapis extends MobRenderer<EntityLapis, ModelLapis<EntityLapis>> {

    public RenderLapis(EntityRendererProvider.Context renderManagerIn, ModelLapis<EntityLapis> baseModel) {
        super(renderManagerIn, baseModel, .25f);
        this.addLayer(new SkinLayer(this));
        this.addLayer(new FaceLayer(this));
        this.addLayer(new VisorLayer(this));
        this.addLayer(new OutfitLayer(this));
        this.addLayer(new InsigniaLayer(this));
        this.addLayer(new HairLayer(this));
        this.addLayer(new GemPlacementLayer(this));
        this.addLayer(new WingLayer(this));
        this.addLayer(new ItemInHandLayer(this, renderManagerIn.getItemInHandRenderer()));
    }

    @Override
    protected void scale(EntityLapis entitylivingbaseIn, PoseStack matrixStackIn, float partialTickTime) {
        matrixStackIn.scale(entitylivingbaseIn.getXScale(), entitylivingbaseIn.getYScale(), entitylivingbaseIn.getZScale());
        super.scale(entitylivingbaseIn, matrixStackIn, partialTickTime);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityLapis entity) {
        return new ResourceLocation(Gempire.MODID+":textures/entity/lapis/blank.png");
    }
    @Override
    protected void renderNameTag(EntityLapis entityIn, Component displayNameIn, PoseStack matrixStackIn, MultiBufferSource bufferIn, int packedLightIn) {
        if (entityIn.ASSIGNED_ID != 0) {
            matrixStackIn.translate(0.0D, (double) 3*(9.0F * 1.15F * 0.025F), 0.0D);
            if (entityIn.hasCustomName()) {
                super.renderNameTag(entityIn, entityIn.getCustomName(), matrixStackIn, bufferIn, packedLightIn);
            } else {
                super.renderNameTag(entityIn, Component.literal(entityIn.getNickname().getString()), matrixStackIn, bufferIn, packedLightIn);
            }
            matrixStackIn.translate(0.0D, (double) (-(9.0F * 1.15F * 0.025F)), 0.0D);
            super.renderNameTag(entityIn, Component.literal("<" + entityIn.getFacet() + " " + entityIn.getCut() + ">"), matrixStackIn, bufferIn, packedLightIn);
            matrixStackIn.translate(0.0D, (double) (-(9.0F * 1.15F * 0.025F)), 0.0D);
            //super.renderNameTag(entityIn, entityIn.level().getPlayerByUUID(entityIn.MASTER_OWNER).getName(), matrixStackIn, bufferIn, packedLightIn);
            //matrixStackIn.translate(0.0D, (double) (-(9.0F * 1.15F * 0.025F)), 0.0D);
           super.renderNameTag(entityIn, Component.literal(entityIn.getAssignedName() + " <" + entityIn.getAssignedFacet() + " " + entityIn.getAssignedCut() + ">").withStyle(ChatFormatting.GREEN), matrixStackIn, bufferIn, packedLightIn);
            super.shadowRadius = 0;
        } else {
            matrixStackIn.translate(0.0D, (double) (9.0F * 1.15F * 0.025F), 0.0D);
            matrixStackIn.translate(0.0D, (double) (9.0F * 1.15F * 0.025F), 0.0D);
            if (entityIn.hasCustomName()) {
                super.renderNameTag(entityIn, entityIn.getCustomName(), matrixStackIn, bufferIn, packedLightIn);
            } else {
                super.renderNameTag(entityIn, Component.literal(entityIn.getNickname().getString()), matrixStackIn, bufferIn, packedLightIn);
            }
            matrixStackIn.translate(0.0D, (double) (-(9.0F * 1.15F * 0.025F)), 0.0D);
            super.renderNameTag(entityIn, Component.literal("<" + entityIn.getFacet() + " " + entityIn.getCut() + ">"), matrixStackIn, bufferIn, packedLightIn);
            matrixStackIn.translate(0.0D, (double) (-(9.0F * 1.15F * 0.025F)), 0.0D);
            if (entityIn.getOwned() && entityIn.MASTER_OWNER != null) {
                super.renderNameTag(entityIn, entityIn.level().getPlayerByUUID(entityIn.MASTER_OWNER).getDisplayName(), matrixStackIn, bufferIn, packedLightIn);
            }
        }
    }
}
