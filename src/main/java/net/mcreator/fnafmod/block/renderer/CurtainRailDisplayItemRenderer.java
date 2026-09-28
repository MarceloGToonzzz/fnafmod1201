package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.CurtainRailDisplayModel;
import net.mcreator.fnafmod.block.display.CurtainRailDisplayItem;

public class CurtainRailDisplayItemRenderer extends GeoItemRenderer<CurtainRailDisplayItem> {
	public CurtainRailDisplayItemRenderer() {
		super(new CurtainRailDisplayModel());
	}

	@Override
	public RenderType getRenderType(CurtainRailDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
