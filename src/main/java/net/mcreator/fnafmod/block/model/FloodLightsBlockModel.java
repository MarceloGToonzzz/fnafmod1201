package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.FloodLightsTileEntity;

public class FloodLightsBlockModel extends GeoModel<FloodLightsTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FloodLightsTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/wallfloodlights.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FloodLightsTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/wallfloodlights.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FloodLightsTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "textures/block/flood_lights.png");
	}
}
