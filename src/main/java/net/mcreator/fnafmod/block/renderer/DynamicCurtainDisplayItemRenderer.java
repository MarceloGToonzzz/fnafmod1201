package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.DynamicCurtainDisplayModel;
import net.mcreator.fnafmod.block.display.DynamicCurtainDisplayItem;

public class DynamicCurtainDisplayItemRenderer extends GeoItemRenderer<DynamicCurtainDisplayItem> {
	public DynamicCurtainDisplayItemRenderer() {
		super(new DynamicCurtainDisplayModel());
	}

	@Override
	public RenderType getRenderType(DynamicCurtainDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
