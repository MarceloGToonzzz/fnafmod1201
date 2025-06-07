package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.PurpleStarTableTileEntity;

public class PurpleStarTableBlockModel extends GeoModel<PurpleStarTableTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PurpleStarTableTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "animations/table.animation.json");
		if (blockstate == 2)
			return new ResourceLocation("fnaf_mod", "animations/table.animation.json");
		if (blockstate == 3)
			return new ResourceLocation("fnaf_mod", "animations/table.animation.json");
		if (blockstate == 4)
			return new ResourceLocation("fnaf_mod", "animations/table.animation.json");
		if (blockstate == 5)
			return new ResourceLocation("fnaf_mod", "animations/table.animation.json");
		if (blockstate == 6)
			return new ResourceLocation("fnaf_mod", "animations/table.animation.json");
		if (blockstate == 7)
			return new ResourceLocation("fnaf_mod", "animations/table.animation.json");
		if (blockstate == 8)
			return new ResourceLocation("fnaf_mod", "animations/table.animation.json");
		if (blockstate == 9)
			return new ResourceLocation("fnaf_mod", "animations/table.animation.json");
		if (blockstate == 10)
			return new ResourceLocation("fnaf_mod", "animations/table.animation.json");
		if (blockstate == 11)
			return new ResourceLocation("fnaf_mod", "animations/table.animation.json");
		if (blockstate == 12)
			return new ResourceLocation("fnaf_mod", "animations/table.animation.json");
		if (blockstate == 13)
			return new ResourceLocation("fnaf_mod", "animations/table.animation.json");
		if (blockstate == 14)
			return new ResourceLocation("fnaf_mod", "animations/table.animation.json");
		if (blockstate == 15)
			return new ResourceLocation("fnaf_mod", "animations/table.animation.json");
		if (blockstate == 16)
			return new ResourceLocation("fnaf_mod", "animations/table.animation.json");
		return new ResourceLocation("fnaf_mod", "animations/table.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PurpleStarTableTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "geo/table.geo.json");
		if (blockstate == 2)
			return new ResourceLocation("fnaf_mod", "geo/table.geo.json");
		if (blockstate == 3)
			return new ResourceLocation("fnaf_mod", "geo/table.geo.json");
		if (blockstate == 4)
			return new ResourceLocation("fnaf_mod", "geo/table.geo.json");
		if (blockstate == 5)
			return new ResourceLocation("fnaf_mod", "geo/table.geo.json");
		if (blockstate == 6)
			return new ResourceLocation("fnaf_mod", "geo/table.geo.json");
		if (blockstate == 7)
			return new ResourceLocation("fnaf_mod", "geo/table.geo.json");
		if (blockstate == 8)
			return new ResourceLocation("fnaf_mod", "geo/table.geo.json");
		if (blockstate == 9)
			return new ResourceLocation("fnaf_mod", "geo/table.geo.json");
		if (blockstate == 10)
			return new ResourceLocation("fnaf_mod", "geo/table.geo.json");
		if (blockstate == 11)
			return new ResourceLocation("fnaf_mod", "geo/table.geo.json");
		if (blockstate == 12)
			return new ResourceLocation("fnaf_mod", "geo/table.geo.json");
		if (blockstate == 13)
			return new ResourceLocation("fnaf_mod", "geo/table.geo.json");
		if (blockstate == 14)
			return new ResourceLocation("fnaf_mod", "geo/table.geo.json");
		if (blockstate == 15)
			return new ResourceLocation("fnaf_mod", "geo/table.geo.json");
		if (blockstate == 16)
			return new ResourceLocation("fnaf_mod", "geo/table.geo.json");
		return new ResourceLocation("fnaf_mod", "geo/table.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PurpleStarTableTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "textures/block/purplestartable1.png");
		if (blockstate == 2)
			return new ResourceLocation("fnaf_mod", "textures/block/purplestartable2.png");
		if (blockstate == 3)
			return new ResourceLocation("fnaf_mod", "textures/block/purplestartable3.png");
		if (blockstate == 4)
			return new ResourceLocation("fnaf_mod", "textures/block/purplestartable4.png");
		if (blockstate == 5)
			return new ResourceLocation("fnaf_mod", "textures/block/purplestartable5.png");
		if (blockstate == 6)
			return new ResourceLocation("fnaf_mod", "textures/block/purplestartable6.png");
		if (blockstate == 7)
			return new ResourceLocation("fnaf_mod", "textures/block/purplestartable7.png");
		if (blockstate == 8)
			return new ResourceLocation("fnaf_mod", "textures/block/purplestartable8.png");
		if (blockstate == 9)
			return new ResourceLocation("fnaf_mod", "textures/block/purplestartable9.png");
		if (blockstate == 10)
			return new ResourceLocation("fnaf_mod", "textures/block/purplestartable10.png");
		if (blockstate == 11)
			return new ResourceLocation("fnaf_mod", "textures/block/purplestartable11.png");
		if (blockstate == 12)
			return new ResourceLocation("fnaf_mod", "textures/block/purplestartable12.png");
		if (blockstate == 13)
			return new ResourceLocation("fnaf_mod", "textures/block/purplestartable13.png");
		if (blockstate == 14)
			return new ResourceLocation("fnaf_mod", "textures/block/purplestartable14.png");
		if (blockstate == 15)
			return new ResourceLocation("fnaf_mod", "textures/block/purplestartable15.png");
		if (blockstate == 16)
			return new ResourceLocation("fnaf_mod", "textures/block/purplestartable16.png");
		return new ResourceLocation("fnaf_mod", "textures/block/purplestartable10.png");
	}
}
