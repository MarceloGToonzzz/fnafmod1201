package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.TortureFreddyDisplayItem;

public class TortureFreddyDisplayModel extends GeoModel<TortureFreddyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(TortureFreddyDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/torture_freddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TortureFreddyDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/torture_freddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TortureFreddyDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/shreddy_fazchair.png");
	}
}
