package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.ConnectingTableDisplayItem;

public class ConnectingTableDisplayModel extends GeoModel<ConnectingTableDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ConnectingTableDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/table.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ConnectingTableDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/table.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ConnectingTableDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/block/connectingtable.png");
	}
}
