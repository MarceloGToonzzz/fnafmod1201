package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.CinematicSignBaseSequelDisplayItem;

public class CinematicSignBaseSequelDisplayModel extends GeoModel<CinematicSignBaseSequelDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CinematicSignBaseSequelDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/cinematic_ffp_sign_base.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CinematicSignBaseSequelDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/cinematic_ffp_sign_base.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CinematicSignBaseSequelDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/sequel_cinematic_sign_base_texture.png");
	}
}
