package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.GeneratorRightCreativeBlockModel;
import net.mcreator.fnafmod.block.entity.GeneratorRightCreativeTileEntity;

public class GeneratorRightCreativeTileRenderer extends GeoBlockRenderer<GeneratorRightCreativeTileEntity> {
	public GeneratorRightCreativeTileRenderer() {
		super(new GeneratorRightCreativeBlockModel());
	}

	@Override
	public RenderType getRenderType(GeneratorRightCreativeTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
