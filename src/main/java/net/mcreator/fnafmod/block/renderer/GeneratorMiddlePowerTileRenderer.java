package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.GeneratorMiddlePowerBlockModel;
import net.mcreator.fnafmod.block.entity.GeneratorMiddlePowerTileEntity;

public class GeneratorMiddlePowerTileRenderer extends GeoBlockRenderer<GeneratorMiddlePowerTileEntity> {
	public GeneratorMiddlePowerTileRenderer() {
		super(new GeneratorMiddlePowerBlockModel());
	}

	@Override
	public RenderType getRenderType(GeneratorMiddlePowerTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
