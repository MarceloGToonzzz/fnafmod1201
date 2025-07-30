package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.BigWideCyanKitchenDoorDisplayItem;

public class BigWideCyanKitchenDoorDisplayModel extends GeoModel<BigWideCyanKitchenDoorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BigWideCyanKitchenDoorDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/bigwidedoor1_closed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigWideCyanKitchenDoorDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/bigwidedoor1_closed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigWideCyanKitchenDoorDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/bigwidedoor1_kitchen-cyan.png");
	}
}
