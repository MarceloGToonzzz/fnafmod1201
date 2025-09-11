package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.BigSecurityDoorDisplayItem;

public class BigSecurityDoorDisplayModel extends GeoModel<BigSecurityDoorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BigSecurityDoorDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/largesecuritydooropen.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigSecurityDoorDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/largesecuritydooropen.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigSecurityDoorDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/ncfast-closingmechanicaldoor.png");
	}
}
