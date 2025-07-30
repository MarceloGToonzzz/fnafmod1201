package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.BigRedDoorDisplayItem;

public class BigRedDoorDisplayModel extends GeoModel<BigRedDoorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BigRedDoorDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/bigdoor1_closed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigRedDoorDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/bigdoor1_closed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigRedDoorDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/bigdoor1_establishment.png");
	}
}
