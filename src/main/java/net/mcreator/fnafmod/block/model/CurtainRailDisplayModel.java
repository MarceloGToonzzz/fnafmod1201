package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.CurtainRailDisplayItem;

public class CurtainRailDisplayModel extends GeoModel<CurtainRailDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CurtainRailDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/curtainrail.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CurtainRailDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/curtainrail.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CurtainRailDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/curtainrail_purple.png");
	}
}
