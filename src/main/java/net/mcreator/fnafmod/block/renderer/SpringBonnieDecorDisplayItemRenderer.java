package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.SpringBonnieDecorDisplayModel;
import net.mcreator.fnafmod.block.display.SpringBonnieDecorDisplayItem;

public class SpringBonnieDecorDisplayItemRenderer extends GeoItemRenderer<SpringBonnieDecorDisplayItem> {
	public SpringBonnieDecorDisplayItemRenderer() {
		super(new SpringBonnieDecorDisplayModel());
	}

	@Override
	public RenderType getRenderType(SpringBonnieDecorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
