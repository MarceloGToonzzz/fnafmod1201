package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.ToyFreddySignOffTileEntity;

public class ToyFreddySignOffBlockModel extends GeoModel<ToyFreddySignOffTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyFreddySignOffTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/toyfreddyjr.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFreddySignOffTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/toyfreddyjr.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFreddySignOffTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "textures/block/fnaf_jr.png");
	}
}
