package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.FreddySignOffDisplayModel;
import net.mcreator.fnafmod.block.display.FreddySignOffDisplayItem;

public class FreddySignOffDisplayItemRenderer extends GeoItemRenderer<FreddySignOffDisplayItem> {
	public FreddySignOffDisplayItemRenderer() {
		super(new FreddySignOffDisplayModel());
	}

	@Override
	public RenderType getRenderType(FreddySignOffDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
