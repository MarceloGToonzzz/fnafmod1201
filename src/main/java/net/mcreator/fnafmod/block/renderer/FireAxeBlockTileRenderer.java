package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.FireAxeBlockBlockModel;
import net.mcreator.fnafmod.block.entity.FireAxeBlockTileEntity;

public class FireAxeBlockTileRenderer extends GeoBlockRenderer<FireAxeBlockTileEntity> {
	public FireAxeBlockTileRenderer() {
		super(new FireAxeBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(FireAxeBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
