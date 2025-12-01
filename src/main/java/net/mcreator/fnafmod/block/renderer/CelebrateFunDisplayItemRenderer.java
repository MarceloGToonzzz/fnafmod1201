package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.CelebrateFunDisplayModel;
import net.mcreator.fnafmod.block.display.CelebrateFunDisplayItem;

public class CelebrateFunDisplayItemRenderer extends GeoItemRenderer<CelebrateFunDisplayItem> {
	public CelebrateFunDisplayItemRenderer() {
		super(new CelebrateFunDisplayModel());
	}

	@Override
	public RenderType getRenderType(CelebrateFunDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
