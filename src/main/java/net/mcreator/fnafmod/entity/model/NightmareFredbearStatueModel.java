package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.entity.NightmareFredbearStatueEntity;

public class NightmareFredbearStatueModel extends GeoModel<NightmareFredbearStatueEntity> {
	@Override
	public ResourceLocation getAnimationResource(NightmareFredbearStatueEntity entity) {
		return new ResourceLocation("fnaf_mod", "animations/nightmare_fredbear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NightmareFredbearStatueEntity entity) {
		return new ResourceLocation("fnaf_mod", "geo/nightmare_fredbear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NightmareFredbearStatueEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
