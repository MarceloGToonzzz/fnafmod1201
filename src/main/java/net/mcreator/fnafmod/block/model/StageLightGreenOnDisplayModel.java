package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.StageLightGreenOnDisplayItem;

public class StageLightGreenOnDisplayModel extends GeoModel<StageLightGreenOnDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StageLightGreenOnDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/stagelighton.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StageLightGreenOnDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/stagelighton.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StageLightGreenOnDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/lighton.png");
	}
}
