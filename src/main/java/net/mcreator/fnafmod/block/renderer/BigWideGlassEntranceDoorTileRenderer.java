package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.BigWideGlassEntranceDoorBlockModel;
import net.mcreator.fnafmod.block.entity.BigWideGlassEntranceDoorTileEntity;

public class BigWideGlassEntranceDoorTileRenderer extends GeoBlockRenderer<BigWideGlassEntranceDoorTileEntity> {
	public BigWideGlassEntranceDoorTileRenderer() {
		super(new BigWideGlassEntranceDoorBlockModel());
	}

	@Override
	public RenderType getRenderType(BigWideGlassEntranceDoorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
