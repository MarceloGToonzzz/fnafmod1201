package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.StageLightGreenOnBlockModel;
import net.mcreator.fnafmod.block.entity.StageLightGreenOnTileEntity;

public class StageLightGreenOnTileRenderer extends GeoBlockRenderer<StageLightGreenOnTileEntity> {
	public StageLightGreenOnTileRenderer() {
		super(new StageLightGreenOnBlockModel());
	}

	@Override
	public RenderType getRenderType(StageLightGreenOnTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
