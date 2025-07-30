package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.BigWideDualColourEntranceDoorTileEntity;

public class BigWideDualColourEntranceDoorBlockModel extends GeoModel<BigWideDualColourEntranceDoorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BigWideDualColourEntranceDoorTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "animations/bigwidedoor1_open1.animation.json");
		if (blockstate == 2)
			return new ResourceLocation("fnaf_mod", "animations/bigwidedoor1_open2.animation.json");
		return new ResourceLocation("fnaf_mod", "animations/bigwidedoor1_closed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigWideDualColourEntranceDoorTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "geo/bigwidedoor1_open1.geo.json");
		if (blockstate == 2)
			return new ResourceLocation("fnaf_mod", "geo/bigwidedoor1_open2.geo.json");
		return new ResourceLocation("fnaf_mod", "geo/bigwidedoor1_closed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigWideDualColourEntranceDoorTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "textures/block/bigwidedoor1_dualcolored.png");
		if (blockstate == 2)
			return new ResourceLocation("fnaf_mod", "textures/block/bigwidedoor1_dualcolored.png");
		return new ResourceLocation("fnaf_mod", "textures/block/bigwidedoor1_dualcolored.png");
	}
}
