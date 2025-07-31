package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.UnWitheredChicaHeadTileEntity;

public class UnWitheredChicaHeadBlockModel extends GeoModel<UnWitheredChicaHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(UnWitheredChicaHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/head_unwithered-chica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnWitheredChicaHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/head_unwithered-chica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnWitheredChicaHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "textures/block/unwithered-chica.png");
	}
}
