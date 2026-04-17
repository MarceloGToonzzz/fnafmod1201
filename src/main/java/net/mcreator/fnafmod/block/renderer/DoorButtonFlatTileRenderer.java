package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.DoorButtonFlatBlockModel;
import net.mcreator.fnafmod.block.entity.DoorButtonFlatTileEntity;

public class DoorButtonFlatTileRenderer extends GeoBlockRenderer<DoorButtonFlatTileEntity> {
	public DoorButtonFlatTileRenderer() {
		super(new DoorButtonFlatBlockModel());
	}

	@Override
	public RenderType getRenderType(DoorButtonFlatTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
