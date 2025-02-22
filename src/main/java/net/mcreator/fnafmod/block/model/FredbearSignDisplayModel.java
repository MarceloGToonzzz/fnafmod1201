package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.FredbearSignDisplayItem;

public class FredbearSignDisplayModel extends GeoModel<FredbearSignDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FredbearSignDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/fredbearsign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredbearSignDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/fredbearsign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredbearSignDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/bear.png");
	}
}
