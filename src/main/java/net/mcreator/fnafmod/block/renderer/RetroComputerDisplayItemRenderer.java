package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.RetroComputerDisplayModel;
import net.mcreator.fnafmod.block.display.RetroComputerDisplayItem;

public class RetroComputerDisplayItemRenderer extends GeoItemRenderer<RetroComputerDisplayItem> {
	public RetroComputerDisplayItemRenderer() {
		super(new RetroComputerDisplayModel());
	}

	@Override
	public RenderType getRenderType(RetroComputerDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
