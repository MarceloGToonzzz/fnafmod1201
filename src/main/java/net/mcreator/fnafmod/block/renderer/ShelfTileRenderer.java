package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.ShelfBlockModel;
import net.mcreator.fnafmod.block.entity.ShelfTileEntity;

public class ShelfTileRenderer extends GeoBlockRenderer<ShelfTileEntity> {
	public ShelfTileRenderer() {
		super(new ShelfBlockModel());
	}

	@Override
	public RenderType getRenderType(ShelfTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
