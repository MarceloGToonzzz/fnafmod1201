package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.LargeIndustrialDoorTileEntity;

public class LargeIndustrialDoorBlockModel extends GeoModel<LargeIndustrialDoorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LargeIndustrialDoorTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "animations/large_industrial_door_closed.animation.json");
		return new ResourceLocation("fnaf_mod", "animations/large_industrial_door_open.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LargeIndustrialDoorTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "geo/large_industrial_door_closed.geo.json");
		return new ResourceLocation("fnaf_mod", "geo/large_industrial_door_open.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LargeIndustrialDoorTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "textures/block/large_industrial_door.png");
		return new ResourceLocation("fnaf_mod", "textures/block/large_industrial_door.png");
	}
}
