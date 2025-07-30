package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.BigWhiteDoorTileEntity;

public class BigWhiteDoorBlockModel extends GeoModel<BigWhiteDoorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BigWhiteDoorTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "animations/bigdoor2_open1.animation.json");
		if (blockstate == 2)
			return new ResourceLocation("fnaf_mod", "animations/bigdoor2_open2.animation.json");
		return new ResourceLocation("fnaf_mod", "animations/bigdoor2_closed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigWhiteDoorTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "geo/bigdoor2_open1.geo.json");
		if (blockstate == 2)
			return new ResourceLocation("fnaf_mod", "geo/bigdoor2_open2.geo.json");
		return new ResourceLocation("fnaf_mod", "geo/bigdoor2_closed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigWhiteDoorTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "textures/block/bigdoor2_white.png");
		if (blockstate == 2)
			return new ResourceLocation("fnaf_mod", "textures/block/bigdoor2_white.png");
		return new ResourceLocation("fnaf_mod", "textures/block/bigdoor2_white.png");
	}
}
