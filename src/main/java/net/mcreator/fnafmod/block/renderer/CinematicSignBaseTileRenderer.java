package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.CinematicSignBaseBlockModel;
import net.mcreator.fnafmod.block.entity.CinematicSignBaseTileEntity;

public class CinematicSignBaseTileRenderer extends GeoBlockRenderer<CinematicSignBaseTileEntity> {
	public CinematicSignBaseTileRenderer() {
		super(new CinematicSignBaseBlockModel());
	}

	@Override
	public RenderType getRenderType(CinematicSignBaseTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
