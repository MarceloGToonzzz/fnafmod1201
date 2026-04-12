package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.PizzaToppingsDisplayModel;
import net.mcreator.fnafmod.block.display.PizzaToppingsDisplayItem;

public class PizzaToppingsDisplayItemRenderer extends GeoItemRenderer<PizzaToppingsDisplayItem> {
	public PizzaToppingsDisplayItemRenderer() {
		super(new PizzaToppingsDisplayModel());
	}

	@Override
	public RenderType getRenderType(PizzaToppingsDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
