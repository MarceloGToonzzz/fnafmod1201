package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.FreddySignOnDisplayItem;

public class FreddySignOnDisplayModel extends GeoModel<FreddySignOnDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FreddySignOnDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/freddysign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddySignOnDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/freddysign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddySignOnDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/movie_sign_glow.png");
	}
}
