package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.BigRedDoorTileEntity;

public class BigRedDoorBlockModel extends GeoModel<BigRedDoorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BigRedDoorTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "animations/bigdoor1_open1.animation.json");
		if (blockstate == 2)
			return new ResourceLocation("fnaf_mod", "animations/bigdoor1_open2.animation.json");
		return new ResourceLocation("fnaf_mod", "animations/bigdoor1_closed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigRedDoorTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "geo/bigdoor1_open1.geo.json");
		if (blockstate == 2)
			return new ResourceLocation("fnaf_mod", "geo/bigdoor1_open2.geo.json");
		return new ResourceLocation("fnaf_mod", "geo/bigdoor1_closed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigRedDoorTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "textures/block/bigdoor1_establishment.png");
		if (blockstate == 2)
			return new ResourceLocation("fnaf_mod", "textures/block/bigdoor1_establishment.png");
		return new ResourceLocation("fnaf_mod", "textures/block/bigdoor1_establishment.png");
	}
}
