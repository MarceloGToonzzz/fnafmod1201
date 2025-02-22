package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.CenteredFreddySignOnBlockModel;
import net.mcreator.fnafmod.block.entity.CenteredFreddySignOnTileEntity;

public class CenteredFreddySignOnTileRenderer extends GeoBlockRenderer<CenteredFreddySignOnTileEntity> {
	public CenteredFreddySignOnTileRenderer() {
		super(new CenteredFreddySignOnBlockModel());
	}

	@Override
	public RenderType getRenderType(CenteredFreddySignOnTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
