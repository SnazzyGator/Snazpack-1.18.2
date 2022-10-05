package net.snazzygator.snazpackmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.snazzygator.snazpackmod.SnazpackMod;
import net.snazzygator.snazpackmod.entity.custom.LittlegatorEntity;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class LittlegatorRenderer extends GeoEntityRenderer<LittlegatorEntity> {
    public LittlegatorRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new LittlegatorModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(LittlegatorEntity instance) {
        return new ResourceLocation(SnazpackMod.MOD_ID, "textures/entity/littlegator/littlegator.png");
    }

    @Override
    public RenderType getRenderType(LittlegatorEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        if(animatable.isBaby()) {
            stack.scale(0.5f, 0.5f, 0.5f);
        } else {
            stack.scale(1F, 1F, 1F);
        }
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}