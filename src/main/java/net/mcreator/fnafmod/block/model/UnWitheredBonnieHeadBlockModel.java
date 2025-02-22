package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.UnWitheredBonnieHeadTileEntity;

public class UnWitheredBonnieHeadBlockModel extends GeoModel<UnWitheredBonnieHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(UnWitheredBonnieHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/unwitheredbonniehead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnWitheredBonnieHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/unwitheredbonniehead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnWitheredBonnieHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "textures/block/unwitheredbonniehead.png");
	}
}
