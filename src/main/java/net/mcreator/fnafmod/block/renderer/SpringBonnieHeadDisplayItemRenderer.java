package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.SpringBonnieHeadDisplayModel;
import net.mcreator.fnafmod.block.display.SpringBonnieHeadDisplayItem;

public class SpringBonnieHeadDisplayItemRenderer extends GeoItemRenderer<SpringBonnieHeadDisplayItem> {
	public SpringBonnieHeadDisplayItemRenderer() {
		super(new SpringBonnieHeadDisplayModel());
	}

	@Override
	public RenderType getRenderType(SpringBonnieHeadDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
