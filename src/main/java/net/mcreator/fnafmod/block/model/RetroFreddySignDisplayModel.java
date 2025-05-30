package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.RetroFreddySignDisplayItem;

public class RetroFreddySignDisplayModel extends GeoModel<RetroFreddySignDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RetroFreddySignDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/fnaf6sign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RetroFreddySignDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/fnaf6sign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RetroFreddySignDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/fnaf_6sign.png");
	}
}
