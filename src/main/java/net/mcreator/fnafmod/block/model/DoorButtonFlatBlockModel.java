package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.DoorButtonFlatTileEntity;

public class DoorButtonFlatBlockModel extends GeoModel<DoorButtonFlatTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DoorButtonFlatTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "animations/doorbuttonflat.animation.json");
		return new ResourceLocation("fnaf_mod", "animations/doorbuttonflat.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DoorButtonFlatTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "geo/doorbuttonflat.geo.json");
		return new ResourceLocation("fnaf_mod", "geo/doorbuttonflat.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DoorButtonFlatTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "textures/block/door_button_active2.png");
		return new ResourceLocation("fnaf_mod", "textures/block/door_button.png");
	}
}
