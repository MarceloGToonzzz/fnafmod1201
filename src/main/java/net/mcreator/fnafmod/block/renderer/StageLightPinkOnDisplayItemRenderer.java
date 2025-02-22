package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.StageLightPinkOnDisplayModel;
import net.mcreator.fnafmod.block.display.StageLightPinkOnDisplayItem;

public class StageLightPinkOnDisplayItemRenderer extends GeoItemRenderer<StageLightPinkOnDisplayItem> {
	public StageLightPinkOnDisplayItemRenderer() {
		super(new StageLightPinkOnDisplayModel());
	}

	@Override
	public RenderType getRenderType(StageLightPinkOnDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
