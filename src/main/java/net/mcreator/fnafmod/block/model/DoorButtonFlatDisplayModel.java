package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.DoorButtonFlatDisplayItem;

public class DoorButtonFlatDisplayModel extends GeoModel<DoorButtonFlatDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DoorButtonFlatDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/doorbuttonflat.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DoorButtonFlatDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/doorbuttonflat.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DoorButtonFlatDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/door_button.png");
	}
}
