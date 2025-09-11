package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.GarageDoorTileEntity;

public class GarageDoorBlockModel extends GeoModel<GarageDoorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GarageDoorTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "animations/garagedoor_open.animation.json");
		return new ResourceLocation("fnaf_mod", "animations/garagedoor_closed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GarageDoorTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "geo/garagedoor_open.geo.json");
		return new ResourceLocation("fnaf_mod", "geo/garagedoor_closed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GarageDoorTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "textures/block/garage_door.png");
		return new ResourceLocation("fnaf_mod", "textures/block/garage_door.png");
	}
}
