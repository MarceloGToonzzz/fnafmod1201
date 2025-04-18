package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.FredbearHeadTileEntity;

public class FredbearHeadBlockModel extends GeoModel<FredbearHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FredbearHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/fredbearhead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredbearHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/fredbearhead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredbearHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "textures/block/fredbearhead.png");
	}
}
