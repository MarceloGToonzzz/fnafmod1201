package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.BigBackstageDoorDisplayModel;
import net.mcreator.fnafmod.block.display.BigBackstageDoorDisplayItem;

public class BigBackstageDoorDisplayItemRenderer extends GeoItemRenderer<BigBackstageDoorDisplayItem> {
	public BigBackstageDoorDisplayItemRenderer() {
		super(new BigBackstageDoorDisplayModel());
	}

	@Override
	public RenderType getRenderType(BigBackstageDoorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
