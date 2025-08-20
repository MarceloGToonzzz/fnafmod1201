package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.CinematicSignToysTileEntity;

public class CinematicSignToysBlockModel extends GeoModel<CinematicSignToysTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CinematicSignToysTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/cinematic_ffp_sign_toy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CinematicSignToysTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/cinematic_ffp_sign_toy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CinematicSignToysTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "textures/block/ffp_sign_toy_cinematic_texture.png");
	}
}
