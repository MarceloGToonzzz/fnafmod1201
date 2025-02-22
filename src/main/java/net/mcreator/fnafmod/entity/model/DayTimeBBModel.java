package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.entity.DayTimeBBEntity;

public class DayTimeBBModel extends GeoModel<DayTimeBBEntity> {
	@Override
	public ResourceLocation getAnimationResource(DayTimeBBEntity entity) {
		return new ResourceLocation("fnaf_mod", "animations/balloonboy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DayTimeBBEntity entity) {
		return new ResourceLocation("fnaf_mod", "geo/balloonboy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DayTimeBBEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
