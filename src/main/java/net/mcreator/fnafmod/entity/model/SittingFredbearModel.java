package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.entity.SittingFredbearEntity;

public class SittingFredbearModel extends GeoModel<SittingFredbearEntity> {
	@Override
	public ResourceLocation getAnimationResource(SittingFredbearEntity entity) {
		return new ResourceLocation("fnaf_mod", "animations/fredbear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SittingFredbearEntity entity) {
		return new ResourceLocation("fnaf_mod", "geo/fredbear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SittingFredbearEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
