package net.snazzygator.snazpackmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab SNAZPACK_TAB = new CreativeModeTab("snazpack_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SNAZZYGATOR_ITEM.get());
        }
    };
}
