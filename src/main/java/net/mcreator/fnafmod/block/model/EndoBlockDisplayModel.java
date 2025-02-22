package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.EndoBlockDisplayItem;

public class EndoBlockDisplayModel extends GeoModel<EndoBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(EndoBlockDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/endoblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EndoBlockDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/endoblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EndoBlockDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/endo01.png");
	}
}
