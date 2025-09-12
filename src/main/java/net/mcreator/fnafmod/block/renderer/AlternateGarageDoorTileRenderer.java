package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.AlternateGarageDoorBlockModel;
import net.mcreator.fnafmod.block.entity.AlternateGarageDoorTileEntity;

public class AlternateGarageDoorTileRenderer extends GeoBlockRenderer<AlternateGarageDoorTileEntity> {
	public AlternateGarageDoorTileRenderer() {
		super(new AlternateGarageDoorBlockModel());
	}

	@Override
	public RenderType getRenderType(AlternateGarageDoorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
