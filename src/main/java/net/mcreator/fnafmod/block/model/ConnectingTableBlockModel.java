package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.ConnectingTableTileEntity;

public class ConnectingTableBlockModel extends GeoModel<ConnectingTableTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ConnectingTableTileEntity animatable) {
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
	public ResourceLocation getModelResource(ConnectingTableTileEntity animatable) {
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
	public ResourceLocation getTextureResource(ConnectingTableTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "textures/block/connectingtable1.png");
		if (blockstate == 2)
			return new ResourceLocation("fnaf_mod", "textures/block/connectingtable5.png");
		if (blockstate == 3)
			return new ResourceLocation("fnaf_mod", "textures/block/connectingtable3.png");
		if (blockstate == 4)
			return new ResourceLocation("fnaf_mod", "textures/block/connectingtable5.png");
		if (blockstate == 5)
			return new ResourceLocation("fnaf_mod", "textures/block/connectingtable5.png");
		if (blockstate == 6)
			return new ResourceLocation("fnaf_mod", "textures/block/connectingtable5.png");
		if (blockstate == 7)
			return new ResourceLocation("fnaf_mod", "textures/block/connectingtable7.png");
		if (blockstate == 8)
			return new ResourceLocation("fnaf_mod", "textures/block/connectingtable5.png");
		if (blockstate == 9)
			return new ResourceLocation("fnaf_mod", "textures/block/connectingtable9.png");
		if (blockstate == 10)
			return new ResourceLocation("fnaf_mod", "textures/block/connectingtable.png");
		if (blockstate == 11)
			return new ResourceLocation("fnaf_mod", "textures/block/connectingtable11.png");
		if (blockstate == 12)
			return new ResourceLocation("fnaf_mod", "textures/block/connectingtable5.png");
		if (blockstate == 13)
			return new ResourceLocation("fnaf_mod", "textures/block/connectingtable13.png");
		if (blockstate == 14)
			return new ResourceLocation("fnaf_mod", "textures/block/connectingtable14.png");
		if (blockstate == 15)
			return new ResourceLocation("fnaf_mod", "textures/block/connectingtable15.png");
		if (blockstate == 16)
			return new ResourceLocation("fnaf_mod", "textures/block/connectingtable16.png");
		return new ResourceLocation("fnaf_mod", "textures/block/connectingtable.png");
	}
}
