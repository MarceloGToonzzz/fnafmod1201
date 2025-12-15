package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.GeneratorRightCreativeDisplayItem;

public class GeneratorRightCreativeDisplayModel extends GeoModel<GeneratorRightCreativeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GeneratorRightCreativeDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/generatorrightcreative.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GeneratorRightCreativeDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/generatorrightcreative.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GeneratorRightCreativeDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/industrial_generator.png");
	}
}
