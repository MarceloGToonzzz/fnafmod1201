package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.ModularLightFlatDisplayItem;

public class ModularLightFlatDisplayModel extends GeoModel<ModularLightFlatDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ModularLightFlatDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/modularlightsflat.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ModularLightFlatDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/modularlightsflat.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ModularLightFlatDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/modularlight0.png");
	}
}
