package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.FredbearSignDisplayModel;
import net.mcreator.fnafmod.block.display.FredbearSignDisplayItem;

public class FredbearSignDisplayItemRenderer extends GeoItemRenderer<FredbearSignDisplayItem> {
	public FredbearSignDisplayItemRenderer() {
		super(new FredbearSignDisplayModel());
	}

	@Override
	public RenderType getRenderType(FredbearSignDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
