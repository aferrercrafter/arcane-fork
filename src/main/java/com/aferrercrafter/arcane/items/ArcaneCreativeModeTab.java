package com.aferrercrafter.arcane.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ArcaneCreativeModeTab {
    public static final CreativeModeTab ARCANE_TAB = new CreativeModeTab("arcane"){
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ArcaneItems.ARCANIUM_SWORD.get());
        }
    };
    
}
