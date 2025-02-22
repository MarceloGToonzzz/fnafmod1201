package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.FoxyHeadDecorationBlockModel;
import net.mcreator.fnafmod.block.entity.FoxyHeadDecorationTileEntity;

public class FoxyHeadDecorationTileRenderer extends GeoBlockRenderer<FoxyHeadDecorationTileEntity> {
	public FoxyHeadDecorationTileRenderer() {
		super(new FoxyHeadDecorationBlockModel());
	}

	@Override
	public RenderType getRenderType(FoxyHeadDecorationTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
