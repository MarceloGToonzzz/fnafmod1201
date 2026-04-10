package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.DisplayMonitorDisplayModel;
import net.mcreator.fnafmod.block.display.DisplayMonitorDisplayItem;

public class DisplayMonitorDisplayItemRenderer extends GeoItemRenderer<DisplayMonitorDisplayItem> {
	public DisplayMonitorDisplayItemRenderer() {
		super(new DisplayMonitorDisplayModel());
	}

	@Override
	public RenderType getRenderType(DisplayMonitorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
