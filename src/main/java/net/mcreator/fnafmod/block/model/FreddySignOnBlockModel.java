package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.FreddySignOnTileEntity;

public class FreddySignOnBlockModel extends GeoModel<FreddySignOnTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FreddySignOnTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/freddysign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddySignOnTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/freddysign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddySignOnTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "textures/block/movie_sign_glow.png");
	}
}
