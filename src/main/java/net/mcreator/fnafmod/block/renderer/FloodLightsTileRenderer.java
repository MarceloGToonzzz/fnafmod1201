package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.FloodLightsBlockModel;
import net.mcreator.fnafmod.block.entity.FloodLightsTileEntity;

public class FloodLightsTileRenderer extends GeoBlockRenderer<FloodLightsTileEntity> {
	public FloodLightsTileRenderer() {
		super(new FloodLightsBlockModel());
	}

	@Override
	public RenderType getRenderType(FloodLightsTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
