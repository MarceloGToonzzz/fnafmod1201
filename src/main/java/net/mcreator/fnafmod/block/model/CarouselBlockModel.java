package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.CarouselTileEntity;

public class CarouselBlockModel extends GeoModel<CarouselTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CarouselTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "animations/carousel.animation.json");
		return new ResourceLocation("fnaf_mod", "animations/carouseloff.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CarouselTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "geo/carousel.geo.json");
		return new ResourceLocation("fnaf_mod", "geo/carouseloff.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CarouselTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "textures/block/carousel.png");
		return new ResourceLocation("fnaf_mod", "textures/block/carousel.png");
	}
}
