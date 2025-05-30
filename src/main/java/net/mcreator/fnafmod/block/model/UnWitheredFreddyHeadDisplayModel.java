package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.UnWitheredFreddyHeadDisplayItem;

public class UnWitheredFreddyHeadDisplayModel extends GeoModel<UnWitheredFreddyHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(UnWitheredFreddyHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/unwitheredfreddyhead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnWitheredFreddyHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/unwitheredfreddyhead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnWitheredFreddyHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/unwitheredfreddyhead.png");
	}
}
