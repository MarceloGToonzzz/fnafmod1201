package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.BigCyanKitchenDoorDisplayModel;
import net.mcreator.fnafmod.block.display.BigCyanKitchenDoorDisplayItem;

public class BigCyanKitchenDoorDisplayItemRenderer extends GeoItemRenderer<BigCyanKitchenDoorDisplayItem> {
	public BigCyanKitchenDoorDisplayItemRenderer() {
		super(new BigCyanKitchenDoorDisplayModel());
	}

	@Override
	public RenderType getRenderType(BigCyanKitchenDoorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
