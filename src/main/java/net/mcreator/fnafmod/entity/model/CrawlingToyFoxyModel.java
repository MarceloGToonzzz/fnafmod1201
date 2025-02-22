package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.entity.CrawlingToyFoxyEntity;

public class CrawlingToyFoxyModel extends GeoModel<CrawlingToyFoxyEntity> {
	@Override
	public ResourceLocation getAnimationResource(CrawlingToyFoxyEntity entity) {
		return new ResourceLocation("fnaf_mod", "animations/toyfoxy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CrawlingToyFoxyEntity entity) {
		return new ResourceLocation("fnaf_mod", "geo/toyfoxy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CrawlingToyFoxyEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
