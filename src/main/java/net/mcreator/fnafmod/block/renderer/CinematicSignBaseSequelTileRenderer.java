package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.CinematicSignBaseSequelBlockModel;
import net.mcreator.fnafmod.block.entity.CinematicSignBaseSequelTileEntity;

public class CinematicSignBaseSequelTileRenderer extends GeoBlockRenderer<CinematicSignBaseSequelTileEntity> {
	public CinematicSignBaseSequelTileRenderer() {
		super(new CinematicSignBaseSequelBlockModel());
	}

	@Override
	public RenderType getRenderType(CinematicSignBaseSequelTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
