package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.CinematicSignFreddyDisplayItem;

public class CinematicSignFreddyDisplayModel extends GeoModel<CinematicSignFreddyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CinematicSignFreddyDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/cinematic_ffp_sign_freddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CinematicSignFreddyDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/cinematic_ffp_sign_freddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CinematicSignFreddyDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/ffp_sign_freddy_cinematic_texture.png");
	}
}
