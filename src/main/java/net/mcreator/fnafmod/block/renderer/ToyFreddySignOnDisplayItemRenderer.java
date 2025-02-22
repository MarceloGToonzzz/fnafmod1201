package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.ToyFreddySignOnDisplayModel;
import net.mcreator.fnafmod.block.display.ToyFreddySignOnDisplayItem;

public class ToyFreddySignOnDisplayItemRenderer extends GeoItemRenderer<ToyFreddySignOnDisplayItem> {
	public ToyFreddySignOnDisplayItemRenderer() {
		super(new ToyFreddySignOnDisplayModel());
	}

	@Override
	public RenderType getRenderType(ToyFreddySignOnDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
