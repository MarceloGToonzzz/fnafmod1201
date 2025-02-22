package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.VassDollDisplayItem;

public class VassDollDisplayModel extends GeoModel<VassDollDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(VassDollDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/vassdoll.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(VassDollDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/vassdoll.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(VassDollDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/vassdoll.png");
	}
}
