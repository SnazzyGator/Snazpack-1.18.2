package net.snazzygator.snazpackmod.block;


import net.minecraft.world.item.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.snazzygator.snazpackmod.SnazpackMod;
import net.snazzygator.snazpackmod.block.custom.ArtisanStationBlock;
import net.snazzygator.snazpackmod.block.custom.BluegrassPlantBlock;
import net.snazzygator.snazpackmod.block.custom.CucumberPlantBlock;
import net.snazzygator.snazpackmod.item.ModCreativeModeTab;
import net.snazzygator.snazpackmod.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, SnazpackMod.MOD_ID);

    //blocks below!
    public static final RegistryObject<Block> CUCUMBER_PLANT = registerBlockWithoutBlockItem("cucumber_plant",
            () -> new CucumberPlantBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noOcclusion()));

    public static final RegistryObject<Block> BLUEGRASS_PLANT = registerBlockWithoutBlockItem("bluegrass_plant",
            () -> new BluegrassPlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));

    /*public static final RegistryObject<Block> SERPENTBERRY_BUSH = registerBlockWithoutBlockItem("serpentberry_bush",
            () -> new SerpentberryBushBlock(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).noOcclusion()));*/

    public static final RegistryObject<Block> WILD_BLUEGRASS_PLANT = registerBlock("wild_bluegrass_plant",
            () -> new TallGrassBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).noOcclusion()),
                    ModCreativeModeTab.SNAZPACK_TAB);

    public static final RegistryObject<Block> WILD_CUCUMBER_PLANT = registerBlock("wild_cucumber_plant",
            () -> new TallGrassBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).noOcclusion()),
            ModCreativeModeTab.SNAZPACK_TAB);

    public static final RegistryObject<Block> BLUEGRASS_BALE = registerBlock("bluegrass_bale",
            () -> new HayBlock(BlockBehaviour.Properties.of(Material.GRASS)
                    .strength(0.5F).sound(SoundType.GRASS)), ModCreativeModeTab.SNAZPACK_TAB);

    public static final RegistryObject<Block> ARTISAN_STATION = registerBlock("artisan_station",
            () -> new ArtisanStationBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()),
            ModCreativeModeTab.SNAZPACK_TAB);



    //blocks above!
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));

    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
