package net.snazzygator.snazpackmod;

import com.mojang.logging.LogUtils;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.snazzygator.snazpackmod.block.ModBlocks;
import net.snazzygator.snazpackmod.block.entity.ModBlockEntities;
import net.snazzygator.snazpackmod.entity.ModEntityTypes;
import net.snazzygator.snazpackmod.entity.client.GeetRenderer;
import net.snazzygator.snazpackmod.entity.client.LittlegatorRenderer;
import net.snazzygator.snazpackmod.item.ModItems;
import net.snazzygator.snazpackmod.recipe.ModRecipes;
import net.snazzygator.snazpackmod.screen.ArtisanStationScreen;
import net.snazzygator.snazpackmod.screen.ModMenuTypes;
import net.snazzygator.snazpackmod.entity.client.sound.ModSounds;
import org.slf4j.Logger;
import software.bernie.geckolib3.GeckoLib;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(SnazpackMod.MOD_ID)
public class SnazpackMod {
    public static final String MOD_ID = "snazpackmod";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public SnazpackMod() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        ModSounds.register(eventBus);

        ModEntityTypes.register(eventBus);

        ModBlockEntities.register(eventBus);
        ModMenuTypes.register(eventBus);

        ModRecipes.register(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);

        GeckoLib.initialize();

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }


    private void clientSetup(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CUCUMBER_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUEGRASS_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WILD_BLUEGRASS_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WILD_CUCUMBER_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SERPENTBERRY_BUSH.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ARTISAN_STATION.get(), RenderType.cutout());

        MenuScreens.register(ModMenuTypes.ARTISAN_STATION_MENU.get(), ArtisanStationScreen::new);

        EntityRenderers.register(ModEntityTypes.LITTLEGATOR.get(), LittlegatorRenderer::new);
        EntityRenderers.register(ModEntityTypes.GEET.get(), GeetRenderer::new);
    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {

            SpawnPlacements.register(ModEntityTypes.GEET.get(),
                    SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Animal::checkAnimalSpawnRules);
        });

        // some preinit code
        LOGGER.info("Baa-aa-aa!");
    }
}
