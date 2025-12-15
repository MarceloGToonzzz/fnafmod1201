package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.GeneratorMiddlePowerDisplayItem;

public class GeneratorMiddlePowerDisplayModel extends GeoModel<GeneratorMiddlePowerDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GeneratorMiddlePowerDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/generatormiddlepower.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GeneratorMiddlePowerDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/generatormiddlepower.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GeneratorMiddlePowerDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/industrial_generator.png");
	}
}
