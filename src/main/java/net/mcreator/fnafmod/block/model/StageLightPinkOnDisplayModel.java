package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.StageLightPinkOnDisplayItem;

public class StageLightPinkOnDisplayModel extends GeoModel<StageLightPinkOnDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StageLightPinkOnDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/stagelighton.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StageLightPinkOnDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/stagelighton.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StageLightPinkOnDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/lightonpink.png");
	}
}
