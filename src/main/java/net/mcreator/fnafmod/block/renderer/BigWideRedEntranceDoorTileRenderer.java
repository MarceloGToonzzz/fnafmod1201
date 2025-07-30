package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.BigWideRedEntranceDoorBlockModel;
import net.mcreator.fnafmod.block.entity.BigWideRedEntranceDoorTileEntity;

public class BigWideRedEntranceDoorTileRenderer extends GeoBlockRenderer<BigWideRedEntranceDoorTileEntity> {
	public BigWideRedEntranceDoorTileRenderer() {
		super(new BigWideRedEntranceDoorBlockModel());
	}

	@Override
	public RenderType getRenderType(BigWideRedEntranceDoorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
