package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.LargeIndustrialDoorDisplayItem;

public class LargeIndustrialDoorDisplayModel extends GeoModel<LargeIndustrialDoorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(LargeIndustrialDoorDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/large_industrial_door_open.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LargeIndustrialDoorDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/large_industrial_door_open.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LargeIndustrialDoorDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/large_industrial_door.png");
	}
}
