package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.entity.NightmareFoxyStatueEntity;

public class NightmareFoxyStatueModel extends GeoModel<NightmareFoxyStatueEntity> {
	@Override
	public ResourceLocation getAnimationResource(NightmareFoxyStatueEntity entity) {
		return new ResourceLocation("fnaf_mod", "animations/nightmare_foxy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NightmareFoxyStatueEntity entity) {
		return new ResourceLocation("fnaf_mod", "geo/nightmare_foxy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NightmareFoxyStatueEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
