package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.entity.CrawlingToyChicaEntity;

public class CrawlingToyChicaModel extends GeoModel<CrawlingToyChicaEntity> {
	@Override
	public ResourceLocation getAnimationResource(CrawlingToyChicaEntity entity) {
		return new ResourceLocation("fnaf_mod", "animations/toychica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CrawlingToyChicaEntity entity) {
		return new ResourceLocation("fnaf_mod", "geo/toychica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CrawlingToyChicaEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
