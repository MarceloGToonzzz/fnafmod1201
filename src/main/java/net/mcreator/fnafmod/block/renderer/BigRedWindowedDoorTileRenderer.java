package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.BigRedWindowedDoorBlockModel;
import net.mcreator.fnafmod.block.entity.BigRedWindowedDoorTileEntity;

public class BigRedWindowedDoorTileRenderer extends GeoBlockRenderer<BigRedWindowedDoorTileEntity> {
	public BigRedWindowedDoorTileRenderer() {
		super(new BigRedWindowedDoorBlockModel());
	}

	@Override
	public RenderType getRenderType(BigRedWindowedDoorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
