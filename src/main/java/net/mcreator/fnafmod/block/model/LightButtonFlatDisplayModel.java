package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.LightButtonFlatDisplayItem;

public class LightButtonFlatDisplayModel extends GeoModel<LightButtonFlatDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(LightButtonFlatDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/lightbuttonflat.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LightButtonFlatDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/lightbuttonflat.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LightButtonFlatDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/light_button.png");
	}
}
