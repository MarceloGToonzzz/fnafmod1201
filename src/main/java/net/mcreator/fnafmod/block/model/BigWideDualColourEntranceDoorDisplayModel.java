package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.BigWideDualColourEntranceDoorDisplayItem;

public class BigWideDualColourEntranceDoorDisplayModel extends GeoModel<BigWideDualColourEntranceDoorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BigWideDualColourEntranceDoorDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/bigwidedoor1_closed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigWideDualColourEntranceDoorDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/bigwidedoor1_closed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigWideDualColourEntranceDoorDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/bigwidedoor1_dualcolored.png");
	}
}
