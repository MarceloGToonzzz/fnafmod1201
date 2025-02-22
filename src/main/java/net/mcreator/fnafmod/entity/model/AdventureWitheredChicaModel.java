package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.entity.AdventureWitheredChicaEntity;

public class AdventureWitheredChicaModel extends GeoModel<AdventureWitheredChicaEntity> {
	@Override
	public ResourceLocation getAnimationResource(AdventureWitheredChicaEntity entity) {
		return new ResourceLocation("fnaf_mod", "animations/adventurewchica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AdventureWitheredChicaEntity entity) {
		return new ResourceLocation("fnaf_mod", "geo/adventurewchica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AdventureWitheredChicaEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
