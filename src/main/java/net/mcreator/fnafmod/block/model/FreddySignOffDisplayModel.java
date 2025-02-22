package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.FreddySignOffDisplayItem;

public class FreddySignOffDisplayModel extends GeoModel<FreddySignOffDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FreddySignOffDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/freddysign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddySignOffDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/freddysign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddySignOffDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/movie_sign.png");
	}
}
