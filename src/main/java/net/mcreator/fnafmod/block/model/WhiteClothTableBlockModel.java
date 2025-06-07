package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.WhiteClothTableTileEntity;

public class WhiteClothTableBlockModel extends GeoModel<WhiteClothTableTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WhiteClothTableTileEntity animatable) {
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
	public ResourceLocation getModelResource(WhiteClothTableTileEntity animatable) {
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
	public ResourceLocation getTextureResource(WhiteClothTableTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "textures/block/whiteclothtable1.png");
		if (blockstate == 2)
			return new ResourceLocation("fnaf_mod", "textures/block/whiteclothtable2.png");
		if (blockstate == 3)
			return new ResourceLocation("fnaf_mod", "textures/block/whiteclothtable3.png");
		if (blockstate == 4)
			return new ResourceLocation("fnaf_mod", "textures/block/whiteclothtable4.png");
		if (blockstate == 5)
			return new ResourceLocation("fnaf_mod", "textures/block/whiteclothtable5.png");
		if (blockstate == 6)
			return new ResourceLocation("fnaf_mod", "textures/block/whiteclothtable6.png");
		if (blockstate == 7)
			return new ResourceLocation("fnaf_mod", "textures/block/whiteclothtable7.png");
		if (blockstate == 8)
			return new ResourceLocation("fnaf_mod", "textures/block/whiteclothtable8.png");
		if (blockstate == 9)
			return new ResourceLocation("fnaf_mod", "textures/block/whiteclothtable9.png");
		if (blockstate == 10)
			return new ResourceLocation("fnaf_mod", "textures/block/whiteclothtable10.png");
		if (blockstate == 11)
			return new ResourceLocation("fnaf_mod", "textures/block/whiteclothtable11.png");
		if (blockstate == 12)
			return new ResourceLocation("fnaf_mod", "textures/block/whiteclothtable12.png");
		if (blockstate == 13)
			return new ResourceLocation("fnaf_mod", "textures/block/whiteclothtable13.png");
		if (blockstate == 14)
			return new ResourceLocation("fnaf_mod", "textures/block/whiteclothtable14.png");
		if (blockstate == 15)
			return new ResourceLocation("fnaf_mod", "textures/block/whiteclothtable15.png");
		if (blockstate == 16)
			return new ResourceLocation("fnaf_mod", "textures/block/whiteclothtable16.png");
		return new ResourceLocation("fnaf_mod", "textures/block/whiteclothtable10.png");
	}
}
