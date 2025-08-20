package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.CinematicSignToysDisplayModel;
import net.mcreator.fnafmod.block.display.CinematicSignToysDisplayItem;

public class CinematicSignToysDisplayItemRenderer extends GeoItemRenderer<CinematicSignToysDisplayItem> {
	public CinematicSignToysDisplayItemRenderer() {
		super(new CinematicSignToysDisplayModel());
	}

	@Override
	public RenderType getRenderType(CinematicSignToysDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
