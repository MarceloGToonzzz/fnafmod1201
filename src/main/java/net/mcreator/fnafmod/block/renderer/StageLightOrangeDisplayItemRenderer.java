package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.StageLightOrangeDisplayModel;
import net.mcreator.fnafmod.block.display.StageLightOrangeDisplayItem;

public class StageLightOrangeDisplayItemRenderer extends GeoItemRenderer<StageLightOrangeDisplayItem> {
	public StageLightOrangeDisplayItemRenderer() {
		super(new StageLightOrangeDisplayModel());
	}

	@Override
	public RenderType getRenderType(StageLightOrangeDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
