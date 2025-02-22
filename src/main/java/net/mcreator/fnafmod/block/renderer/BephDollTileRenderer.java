package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.BephDollBlockModel;
import net.mcreator.fnafmod.block.entity.BephDollTileEntity;

public class BephDollTileRenderer extends GeoBlockRenderer<BephDollTileEntity> {
	public BephDollTileRenderer() {
		super(new BephDollBlockModel());
	}

	@Override
	public RenderType getRenderType(BephDollTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
