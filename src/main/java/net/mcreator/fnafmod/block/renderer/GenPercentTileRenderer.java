package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.GenPercentBlockModel;
import net.mcreator.fnafmod.block.entity.GenPercentTileEntity;

public class GenPercentTileRenderer extends GeoBlockRenderer<GenPercentTileEntity> {
	public GenPercentTileRenderer() {
		super(new GenPercentBlockModel());
	}

	@Override
	public RenderType getRenderType(GenPercentTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
