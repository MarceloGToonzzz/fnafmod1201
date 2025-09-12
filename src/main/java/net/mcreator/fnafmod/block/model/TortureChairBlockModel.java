package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.TortureChairTileEntity;

public class TortureChairBlockModel extends GeoModel<TortureChairTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(TortureChairTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "animations/fazchairleft.animation.json");
		if (blockstate == 2)
			return new ResourceLocation("fnaf_mod", "animations/fazchairright.animation.json");
		return new ResourceLocation("fnaf_mod", "animations/fazchair.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TortureChairTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "geo/fazchairleft.geo.json");
		if (blockstate == 2)
			return new ResourceLocation("fnaf_mod", "geo/fazchairright.geo.json");
		return new ResourceLocation("fnaf_mod", "geo/fazchair.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TortureChairTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "textures/block/fazchair.png");
		if (blockstate == 2)
			return new ResourceLocation("fnaf_mod", "textures/block/fazchair.png");
		return new ResourceLocation("fnaf_mod", "textures/block/fazchair.png");
	}
}
