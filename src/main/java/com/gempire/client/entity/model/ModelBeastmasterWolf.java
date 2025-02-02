package com.gempire.client.entity.model;

import com.gempire.entities.other.EntityBeastmasterWolf;
import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.ColorableAgeableListModel;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.animal.Wolf;

public class ModelBeastmasterWolf<T extends EntityBeastmasterWolf> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("gempire", "beastmaster_wolf"), "main");
    private final ModelPart head;
    private final ModelPart leftEar;
    private final ModelPart rightEar;
    private final ModelPart body;
    private final ModelPart chest;
    private final ModelPart butt;
    private final ModelPart tail;
    private final ModelPart leftFrontLeg;
    private final ModelPart rightFrontLeg;
    private final ModelPart leftBackLeg;
    private final ModelPart rightBackLeg;

    public ModelBeastmasterWolf(ModelPart root) {
        this.head = root.getChild("head");
        this.leftEar = this.head.getChild("leftEar");
        this.rightEar = this.head.getChild("rightEar");
        this.body = root.getChild("body");
        this.chest = this.body.getChild("chest");
        this.butt = this.body.getChild("butt");
        this.tail = this.butt.getChild("tail");
        this.leftFrontLeg = root.getChild("leftFrontLeg");
        this.rightFrontLeg = root.getChild("rightFrontLeg");
        this.leftBackLeg = root.getChild("leftBackLeg");
        this.rightBackLeg = root.getChild("rightBackLeg");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 12.5F, -7.0F));

        PartDefinition snout_r1 = head.addOrReplaceChild("snout_r1", CubeListBuilder.create().texOffs(20, 0).addBox(-2.0F, -1.5F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, -4.0F, 0.0436F, 0.0F, 0.0F));

        PartDefinition cheekRight_r1 = head.addOrReplaceChild("cheekRight_r1", CubeListBuilder.create().texOffs(0, 6).mirror().addBox(0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 1.0F, -3.0F, 0.0F, -0.3927F, 0.0F));

        PartDefinition cheekLeft_r1 = head.addOrReplaceChild("cheekLeft_r1", CubeListBuilder.create().texOffs(0, 6).addBox(0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.0F, -3.0F, 0.0F, 0.3927F, 0.0F));

        PartDefinition gem_r1 = head.addOrReplaceChild("gem_r1", CubeListBuilder.create().texOffs(0, 14).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.75F, -2.75F, -0.3927F, 0.0F, 0.0F));

        PartDefinition leftEar = head.addOrReplaceChild("leftEar", CubeListBuilder.create().texOffs(36, 0).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -4.5F, -0.5F));

        PartDefinition rightEar = head.addOrReplaceChild("rightEar", CubeListBuilder.create().texOffs(36, 0).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -4.5F, -0.5F));

        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 12.5F, -3.0F));

        PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(0, 12).addBox(-5.0F, -4.0F, -4.0F, 10.0F, 8.0F, 8.0F, new CubeDeformation(-0.3F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition butt = body.addOrReplaceChild("butt", CubeListBuilder.create().texOffs(30, 19).addBox(-4.0F, -3.0F, -4.5F, 8.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 6.5F));

        PartDefinition tail = butt.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 28).addBox(-2.0F, -1.5F, 0.0F, 4.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.5F, 4.5F));

        PartDefinition leftFrontLeg = partdefinition.addOrReplaceChild("leftFrontLeg", CubeListBuilder.create().texOffs(52, 0).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 15.0F, -4.5F));

        PartDefinition rightFrontLeg = partdefinition.addOrReplaceChild("rightFrontLeg", CubeListBuilder.create().texOffs(52, 0).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 15.0F, -4.5F));

        PartDefinition leftBackLeg = partdefinition.addOrReplaceChild("leftBackLeg", CubeListBuilder.create().texOffs(52, 0).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 15.0F, 4.5F));

        PartDefinition rightBackLeg = partdefinition.addOrReplaceChild("rightBackLeg", CubeListBuilder.create().texOffs(52, 0).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 15.0F, 4.5F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void setupAnim(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.setRotateAngle(rightFrontLeg, Mth.cos(limbSwing * 0.5F) * limbSwingAmount * 0.8f, 0, 0);
        this.setRotateAngle(leftFrontLeg, Mth.cos(limbSwing * 0.5F + (float)Math.PI) * limbSwingAmount * 0.8f, 0, 0);
        this.setRotateAngle(rightBackLeg, Mth.cos(limbSwing * 0.5F) * limbSwingAmount * 0.8f, 0, 0);
        this.setRotateAngle(leftBackLeg, Mth.cos(limbSwing * 0.5F + (float)Math.PI) * limbSwingAmount * 0.8f, 0, 0);
    }

    public void setRotateAngle(ModelPart modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        leftFrontLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        rightFrontLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        leftBackLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        rightBackLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}
