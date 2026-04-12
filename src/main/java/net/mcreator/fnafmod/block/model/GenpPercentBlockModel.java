package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.GenpPercentTileEntity;

public class GenpPercentBlockModel extends GeoModel<GenpPercentTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GenpPercentTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "animations/doorbutton.animation.json");
		return new ResourceLocation("fnaf_mod", "animations/doorbutton.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GenpPercentTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "geo/doorbutton.geo.json");
		return new ResourceLocation("fnaf_mod", "geo/doorbutton.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GenpPercentTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "textures/block/door_button_active2.png");
		return new ResourceLocation("fnaf_mod", "textures/block/door_button.png");
	}
}
