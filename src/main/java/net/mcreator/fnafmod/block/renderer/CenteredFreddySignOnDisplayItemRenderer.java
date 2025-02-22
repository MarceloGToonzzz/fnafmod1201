package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.CenteredFreddySignOnDisplayModel;
import net.mcreator.fnafmod.block.display.CenteredFreddySignOnDisplayItem;

public class CenteredFreddySignOnDisplayItemRenderer extends GeoItemRenderer<CenteredFreddySignOnDisplayItem> {
	public CenteredFreddySignOnDisplayItemRenderer() {
		super(new CenteredFreddySignOnDisplayModel());
	}

	@Override
	public RenderType getRenderType(CenteredFreddySignOnDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
