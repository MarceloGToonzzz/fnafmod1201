package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.UnWitheredFreddyHeadDisplayModel;
import net.mcreator.fnafmod.block.display.UnWitheredFreddyHeadDisplayItem;

public class UnWitheredFreddyHeadDisplayItemRenderer extends GeoItemRenderer<UnWitheredFreddyHeadDisplayItem> {
	public UnWitheredFreddyHeadDisplayItemRenderer() {
		super(new UnWitheredFreddyHeadDisplayModel());
	}

	@Override
	public RenderType getRenderType(UnWitheredFreddyHeadDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
