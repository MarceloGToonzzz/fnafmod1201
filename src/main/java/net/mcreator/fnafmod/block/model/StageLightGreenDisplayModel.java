package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.StageLightGreenDisplayItem;

public class StageLightGreenDisplayModel extends GeoModel<StageLightGreenDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StageLightGreenDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/stagelight.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StageLightGreenDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/stagelight.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StageLightGreenDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/light.png");
	}
}
