package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.BigRedEntranceDoorDisplayModel;
import net.mcreator.fnafmod.block.display.BigRedEntranceDoorDisplayItem;

public class BigRedEntranceDoorDisplayItemRenderer extends GeoItemRenderer<BigRedEntranceDoorDisplayItem> {
	public BigRedEntranceDoorDisplayItemRenderer() {
		super(new BigRedEntranceDoorDisplayModel());
	}

	@Override
	public RenderType getRenderType(BigRedEntranceDoorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
