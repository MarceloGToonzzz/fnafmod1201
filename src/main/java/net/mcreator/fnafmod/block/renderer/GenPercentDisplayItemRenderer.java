package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.GenPercentDisplayModel;
import net.mcreator.fnafmod.block.display.GenPercentDisplayItem;

public class GenPercentDisplayItemRenderer extends GeoItemRenderer<GenPercentDisplayItem> {
	public GenPercentDisplayItemRenderer() {
		super(new GenPercentDisplayModel());
	}

	@Override
	public RenderType getRenderType(GenPercentDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
