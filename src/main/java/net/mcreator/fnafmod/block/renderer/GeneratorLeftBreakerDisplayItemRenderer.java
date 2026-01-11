package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.GeneratorLeftBreakerDisplayModel;
import net.mcreator.fnafmod.block.display.GeneratorLeftBreakerDisplayItem;

public class GeneratorLeftBreakerDisplayItemRenderer extends GeoItemRenderer<GeneratorLeftBreakerDisplayItem> {
	public GeneratorLeftBreakerDisplayItemRenderer() {
		super(new GeneratorLeftBreakerDisplayModel());
	}

	@Override
	public RenderType getRenderType(GeneratorLeftBreakerDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
