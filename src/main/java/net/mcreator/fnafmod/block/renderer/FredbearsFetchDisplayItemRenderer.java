package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.FredbearsFetchDisplayModel;
import net.mcreator.fnafmod.block.display.FredbearsFetchDisplayItem;

public class FredbearsFetchDisplayItemRenderer extends GeoItemRenderer<FredbearsFetchDisplayItem> {
	public FredbearsFetchDisplayItemRenderer() {
		super(new FredbearsFetchDisplayModel());
	}

	@Override
	public RenderType getRenderType(FredbearsFetchDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
