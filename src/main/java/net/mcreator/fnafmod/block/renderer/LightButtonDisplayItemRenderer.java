package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.LightButtonDisplayModel;
import net.mcreator.fnafmod.block.display.LightButtonDisplayItem;

public class LightButtonDisplayItemRenderer extends GeoItemRenderer<LightButtonDisplayItem> {
	public LightButtonDisplayItemRenderer() {
		super(new LightButtonDisplayModel());
	}

	@Override
	public RenderType getRenderType(LightButtonDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
