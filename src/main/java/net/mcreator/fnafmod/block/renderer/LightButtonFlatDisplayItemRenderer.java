package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.LightButtonFlatDisplayModel;
import net.mcreator.fnafmod.block.display.LightButtonFlatDisplayItem;

public class LightButtonFlatDisplayItemRenderer extends GeoItemRenderer<LightButtonFlatDisplayItem> {
	public LightButtonFlatDisplayItemRenderer() {
		super(new LightButtonFlatDisplayModel());
	}

	@Override
	public RenderType getRenderType(LightButtonFlatDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
