package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.UnWitheredChicaHeadDisplayItem;

public class UnWitheredChicaHeadDisplayModel extends GeoModel<UnWitheredChicaHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(UnWitheredChicaHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/unwitheredchicahead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnWitheredChicaHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/unwitheredchicahead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnWitheredChicaHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/unwitheredchicahead.png");
	}
}
