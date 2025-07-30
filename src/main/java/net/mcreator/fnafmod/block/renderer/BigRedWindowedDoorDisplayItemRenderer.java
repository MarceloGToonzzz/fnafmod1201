package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.BigRedWindowedDoorDisplayModel;
import net.mcreator.fnafmod.block.display.BigRedWindowedDoorDisplayItem;

public class BigRedWindowedDoorDisplayItemRenderer extends GeoItemRenderer<BigRedWindowedDoorDisplayItem> {
	public BigRedWindowedDoorDisplayItemRenderer() {
		super(new BigRedWindowedDoorDisplayModel());
	}

	@Override
	public RenderType getRenderType(BigRedWindowedDoorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
