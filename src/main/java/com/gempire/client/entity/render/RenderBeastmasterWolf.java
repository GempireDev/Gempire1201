package com.gempire.client.entity.render;

import com.gempire.Gempire;
import com.gempire.client.entity.model.ModelAquamarine;
import com.gempire.client.entity.model.ModelBeastmasterWolf;
import com.gempire.client.entity.render.layers.*;
import com.gempire.entities.bases.EntityGem;
import com.gempire.entities.gems.EntityAquamarine;
import com.gempire.entities.gems.EntityBismuth;
import com.gempire.entities.other.EntityBeastmasterWolf;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.WolfModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.WolfCollarLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.Wolf;

public class RenderBeastmasterWolf extends MobRenderer<EntityBeastmasterWolf, ModelBeastmasterWolf<EntityBeastmasterWolf>> {

    @Override
    public ResourceLocation getTextureLocation(EntityBeastmasterWolf entity) {
        return new ResourceLocation(Gempire.MODID+":textures/entity/wolf/blank.png");
    }

    public RenderBeastmasterWolf(EntityRendererProvider.Context renderManagerIn, ModelBeastmasterWolf<EntityBeastmasterWolf> baseModel) {
        super(renderManagerIn, baseModel, .25f);
        this.addLayer(new WolfSkinLayer(this));
        this.addLayer(new WolfGemLayer(this));
        this.addLayer(new WolfHairLayer(this));
        super.shadowRadius = 0.2f;
    }
}
