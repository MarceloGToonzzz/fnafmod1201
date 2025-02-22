package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.ShelfDisplayItem;

public class ShelfDisplayModel extends GeoModel<ShelfDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ShelfDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/shelves.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ShelfDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/shelves.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ShelfDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/shelf.png");
	}
}
