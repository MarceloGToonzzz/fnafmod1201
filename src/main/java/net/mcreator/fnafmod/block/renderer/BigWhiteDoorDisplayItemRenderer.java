package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.BigWhiteDoorDisplayModel;
import net.mcreator.fnafmod.block.display.BigWhiteDoorDisplayItem;

public class BigWhiteDoorDisplayItemRenderer extends GeoItemRenderer<BigWhiteDoorDisplayItem> {
	public BigWhiteDoorDisplayItemRenderer() {
		super(new BigWhiteDoorDisplayModel());
	}

	@Override
	public RenderType getRenderType(BigWhiteDoorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
