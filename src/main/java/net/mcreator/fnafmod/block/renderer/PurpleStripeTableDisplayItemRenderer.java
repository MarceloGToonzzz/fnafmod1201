package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.PurpleStripeTableDisplayModel;
import net.mcreator.fnafmod.block.display.PurpleStripeTableDisplayItem;

public class PurpleStripeTableDisplayItemRenderer extends GeoItemRenderer<PurpleStripeTableDisplayItem> {
	public PurpleStripeTableDisplayItemRenderer() {
		super(new PurpleStripeTableDisplayModel());
	}

	@Override
	public RenderType getRenderType(PurpleStripeTableDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
