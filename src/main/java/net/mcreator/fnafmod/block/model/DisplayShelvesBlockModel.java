package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.DisplayShelvesTileEntity;

public class DisplayShelvesBlockModel extends GeoModel<DisplayShelvesTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DisplayShelvesTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "animations/displayshelves.animation.json");
		if (blockstate == 2)
			return new ResourceLocation("fnaf_mod", "animations/displayshelves.animation.json");
		if (blockstate == 3)
			return new ResourceLocation("fnaf_mod", "animations/displayshelves.animation.json");
		if (blockstate == 4)
			return new ResourceLocation("fnaf_mod", "animations/displayshelves.animation.json");
		if (blockstate == 5)
			return new ResourceLocation("fnaf_mod", "animations/displayshelves.animation.json");
		if (blockstate == 6)
			return new ResourceLocation("fnaf_mod", "animations/displayshelves.animation.json");
		if (blockstate == 7)
			return new ResourceLocation("fnaf_mod", "animations/displayshelves.animation.json");
		return new ResourceLocation("fnaf_mod", "animations/displayshelves.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DisplayShelvesTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "geo/displayshelves.geo.json");
		if (blockstate == 2)
			return new ResourceLocation("fnaf_mod", "geo/displayshelves.geo.json");
		if (blockstate == 3)
			return new ResourceLocation("fnaf_mod", "geo/displayshelves.geo.json");
		if (blockstate == 4)
			return new ResourceLocation("fnaf_mod", "geo/displayshelves.geo.json");
		if (blockstate == 5)
			return new ResourceLocation("fnaf_mod", "geo/displayshelves.geo.json");
		if (blockstate == 6)
			return new ResourceLocation("fnaf_mod", "geo/displayshelves.geo.json");
		if (blockstate == 7)
			return new ResourceLocation("fnaf_mod", "geo/displayshelves.geo.json");
		return new ResourceLocation("fnaf_mod", "geo/displayshelves.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DisplayShelvesTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "textures/block/standingshelfsingle.png");
		if (blockstate == 2)
			return new ResourceLocation("fnaf_mod", "textures/block/standingshelfleft.png");
		if (blockstate == 3)
			return new ResourceLocation("fnaf_mod", "textures/block/standingshelfmiddle.png");
		if (blockstate == 4)
			return new ResourceLocation("fnaf_mod", "textures/block/standingshelfright.png");
		if (blockstate == 5)
			return new ResourceLocation("fnaf_mod", "textures/block/wallshelfright.png");
		if (blockstate == 6)
			return new ResourceLocation("fnaf_mod", "textures/block/wallshelfleft.png");
		if (blockstate == 7)
			return new ResourceLocation("fnaf_mod", "textures/block/wallshelfsingle.png");
		return new ResourceLocation("fnaf_mod", "textures/block/standingshelfsingle.png");
	}
}
