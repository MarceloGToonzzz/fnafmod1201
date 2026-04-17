package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.LightButtonDisplayItem;

public class LightButtonDisplayModel extends GeoModel<LightButtonDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(LightButtonDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/lightbutton.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LightButtonDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/lightbutton.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LightButtonDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/light_button.png");
	}
}
