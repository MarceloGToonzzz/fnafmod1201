package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.BigWhiteDoorDisplayItem;

public class BigWhiteDoorDisplayModel extends GeoModel<BigWhiteDoorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BigWhiteDoorDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/bigdoor2_closed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigWhiteDoorDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/bigdoor2_closed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigWhiteDoorDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/bigdoor2_white.png");
	}
}
