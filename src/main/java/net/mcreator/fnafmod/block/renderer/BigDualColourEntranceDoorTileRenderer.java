package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.BigDualColourEntranceDoorBlockModel;
import net.mcreator.fnafmod.block.entity.BigDualColourEntranceDoorTileEntity;

public class BigDualColourEntranceDoorTileRenderer extends GeoBlockRenderer<BigDualColourEntranceDoorTileEntity> {
	public BigDualColourEntranceDoorTileRenderer() {
		super(new BigDualColourEntranceDoorBlockModel());
	}

	@Override
	public RenderType getRenderType(BigDualColourEntranceDoorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
