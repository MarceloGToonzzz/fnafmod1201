package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.StageLightRedOnDisplayModel;
import net.mcreator.fnafmod.block.display.StageLightRedOnDisplayItem;

public class StageLightRedOnDisplayItemRenderer extends GeoItemRenderer<StageLightRedOnDisplayItem> {
	public StageLightRedOnDisplayItemRenderer() {
		super(new StageLightRedOnDisplayModel());
	}

	@Override
	public RenderType getRenderType(StageLightRedOnDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
