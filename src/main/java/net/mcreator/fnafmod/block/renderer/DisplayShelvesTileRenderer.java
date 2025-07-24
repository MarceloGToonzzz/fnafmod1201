package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.DisplayShelvesBlockModel;
import net.mcreator.fnafmod.block.entity.DisplayShelvesTileEntity;

public class DisplayShelvesTileRenderer extends GeoBlockRenderer<DisplayShelvesTileEntity> {
	public DisplayShelvesTileRenderer() {
		super(new DisplayShelvesBlockModel());
	}

	@Override
	public RenderType getRenderType(DisplayShelvesTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
