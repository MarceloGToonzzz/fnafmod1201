package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.PurpleStarTableDisplayModel;
import net.mcreator.fnafmod.block.display.PurpleStarTableDisplayItem;

public class PurpleStarTableDisplayItemRenderer extends GeoItemRenderer<PurpleStarTableDisplayItem> {
	public PurpleStarTableDisplayItemRenderer() {
		super(new PurpleStarTableDisplayModel());
	}

	@Override
	public RenderType getRenderType(PurpleStarTableDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
