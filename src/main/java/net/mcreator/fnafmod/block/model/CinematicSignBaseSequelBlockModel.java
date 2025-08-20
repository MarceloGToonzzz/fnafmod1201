package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.CinematicSignBaseSequelTileEntity;

public class CinematicSignBaseSequelBlockModel extends GeoModel<CinematicSignBaseSequelTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CinematicSignBaseSequelTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/cinematic_ffp_sign_base.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CinematicSignBaseSequelTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/cinematic_ffp_sign_base.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CinematicSignBaseSequelTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "textures/block/sequel_cinematic_sign_base_texture.png");
	}
}
