package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.DisplayMonitorDisplayItem;

public class DisplayMonitorDisplayModel extends GeoModel<DisplayMonitorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DisplayMonitorDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/displaymonitor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DisplayMonitorDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/displaymonitor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DisplayMonitorDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/screen.png");
	}
}
