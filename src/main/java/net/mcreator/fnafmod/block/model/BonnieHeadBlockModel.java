package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.BonnieHeadTileEntity;

public class BonnieHeadBlockModel extends GeoModel<BonnieHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BonnieHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/bonniehead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/bonniehead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "textures/block/bonniehead.png");
	}
}
