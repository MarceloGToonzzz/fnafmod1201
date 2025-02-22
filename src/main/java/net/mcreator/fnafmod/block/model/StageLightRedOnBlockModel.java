package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.StageLightRedOnTileEntity;

public class StageLightRedOnBlockModel extends GeoModel<StageLightRedOnTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(StageLightRedOnTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/stagelighton.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StageLightRedOnTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/stagelighton.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StageLightRedOnTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "textures/block/lightred.png");
	}
}
