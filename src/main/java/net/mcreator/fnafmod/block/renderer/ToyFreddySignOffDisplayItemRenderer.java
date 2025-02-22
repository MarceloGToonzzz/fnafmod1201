package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.ToyFreddySignOffDisplayModel;
import net.mcreator.fnafmod.block.display.ToyFreddySignOffDisplayItem;

public class ToyFreddySignOffDisplayItemRenderer extends GeoItemRenderer<ToyFreddySignOffDisplayItem> {
	public ToyFreddySignOffDisplayItemRenderer() {
		super(new ToyFreddySignOffDisplayModel());
	}

	@Override
	public RenderType getRenderType(ToyFreddySignOffDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
