package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.DoorButtonTileEntity;

public class DoorButtonBlockModel extends GeoModel<DoorButtonTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DoorButtonTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "animations/doorbutton.animation.json");
		return new ResourceLocation("fnaf_mod", "animations/doorbutton.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DoorButtonTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "geo/doorbutton.geo.json");
		return new ResourceLocation("fnaf_mod", "geo/doorbutton.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DoorButtonTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "textures/block/door_button_active2.png");
		return new ResourceLocation("fnaf_mod", "textures/block/door_button.png");
	}
}
