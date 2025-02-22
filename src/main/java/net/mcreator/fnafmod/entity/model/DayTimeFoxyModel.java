package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.entity.DayTimeFoxyEntity;

public class DayTimeFoxyModel extends GeoModel<DayTimeFoxyEntity> {
	@Override
	public ResourceLocation getAnimationResource(DayTimeFoxyEntity entity) {
		return new ResourceLocation("fnaf_mod", "animations/foxypirate.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DayTimeFoxyEntity entity) {
		return new ResourceLocation("fnaf_mod", "geo/foxypirate.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DayTimeFoxyEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
