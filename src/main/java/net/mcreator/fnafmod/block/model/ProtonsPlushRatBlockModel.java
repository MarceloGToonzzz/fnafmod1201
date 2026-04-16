package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.ProtonsPlushRatTileEntity;

public class ProtonsPlushRatBlockModel extends GeoModel<ProtonsPlushRatTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ProtonsPlushRatTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/protons_rat.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ProtonsPlushRatTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/protons_rat.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ProtonsPlushRatTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "textures/block/protons_rat.png");
	}
}
