package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.DynamicCurtainDisplayItem;

public class DynamicCurtainDisplayModel extends GeoModel<DynamicCurtainDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DynamicCurtainDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/dynamiccurtain.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DynamicCurtainDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/dynamiccurtain.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DynamicCurtainDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/dynamiccurtain_purple.png");
	}
}
