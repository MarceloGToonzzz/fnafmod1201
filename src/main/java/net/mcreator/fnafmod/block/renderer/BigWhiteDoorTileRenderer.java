package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.BigWhiteDoorBlockModel;
import net.mcreator.fnafmod.block.entity.BigWhiteDoorTileEntity;

public class BigWhiteDoorTileRenderer extends GeoBlockRenderer<BigWhiteDoorTileEntity> {
	public BigWhiteDoorTileRenderer() {
		super(new BigWhiteDoorBlockModel());
	}

	@Override
	public RenderType getRenderType(BigWhiteDoorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
