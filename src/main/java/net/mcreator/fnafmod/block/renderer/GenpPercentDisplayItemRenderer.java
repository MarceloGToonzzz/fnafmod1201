package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.GenpPercentDisplayModel;
import net.mcreator.fnafmod.block.display.GenpPercentDisplayItem;

public class GenpPercentDisplayItemRenderer extends GeoItemRenderer<GenpPercentDisplayItem> {
	public GenpPercentDisplayItemRenderer() {
		super(new GenpPercentDisplayModel());
	}

	@Override
	public RenderType getRenderType(GenpPercentDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
