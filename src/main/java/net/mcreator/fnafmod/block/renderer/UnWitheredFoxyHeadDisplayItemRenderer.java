package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.UnWitheredFoxyHeadDisplayModel;
import net.mcreator.fnafmod.block.display.UnWitheredFoxyHeadDisplayItem;

public class UnWitheredFoxyHeadDisplayItemRenderer extends GeoItemRenderer<UnWitheredFoxyHeadDisplayItem> {
	public UnWitheredFoxyHeadDisplayItemRenderer() {
		super(new UnWitheredFoxyHeadDisplayModel());
	}

	@Override
	public RenderType getRenderType(UnWitheredFoxyHeadDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
