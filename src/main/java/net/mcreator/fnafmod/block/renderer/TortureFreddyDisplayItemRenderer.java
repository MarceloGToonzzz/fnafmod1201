package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.TortureFreddyDisplayModel;
import net.mcreator.fnafmod.block.display.TortureFreddyDisplayItem;

public class TortureFreddyDisplayItemRenderer extends GeoItemRenderer<TortureFreddyDisplayItem> {
	public TortureFreddyDisplayItemRenderer() {
		super(new TortureFreddyDisplayModel());
	}

	@Override
	public RenderType getRenderType(TortureFreddyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
