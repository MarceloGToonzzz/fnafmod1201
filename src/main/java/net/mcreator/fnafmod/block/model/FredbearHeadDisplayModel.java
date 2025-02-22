package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.FredbearHeadDisplayItem;

public class FredbearHeadDisplayModel extends GeoModel<FredbearHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FredbearHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/fredbearhead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredbearHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/fredbearhead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredbearHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/fredbearhead.png");
	}
}
