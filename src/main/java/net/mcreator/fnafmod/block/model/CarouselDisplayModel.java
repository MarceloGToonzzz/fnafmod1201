package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.CarouselDisplayItem;

public class CarouselDisplayModel extends GeoModel<CarouselDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CarouselDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/carouseloff.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CarouselDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/carouseloff.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CarouselDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/carousel.png");
	}
}
