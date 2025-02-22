package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.ShelfTileEntity;

public class ShelfBlockModel extends GeoModel<ShelfTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ShelfTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/shelves.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ShelfTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/shelves.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ShelfTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "textures/block/shelf.png");
	}
}
