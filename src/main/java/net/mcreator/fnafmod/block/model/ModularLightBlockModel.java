package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.ModularLightTileEntity;

public class ModularLightBlockModel extends GeoModel<ModularLightTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ModularLightTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "animations/modularlights.animation.json");
		if (blockstate == 2)
			return new ResourceLocation("fnaf_mod", "animations/modularlights.animation.json");
		if (blockstate == 3)
			return new ResourceLocation("fnaf_mod", "animations/modularlights.animation.json");
		if (blockstate == 4)
			return new ResourceLocation("fnaf_mod", "animations/modularlights.animation.json");
		if (blockstate == 5)
			return new ResourceLocation("fnaf_mod", "animations/modularlights.animation.json");
		if (blockstate == 6)
			return new ResourceLocation("fnaf_mod", "animations/modularlights.animation.json");
		if (blockstate == 7)
			return new ResourceLocation("fnaf_mod", "animations/modularlights.animation.json");
		if (blockstate == 8)
			return new ResourceLocation("fnaf_mod", "animations/modularlights.animation.json");
		if (blockstate == 9)
			return new ResourceLocation("fnaf_mod", "animations/modularlights.animation.json");
		if (blockstate == 10)
			return new ResourceLocation("fnaf_mod", "animations/modularlights.animation.json");
		if (blockstate == 11)
			return new ResourceLocation("fnaf_mod", "animations/modularlights.animation.json");
		if (blockstate == 12)
			return new ResourceLocation("fnaf_mod", "animations/modularlights.animation.json");
		if (blockstate == 13)
			return new ResourceLocation("fnaf_mod", "animations/modularlights.animation.json");
		return new ResourceLocation("fnaf_mod", "animations/modularlights.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ModularLightTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "geo/modularlights.geo.json");
		if (blockstate == 2)
			return new ResourceLocation("fnaf_mod", "geo/modularlights.geo.json");
		if (blockstate == 3)
			return new ResourceLocation("fnaf_mod", "geo/modularlights.geo.json");
		if (blockstate == 4)
			return new ResourceLocation("fnaf_mod", "geo/modularlights.geo.json");
		if (blockstate == 5)
			return new ResourceLocation("fnaf_mod", "geo/modularlights.geo.json");
		if (blockstate == 6)
			return new ResourceLocation("fnaf_mod", "geo/modularlights.geo.json");
		if (blockstate == 7)
			return new ResourceLocation("fnaf_mod", "geo/modularlights.geo.json");
		if (blockstate == 8)
			return new ResourceLocation("fnaf_mod", "geo/modularlights.geo.json");
		if (blockstate == 9)
			return new ResourceLocation("fnaf_mod", "geo/modularlights.geo.json");
		if (blockstate == 10)
			return new ResourceLocation("fnaf_mod", "geo/modularlights.geo.json");
		if (blockstate == 11)
			return new ResourceLocation("fnaf_mod", "geo/modularlights.geo.json");
		if (blockstate == 12)
			return new ResourceLocation("fnaf_mod", "geo/modularlights.geo.json");
		if (blockstate == 13)
			return new ResourceLocation("fnaf_mod", "geo/modularlights.geo.json");
		return new ResourceLocation("fnaf_mod", "geo/modularlights.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ModularLightTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "textures/block/modularlight1.png");
		if (blockstate == 2)
			return new ResourceLocation("fnaf_mod", "textures/block/modularlight2.png");
		if (blockstate == 3)
			return new ResourceLocation("fnaf_mod", "textures/block/modularlight3.png");
		if (blockstate == 4)
			return new ResourceLocation("fnaf_mod", "textures/block/modularlight4.png");
		if (blockstate == 5)
			return new ResourceLocation("fnaf_mod", "textures/block/modularlight5.png");
		if (blockstate == 6)
			return new ResourceLocation("fnaf_mod", "textures/block/modularlight6.png");
		if (blockstate == 7)
			return new ResourceLocation("fnaf_mod", "textures/block/modularlight7.png");
		if (blockstate == 8)
			return new ResourceLocation("fnaf_mod", "textures/block/modularlight8.png");
		if (blockstate == 9)
			return new ResourceLocation("fnaf_mod", "textures/block/modularlight9.png");
		if (blockstate == 10)
			return new ResourceLocation("fnaf_mod", "textures/block/modularlight10.png");
		if (blockstate == 11)
			return new ResourceLocation("fnaf_mod", "textures/block/modularlight11.png");
		if (blockstate == 12)
			return new ResourceLocation("fnaf_mod", "textures/block/modularlight12.png");
		if (blockstate == 13)
			return new ResourceLocation("fnaf_mod", "textures/block/modularlight13.png");
		return new ResourceLocation("fnaf_mod", "textures/block/modularlight0.png");
	}
}
