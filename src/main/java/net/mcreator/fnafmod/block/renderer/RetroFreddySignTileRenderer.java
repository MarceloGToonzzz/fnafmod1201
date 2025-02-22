package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.RetroFreddySignBlockModel;
import net.mcreator.fnafmod.block.entity.RetroFreddySignTileEntity;

public class RetroFreddySignTileRenderer extends GeoBlockRenderer<RetroFreddySignTileEntity> {
	public RetroFreddySignTileRenderer() {
		super(new RetroFreddySignBlockModel());
	}

	@Override
	public RenderType getRenderType(RetroFreddySignTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
