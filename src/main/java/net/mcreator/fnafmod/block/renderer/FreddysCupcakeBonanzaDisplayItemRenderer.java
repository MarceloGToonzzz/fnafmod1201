package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.FreddysCupcakeBonanzaDisplayModel;
import net.mcreator.fnafmod.block.display.FreddysCupcakeBonanzaDisplayItem;

public class FreddysCupcakeBonanzaDisplayItemRenderer extends GeoItemRenderer<FreddysCupcakeBonanzaDisplayItem> {
	public FreddysCupcakeBonanzaDisplayItemRenderer() {
		super(new FreddysCupcakeBonanzaDisplayModel());
	}

	@Override
	public RenderType getRenderType(FreddysCupcakeBonanzaDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
