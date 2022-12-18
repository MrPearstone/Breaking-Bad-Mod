package net.pearstone.moreores.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MOREORES_TAB = new CreativeModeTab("moreorestab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MITHRIL.get());
        }
    };
}
