package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.FireAxeBlockDisplayItem;

public class FireAxeBlockDisplayModel extends GeoModel<FireAxeBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FireAxeBlockDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/fire_axe.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FireAxeBlockDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/fire_axe.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FireAxeBlockDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/fire_axe.png");
	}
}
