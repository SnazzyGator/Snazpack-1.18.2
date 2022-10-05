package net.snazzygator.snazpackmod.block.entity;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.snazzygator.snazpackmod.SnazpackMod;
import net.snazzygator.snazpackmod.block.ModBlocks;
import net.snazzygator.snazpackmod.block.entity.custom.ArtisanStationBlockEntity;

public class ModBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, SnazpackMod.MOD_ID);

    public static final RegistryObject<BlockEntityType<ArtisanStationBlockEntity>> ARTISAN_STATION_BLOCK_ENTITY =
            BLOCK_ENTITIES.register( "artisan_station_block_entity", () ->
                    BlockEntityType.Builder.of(ArtisanStationBlockEntity::new,
                            ModBlocks.ARTISAN_STATION.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }

}
