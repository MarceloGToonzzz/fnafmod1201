package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.RetroComputerBlockModel;
import net.mcreator.fnafmod.block.entity.RetroComputerTileEntity;

public class RetroComputerTileRenderer extends GeoBlockRenderer<RetroComputerTileEntity> {
	public RetroComputerTileRenderer() {
		super(new RetroComputerBlockModel());
	}

	@Override
	public RenderType getRenderType(RetroComputerTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
