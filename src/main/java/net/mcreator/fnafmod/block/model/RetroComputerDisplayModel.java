package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.RetroComputerDisplayItem;

public class RetroComputerDisplayModel extends GeoModel<RetroComputerDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RetroComputerDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/retro_computer.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RetroComputerDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/retro_computer.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RetroComputerDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/mpretterm.png");
	}
}
