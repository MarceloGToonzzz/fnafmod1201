package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.BonnieHeadDisplayModel;
import net.mcreator.fnafmod.block.display.BonnieHeadDisplayItem;

public class BonnieHeadDisplayItemRenderer extends GeoItemRenderer<BonnieHeadDisplayItem> {
	public BonnieHeadDisplayItemRenderer() {
		super(new BonnieHeadDisplayModel());
	}

	@Override
	public RenderType getRenderType(BonnieHeadDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
