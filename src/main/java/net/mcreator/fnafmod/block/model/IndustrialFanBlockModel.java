package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.IndustrialFanTileEntity;

public class IndustrialFanBlockModel extends GeoModel<IndustrialFanTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(IndustrialFanTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "animations/industrial_fan_1.animation.json");
		if (blockstate == 2)
			return new ResourceLocation("fnaf_mod", "animations/industrial_fan_2.animation.json");
		if (blockstate == 3)
			return new ResourceLocation("fnaf_mod", "animations/industrial_fan_3.animation.json");
		return new ResourceLocation("fnaf_mod", "animations/industrial_fan_0.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IndustrialFanTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "geo/industrial_fan_1.geo.json");
		if (blockstate == 2)
			return new ResourceLocation("fnaf_mod", "geo/industrial_fan_2.geo.json");
		if (blockstate == 3)
			return new ResourceLocation("fnaf_mod", "geo/industrial_fan_3.geo.json");
		return new ResourceLocation("fnaf_mod", "geo/industrial_fan_0.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IndustrialFanTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "textures/block/industrial_fan.png");
		if (blockstate == 2)
			return new ResourceLocation("fnaf_mod", "textures/block/industrial_fan.png");
		if (blockstate == 3)
			return new ResourceLocation("fnaf_mod", "textures/block/industrial_fan.png");
		return new ResourceLocation("fnaf_mod", "textures/block/industrial_fan.png");
	}
}
