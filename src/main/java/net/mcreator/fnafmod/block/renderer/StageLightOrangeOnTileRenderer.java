package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.StageLightOrangeOnBlockModel;
import net.mcreator.fnafmod.block.entity.StageLightOrangeOnTileEntity;

public class StageLightOrangeOnTileRenderer extends GeoBlockRenderer<StageLightOrangeOnTileEntity> {
	public StageLightOrangeOnTileRenderer() {
		super(new StageLightOrangeOnBlockModel());
	}

	@Override
	public RenderType getRenderType(StageLightOrangeOnTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
