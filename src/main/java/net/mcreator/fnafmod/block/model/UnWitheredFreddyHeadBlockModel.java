package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.UnWitheredFreddyHeadTileEntity;

public class UnWitheredFreddyHeadBlockModel extends GeoModel<UnWitheredFreddyHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(UnWitheredFreddyHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/unwitheredfreddyhead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnWitheredFreddyHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/unwitheredfreddyhead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnWitheredFreddyHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "textures/block/unwitheredfreddyhead.png");
	}
}
