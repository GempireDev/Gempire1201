package com.gempire.client.entity.render.layers;

import com.gempire.Gempire;
import com.gempire.client.entity.model.ModelGem;
import com.gempire.entities.bases.EntityGem;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class HairLayer<E extends EntityGem, M extends ModelGem<E>> extends GempireLayer<EntityGem, ModelGem<EntityGem>> {
    private IEntityRenderer<EntityGem, ModelGem<EntityGem>> gemRenderer;
    //TODO Temp

    public HairLayer(IEntityRenderer<EntityGem, ModelGem<EntityGem>> entityRendererIn) {
        super(entityRendererIn);
        this.gemRenderer = entityRendererIn;
    }

    @Override
    public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, EntityGem gem, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        int hair = gem.getHairColor();
        float r = ((hair & 16711680) >> 16) / 255f;
        float g = ((hair & 65280) >> 8) / 255f;
        float b = ((hair & 255) >> 0) / 255f;
        IVertexBuilder builder = bufferIn.getBuffer(RenderType.getEntityCutoutNoCull(new ResourceLocation(Gempire.MODID+":textures/entity/" + this.getName(gem).toLowerCase() + "/hair_" + gem.getHairVariant() + ".png")));
        this.getEntityModel().setRotationAngles(gem, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        this.getEntityModel().render(matrixStackIn, builder, packedLightIn, OverlayTexture.NO_OVERLAY, r, g, b, 1.0F);
        /*if(gem instanceof EntityStarterGem){
            ModelStarterGem model = ((ModelStarterGem)this.getEntityModel());
            model.
        }*/
    }
}
