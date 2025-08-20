package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.CinematicSignBaseSequelDisplayModel;
import net.mcreator.fnafmod.block.display.CinematicSignBaseSequelDisplayItem;

public class CinematicSignBaseSequelDisplayItemRenderer extends GeoItemRenderer<CinematicSignBaseSequelDisplayItem> {
	public CinematicSignBaseSequelDisplayItemRenderer() {
		super(new CinematicSignBaseSequelDisplayModel());
	}

	@Override
	public RenderType getRenderType(CinematicSignBaseSequelDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
