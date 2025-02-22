package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.RetroFreddySignOnDisplayModel;
import net.mcreator.fnafmod.block.display.RetroFreddySignOnDisplayItem;

public class RetroFreddySignOnDisplayItemRenderer extends GeoItemRenderer<RetroFreddySignOnDisplayItem> {
	public RetroFreddySignOnDisplayItemRenderer() {
		super(new RetroFreddySignOnDisplayModel());
	}

	@Override
	public RenderType getRenderType(RetroFreddySignOnDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
