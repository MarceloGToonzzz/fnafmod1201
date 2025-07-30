package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.BigClosetDoorBlockModel;
import net.mcreator.fnafmod.block.entity.BigClosetDoorTileEntity;

public class BigClosetDoorTileRenderer extends GeoBlockRenderer<BigClosetDoorTileEntity> {
	public BigClosetDoorTileRenderer() {
		super(new BigClosetDoorBlockModel());
	}

	@Override
	public RenderType getRenderType(BigClosetDoorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
