package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.BigDualColourEntranceDoorDisplayItem;

public class BigDualColourEntranceDoorDisplayModel extends GeoModel<BigDualColourEntranceDoorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BigDualColourEntranceDoorDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/bigdoor1_closed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigDualColourEntranceDoorDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/bigdoor1_closed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigDualColourEntranceDoorDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/bigdoor1_dualcolored.png");
	}
}
