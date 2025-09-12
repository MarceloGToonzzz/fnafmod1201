package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.AlternateGarageDoorTileEntity;

public class AlternateGarageDoorBlockModel extends GeoModel<AlternateGarageDoorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AlternateGarageDoorTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "animations/alt_garage_door_open.animation.json");
		return new ResourceLocation("fnaf_mod", "animations/alt_garage_door_closed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AlternateGarageDoorTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "geo/alt_garage_door_open.geo.json");
		return new ResourceLocation("fnaf_mod", "geo/alt_garage_door_closed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AlternateGarageDoorTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "textures/block/alt_garage_door.png");
		return new ResourceLocation("fnaf_mod", "textures/block/alt_garage_door.png");
	}
}
