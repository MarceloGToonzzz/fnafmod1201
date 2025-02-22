package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.entity.BreadbearEntity;

public class BreadbearModel extends GeoModel<BreadbearEntity> {
	@Override
	public ResourceLocation getAnimationResource(BreadbearEntity entity) {
		return new ResourceLocation("fnaf_mod", "animations/breadbear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BreadbearEntity entity) {
		return new ResourceLocation("fnaf_mod", "geo/breadbear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BreadbearEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
