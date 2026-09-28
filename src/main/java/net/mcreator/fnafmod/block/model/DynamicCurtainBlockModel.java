package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.DynamicCurtainTileEntity;

public class DynamicCurtainBlockModel extends GeoModel<DynamicCurtainTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DynamicCurtainTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "animations/dynamiccurtain.animation.json");
		return new ResourceLocation("fnaf_mod", "animations/dynamiccurtain.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DynamicCurtainTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "geo/dynamiccurtain.geo.json");
		return new ResourceLocation("fnaf_mod", "geo/dynamiccurtain.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DynamicCurtainTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "textures/block/dynamiccurtainhalf_purple.png");
		return new ResourceLocation("fnaf_mod", "textures/block/dynamiccurtain_purple.png");
	}
}
