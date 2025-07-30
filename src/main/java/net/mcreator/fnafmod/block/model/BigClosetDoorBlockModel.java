package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.BigClosetDoorTileEntity;

public class BigClosetDoorBlockModel extends GeoModel<BigClosetDoorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BigClosetDoorTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "animations/bigclosetdoor_open.animation.json");
		return new ResourceLocation("fnaf_mod", "animations/bigclosetdoor_closed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigClosetDoorTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "geo/bigclosetdoor_open.geo.json");
		return new ResourceLocation("fnaf_mod", "geo/bigclosetdoor_closed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigClosetDoorTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "textures/block/bigclosetdoor.png");
		return new ResourceLocation("fnaf_mod", "textures/block/bigclosetdoor.png");
	}
}
