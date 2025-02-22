package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.StageLightRedDisplayItem;

public class StageLightRedDisplayModel extends GeoModel<StageLightRedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StageLightRedDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/stagelight.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StageLightRedDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/stagelight.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StageLightRedDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/light.png");
	}
}
