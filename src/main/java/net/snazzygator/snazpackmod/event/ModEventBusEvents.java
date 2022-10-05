package net.snazzygator.snazpackmod.event;

import net.minecraft.core.Registry;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.snazzygator.snazpackmod.SnazpackMod;
import net.snazzygator.snazpackmod.entity.ModEntityTypes;
import net.snazzygator.snazpackmod.entity.custom.GeetEntity;
import net.snazzygator.snazpackmod.entity.custom.LittlegatorEntity;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.snazzygator.snazpackmod.recipe.ArtisanStationRecipe;

@Mod.EventBusSubscriber(modid = SnazpackMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.LITTLEGATOR.get(), LittlegatorEntity.setAttributes());
        event.put(ModEntityTypes.GEET.get(), GeetEntity.setAttributes());
    }

    @SubscribeEvent
    public static void registerRecipeTypes(final RegistryEvent.Register<RecipeSerializer<?>> event) {
        Registry.register(Registry.RECIPE_TYPE, ArtisanStationRecipe.Type.ID, ArtisanStationRecipe.Type.INSTANCE);
    }
}