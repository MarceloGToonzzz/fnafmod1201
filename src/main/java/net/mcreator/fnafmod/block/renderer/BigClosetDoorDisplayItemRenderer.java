package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.BigClosetDoorDisplayModel;
import net.mcreator.fnafmod.block.display.BigClosetDoorDisplayItem;

public class BigClosetDoorDisplayItemRenderer extends GeoItemRenderer<BigClosetDoorDisplayItem> {
	public BigClosetDoorDisplayItemRenderer() {
		super(new BigClosetDoorDisplayModel());
	}

	@Override
	public RenderType getRenderType(BigClosetDoorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
