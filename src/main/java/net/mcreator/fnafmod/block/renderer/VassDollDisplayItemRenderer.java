package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.VassDollDisplayModel;
import net.mcreator.fnafmod.block.display.VassDollDisplayItem;

public class VassDollDisplayItemRenderer extends GeoItemRenderer<VassDollDisplayItem> {
	public VassDollDisplayItemRenderer() {
		super(new VassDollDisplayModel());
	}

	@Override
	public RenderType getRenderType(VassDollDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
