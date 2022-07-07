package com.aferrercrafter.arcane.blocks;

import java.util.function.Supplier;

import com.aferrercrafter.arcane.Arcane;
import com.aferrercrafter.arcane.items.ArcaneItems;
import com.aferrercrafter.arcane.items.ArcaneCreativeModeTab;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.PressurePlateBlock.Sensitivity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ArcaneBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Arcane.MOD_ID);

    // General
	// Arcane Stone
    public static final RegistryObject<Block> ARCANE_STONE = registerBlock("arcane_stone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f).requiresCorrectToolForDrops()), ArcaneCreativeModeTab.ARCANE_TAB);
    public static final RegistryObject<SlabBlock> ARCANE_STONE_SLAB = registerBlock("arcane_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)), ArcaneCreativeModeTab.ARCANE_TAB);
    public static final RegistryObject<StairBlock> ARCANE_STONE_STAIRS = registerBlock("arcane_stone_stairs", () -> (StairBlock)new StairBlock(ARCANE_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(ARCANE_STONE.get())),  ArcaneCreativeModeTab.ARCANE_TAB);
    public static final RegistryObject<PressurePlateBlock> ARCANE_STONE_PRESSURE_PLATE = registerBlock("arcane_stone_pressure_plate", () -> new PressurePlateBlock(Sensitivity.MOBS, BlockBehaviour.Properties.of(Material.STONE)), ArcaneCreativeModeTab.ARCANE_TAB);
    public static final RegistryObject<WallBlock> ARCANE_STONE_WALL = registerBlock("arcane_stone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(ARCANE_STONE.get())), ArcaneCreativeModeTab.ARCANE_TAB);
	
	
	// Arcane Stone Bricks
	public static final RegistryObject<Block> ARCANE_STONE_BRICKS = registerBlock("arcane_stone_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)), ArcaneCreativeModeTab.ARCANE_TAB);
	public static final RegistryObject<SlabBlock> ARCANE_STONE_BRICKS_SLAB = registerBlock("arcane_stone_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)), ArcaneCreativeModeTab.ARCANE_TAB);
	public static final RegistryObject<StairBlock> ARCANE_STONE_BRICKS_STAIRS = registerBlock("arcane_stone_bricks_stairs", () -> (StairBlock)new StairBlock(ARCANE_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE)), ArcaneCreativeModeTab.ARCANE_TAB);
	public static final RegistryObject<PressurePlateBlock> ARCANE_STONE_BRICKS_PRESSURE_PLATE = registerBlock("arcane_stone_bricks_pressure_plate", () -> new PressurePlateBlock(Sensitivity.MOBS, BlockBehaviour.Properties.of(Material.STONE)), ArcaneCreativeModeTab.ARCANE_TAB);
	public static final RegistryObject<WallBlock> ARCANE_STONE_BRICKS_WALL = registerBlock("arcane_stone_bricks_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(ARCANE_STONE_BRICKS.get())), ArcaneCreativeModeTab.ARCANE_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ArcaneItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
