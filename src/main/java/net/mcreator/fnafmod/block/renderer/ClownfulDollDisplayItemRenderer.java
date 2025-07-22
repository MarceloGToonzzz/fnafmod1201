package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.ClownfulDollDisplayModel;
import net.mcreator.fnafmod.block.display.ClownfulDollDisplayItem;

public class ClownfulDollDisplayItemRenderer extends GeoItemRenderer<ClownfulDollDisplayItem> {
	public ClownfulDollDisplayItemRenderer() {
		super(new ClownfulDollDisplayModel());
	}

	@Override
	public RenderType getRenderType(ClownfulDollDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
