package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.LargeIndustrialDoorDisplayModel;
import net.mcreator.fnafmod.block.display.LargeIndustrialDoorDisplayItem;

public class LargeIndustrialDoorDisplayItemRenderer extends GeoItemRenderer<LargeIndustrialDoorDisplayItem> {
	public LargeIndustrialDoorDisplayItemRenderer() {
		super(new LargeIndustrialDoorDisplayModel());
	}

	@Override
	public RenderType getRenderType(LargeIndustrialDoorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
