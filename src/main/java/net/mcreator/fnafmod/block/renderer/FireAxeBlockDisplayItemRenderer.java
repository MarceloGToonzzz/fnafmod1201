package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.FireAxeBlockDisplayModel;
import net.mcreator.fnafmod.block.display.FireAxeBlockDisplayItem;

public class FireAxeBlockDisplayItemRenderer extends GeoItemRenderer<FireAxeBlockDisplayItem> {
	public FireAxeBlockDisplayItemRenderer() {
		super(new FireAxeBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(FireAxeBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
