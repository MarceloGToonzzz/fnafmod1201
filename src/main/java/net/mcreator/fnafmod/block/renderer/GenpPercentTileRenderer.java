package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.GenpPercentBlockModel;
import net.mcreator.fnafmod.block.entity.GenpPercentTileEntity;

public class GenpPercentTileRenderer extends GeoBlockRenderer<GenpPercentTileEntity> {
	public GenpPercentTileRenderer() {
		super(new GenpPercentBlockModel());
	}

	@Override
	public RenderType getRenderType(GenpPercentTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
