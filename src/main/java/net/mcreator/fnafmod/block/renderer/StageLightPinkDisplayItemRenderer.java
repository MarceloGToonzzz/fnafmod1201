package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.StageLightPinkDisplayModel;
import net.mcreator.fnafmod.block.display.StageLightPinkDisplayItem;

public class StageLightPinkDisplayItemRenderer extends GeoItemRenderer<StageLightPinkDisplayItem> {
	public StageLightPinkDisplayItemRenderer() {
		super(new StageLightPinkDisplayModel());
	}

	@Override
	public RenderType getRenderType(StageLightPinkDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
