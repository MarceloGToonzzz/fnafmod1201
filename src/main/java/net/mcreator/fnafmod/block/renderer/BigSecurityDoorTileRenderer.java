package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.BigSecurityDoorBlockModel;
import net.mcreator.fnafmod.block.entity.BigSecurityDoorTileEntity;

public class BigSecurityDoorTileRenderer extends GeoBlockRenderer<BigSecurityDoorTileEntity> {
	public BigSecurityDoorTileRenderer() {
		super(new BigSecurityDoorBlockModel());
	}

	@Override
	public RenderType getRenderType(BigSecurityDoorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
