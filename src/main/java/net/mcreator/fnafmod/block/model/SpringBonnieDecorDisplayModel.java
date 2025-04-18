package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.SpringBonnieDecorDisplayItem;

public class SpringBonnieDecorDisplayModel extends GeoModel<SpringBonnieDecorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SpringBonnieDecorDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/floorspringbonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringBonnieDecorDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/floorspringbonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringBonnieDecorDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/floor_spring_bonnie.png");
	}
}
