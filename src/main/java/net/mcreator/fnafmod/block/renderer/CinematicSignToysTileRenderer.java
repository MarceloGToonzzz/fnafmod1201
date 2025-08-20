package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.CinematicSignToysBlockModel;
import net.mcreator.fnafmod.block.entity.CinematicSignToysTileEntity;

public class CinematicSignToysTileRenderer extends GeoBlockRenderer<CinematicSignToysTileEntity> {
	public CinematicSignToysTileRenderer() {
		super(new CinematicSignToysBlockModel());
	}

	@Override
	public RenderType getRenderType(CinematicSignToysTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
