package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.SpringBonnieDecorTileEntity;

public class SpringBonnieDecorBlockModel extends GeoModel<SpringBonnieDecorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpringBonnieDecorTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/floorspringbonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringBonnieDecorTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/floorspringbonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringBonnieDecorTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "textures/block/floor_spring_bonnie.png");
	}
}
