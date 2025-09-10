package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.FluorescentLightTileEntity;

public class FluorescentLightBlockModel extends GeoModel<FluorescentLightTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FluorescentLightTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "animations/hangingflourescentlights.animation.json");
		return new ResourceLocation("fnaf_mod", "animations/hangingflourescentlights.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FluorescentLightTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "geo/hangingflourescentlights.geo.json");
		return new ResourceLocation("fnaf_mod", "geo/hangingflourescentlights.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FluorescentLightTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "textures/block/hangingflourescentlights.png");
		return new ResourceLocation("fnaf_mod", "textures/block/hangingflourescentlightsoff.png");
	}
}
