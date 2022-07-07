package com.aferrercrafter.arcane.items.attachments;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class CapItem extends Item implements Cap{

    private final int complexity, visStorage, level;
	private final ResourceLocation id;

    public CapItem(Properties properties, int visStorage, int complexity, int level, ResourceLocation id){
		super(properties);
		this.complexity = complexity;
		this.visStorage = visStorage;
		this.level = level;
		this.id = id;
		CAPS.put(getId(), this);
	}

    public int level(){
		return level;
	}
	
	public int complexity(){
		return complexity;
	}
	
	public int visStorage(){
		return visStorage;
	}

    public ResourceLocation getId(){
		return id;
	}
    
}
