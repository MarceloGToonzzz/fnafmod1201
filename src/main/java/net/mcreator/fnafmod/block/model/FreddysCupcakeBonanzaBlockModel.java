package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.FreddysCupcakeBonanzaTileEntity;

public class FreddysCupcakeBonanzaBlockModel extends GeoModel<FreddysCupcakeBonanzaTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FreddysCupcakeBonanzaTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/cupcakebonanza.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddysCupcakeBonanzaTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/cupcakebonanza.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddysCupcakeBonanzaTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "textures/block/freddyscupcakebonaza.png");
	}
}
