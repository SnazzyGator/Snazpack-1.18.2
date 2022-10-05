package net.snazzygator.snazpackmod.entity.client;

import net.minecraft.resources.ResourceLocation;

import net.snazzygator.snazpackmod.SnazpackMod;
import net.snazzygator.snazpackmod.entity.custom.GeetEntity;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class GeetModel extends AnimatedGeoModel<GeetEntity> {
    @Override
    public ResourceLocation getModelLocation(GeetEntity object) {
        return new ResourceLocation(SnazpackMod.MOD_ID, "geo/geet.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(GeetEntity object) {
        return GeetRenderer.LOCATION_BY_VARIANT.get(object.getVariant());
    }

    @Override
    public ResourceLocation getAnimationFileLocation(GeetEntity animatable) {
        return new ResourceLocation(SnazpackMod.MOD_ID, "animations/geet.animation.json");
    }
    @Override
    public void setLivingAnimations(GeetEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone neck = this.getAnimationProcessor().getBone("neck");
        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        neck.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 330F));
        IBone head = this.getAnimationProcessor().getBone("head");
        head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
        head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 330F));
    }
}