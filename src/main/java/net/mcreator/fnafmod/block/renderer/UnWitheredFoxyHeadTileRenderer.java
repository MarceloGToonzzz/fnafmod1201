package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.UnWitheredFoxyHeadBlockModel;
import net.mcreator.fnafmod.block.entity.UnWitheredFoxyHeadTileEntity;

public class UnWitheredFoxyHeadTileRenderer extends GeoBlockRenderer<UnWitheredFoxyHeadTileEntity> {
	public UnWitheredFoxyHeadTileRenderer() {
		super(new UnWitheredFoxyHeadBlockModel());
	}

	@Override
	public RenderType getRenderType(UnWitheredFoxyHeadTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
