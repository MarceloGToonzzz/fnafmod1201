package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.LightButtonBlockModel;
import net.mcreator.fnafmod.block.entity.LightButtonTileEntity;

public class LightButtonTileRenderer extends GeoBlockRenderer<LightButtonTileEntity> {
	public LightButtonTileRenderer() {
		super(new LightButtonBlockModel());
	}

	@Override
	public RenderType getRenderType(LightButtonTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
