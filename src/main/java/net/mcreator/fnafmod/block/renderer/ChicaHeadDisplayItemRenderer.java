package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.ChicaHeadDisplayModel;
import net.mcreator.fnafmod.block.display.ChicaHeadDisplayItem;

public class ChicaHeadDisplayItemRenderer extends GeoItemRenderer<ChicaHeadDisplayItem> {
	public ChicaHeadDisplayItemRenderer() {
		super(new ChicaHeadDisplayModel());
	}

	@Override
	public RenderType getRenderType(ChicaHeadDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
