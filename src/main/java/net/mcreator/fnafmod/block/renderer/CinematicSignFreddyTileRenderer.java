package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.CinematicSignFreddyBlockModel;
import net.mcreator.fnafmod.block.entity.CinematicSignFreddyTileEntity;

public class CinematicSignFreddyTileRenderer extends GeoBlockRenderer<CinematicSignFreddyTileEntity> {
	public CinematicSignFreddyTileRenderer() {
		super(new CinematicSignFreddyBlockModel());
	}

	@Override
	public RenderType getRenderType(CinematicSignFreddyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
