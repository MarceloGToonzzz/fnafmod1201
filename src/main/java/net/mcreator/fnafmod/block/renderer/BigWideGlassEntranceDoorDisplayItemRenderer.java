package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.BigWideGlassEntranceDoorDisplayModel;
import net.mcreator.fnafmod.block.display.BigWideGlassEntranceDoorDisplayItem;

public class BigWideGlassEntranceDoorDisplayItemRenderer extends GeoItemRenderer<BigWideGlassEntranceDoorDisplayItem> {
	public BigWideGlassEntranceDoorDisplayItemRenderer() {
		super(new BigWideGlassEntranceDoorDisplayModel());
	}

	@Override
	public RenderType getRenderType(BigWideGlassEntranceDoorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
