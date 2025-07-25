package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.DisplayShelvesDisplayItem;

public class DisplayShelvesDisplayModel extends GeoModel<DisplayShelvesDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DisplayShelvesDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/displayshelves.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DisplayShelvesDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/displayshelves.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DisplayShelvesDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/standingshelfsingle.png");
	}
}
