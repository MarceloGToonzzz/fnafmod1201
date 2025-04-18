package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.StageLightRedOnDisplayItem;

public class StageLightRedOnDisplayModel extends GeoModel<StageLightRedOnDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StageLightRedOnDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/stagelighton.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StageLightRedOnDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/stagelighton.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StageLightRedOnDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/lightred.png");
	}
}
