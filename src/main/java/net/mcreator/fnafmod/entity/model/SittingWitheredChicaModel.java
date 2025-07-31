package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.entity.SittingWitheredChicaEntity;

public class SittingWitheredChicaModel extends GeoModel<SittingWitheredChicaEntity> {
	@Override
	public ResourceLocation getAnimationResource(SittingWitheredChicaEntity entity) {
		return new ResourceLocation("fnaf_mod", "animations/withered-chica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SittingWitheredChicaEntity entity) {
		return new ResourceLocation("fnaf_mod", "geo/withered-chica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SittingWitheredChicaEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
