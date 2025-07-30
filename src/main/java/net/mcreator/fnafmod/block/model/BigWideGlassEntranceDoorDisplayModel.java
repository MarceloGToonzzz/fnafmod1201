package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.BigWideGlassEntranceDoorDisplayItem;

public class BigWideGlassEntranceDoorDisplayModel extends GeoModel<BigWideGlassEntranceDoorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BigWideGlassEntranceDoorDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/bigwidedoor1_closed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigWideGlassEntranceDoorDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/bigwidedoor1_closed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigWideGlassEntranceDoorDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/bigwidedoor1_glassentrance.png");
	}
}
