package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.BigWideDualColourEntranceDoorBlockModel;
import net.mcreator.fnafmod.block.entity.BigWideDualColourEntranceDoorTileEntity;

public class BigWideDualColourEntranceDoorTileRenderer extends GeoBlockRenderer<BigWideDualColourEntranceDoorTileEntity> {
	public BigWideDualColourEntranceDoorTileRenderer() {
		super(new BigWideDualColourEntranceDoorBlockModel());
	}

	@Override
	public RenderType getRenderType(BigWideDualColourEntranceDoorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
