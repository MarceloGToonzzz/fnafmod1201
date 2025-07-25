package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.DisplayShelvesDisplayModel;
import net.mcreator.fnafmod.block.display.DisplayShelvesDisplayItem;

public class DisplayShelvesDisplayItemRenderer extends GeoItemRenderer<DisplayShelvesDisplayItem> {
	public DisplayShelvesDisplayItemRenderer() {
		super(new DisplayShelvesDisplayModel());
	}

	@Override
	public RenderType getRenderType(DisplayShelvesDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
