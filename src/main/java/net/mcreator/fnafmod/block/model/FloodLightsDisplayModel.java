package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.FloodLightsDisplayItem;

public class FloodLightsDisplayModel extends GeoModel<FloodLightsDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FloodLightsDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/wallfloodlights.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FloodLightsDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/wallfloodlights.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FloodLightsDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/flood_lights.png");
	}
}
