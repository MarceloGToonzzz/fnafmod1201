package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.PurpleStarTableDisplayItem;

public class PurpleStarTableDisplayModel extends GeoModel<PurpleStarTableDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PurpleStarTableDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/table.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PurpleStarTableDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/table.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PurpleStarTableDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/purplestartable10.png");
	}
}
