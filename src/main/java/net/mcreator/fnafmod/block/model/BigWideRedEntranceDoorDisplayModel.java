package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.BigWideRedEntranceDoorDisplayItem;

public class BigWideRedEntranceDoorDisplayModel extends GeoModel<BigWideRedEntranceDoorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BigWideRedEntranceDoorDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/bigwidedoor1_closed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigWideRedEntranceDoorDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/bigwidedoor1_closed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigWideRedEntranceDoorDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/bigwidedoor1_redentrance.png");
	}
}
