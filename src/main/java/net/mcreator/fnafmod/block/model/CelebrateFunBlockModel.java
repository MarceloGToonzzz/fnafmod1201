package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.CelebrateFunTileEntity;

public class CelebrateFunBlockModel extends GeoModel<CelebrateFunTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CelebrateFunTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/celebrate_fun.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CelebrateFunTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/celebrate_fun.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CelebrateFunTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "textures/block/celebrate_fun.png");
	}
}
