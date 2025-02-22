package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.EndoBlockDisplayModel;
import net.mcreator.fnafmod.block.display.EndoBlockDisplayItem;

public class EndoBlockDisplayItemRenderer extends GeoItemRenderer<EndoBlockDisplayItem> {
	public EndoBlockDisplayItemRenderer() {
		super(new EndoBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(EndoBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
