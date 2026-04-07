package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.LightSwitchTileEntity;

public class LightSwitchBlockModel extends GeoModel<LightSwitchTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LightSwitchTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/lightswitch.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LightSwitchTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/lightswitch.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LightSwitchTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "textures/block/lightswitch.png");
	}
}
