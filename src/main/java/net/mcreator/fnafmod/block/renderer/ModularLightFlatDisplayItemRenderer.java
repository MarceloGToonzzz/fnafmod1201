package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.ModularLightFlatDisplayModel;
import net.mcreator.fnafmod.block.display.ModularLightFlatDisplayItem;

public class ModularLightFlatDisplayItemRenderer extends GeoItemRenderer<ModularLightFlatDisplayItem> {
	public ModularLightFlatDisplayItemRenderer() {
		super(new ModularLightFlatDisplayModel());
	}

	@Override
	public RenderType getRenderType(ModularLightFlatDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
