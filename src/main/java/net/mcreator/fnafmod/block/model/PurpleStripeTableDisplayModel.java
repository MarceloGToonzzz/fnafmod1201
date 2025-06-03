package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.PurpleStripeTableDisplayItem;

public class PurpleStripeTableDisplayModel extends GeoModel<PurpleStripeTableDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PurpleStripeTableDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/table.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PurpleStripeTableDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/table.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PurpleStripeTableDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/purplestripedtable10.png");
	}
}
