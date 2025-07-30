package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.BigWideCyanKitchenDoorBlockModel;
import net.mcreator.fnafmod.block.entity.BigWideCyanKitchenDoorTileEntity;

public class BigWideCyanKitchenDoorTileRenderer extends GeoBlockRenderer<BigWideCyanKitchenDoorTileEntity> {
	public BigWideCyanKitchenDoorTileRenderer() {
		super(new BigWideCyanKitchenDoorBlockModel());
	}

	@Override
	public RenderType getRenderType(BigWideCyanKitchenDoorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
