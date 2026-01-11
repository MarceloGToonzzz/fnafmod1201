package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.GeneratorLeftBreakerBlockModel;
import net.mcreator.fnafmod.block.entity.GeneratorLeftBreakerTileEntity;

public class GeneratorLeftBreakerTileRenderer extends GeoBlockRenderer<GeneratorLeftBreakerTileEntity> {
	public GeneratorLeftBreakerTileRenderer() {
		super(new GeneratorLeftBreakerBlockModel());
	}

	@Override
	public RenderType getRenderType(GeneratorLeftBreakerTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
