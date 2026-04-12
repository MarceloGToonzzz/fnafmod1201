package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.ModularLightDisplayModel;
import net.mcreator.fnafmod.block.display.ModularLightDisplayItem;

public class ModularLightDisplayItemRenderer extends GeoItemRenderer<ModularLightDisplayItem> {
	public ModularLightDisplayItemRenderer() {
		super(new ModularLightDisplayModel());
	}

	@Override
	public RenderType getRenderType(ModularLightDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
