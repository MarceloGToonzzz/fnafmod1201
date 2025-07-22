package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.FreddysCupcakeBonanzaDisplayItem;

public class FreddysCupcakeBonanzaDisplayModel extends GeoModel<FreddysCupcakeBonanzaDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FreddysCupcakeBonanzaDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/cupcakebonanza.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddysCupcakeBonanzaDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/cupcakebonanza.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddysCupcakeBonanzaDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/freddyscupcakebonaza.png");
	}
}
