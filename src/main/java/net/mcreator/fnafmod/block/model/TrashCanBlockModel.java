package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.TrashCanTileEntity;

public class TrashCanBlockModel extends GeoModel<TrashCanTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(TrashCanTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/trash_can.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrashCanTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/trash_can.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrashCanTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "textures/block/trash_can.png");
	}
}
