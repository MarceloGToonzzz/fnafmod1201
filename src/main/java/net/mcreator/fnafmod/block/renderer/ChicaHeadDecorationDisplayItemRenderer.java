package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.ChicaHeadDecorationDisplayModel;
import net.mcreator.fnafmod.block.display.ChicaHeadDecorationDisplayItem;

public class ChicaHeadDecorationDisplayItemRenderer extends GeoItemRenderer<ChicaHeadDecorationDisplayItem> {
	public ChicaHeadDecorationDisplayItemRenderer() {
		super(new ChicaHeadDecorationDisplayModel());
	}

	@Override
	public RenderType getRenderType(ChicaHeadDecorationDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
