package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.IndustrialFanDisplayModel;
import net.mcreator.fnafmod.block.display.IndustrialFanDisplayItem;

public class IndustrialFanDisplayItemRenderer extends GeoItemRenderer<IndustrialFanDisplayItem> {
	public IndustrialFanDisplayItemRenderer() {
		super(new IndustrialFanDisplayModel());
	}

	@Override
	public RenderType getRenderType(IndustrialFanDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
