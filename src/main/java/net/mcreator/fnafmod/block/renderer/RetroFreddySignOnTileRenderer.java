package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.RetroFreddySignOnBlockModel;
import net.mcreator.fnafmod.block.entity.RetroFreddySignOnTileEntity;

public class RetroFreddySignOnTileRenderer extends GeoBlockRenderer<RetroFreddySignOnTileEntity> {
	public RetroFreddySignOnTileRenderer() {
		super(new RetroFreddySignOnBlockModel());
	}

	@Override
	public RenderType getRenderType(RetroFreddySignOnTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
