package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.AlternateGarageDoorDisplayItem;

public class AlternateGarageDoorDisplayModel extends GeoModel<AlternateGarageDoorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AlternateGarageDoorDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/alt_garage_door_closed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AlternateGarageDoorDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/alt_garage_door_closed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AlternateGarageDoorDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/alt_garage_door.png");
	}
}
