package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.LightSwitchDisplayItem;

public class LightSwitchDisplayModel extends GeoModel<LightSwitchDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(LightSwitchDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/lightswitch.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LightSwitchDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/lightswitch.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LightSwitchDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/lightswitch.png");
	}
}
