package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.BephDollTileEntity;

public class BephDollBlockModel extends GeoModel<BephDollTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BephDollTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/chibi_beph.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BephDollTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/chibi_beph.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BephDollTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "textures/block/chibibeph.png");
	}
}
