package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.CenteredFreddySignOnDisplayItem;

public class CenteredFreddySignOnDisplayModel extends GeoModel<CenteredFreddySignOnDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CenteredFreddySignOnDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/centeredfreddysign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CenteredFreddySignOnDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/centeredfreddysign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CenteredFreddySignOnDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/movie_sign_glow.png");
	}
}
