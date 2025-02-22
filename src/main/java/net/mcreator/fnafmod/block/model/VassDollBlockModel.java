package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.VassDollTileEntity;

public class VassDollBlockModel extends GeoModel<VassDollTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(VassDollTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/vassdoll.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(VassDollTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/vassdoll.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(VassDollTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "textures/block/vassdoll.png");
	}
}
