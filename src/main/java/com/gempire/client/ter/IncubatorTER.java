package com.gempire.client.ter;

import com.gempire.blocks.machine.IncubatorBlock;
import com.gempire.blocks.machine.ShellBlock;
import com.gempire.tileentities.IncubatorTE;
import com.gempire.tileentities.ShellTE;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.renderer.LightTexture;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LightLayer;
import org.joml.Quaternionf;

public class IncubatorTER implements BlockEntityRenderer<IncubatorTE> {
    public Minecraft mc = Minecraft.getInstance();
    private final BlockEntityRendererProvider.Context context;

    public IncubatorTER(BlockEntityRendererProvider.Context context) {
        this.context = context;
    }

    @Override
    public void render(IncubatorTE te, float partialTicks, PoseStack matrixStackIn, MultiBufferSource bufferIn, int combinedLightIn, int combinedOverlayIn) {
        ItemStack toRender = te.getGemItem();
        if(te.getGemItem() == ItemStack.EMPTY || te.getGemItem().getItem().equals(Items.AIR)){
            toRender = te.getBase();
        }
        LocalPlayer player = mc.player;
        double yPos = 1.1D;
        if (te.incubationProgress <= 30 && te.incubationProgress != 0) {
            if (te.incubationProgress < 5) {
                yPos -= (double) te.incubationProgress / 10;
            } else {
                yPos = 0.6D;
            }
        } else if (te.incubationProgress == 0) yPos = 1.1D;
        int lightLevel = getLightLevel(te.getLevel(), te.getBlockPos());
        renderItem(toRender, new double[]{.5D, yPos, .5D}, Axis.YP.rotationDegrees(rotationFromFacing(te.getBlockState().getValue(IncubatorBlock.FACING))),
                matrixStackIn, bufferIn, partialTicks, combinedOverlayIn, lightLevel, .8f);
    }

    public void renderItem(ItemStack stack, double[] translation, Quaternionf rotation, PoseStack matrixStack, MultiBufferSource buffer,
                           float partialTicks, int combinedOverley, int lightLevel, float scale){
        matrixStack.pushPose();
        matrixStack.translate(translation[0], translation[1], translation[2]);
        matrixStack.mulPose(rotation);
        matrixStack.scale(scale, scale, scale);
        BakedModel model = mc.getItemRenderer().getModel(stack, null, null, 1);
        mc.getItemRenderer().render(stack, ItemDisplayContext.GROUND, true, matrixStack, buffer, lightLevel, combinedOverley, model);
        matrixStack.popPose();
    }

    public int getLightLevel(Level world, BlockPos pos){
        int blockLight = world.getBrightness(LightLayer.BLOCK, pos);
        int sLight = world.getBrightness(LightLayer.SKY, pos);
        return LightTexture.pack(blockLight, sLight);
    }

    public int rotationFromFacing(Direction facing) {
        switch (facing){
            case SOUTH:
                return 0;
            case EAST:
                return 90;
            case NORTH:
                return 180;
            default:
                return 270;
        }
    }
}
