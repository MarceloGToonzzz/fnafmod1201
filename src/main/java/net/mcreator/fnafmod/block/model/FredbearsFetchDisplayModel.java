package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.FredbearsFetchDisplayItem;

public class FredbearsFetchDisplayModel extends GeoModel<FredbearsFetchDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FredbearsFetchDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/diner_fetch.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredbearsFetchDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/diner_fetch.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredbearsFetchDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/fredbears_fetch.png");
	}
}
