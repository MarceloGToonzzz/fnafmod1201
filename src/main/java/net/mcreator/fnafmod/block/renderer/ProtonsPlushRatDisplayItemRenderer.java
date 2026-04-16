package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.ProtonsPlushRatDisplayModel;
import net.mcreator.fnafmod.block.display.ProtonsPlushRatDisplayItem;

public class ProtonsPlushRatDisplayItemRenderer extends GeoItemRenderer<ProtonsPlushRatDisplayItem> {
	public ProtonsPlushRatDisplayItemRenderer() {
		super(new ProtonsPlushRatDisplayModel());
	}

	@Override
	public RenderType getRenderType(ProtonsPlushRatDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
