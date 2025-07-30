package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.BigWideRedEntranceDoorTileEntity;

public class BigWideRedEntranceDoorBlockModel extends GeoModel<BigWideRedEntranceDoorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BigWideRedEntranceDoorTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "animations/bigwidedoor1_open1.animation.json");
		if (blockstate == 2)
			return new ResourceLocation("fnaf_mod", "animations/bigwidedoor1_open2.animation.json");
		return new ResourceLocation("fnaf_mod", "animations/bigwidedoor1_closed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigWideRedEntranceDoorTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "geo/bigwidedoor1_open1.geo.json");
		if (blockstate == 2)
			return new ResourceLocation("fnaf_mod", "geo/bigwidedoor1_open2.geo.json");
		return new ResourceLocation("fnaf_mod", "geo/bigwidedoor1_closed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigWideRedEntranceDoorTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "textures/block/bigwidedoor1_redentrance.png");
		if (blockstate == 2)
			return new ResourceLocation("fnaf_mod", "textures/block/bigwidedoor1_redentrance.png");
		return new ResourceLocation("fnaf_mod", "textures/block/bigwidedoor1_redentrance.png");
	}
}
