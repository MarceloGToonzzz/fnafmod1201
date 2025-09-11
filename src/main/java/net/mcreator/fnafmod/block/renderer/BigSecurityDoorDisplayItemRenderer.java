package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.BigSecurityDoorDisplayModel;
import net.mcreator.fnafmod.block.display.BigSecurityDoorDisplayItem;

public class BigSecurityDoorDisplayItemRenderer extends GeoItemRenderer<BigSecurityDoorDisplayItem> {
	public BigSecurityDoorDisplayItemRenderer() {
		super(new BigSecurityDoorDisplayModel());
	}

	@Override
	public RenderType getRenderType(BigSecurityDoorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
