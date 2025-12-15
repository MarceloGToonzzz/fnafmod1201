package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.GeneratorLeftBreakerTileEntity;

public class GeneratorLeftBreakerBlockModel extends GeoModel<GeneratorLeftBreakerTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GeneratorLeftBreakerTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/generatorleftbreaker.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GeneratorLeftBreakerTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/generatorleftbreaker.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GeneratorLeftBreakerTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "textures/block/industrial_generator.png");
	}
}
