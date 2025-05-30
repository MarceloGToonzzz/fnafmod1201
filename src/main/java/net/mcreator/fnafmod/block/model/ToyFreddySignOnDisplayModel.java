package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.ToyFreddySignOnDisplayItem;

public class ToyFreddySignOnDisplayModel extends GeoModel<ToyFreddySignOnDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyFreddySignOnDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/toyfreddyjr.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFreddySignOnDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/toyfreddyjr.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFreddySignOnDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/fnaf_jr_lit.png");
	}
}
