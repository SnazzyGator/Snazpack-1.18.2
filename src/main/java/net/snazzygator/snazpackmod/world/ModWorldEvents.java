package net.snazzygator.snazpackmod.world;

import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.snazzygator.snazpackmod.SnazpackMod;
import net.snazzygator.snazpackmod.world.gen.ModEntityGeneration;
import net.snazzygator.snazpackmod.world.gen.ModFlowerGeneration;

@Mod.EventBusSubscriber(modid = SnazpackMod.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {

        ModEntityGeneration.onEntitySpawn(event);
        ModFlowerGeneration.generateFlowers(event);

    }
}