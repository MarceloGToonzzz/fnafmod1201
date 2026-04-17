package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.LightButtonTileEntity;

public class LightButtonBlockModel extends GeoModel<LightButtonTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LightButtonTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "animations/lightbutton.animation.json");
		return new ResourceLocation("fnaf_mod", "animations/lightbutton.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LightButtonTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "geo/lightbutton.geo.json");
		return new ResourceLocation("fnaf_mod", "geo/lightbutton.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LightButtonTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "textures/block/light_button_active2.png");
		return new ResourceLocation("fnaf_mod", "textures/block/light_button.png");
	}
}
