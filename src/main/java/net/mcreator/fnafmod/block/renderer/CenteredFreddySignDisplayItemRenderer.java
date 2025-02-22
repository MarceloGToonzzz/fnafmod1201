package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.CenteredFreddySignDisplayModel;
import net.mcreator.fnafmod.block.display.CenteredFreddySignDisplayItem;

public class CenteredFreddySignDisplayItemRenderer extends GeoItemRenderer<CenteredFreddySignDisplayItem> {
	public CenteredFreddySignDisplayItemRenderer() {
		super(new CenteredFreddySignDisplayModel());
	}

	@Override
	public RenderType getRenderType(CenteredFreddySignDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
