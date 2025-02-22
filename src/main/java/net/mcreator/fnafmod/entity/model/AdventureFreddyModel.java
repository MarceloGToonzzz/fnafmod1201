package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.entity.AdventureFreddyEntity;

public class AdventureFreddyModel extends GeoModel<AdventureFreddyEntity> {
	@Override
	public ResourceLocation getAnimationResource(AdventureFreddyEntity entity) {
		return new ResourceLocation("fnaf_mod", "animations/adventure_freddy2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AdventureFreddyEntity entity) {
		return new ResourceLocation("fnaf_mod", "geo/adventure_freddy2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AdventureFreddyEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
