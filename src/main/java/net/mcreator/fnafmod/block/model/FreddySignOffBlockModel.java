package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.FreddySignOffTileEntity;

public class FreddySignOffBlockModel extends GeoModel<FreddySignOffTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FreddySignOffTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/freddysign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddySignOffTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/freddysign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddySignOffTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "textures/block/movie_sign.png");
	}
}
