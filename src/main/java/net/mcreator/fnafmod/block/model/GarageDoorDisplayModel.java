package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.GarageDoorDisplayItem;

public class GarageDoorDisplayModel extends GeoModel<GarageDoorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GarageDoorDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/garagedoor_closed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GarageDoorDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/garagedoor_closed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GarageDoorDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/garage_door.png");
	}
}
