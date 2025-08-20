package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.CinematicSignFreddyDisplayModel;
import net.mcreator.fnafmod.block.display.CinematicSignFreddyDisplayItem;

public class CinematicSignFreddyDisplayItemRenderer extends GeoItemRenderer<CinematicSignFreddyDisplayItem> {
	public CinematicSignFreddyDisplayItemRenderer() {
		super(new CinematicSignFreddyDisplayModel());
	}

	@Override
	public RenderType getRenderType(CinematicSignFreddyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
