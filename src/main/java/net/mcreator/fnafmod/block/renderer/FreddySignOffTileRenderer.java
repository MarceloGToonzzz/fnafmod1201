package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.FreddySignOffBlockModel;
import net.mcreator.fnafmod.block.entity.FreddySignOffTileEntity;

public class FreddySignOffTileRenderer extends GeoBlockRenderer<FreddySignOffTileEntity> {
	public FreddySignOffTileRenderer() {
		super(new FreddySignOffBlockModel());
	}

	@Override
	public RenderType getRenderType(FreddySignOffTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
