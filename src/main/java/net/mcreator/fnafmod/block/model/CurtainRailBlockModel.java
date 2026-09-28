package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.CurtainRailTileEntity;

public class CurtainRailBlockModel extends GeoModel<CurtainRailTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CurtainRailTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "animations/curtainrail.animation.json");
		if (blockstate == 2)
			return new ResourceLocation("fnaf_mod", "animations/curtainrail.animation.json");
		return new ResourceLocation("fnaf_mod", "animations/curtainrail.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CurtainRailTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "geo/curtainrail.geo.json");
		if (blockstate == 2)
			return new ResourceLocation("fnaf_mod", "geo/curtainrail.geo.json");
		return new ResourceLocation("fnaf_mod", "geo/curtainrail.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CurtainRailTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "textures/block/curtainrailhalf_purple.png");
		if (blockstate == 2)
			return new ResourceLocation("fnaf_mod", "textures/block/curtainrailfull_purple.png");
		return new ResourceLocation("fnaf_mod", "textures/block/curtainrail_purple.png");
	}
}
