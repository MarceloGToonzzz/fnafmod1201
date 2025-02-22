package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.FoxyHeadDisplayModel;
import net.mcreator.fnafmod.block.display.FoxyHeadDisplayItem;

public class FoxyHeadDisplayItemRenderer extends GeoItemRenderer<FoxyHeadDisplayItem> {
	public FoxyHeadDisplayItemRenderer() {
		super(new FoxyHeadDisplayModel());
	}

	@Override
	public RenderType getRenderType(FoxyHeadDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
