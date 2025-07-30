package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.BigRedDoorDisplayModel;
import net.mcreator.fnafmod.block.display.BigRedDoorDisplayItem;

public class BigRedDoorDisplayItemRenderer extends GeoItemRenderer<BigRedDoorDisplayItem> {
	public BigRedDoorDisplayItemRenderer() {
		super(new BigRedDoorDisplayModel());
	}

	@Override
	public RenderType getRenderType(BigRedDoorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
