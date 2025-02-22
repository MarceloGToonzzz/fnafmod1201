package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.TrashCanDisplayItem;

public class TrashCanDisplayModel extends GeoModel<TrashCanDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(TrashCanDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/trash_can.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrashCanDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/trash_can.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrashCanDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/trash_can.png");
	}
}
