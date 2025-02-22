package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.StageLightGreenOnDisplayModel;
import net.mcreator.fnafmod.block.display.StageLightGreenOnDisplayItem;

public class StageLightGreenOnDisplayItemRenderer extends GeoItemRenderer<StageLightGreenOnDisplayItem> {
	public StageLightGreenOnDisplayItemRenderer() {
		super(new StageLightGreenOnDisplayModel());
	}

	@Override
	public RenderType getRenderType(StageLightGreenOnDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
