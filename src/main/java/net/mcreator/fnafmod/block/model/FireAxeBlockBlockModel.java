package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.FireAxeBlockTileEntity;

public class FireAxeBlockBlockModel extends GeoModel<FireAxeBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FireAxeBlockTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/fire_axe.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FireAxeBlockTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/fire_axe.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FireAxeBlockTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "textures/block/fire_axe.png");
	}
}
