package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.entity.TameableChicaEntity;

public class TameableChicaModel extends GeoModel<TameableChicaEntity> {
	@Override
	public ResourceLocation getAnimationResource(TameableChicaEntity entity) {
		return new ResourceLocation("fnaf_mod", "animations/adventurewchica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TameableChicaEntity entity) {
		return new ResourceLocation("fnaf_mod", "geo/adventurewchica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TameableChicaEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
