package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.StageLightGreenOnTileEntity;

public class StageLightGreenOnBlockModel extends GeoModel<StageLightGreenOnTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(StageLightGreenOnTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/stagelighton.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StageLightGreenOnTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/stagelighton.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StageLightGreenOnTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "textures/block/lighton.png");
	}
}
