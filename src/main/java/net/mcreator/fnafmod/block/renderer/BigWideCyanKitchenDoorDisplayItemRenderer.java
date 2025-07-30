package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.BigWideCyanKitchenDoorDisplayModel;
import net.mcreator.fnafmod.block.display.BigWideCyanKitchenDoorDisplayItem;

public class BigWideCyanKitchenDoorDisplayItemRenderer extends GeoItemRenderer<BigWideCyanKitchenDoorDisplayItem> {
	public BigWideCyanKitchenDoorDisplayItemRenderer() {
		super(new BigWideCyanKitchenDoorDisplayModel());
	}

	@Override
	public RenderType getRenderType(BigWideCyanKitchenDoorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
