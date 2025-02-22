package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.FoxyHeadDecorationDisplayItem;

public class FoxyHeadDecorationDisplayModel extends GeoModel<FoxyHeadDecorationDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FoxyHeadDecorationDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/foxyheadprop.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyHeadDecorationDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/foxyheadprop.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyHeadDecorationDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/foxyheaddecor.png");
	}
}
