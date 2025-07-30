package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.BigDualColourEntranceDoorDisplayModel;
import net.mcreator.fnafmod.block.display.BigDualColourEntranceDoorDisplayItem;

public class BigDualColourEntranceDoorDisplayItemRenderer extends GeoItemRenderer<BigDualColourEntranceDoorDisplayItem> {
	public BigDualColourEntranceDoorDisplayItemRenderer() {
		super(new BigDualColourEntranceDoorDisplayModel());
	}

	@Override
	public RenderType getRenderType(BigDualColourEntranceDoorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
