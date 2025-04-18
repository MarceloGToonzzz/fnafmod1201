package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.entity.DedWitheredFreddyEntity;

public class DedWitheredFreddyModel extends GeoModel<DedWitheredFreddyEntity> {
	@Override
	public ResourceLocation getAnimationResource(DedWitheredFreddyEntity entity) {
		return new ResourceLocation("fnaf_mod", "animations/witheredfreddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DedWitheredFreddyEntity entity) {
		return new ResourceLocation("fnaf_mod", "geo/witheredfreddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DedWitheredFreddyEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
