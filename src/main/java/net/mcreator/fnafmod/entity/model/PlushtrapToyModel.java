package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.entity.PlushtrapToyEntity;

public class PlushtrapToyModel extends GeoModel<PlushtrapToyEntity> {
	@Override
	public ResourceLocation getAnimationResource(PlushtrapToyEntity entity) {
		return new ResourceLocation("fnaf_mod", "animations/plushtrap.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PlushtrapToyEntity entity) {
		return new ResourceLocation("fnaf_mod", "geo/plushtrap.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PlushtrapToyEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
