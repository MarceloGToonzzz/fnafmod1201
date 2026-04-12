package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.PizzaToppingsBlockModel;
import net.mcreator.fnafmod.block.entity.PizzaToppingsTileEntity;

public class PizzaToppingsTileRenderer extends GeoBlockRenderer<PizzaToppingsTileEntity> {
	public PizzaToppingsTileRenderer() {
		super(new PizzaToppingsBlockModel());
	}

	@Override
	public RenderType getRenderType(PizzaToppingsTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
