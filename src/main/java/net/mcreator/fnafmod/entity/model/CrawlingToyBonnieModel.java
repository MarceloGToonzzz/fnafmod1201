package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.entity.CrawlingToyBonnieEntity;

public class CrawlingToyBonnieModel extends GeoModel<CrawlingToyBonnieEntity> {
	@Override
	public ResourceLocation getAnimationResource(CrawlingToyBonnieEntity entity) {
		return new ResourceLocation("fnaf_mod", "animations/toybonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CrawlingToyBonnieEntity entity) {
		return new ResourceLocation("fnaf_mod", "geo/toybonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CrawlingToyBonnieEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
