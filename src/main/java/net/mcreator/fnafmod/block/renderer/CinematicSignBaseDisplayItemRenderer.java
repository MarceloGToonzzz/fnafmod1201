package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.CinematicSignBaseDisplayModel;
import net.mcreator.fnafmod.block.display.CinematicSignBaseDisplayItem;

public class CinematicSignBaseDisplayItemRenderer extends GeoItemRenderer<CinematicSignBaseDisplayItem> {
	public CinematicSignBaseDisplayItemRenderer() {
		super(new CinematicSignBaseDisplayModel());
	}

	@Override
	public RenderType getRenderType(CinematicSignBaseDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
