package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.GeneratorMiddlePowerDisplayModel;
import net.mcreator.fnafmod.block.display.GeneratorMiddlePowerDisplayItem;

public class GeneratorMiddlePowerDisplayItemRenderer extends GeoItemRenderer<GeneratorMiddlePowerDisplayItem> {
	public GeneratorMiddlePowerDisplayItemRenderer() {
		super(new GeneratorMiddlePowerDisplayModel());
	}

	@Override
	public RenderType getRenderType(GeneratorMiddlePowerDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
