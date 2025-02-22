package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.UnWitheredFoxyHeadTileEntity;

public class UnWitheredFoxyHeadBlockModel extends GeoModel<UnWitheredFoxyHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(UnWitheredFoxyHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/unwitheredfoxyhead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnWitheredFoxyHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/unwitheredfoxyhead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnWitheredFoxyHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "textures/block/unwitheredfoxyhead.png");
	}
}
