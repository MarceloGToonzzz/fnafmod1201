package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.DisplayMonitorTileEntity;

public class DisplayMonitorBlockModel extends GeoModel<DisplayMonitorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DisplayMonitorTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "animations/displaymonitor.animation.json");
		if (blockstate == 2)
			return new ResourceLocation("fnaf_mod", "animations/displaymonitor.animation.json");
		if (blockstate == 3)
			return new ResourceLocation("fnaf_mod", "animations/displaymonitor.animation.json");
		if (blockstate == 4)
			return new ResourceLocation("fnaf_mod", "animations/displaymonitor.animation.json");
		if (blockstate == 5)
			return new ResourceLocation("fnaf_mod", "animations/displaymonitor.animation.json");
		return new ResourceLocation("fnaf_mod", "animations/displaymonitor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DisplayMonitorTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "geo/displaymonitor.geo.json");
		if (blockstate == 2)
			return new ResourceLocation("fnaf_mod", "geo/displaymonitor.geo.json");
		if (blockstate == 3)
			return new ResourceLocation("fnaf_mod", "geo/displaymonitor.geo.json");
		if (blockstate == 4)
			return new ResourceLocation("fnaf_mod", "geo/displaymonitor.geo.json");
		if (blockstate == 5)
			return new ResourceLocation("fnaf_mod", "geo/displaymonitor.geo.json");
		return new ResourceLocation("fnaf_mod", "geo/displaymonitor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DisplayMonitorTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("fnaf_mod", "textures/block/screen1.png");
		if (blockstate == 2)
			return new ResourceLocation("fnaf_mod", "textures/block/screen2.png");
		if (blockstate == 3)
			return new ResourceLocation("fnaf_mod", "textures/block/screen3.png");
		if (blockstate == 4)
			return new ResourceLocation("fnaf_mod", "textures/block/screen4.png");
		if (blockstate == 5)
			return new ResourceLocation("fnaf_mod", "textures/block/screen5.png");
		return new ResourceLocation("fnaf_mod", "textures/block/screen.png");
	}
}
