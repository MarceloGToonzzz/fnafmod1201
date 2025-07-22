package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.ClownfulDollDisplayItem;

public class ClownfulDollDisplayModel extends GeoModel<ClownfulDollDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ClownfulDollDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/chibiclownful.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClownfulDollDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/chibiclownful.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClownfulDollDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/chibiclownfull.png");
	}
}
