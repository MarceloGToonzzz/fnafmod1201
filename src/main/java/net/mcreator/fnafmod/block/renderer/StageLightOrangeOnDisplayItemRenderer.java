package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.StageLightOrangeOnDisplayModel;
import net.mcreator.fnafmod.block.display.StageLightOrangeOnDisplayItem;

public class StageLightOrangeOnDisplayItemRenderer extends GeoItemRenderer<StageLightOrangeOnDisplayItem> {
	public StageLightOrangeOnDisplayItemRenderer() {
		super(new StageLightOrangeOnDisplayModel());
	}

	@Override
	public RenderType getRenderType(StageLightOrangeOnDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
