package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.BigHeavyDutyDoorTileEntity;

public class BigHeavyDutyDoorBlockModel extends GeoModel<BigHeavyDutyDoorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BigHeavyDutyDoorTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "animations/heavy_duty_door_closed.animation.json");
		return new ResourceLocation("fnaf_mod", "animations/heavy_duty_door_open.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigHeavyDutyDoorTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "geo/heavy_duty_door_closed.geo.json");
		return new ResourceLocation("fnaf_mod", "geo/heavy_duty_door_open.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigHeavyDutyDoorTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "textures/block/heavy_duty_door.png");
		return new ResourceLocation("fnaf_mod", "textures/block/heavy_duty_door.png");
	}
}
