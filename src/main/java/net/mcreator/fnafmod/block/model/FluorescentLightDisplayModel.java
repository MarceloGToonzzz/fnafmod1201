package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.FluorescentLightDisplayItem;

public class FluorescentLightDisplayModel extends GeoModel<FluorescentLightDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FluorescentLightDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/hangingflourescentlights.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FluorescentLightDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/hangingflourescentlights.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FluorescentLightDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/hangingflourescentlightsoff.png");
	}
}
