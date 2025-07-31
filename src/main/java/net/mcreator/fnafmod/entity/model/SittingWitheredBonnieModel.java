package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.entity.SittingWitheredBonnieEntity;

public class SittingWitheredBonnieModel extends GeoModel<SittingWitheredBonnieEntity> {
	@Override
	public ResourceLocation getAnimationResource(SittingWitheredBonnieEntity entity) {
		return new ResourceLocation("fnaf_mod", "animations/withered-bonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SittingWitheredBonnieEntity entity) {
		return new ResourceLocation("fnaf_mod", "geo/withered-bonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SittingWitheredBonnieEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
