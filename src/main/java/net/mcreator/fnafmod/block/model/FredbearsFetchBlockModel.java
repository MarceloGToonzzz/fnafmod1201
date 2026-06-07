package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.FredbearsFetchTileEntity;

public class FredbearsFetchBlockModel extends GeoModel<FredbearsFetchTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FredbearsFetchTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/diner_fetch.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredbearsFetchTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/diner_fetch.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredbearsFetchTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "textures/block/fredbears_fetch.png");
	}
}
