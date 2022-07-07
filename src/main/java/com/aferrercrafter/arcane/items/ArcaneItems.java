package com.aferrercrafter.arcane.items;

import com.aferrercrafter.arcane.Arcane;
import com.aferrercrafter.arcane.items.attachments.CapItem;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ArcaneItems {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Arcane.MOD_ID);

    // Arcanium
	//public static final RegistryObject<Item> ARCANIUM_SWORDA_OBJECT = ITEMS.register("arcanium_sword", () -> new SwordItem(ArcanaToolTiers.ARCANIUM, 3, -2.4f, new Properties().group(Arcana.ITEMS)));
    public static final RegistryObject<Item> ARCANIUM_SWORD = ITEMS.register("arcanium_sword", () -> new Item(new Item.Properties().tab(ArcaneCreativeModeTab.ARCANE_TAB)));

    // Caps
	public static final RegistryObject<CapItem> IRON_CAP = ITEMS.register("iron_cap", () -> new CapItem(new Item.Properties().tab(ArcaneCreativeModeTab.ARCANE_TAB), 10, 3, 1, Arcane.ArcaneLocation("iron_cap")));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
