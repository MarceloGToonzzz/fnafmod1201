package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.ToyFreddySignOffBlockModel;
import net.mcreator.fnafmod.block.entity.ToyFreddySignOffTileEntity;

public class ToyFreddySignOffTileRenderer extends GeoBlockRenderer<ToyFreddySignOffTileEntity> {
	public ToyFreddySignOffTileRenderer() {
		super(new ToyFreddySignOffBlockModel());
	}

	@Override
	public RenderType getRenderType(ToyFreddySignOffTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
