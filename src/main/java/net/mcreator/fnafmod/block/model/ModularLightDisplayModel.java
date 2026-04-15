package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.ModularLightDisplayItem;

public class ModularLightDisplayModel extends GeoModel<ModularLightDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ModularLightDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/modularlights.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ModularLightDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/modularlights.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ModularLightDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/modularlight0.png");
	}
}
