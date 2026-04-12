package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.PizzaToppingsDisplayItem;

public class PizzaToppingsDisplayModel extends GeoModel<PizzaToppingsDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PizzaToppingsDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/foxyhead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzaToppingsDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/foxyhead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzaToppingsDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/foxyhead.png");
	}
}
