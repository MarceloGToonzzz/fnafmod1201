package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.BigCyanBackstageDoorDisplayItem;

public class BigCyanBackstageDoorDisplayModel extends GeoModel<BigCyanBackstageDoorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BigCyanBackstageDoorDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/bigdoor1_closed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigCyanBackstageDoorDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/bigdoor1_closed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigCyanBackstageDoorDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/bigdoor1_backstage-cyan.png");
	}
}
