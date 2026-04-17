package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.LightButtonFlatTileEntity;

public class LightButtonFlatBlockModel extends GeoModel<LightButtonFlatTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LightButtonFlatTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "animations/lightbuttonflat.animation.json");
		return new ResourceLocation("fnaf_mod", "animations/lightbuttonflat.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LightButtonFlatTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "geo/lightbuttonflat.geo.json");
		return new ResourceLocation("fnaf_mod", "geo/lightbuttonflat.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LightButtonFlatTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "textures/block/light_button_active2.png");
		return new ResourceLocation("fnaf_mod", "textures/block/light_button.png");
	}
}
