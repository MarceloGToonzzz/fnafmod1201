package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.ProtonsPlushRatDisplayItem;

public class ProtonsPlushRatDisplayModel extends GeoModel<ProtonsPlushRatDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ProtonsPlushRatDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/protons_rat.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ProtonsPlushRatDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/protons_rat.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ProtonsPlushRatDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/protons_rat.png");
	}
}
