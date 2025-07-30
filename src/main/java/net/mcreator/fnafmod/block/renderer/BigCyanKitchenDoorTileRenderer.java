package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.BigCyanKitchenDoorBlockModel;
import net.mcreator.fnafmod.block.entity.BigCyanKitchenDoorTileEntity;

public class BigCyanKitchenDoorTileRenderer extends GeoBlockRenderer<BigCyanKitchenDoorTileEntity> {
	public BigCyanKitchenDoorTileRenderer() {
		super(new BigCyanKitchenDoorBlockModel());
	}

	@Override
	public RenderType getRenderType(BigCyanKitchenDoorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
