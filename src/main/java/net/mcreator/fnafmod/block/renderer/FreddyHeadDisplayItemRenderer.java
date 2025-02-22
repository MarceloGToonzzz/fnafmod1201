package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.FreddyHeadDisplayModel;
import net.mcreator.fnafmod.block.display.FreddyHeadDisplayItem;

public class FreddyHeadDisplayItemRenderer extends GeoItemRenderer<FreddyHeadDisplayItem> {
	public FreddyHeadDisplayItemRenderer() {
		super(new FreddyHeadDisplayModel());
	}

	@Override
	public RenderType getRenderType(FreddyHeadDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
