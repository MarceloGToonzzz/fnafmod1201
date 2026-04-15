package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.GenPercentDisplayItem;

public class GenPercentDisplayModel extends GeoModel<GenPercentDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GenPercentDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/doorbutton.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GenPercentDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/doorbutton.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GenPercentDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/door_button.png");
	}
}
