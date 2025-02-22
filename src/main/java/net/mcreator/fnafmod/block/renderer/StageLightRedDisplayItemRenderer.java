package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.StageLightRedDisplayModel;
import net.mcreator.fnafmod.block.display.StageLightRedDisplayItem;

public class StageLightRedDisplayItemRenderer extends GeoItemRenderer<StageLightRedDisplayItem> {
	public StageLightRedDisplayItemRenderer() {
		super(new StageLightRedDisplayModel());
	}

	@Override
	public RenderType getRenderType(StageLightRedDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
