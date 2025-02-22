package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.StageLightPinkOnBlockModel;
import net.mcreator.fnafmod.block.entity.StageLightPinkOnTileEntity;

public class StageLightPinkOnTileRenderer extends GeoBlockRenderer<StageLightPinkOnTileEntity> {
	public StageLightPinkOnTileRenderer() {
		super(new StageLightPinkOnBlockModel());
	}

	@Override
	public RenderType getRenderType(StageLightPinkOnTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
