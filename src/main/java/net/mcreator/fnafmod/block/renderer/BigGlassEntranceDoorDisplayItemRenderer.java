package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.BigGlassEntranceDoorDisplayModel;
import net.mcreator.fnafmod.block.display.BigGlassEntranceDoorDisplayItem;

public class BigGlassEntranceDoorDisplayItemRenderer extends GeoItemRenderer<BigGlassEntranceDoorDisplayItem> {
	public BigGlassEntranceDoorDisplayItemRenderer() {
		super(new BigGlassEntranceDoorDisplayModel());
	}

	@Override
	public RenderType getRenderType(BigGlassEntranceDoorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
