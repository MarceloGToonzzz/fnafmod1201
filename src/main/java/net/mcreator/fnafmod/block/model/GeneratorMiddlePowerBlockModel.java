package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.GeneratorMiddlePowerTileEntity;

public class GeneratorMiddlePowerBlockModel extends GeoModel<GeneratorMiddlePowerTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GeneratorMiddlePowerTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/generatormiddlepower.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GeneratorMiddlePowerTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/generatormiddlepower.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GeneratorMiddlePowerTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "textures/block/industrial_generator.png");
	}
}
