package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.CenteredFreddySignBlockModel;
import net.mcreator.fnafmod.block.entity.CenteredFreddySignTileEntity;

public class CenteredFreddySignTileRenderer extends GeoBlockRenderer<CenteredFreddySignTileEntity> {
	public CenteredFreddySignTileRenderer() {
		super(new CenteredFreddySignBlockModel());
	}

	@Override
	public RenderType getRenderType(CenteredFreddySignTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
