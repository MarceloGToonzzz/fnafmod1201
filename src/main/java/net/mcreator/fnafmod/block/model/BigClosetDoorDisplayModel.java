package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.BigClosetDoorDisplayItem;

public class BigClosetDoorDisplayModel extends GeoModel<BigClosetDoorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BigClosetDoorDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/bigclosetdoor_closed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigClosetDoorDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/bigclosetdoor_closed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigClosetDoorDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/bigclosetdoor.png");
	}
}
