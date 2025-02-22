package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.CenteredFreddySignDisplayItem;

public class CenteredFreddySignDisplayModel extends GeoModel<CenteredFreddySignDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CenteredFreddySignDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/centeredfreddysign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CenteredFreddySignDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/centeredfreddysign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CenteredFreddySignDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/movie_sign.png");
	}
}
