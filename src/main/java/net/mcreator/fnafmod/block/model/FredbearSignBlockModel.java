package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.FredbearSignTileEntity;

public class FredbearSignBlockModel extends GeoModel<FredbearSignTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FredbearSignTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/fredbearsign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredbearSignTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/fredbearsign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredbearSignTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "textures/block/bear.png");
	}
}
