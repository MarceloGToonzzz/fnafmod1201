package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.UnWitheredBonnieHeadDisplayModel;
import net.mcreator.fnafmod.block.display.UnWitheredBonnieHeadDisplayItem;

public class UnWitheredBonnieHeadDisplayItemRenderer extends GeoItemRenderer<UnWitheredBonnieHeadDisplayItem> {
	public UnWitheredBonnieHeadDisplayItemRenderer() {
		super(new UnWitheredBonnieHeadDisplayModel());
	}

	@Override
	public RenderType getRenderType(UnWitheredBonnieHeadDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
