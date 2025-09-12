package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.IndustrialFanDisplayItem;

public class IndustrialFanDisplayModel extends GeoModel<IndustrialFanDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(IndustrialFanDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/industrial_fan_0.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IndustrialFanDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/industrial_fan_0.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IndustrialFanDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/industrial_fan.png");
	}
}
