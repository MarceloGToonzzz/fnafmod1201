package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.BonnieHeadDisplayItem;

public class BonnieHeadDisplayModel extends GeoModel<BonnieHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BonnieHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/bonniehead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/bonniehead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/bonniehead.png");
	}
}
