package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.BigWideRedWindowedDoorDisplayModel;
import net.mcreator.fnafmod.block.display.BigWideRedWindowedDoorDisplayItem;

public class BigWideRedWindowedDoorDisplayItemRenderer extends GeoItemRenderer<BigWideRedWindowedDoorDisplayItem> {
	public BigWideRedWindowedDoorDisplayItemRenderer() {
		super(new BigWideRedWindowedDoorDisplayModel());
	}

	@Override
	public RenderType getRenderType(BigWideRedWindowedDoorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
