package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.ToyFreddySignOffDisplayItem;

public class ToyFreddySignOffDisplayModel extends GeoModel<ToyFreddySignOffDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyFreddySignOffDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/toyfreddyjr.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFreddySignOffDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/toyfreddyjr.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFreddySignOffDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/fnaf_jr.png");
	}
}
