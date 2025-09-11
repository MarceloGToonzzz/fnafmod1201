package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.GarageDoorBlockModel;
import net.mcreator.fnafmod.block.entity.GarageDoorTileEntity;

public class GarageDoorTileRenderer extends GeoBlockRenderer<GarageDoorTileEntity> {
	public GarageDoorTileRenderer() {
		super(new GarageDoorBlockModel());
	}

	@Override
	public RenderType getRenderType(GarageDoorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
