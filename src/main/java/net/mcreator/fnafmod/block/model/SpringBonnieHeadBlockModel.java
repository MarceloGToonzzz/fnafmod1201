package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.SpringBonnieHeadTileEntity;

public class SpringBonnieHeadBlockModel extends GeoModel<SpringBonnieHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpringBonnieHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/springbonniehead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringBonnieHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/springbonniehead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringBonnieHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "textures/block/springbonniehead.png");
	}
}
