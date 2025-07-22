package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.ClownfulDollTileEntity;

public class ClownfulDollBlockModel extends GeoModel<ClownfulDollTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ClownfulDollTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/chibiclownful.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClownfulDollTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/chibiclownful.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClownfulDollTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "textures/block/chibiclownfull.png");
	}
}
