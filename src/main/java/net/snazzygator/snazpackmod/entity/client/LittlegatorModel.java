package net.snazzygator.snazpackmod.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.snazzygator.snazpackmod.SnazpackMod;
import net.snazzygator.snazpackmod.entity.custom.LittlegatorEntity;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class LittlegatorModel extends AnimatedGeoModel<LittlegatorEntity> {
    @Override
    public ResourceLocation getModelLocation(LittlegatorEntity object) {
        return new ResourceLocation(SnazpackMod.MOD_ID, "geo/littlegator.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(LittlegatorEntity object) {
        return new ResourceLocation(SnazpackMod.MOD_ID, "textures/entity/littlegator/littlegator.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(LittlegatorEntity animatable) {
        return new ResourceLocation(SnazpackMod.MOD_ID, "animations/littlegator.animation.json");
    }
    @Override
    public void setLivingAnimations(LittlegatorEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone neck = this.getAnimationProcessor().getBone("neck");
        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        neck.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 330F));
        IBone head = this.getAnimationProcessor().getBone("head");
        head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
        head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 330F));
    }
}