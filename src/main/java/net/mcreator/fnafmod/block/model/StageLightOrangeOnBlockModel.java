package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.StageLightOrangeOnTileEntity;

public class StageLightOrangeOnBlockModel extends GeoModel<StageLightOrangeOnTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(StageLightOrangeOnTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/stagelighton.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StageLightOrangeOnTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/stagelighton.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StageLightOrangeOnTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "textures/block/lightonorange.png");
	}
}
