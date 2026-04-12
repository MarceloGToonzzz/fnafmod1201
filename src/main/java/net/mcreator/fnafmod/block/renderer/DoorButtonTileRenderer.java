package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.DoorButtonBlockModel;
import net.mcreator.fnafmod.block.entity.DoorButtonTileEntity;

public class DoorButtonTileRenderer extends GeoBlockRenderer<DoorButtonTileEntity> {
	public DoorButtonTileRenderer() {
		super(new DoorButtonBlockModel());
	}

	@Override
	public RenderType getRenderType(DoorButtonTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
