package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.RetroFreddySignDisplayModel;
import net.mcreator.fnafmod.block.display.RetroFreddySignDisplayItem;

public class RetroFreddySignDisplayItemRenderer extends GeoItemRenderer<RetroFreddySignDisplayItem> {
	public RetroFreddySignDisplayItemRenderer() {
		super(new RetroFreddySignDisplayModel());
	}

	@Override
	public RenderType getRenderType(RetroFreddySignDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
