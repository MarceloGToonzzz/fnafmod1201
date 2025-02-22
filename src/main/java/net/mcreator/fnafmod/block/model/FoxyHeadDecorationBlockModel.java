package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.FoxyHeadDecorationTileEntity;

public class FoxyHeadDecorationBlockModel extends GeoModel<FoxyHeadDecorationTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FoxyHeadDecorationTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/foxyheadprop.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyHeadDecorationTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/foxyheadprop.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyHeadDecorationTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "textures/block/foxyheaddecor.png");
	}
}
