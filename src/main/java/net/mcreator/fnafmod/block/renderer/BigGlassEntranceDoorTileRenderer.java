package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.BigGlassEntranceDoorBlockModel;
import net.mcreator.fnafmod.block.entity.BigGlassEntranceDoorTileEntity;

public class BigGlassEntranceDoorTileRenderer extends GeoBlockRenderer<BigGlassEntranceDoorTileEntity> {
	public BigGlassEntranceDoorTileRenderer() {
		super(new BigGlassEntranceDoorBlockModel());
	}

	@Override
	public RenderType getRenderType(BigGlassEntranceDoorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
