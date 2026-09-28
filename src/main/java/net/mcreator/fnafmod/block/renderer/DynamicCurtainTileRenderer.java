package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.DynamicCurtainBlockModel;
import net.mcreator.fnafmod.block.entity.DynamicCurtainTileEntity;

public class DynamicCurtainTileRenderer extends GeoBlockRenderer<DynamicCurtainTileEntity> {
	public DynamicCurtainTileRenderer() {
		super(new DynamicCurtainBlockModel());
	}

	@Override
	public RenderType getRenderType(DynamicCurtainTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
