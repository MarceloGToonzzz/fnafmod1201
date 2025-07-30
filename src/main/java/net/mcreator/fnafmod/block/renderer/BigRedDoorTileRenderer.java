package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.BigRedDoorBlockModel;
import net.mcreator.fnafmod.block.entity.BigRedDoorTileEntity;

public class BigRedDoorTileRenderer extends GeoBlockRenderer<BigRedDoorTileEntity> {
	public BigRedDoorTileRenderer() {
		super(new BigRedDoorBlockModel());
	}

	@Override
	public RenderType getRenderType(BigRedDoorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
