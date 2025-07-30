package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.BigCyanBackstageDoorBlockModel;
import net.mcreator.fnafmod.block.entity.BigCyanBackstageDoorTileEntity;

public class BigCyanBackstageDoorTileRenderer extends GeoBlockRenderer<BigCyanBackstageDoorTileEntity> {
	public BigCyanBackstageDoorTileRenderer() {
		super(new BigCyanBackstageDoorBlockModel());
	}

	@Override
	public RenderType getRenderType(BigCyanBackstageDoorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
