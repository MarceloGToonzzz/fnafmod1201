package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.MeshTrashCanTileEntity;

public class MeshTrashCanBlockModel extends GeoModel<MeshTrashCanTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(MeshTrashCanTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/mesh_trash_can.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MeshTrashCanTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/mesh_trash_can.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MeshTrashCanTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "textures/block/bin.png");
	}
}
