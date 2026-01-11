package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.GeneratorLeftBreakerDisplayItem;

public class GeneratorLeftBreakerDisplayModel extends GeoModel<GeneratorLeftBreakerDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GeneratorLeftBreakerDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/generatorleftbreaker.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GeneratorLeftBreakerDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/generatorleftbreaker.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GeneratorLeftBreakerDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/industrial_generator.png");
	}
}
