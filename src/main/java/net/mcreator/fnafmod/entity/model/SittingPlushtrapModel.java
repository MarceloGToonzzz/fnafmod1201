package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.entity.SittingPlushtrapEntity;

public class SittingPlushtrapModel extends GeoModel<SittingPlushtrapEntity> {
	@Override
	public ResourceLocation getAnimationResource(SittingPlushtrapEntity entity) {
		return new ResourceLocation("fnaf_mod", "animations/plushtrap.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SittingPlushtrapEntity entity) {
		return new ResourceLocation("fnaf_mod", "geo/plushtrap.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SittingPlushtrapEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
