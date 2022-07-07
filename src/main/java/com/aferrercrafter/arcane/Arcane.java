package com.aferrercrafter.arcane;

import com.aferrercrafter.arcane.blocks.ArcaneBlocks;
import com.aferrercrafter.arcane.items.ArcaneItems;
import com.mojang.logging.LogUtils;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Arcane.MOD_ID)
public class Arcane
{
    public static final String MOD_ID = "arcane";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public Arcane()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ArcaneItems.register(eventBus);
        ArcaneBlocks.register(eventBus);

        eventBus.addListener(this::setup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    public static ResourceLocation ArcaneLocation(String path){
		return new ResourceLocation(MOD_ID, path);
	}
}
