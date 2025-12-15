package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.GeneratorRightCreativeDisplayModel;
import net.mcreator.fnafmod.block.display.GeneratorRightCreativeDisplayItem;

public class GeneratorRightCreativeDisplayItemRenderer extends GeoItemRenderer<GeneratorRightCreativeDisplayItem> {
	public GeneratorRightCreativeDisplayItemRenderer() {
		super(new GeneratorRightCreativeDisplayModel());
	}

	@Override
	public RenderType getRenderType(GeneratorRightCreativeDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
