package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.FoxyHeadBlockModel;
import net.mcreator.fnafmod.block.entity.FoxyHeadTileEntity;

public class FoxyHeadTileRenderer extends GeoBlockRenderer<FoxyHeadTileEntity> {
	public FoxyHeadTileRenderer() {
		super(new FoxyHeadBlockModel());
	}

	@Override
	public RenderType getRenderType(FoxyHeadTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
