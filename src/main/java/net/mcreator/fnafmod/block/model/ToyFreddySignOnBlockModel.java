package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.ToyFreddySignOnTileEntity;

public class ToyFreddySignOnBlockModel extends GeoModel<ToyFreddySignOnTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyFreddySignOnTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/toyfreddyjr.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFreddySignOnTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/toyfreddyjr.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFreddySignOnTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "textures/block/fnaf_jr_lit.png");
	}
}
