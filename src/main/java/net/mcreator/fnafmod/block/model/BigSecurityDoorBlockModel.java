package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.BigSecurityDoorTileEntity;

public class BigSecurityDoorBlockModel extends GeoModel<BigSecurityDoorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BigSecurityDoorTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "animations/largesecuritydoorclosed.animation.json");
		return new ResourceLocation("fnaf_mod", "animations/largesecuritydooropen.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigSecurityDoorTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "geo/largesecuritydoorclosed.geo.json");
		return new ResourceLocation("fnaf_mod", "geo/largesecuritydooropen.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigSecurityDoorTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "textures/block/ncfast-closingmechanicaldoor.png");
		return new ResourceLocation("fnaf_mod", "textures/block/ncfast-closingmechanicaldoor.png");
	}
}
