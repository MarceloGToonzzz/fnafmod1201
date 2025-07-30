package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.BigRedEntranceDoorBlockModel;
import net.mcreator.fnafmod.block.entity.BigRedEntranceDoorTileEntity;

public class BigRedEntranceDoorTileRenderer extends GeoBlockRenderer<BigRedEntranceDoorTileEntity> {
	public BigRedEntranceDoorTileRenderer() {
		super(new BigRedEntranceDoorBlockModel());
	}

	@Override
	public RenderType getRenderType(BigRedEntranceDoorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
