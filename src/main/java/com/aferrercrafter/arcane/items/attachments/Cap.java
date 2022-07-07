package com.aferrercrafter.arcane.items.attachments;

import java.util.LinkedHashMap;
import java.util.Map;
import net.minecraft.resources.ResourceLocation;

public interface Cap {

    Map<ResourceLocation, Cap> CAPS = new LinkedHashMap<>();

    int visStorage();

	int complexity();
	
	int level();

    ResourceLocation getId();

    default String getPrefixTranslationKey(){
		return "item." + getId().getNamespace() + "." + getId().getPath() + ".prefix";
	}
	
	default ResourceLocation getTextureLocation(){
		return new ResourceLocation(getId().getNamespace(), "models/wands/caps/" + getId().getPath());
	}
    
}
