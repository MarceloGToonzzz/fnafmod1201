package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.BigBackstageDoorDisplayItem;

public class BigBackstageDoorDisplayModel extends GeoModel<BigBackstageDoorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BigBackstageDoorDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/bigdoor1_closed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigBackstageDoorDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/bigdoor1_closed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigBackstageDoorDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/bigdoor1_backstage.png");
	}
}
