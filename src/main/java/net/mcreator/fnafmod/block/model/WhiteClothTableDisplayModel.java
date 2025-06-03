package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.WhiteClothTableDisplayItem;

public class WhiteClothTableDisplayModel extends GeoModel<WhiteClothTableDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WhiteClothTableDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/table.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WhiteClothTableDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/table.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WhiteClothTableDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/whiteclothtable10.png");
	}
}
