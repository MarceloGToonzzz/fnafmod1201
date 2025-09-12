package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.TortureChairDisplayModel;
import net.mcreator.fnafmod.block.display.TortureChairDisplayItem;

public class TortureChairDisplayItemRenderer extends GeoItemRenderer<TortureChairDisplayItem> {
	public TortureChairDisplayItemRenderer() {
		super(new TortureChairDisplayModel());
	}

	@Override
	public RenderType getRenderType(TortureChairDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
