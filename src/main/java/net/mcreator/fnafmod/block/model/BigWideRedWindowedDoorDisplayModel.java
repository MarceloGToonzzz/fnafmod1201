package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.BigWideRedWindowedDoorDisplayItem;

public class BigWideRedWindowedDoorDisplayModel extends GeoModel<BigWideRedWindowedDoorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BigWideRedWindowedDoorDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/bigwidedoor1_closed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigWideRedWindowedDoorDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/bigwidedoor1_closed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigWideRedWindowedDoorDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/bigwidedoor1_establishment-windowed.png");
	}
}
