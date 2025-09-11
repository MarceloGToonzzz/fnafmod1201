package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.BigHeavyDutyDoorDisplayItem;

public class BigHeavyDutyDoorDisplayModel extends GeoModel<BigHeavyDutyDoorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BigHeavyDutyDoorDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/heavy_duty_door_open.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigHeavyDutyDoorDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/heavy_duty_door_open.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigHeavyDutyDoorDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/heavy_duty_door.png");
	}
}
