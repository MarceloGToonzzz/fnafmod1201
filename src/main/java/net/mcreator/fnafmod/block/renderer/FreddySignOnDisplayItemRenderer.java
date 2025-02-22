package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.FreddySignOnDisplayModel;
import net.mcreator.fnafmod.block.display.FreddySignOnDisplayItem;

public class FreddySignOnDisplayItemRenderer extends GeoItemRenderer<FreddySignOnDisplayItem> {
	public FreddySignOnDisplayItemRenderer() {
		super(new FreddySignOnDisplayModel());
	}

	@Override
	public RenderType getRenderType(FreddySignOnDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
