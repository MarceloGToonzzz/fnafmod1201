package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.entity.DayTimeToyBonnieEntity;

public class DayTimeToyBonnieModel extends GeoModel<DayTimeToyBonnieEntity> {
	@Override
	public ResourceLocation getAnimationResource(DayTimeToyBonnieEntity entity) {
		return new ResourceLocation("fnaf_mod", "animations/toybonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DayTimeToyBonnieEntity entity) {
		return new ResourceLocation("fnaf_mod", "geo/toybonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DayTimeToyBonnieEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
