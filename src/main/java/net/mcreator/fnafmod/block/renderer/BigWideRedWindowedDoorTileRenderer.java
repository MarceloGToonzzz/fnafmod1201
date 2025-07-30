package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.BigWideRedWindowedDoorBlockModel;
import net.mcreator.fnafmod.block.entity.BigWideRedWindowedDoorTileEntity;

public class BigWideRedWindowedDoorTileRenderer extends GeoBlockRenderer<BigWideRedWindowedDoorTileEntity> {
	public BigWideRedWindowedDoorTileRenderer() {
		super(new BigWideRedWindowedDoorBlockModel());
	}

	@Override
	public RenderType getRenderType(BigWideRedWindowedDoorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
