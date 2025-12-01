package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.CelebrateFunDisplayItem;

public class CelebrateFunDisplayModel extends GeoModel<CelebrateFunDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CelebrateFunDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/celebrate_fun.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CelebrateFunDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/celebrate_fun.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CelebrateFunDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/celebrate_fun.png");
	}
}
