package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.entity.FredbearsBonnieEntity;

public class FredbearsBonnieModel extends GeoModel<FredbearsBonnieEntity> {
	@Override
	public ResourceLocation getAnimationResource(FredbearsBonnieEntity entity) {
		return new ResourceLocation("fnaf_mod", "animations/diner-bonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredbearsBonnieEntity entity) {
		return new ResourceLocation("fnaf_mod", "geo/diner-bonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredbearsBonnieEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
