package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.TortureFreddyTileEntity;

public class TortureFreddyBlockModel extends GeoModel<TortureFreddyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(TortureFreddyTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "animations/torture_freddy_left.animation.json");
		if (blockstate == 2)
			return new ResourceLocation("fnaf_mod", "animations/torture_freddy_right.animation.json");
		return new ResourceLocation("fnaf_mod", "animations/torture_freddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TortureFreddyTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "geo/torture_freddy_left.geo.json");
		if (blockstate == 2)
			return new ResourceLocation("fnaf_mod", "geo/torture_freddy_right.geo.json");
		return new ResourceLocation("fnaf_mod", "geo/torture_freddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TortureFreddyTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "textures/block/shreddy_fazchair.png");
		if (blockstate == 2)
			return new ResourceLocation("fnaf_mod", "textures/block/shreddy_fazchair.png");
		return new ResourceLocation("fnaf_mod", "textures/block/shreddy_fazchair.png");
	}
}
