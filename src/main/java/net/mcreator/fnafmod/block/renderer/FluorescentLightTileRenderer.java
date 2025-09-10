package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.FluorescentLightBlockModel;
import net.mcreator.fnafmod.block.entity.FluorescentLightTileEntity;

public class FluorescentLightTileRenderer extends GeoBlockRenderer<FluorescentLightTileEntity> {
	public FluorescentLightTileRenderer() {
		super(new FluorescentLightBlockModel());
	}

	@Override
	public RenderType getRenderType(FluorescentLightTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
