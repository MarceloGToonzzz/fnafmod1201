package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.StageLightOrangeBlockModel;
import net.mcreator.fnafmod.block.entity.StageLightOrangeTileEntity;

public class StageLightOrangeTileRenderer extends GeoBlockRenderer<StageLightOrangeTileEntity> {
	public StageLightOrangeTileRenderer() {
		super(new StageLightOrangeBlockModel());
	}

	@Override
	public RenderType getRenderType(StageLightOrangeTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
