package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.RetroComputerTileEntity;

public class RetroComputerBlockModel extends GeoModel<RetroComputerTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RetroComputerTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/retro_computer.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RetroComputerTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/retro_computer.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RetroComputerTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "textures/block/mpretterm.png");
	}
}
