package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.entity.DayTimeToyFoxyEntity;

public class DayTimeToyFoxyModel extends GeoModel<DayTimeToyFoxyEntity> {
	@Override
	public ResourceLocation getAnimationResource(DayTimeToyFoxyEntity entity) {
		return new ResourceLocation("fnaf_mod", "animations/toyfoxy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DayTimeToyFoxyEntity entity) {
		return new ResourceLocation("fnaf_mod", "geo/toyfoxy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DayTimeToyFoxyEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
