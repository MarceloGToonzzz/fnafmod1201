package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.FoxyHeadDecorationDisplayModel;
import net.mcreator.fnafmod.block.display.FoxyHeadDecorationDisplayItem;

public class FoxyHeadDecorationDisplayItemRenderer extends GeoItemRenderer<FoxyHeadDecorationDisplayItem> {
	public FoxyHeadDecorationDisplayItemRenderer() {
		super(new FoxyHeadDecorationDisplayModel());
	}

	@Override
	public RenderType getRenderType(FoxyHeadDecorationDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
