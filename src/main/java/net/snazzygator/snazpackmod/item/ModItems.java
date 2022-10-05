package net.snazzygator.snazpackmod.item;

import net.minecraft.world.food.Foods;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.snazzygator.snazpackmod.SnazpackMod;
import net.snazzygator.snazpackmod.block.ModBlocks;
import net.snazzygator.snazpackmod.entity.ModEntityTypes;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SnazpackMod.MOD_ID);
    
    //FOODSTUFFS
    public static final RegistryObject<Item> CUCUMBER = ITEMS.register("cucumber",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SNAZPACK_TAB).food(ModFoods.CUCUMBER)));
    public static final RegistryObject<Item> CUCUMBER_SLICES = ITEMS.register("cucumber_slices",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SNAZPACK_TAB).food(ModFoods.CUCUMBER_SLICES)));

    public static final RegistryObject<Item> SUS_BREAD = ITEMS.register("sus_bread",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SNAZPACK_TAB).food(ModFoods.SUS_BREAD)));
    /*public static final RegistryObject<Item> SERPENTBERRIES = ITEMS.register("serpentberries",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SNAZPACK_TAB).food(ModFoods.SERPENTBERRIES)));*/

    public static final RegistryObject<Item> CUCUMBER_SANDWICH = ITEMS.register("cucumber_sandwich",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SNAZPACK_TAB).food(ModFoods.CUCUMBER_SANDWICH)));
    public static final RegistryObject<Item> MUTTON_SANDWICH = ITEMS.register("mutton_sandwich",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SNAZPACK_TAB).food(ModFoods.MUTTON_SANDWICH)));
    public static final RegistryObject<Item> CHEESE_MUTTON_SANDWICH = ITEMS.register("cheese_mutton_sandwich",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SNAZPACK_TAB).food(ModFoods.CHEESE_MUTTON_SANDWICH)));
    public static final RegistryObject<Item> PULLED_PORK_SANDWICH = ITEMS.register("pulled_pork_sandwich",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SNAZPACK_TAB).food(ModFoods.PULLED_PORK_SANDWICH)));

    public static final RegistryObject<Item> GEET_MILK_BUCKET = ITEMS.register("geet_milk_bucket",
            () -> new MilkBucketItem(new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)
                    .tab(ModCreativeModeTab.SNAZPACK_TAB)));

    public static final RegistryObject<Item> CHEESE_MOZZARELLA = ITEMS.register("cheese_mozzarella",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SNAZPACK_TAB).food(ModFoods.CHEESE_MOZZARELLA)));
    public static final RegistryObject<Item> CHEESE_SCAMORZA = ITEMS.register("cheese_scamorza",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SNAZPACK_TAB).food(ModFoods.CHEESE_SCAMORZA)));
    public static final RegistryObject<Item> CHEESE_GEET_FETA = ITEMS.register("cheese_geet_feta",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SNAZPACK_TAB).food(ModFoods.CHEESE_GEET_FETA)));
    public static final RegistryObject<Item> CHEESE_GEET_RAW = ITEMS.register("cheese_geet_raw",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SNAZPACK_TAB).food(ModFoods.CHEESE_GEET_RAW)));

    public static final RegistryObject<Item> YOGURT = ITEMS.register("yogurt",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SNAZPACK_TAB).food(ModFoods.YOGURT)));
    public static final RegistryObject<Item> GEET_YOGURT = ITEMS.register("geet_yogurt",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SNAZPACK_TAB).food(ModFoods.GEET_YOGURT)));
    public static final RegistryObject<Item> SERPENTBERRY_YOGURT = ITEMS.register("serpentberry_yogurt",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SNAZPACK_TAB).food(ModFoods.SERPENTBERRY_YOGURT)));
    public static final RegistryObject<Item> SWEETBERRY_YOGURT = ITEMS.register("sweetberry_yogurt",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SNAZPACK_TAB).food(ModFoods.SWEETBERRY_YOGURT)));

    public static final RegistryObject<Item> BUTTER = ITEMS.register("butter",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SNAZPACK_TAB).food(ModFoods.BUTTER)));

    public static final RegistryObject<Item> SALT = ITEMS.register("salt",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SNAZPACK_TAB)));

    public static final RegistryObject<Item> CUCUMBER_SEEDS = ITEMS.register("cucumber_seeds",
            () -> new ItemNameBlockItem(ModBlocks.CUCUMBER_PLANT.get(),
                    new Item.Properties().tab(ModCreativeModeTab.SNAZPACK_TAB)));
    public static final RegistryObject<Item> BLUEGRASS_SEEDS = ITEMS.register("bluegrass_seeds",
            () -> new ItemNameBlockItem(ModBlocks.BLUEGRASS_PLANT.get(),
                    new Item.Properties().tab(ModCreativeModeTab.SNAZPACK_TAB)));
    /*public static final RegistryObject<Item> SERPENTBERRIES = ITEMS.register("serpentberries",
            () -> new ItemNameBlockItem(ModBlocks.SERPENTBERRY_BUSH.get(),
                    (new Item.Properties()).tab(ModCreativeModeTab.SNAZPACK_TAB).food(ModFoods.SERPENTBERRIES)));*/

    public static final RegistryObject<Item> BLUEGRASS = ITEMS.register("bluegrass",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SNAZPACK_TAB)));

    //ENTITY ITEMS
    public static final RegistryObject<Item> LITTLEGATOR_SPAWN_EGG = ITEMS.register("littlegator_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.LITTLEGATOR, 0x50B325, 0xAC50C3,
                    new Item.Properties().tab(ModCreativeModeTab.SNAZPACK_TAB)));
    public static final RegistryObject<Item> GEET_SPAWN_EGG = ITEMS.register("geet_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.GEET,0x878481, 0x3D3C3B,
                    new Item.Properties().tab(ModCreativeModeTab.SNAZPACK_TAB)));

    //CREATIVE TAB ICON ITEM
    public static final RegistryObject<Item> SNAZZYGATOR_ITEM = ITEMS.register("snazzygator_item",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SNAZPACK_TAB).stacksTo(1)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
