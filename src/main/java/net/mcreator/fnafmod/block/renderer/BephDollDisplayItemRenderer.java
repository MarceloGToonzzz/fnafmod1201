package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.BephDollDisplayModel;
import net.mcreator.fnafmod.block.display.BephDollDisplayItem;

public class BephDollDisplayItemRenderer extends GeoItemRenderer<BephDollDisplayItem> {
	public BephDollDisplayItemRenderer() {
		super(new BephDollDisplayModel());
	}

	@Override
	public RenderType getRenderType(BephDollDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
