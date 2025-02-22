package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.FoxyHeadDisplayItem;

public class FoxyHeadDisplayModel extends GeoModel<FoxyHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FoxyHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/foxyhead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/foxyhead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/foxyhead.png");
	}
}
