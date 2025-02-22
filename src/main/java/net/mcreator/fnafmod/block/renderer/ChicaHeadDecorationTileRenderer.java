package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.ChicaHeadDecorationBlockModel;
import net.mcreator.fnafmod.block.entity.ChicaHeadDecorationTileEntity;

public class ChicaHeadDecorationTileRenderer extends GeoBlockRenderer<ChicaHeadDecorationTileEntity> {
	public ChicaHeadDecorationTileRenderer() {
		super(new ChicaHeadDecorationBlockModel());
	}

	@Override
	public RenderType getRenderType(ChicaHeadDecorationTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
