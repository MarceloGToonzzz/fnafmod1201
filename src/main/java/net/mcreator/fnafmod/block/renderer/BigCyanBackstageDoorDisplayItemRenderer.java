package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.BigCyanBackstageDoorDisplayModel;
import net.mcreator.fnafmod.block.display.BigCyanBackstageDoorDisplayItem;

public class BigCyanBackstageDoorDisplayItemRenderer extends GeoItemRenderer<BigCyanBackstageDoorDisplayItem> {
	public BigCyanBackstageDoorDisplayItemRenderer() {
		super(new BigCyanBackstageDoorDisplayModel());
	}

	@Override
	public RenderType getRenderType(BigCyanBackstageDoorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
