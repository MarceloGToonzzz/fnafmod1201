package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.TortureChairDisplayItem;

public class TortureChairDisplayModel extends GeoModel<TortureChairDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(TortureChairDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/fazchair.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TortureChairDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/fazchair.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TortureChairDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/fazchair.png");
	}
}
