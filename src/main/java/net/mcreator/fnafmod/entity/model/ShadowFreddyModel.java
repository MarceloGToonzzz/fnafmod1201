package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.entity.ShadowFreddyEntity;

public class ShadowFreddyModel extends GeoModel<ShadowFreddyEntity> {
	@Override
	public ResourceLocation getAnimationResource(ShadowFreddyEntity entity) {
		return new ResourceLocation("fnaf_mod", "animations/witheredfreddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ShadowFreddyEntity entity) {
		return new ResourceLocation("fnaf_mod", "geo/witheredfreddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ShadowFreddyEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
