package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.UnWitheredFoxyHeadDisplayItem;

public class UnWitheredFoxyHeadDisplayModel extends GeoModel<UnWitheredFoxyHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(UnWitheredFoxyHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/head_unwithered-foxy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnWitheredFoxyHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/head_unwithered-foxy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnWitheredFoxyHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/unwithered-foxy.png");
	}
}
