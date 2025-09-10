package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.FloodLightsDisplayModel;
import net.mcreator.fnafmod.block.display.FloodLightsDisplayItem;

public class FloodLightsDisplayItemRenderer extends GeoItemRenderer<FloodLightsDisplayItem> {
	public FloodLightsDisplayItemRenderer() {
		super(new FloodLightsDisplayModel());
	}

	@Override
	public RenderType getRenderType(FloodLightsDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
