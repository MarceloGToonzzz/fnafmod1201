package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.GenpPercentDisplayItem;

public class GenpPercentDisplayModel extends GeoModel<GenpPercentDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GenpPercentDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/doorbutton.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GenpPercentDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/doorbutton.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GenpPercentDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/door_button.png");
	}
}
