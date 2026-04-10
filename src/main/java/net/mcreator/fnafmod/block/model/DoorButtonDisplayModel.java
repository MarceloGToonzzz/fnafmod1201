package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.DoorButtonDisplayItem;

public class DoorButtonDisplayModel extends GeoModel<DoorButtonDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DoorButtonDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/doorbutton.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DoorButtonDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/doorbutton.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DoorButtonDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/door_button.png");
	}
}
