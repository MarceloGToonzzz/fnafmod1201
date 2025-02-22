package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.UnWitheredChicaHeadDisplayModel;
import net.mcreator.fnafmod.block.display.UnWitheredChicaHeadDisplayItem;

public class UnWitheredChicaHeadDisplayItemRenderer extends GeoItemRenderer<UnWitheredChicaHeadDisplayItem> {
	public UnWitheredChicaHeadDisplayItemRenderer() {
		super(new UnWitheredChicaHeadDisplayModel());
	}

	@Override
	public RenderType getRenderType(UnWitheredChicaHeadDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
