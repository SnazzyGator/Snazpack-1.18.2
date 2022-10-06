package net.snazzygator.snazpackmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties CUCUMBER = (new FoodProperties.Builder())
            .nutrition(4).saturationMod(0.4F).build();
    public static final FoodProperties CUCUMBER_SLICES = (new FoodProperties.Builder())
            .nutrition(1).saturationMod(0.1F).fast().build();
    public static final FoodProperties SUS_BREAD = (new FoodProperties.Builder())
            .nutrition(5).saturationMod(0.6F).effect(new MobEffectInstance(MobEffects.CONFUSION, 300, 0), 1.0F).build();
    public static final FoodProperties SERPENTBERRIES = (new FoodProperties.Builder())
            .nutrition(2).saturationMod(0.1F).build();
    public static final FoodProperties CHEESE_MOZZARELLA = (new FoodProperties.Builder())
            .nutrition(4).saturationMod(0.8F).build();
    public static final FoodProperties CHEESE_SCAMORZA = (new FoodProperties.Builder())
            .nutrition(6).saturationMod(1.0F).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 600, 0), 1.0F).build();
    public static final FoodProperties CHEESE_GEET_FETA = (new FoodProperties.Builder())
            .nutrition(6).saturationMod(1.0F).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 1.0F).build();
    public static final FoodProperties CHEESE_GEET_RAW = (new FoodProperties.Builder())
            .nutrition(4).saturationMod(0.8F).build();
    public static final FoodProperties CUCUMBER_SANDWICH = (new FoodProperties.Builder())
            .nutrition(6).saturationMod(0.8F).build();
    public static final FoodProperties MUTTON_SANDWICH = (new FoodProperties.Builder())
            .nutrition(12).saturationMod(1.8F).build();
    public static final FoodProperties CHEESE_MUTTON_SANDWICH = (new FoodProperties.Builder())
            .nutrition(16).saturationMod(2.6F).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1200, 0), 1.0F).build();
    public static final FoodProperties PULLED_PORK_SANDWICH = (new FoodProperties.Builder())
            .nutrition(18).saturationMod(2.6F).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1200, 0), 1.0F).build();
    public static final FoodProperties YOGURT = (new FoodProperties.Builder())
            .nutrition(4).saturationMod(0.6F).build();
    public static final FoodProperties GEET_YOGURT = (new FoodProperties.Builder())
            .nutrition(4).saturationMod(0.6F).build();
    public static final FoodProperties SERPENTBERRY_YOGURT = (new FoodProperties.Builder())
            .nutrition(6).saturationMod(0.8F).build();
    public static final FoodProperties SWEETBERRY_YOGURT = (new FoodProperties.Builder())
            .nutrition(6).saturationMod(0.8F).build();
    public static final FoodProperties BUTTER = (new FoodProperties.Builder())
            .nutrition(2).saturationMod(1.0F).effect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 300, 0), 1.0F).build();

}
