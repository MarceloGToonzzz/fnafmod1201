package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.GenPercentTileEntity;

public class GenPercentBlockModel extends GeoModel<GenPercentTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GenPercentTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "animations/genpercentage.animation.json");
		return new ResourceLocation("fnaf_mod", "animations/genpercentage.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GenPercentTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "geo/genpercentage.geo.json");
		return new ResourceLocation("fnaf_mod", "geo/genpercentage.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GenPercentTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "textures/block/blueprint_tiles.png");
		return new ResourceLocation("fnaf_mod", "textures/block/diagonal_tiles.png");
	}
}
