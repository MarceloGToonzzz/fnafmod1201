package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.BephDollDisplayItem;

public class BephDollDisplayModel extends GeoModel<BephDollDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BephDollDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/chibi_beph.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BephDollDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/chibi_beph.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BephDollDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/chibibeph.png");
	}
}
