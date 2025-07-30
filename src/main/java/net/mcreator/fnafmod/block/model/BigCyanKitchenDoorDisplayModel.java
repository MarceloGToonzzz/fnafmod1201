package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.BigCyanKitchenDoorDisplayItem;

public class BigCyanKitchenDoorDisplayModel extends GeoModel<BigCyanKitchenDoorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BigCyanKitchenDoorDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/bigdoor1_closed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigCyanKitchenDoorDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/bigdoor1_closed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigCyanKitchenDoorDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/bigdoor1_kitchen-cyan.png");
	}
}
