package net.snazzygator.snazpackmod.entity.client;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.snazzygator.snazpackmod.SnazpackMod;
import net.snazzygator.snazpackmod.entity.custom.GeetEntity;
import net.snazzygator.snazpackmod.entity.variant.GeetVariants;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class GeetRenderer extends GeoEntityRenderer<GeetEntity> {

    public static final Map<GeetVariants, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(GeetVariants.class), (p_114874_) -> {
                p_114874_.put(GeetVariants.SILVER,
                        new ResourceLocation(SnazpackMod.MOD_ID, "textures/entity/geet/geet1.png"));
                p_114874_.put(GeetVariants.COOKIE,
                        new ResourceLocation(SnazpackMod.MOD_ID, "textures/entity/geet/geet2.png"));
                p_114874_.put(GeetVariants.CHOCOLATE,
                        new ResourceLocation(SnazpackMod.MOD_ID, "textures/entity/geet/geet3.png"));
            });


    public GeetRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new GeetModel());
        this.shadowRadius = 0.5f;
    }

    @Override
    public ResourceLocation getTextureLocation(GeetEntity instance) {
        return LOCATION_BY_VARIANT.get(instance.getVariant());
    }

    @Override
    public RenderType getRenderType(GeetEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        if(animatable.isBaby()) {
            stack.scale(0.6f, 0.6f, 0.6f);
        } else {
            stack.scale(1F, 1F, 1F);
        }
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}