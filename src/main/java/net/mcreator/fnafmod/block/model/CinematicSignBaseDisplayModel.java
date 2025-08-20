package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.CinematicSignBaseDisplayItem;

public class CinematicSignBaseDisplayModel extends GeoModel<CinematicSignBaseDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CinematicSignBaseDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/cinematic_ffp_sign_base.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CinematicSignBaseDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/cinematic_ffp_sign_base.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CinematicSignBaseDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/cinematic_sign_base_texture.png");
	}
}
