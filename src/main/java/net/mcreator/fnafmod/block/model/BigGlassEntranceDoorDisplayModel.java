package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.BigGlassEntranceDoorDisplayItem;

public class BigGlassEntranceDoorDisplayModel extends GeoModel<BigGlassEntranceDoorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BigGlassEntranceDoorDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/bigdoor1_closed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigGlassEntranceDoorDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/bigdoor1_closed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigGlassEntranceDoorDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/bigdoor1_glassentrance.png");
	}
}
