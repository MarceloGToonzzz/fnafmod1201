package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.entity.DayTimeBonnieEntity;

public class DayTimeBonnieModel extends GeoModel<DayTimeBonnieEntity> {
	@Override
	public ResourceLocation getAnimationResource(DayTimeBonnieEntity entity) {
		return new ResourceLocation("fnaf_mod", "animations/bonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DayTimeBonnieEntity entity) {
		return new ResourceLocation("fnaf_mod", "geo/bonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DayTimeBonnieEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
