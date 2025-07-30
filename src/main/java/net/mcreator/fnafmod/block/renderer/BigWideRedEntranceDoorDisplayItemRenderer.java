package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.BigWideRedEntranceDoorDisplayModel;
import net.mcreator.fnafmod.block.display.BigWideRedEntranceDoorDisplayItem;

public class BigWideRedEntranceDoorDisplayItemRenderer extends GeoItemRenderer<BigWideRedEntranceDoorDisplayItem> {
	public BigWideRedEntranceDoorDisplayItemRenderer() {
		super(new BigWideRedEntranceDoorDisplayModel());
	}

	@Override
	public RenderType getRenderType(BigWideRedEntranceDoorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
