package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.CelebrateFunBlockModel;
import net.mcreator.fnafmod.block.entity.CelebrateFunTileEntity;

public class CelebrateFunTileRenderer extends GeoBlockRenderer<CelebrateFunTileEntity> {
	public CelebrateFunTileRenderer() {
		super(new CelebrateFunBlockModel());
	}

	@Override
	public RenderType getRenderType(CelebrateFunTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
