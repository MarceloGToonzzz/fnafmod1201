package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.GeneratorRightCreativeTileEntity;

public class GeneratorRightCreativeBlockModel extends GeoModel<GeneratorRightCreativeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GeneratorRightCreativeTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/generatorrightcreative.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GeneratorRightCreativeTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/generatorrightcreative.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GeneratorRightCreativeTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "textures/block/industrial_generator.png");
	}
}
