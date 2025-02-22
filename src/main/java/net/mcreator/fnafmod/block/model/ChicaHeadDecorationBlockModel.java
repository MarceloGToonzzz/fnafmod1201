package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.ChicaHeadDecorationTileEntity;

public class ChicaHeadDecorationBlockModel extends GeoModel<ChicaHeadDecorationTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChicaHeadDecorationTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/chicaheadprop.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaHeadDecorationTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/chicaheadprop.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaHeadDecorationTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "textures/block/chicaheaddecor.png");
	}
}
