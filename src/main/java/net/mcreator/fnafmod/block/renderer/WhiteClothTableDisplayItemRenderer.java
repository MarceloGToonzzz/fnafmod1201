package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.WhiteClothTableDisplayModel;
import net.mcreator.fnafmod.block.display.WhiteClothTableDisplayItem;

public class WhiteClothTableDisplayItemRenderer extends GeoItemRenderer<WhiteClothTableDisplayItem> {
	public WhiteClothTableDisplayItemRenderer() {
		super(new WhiteClothTableDisplayModel());
	}

	@Override
	public RenderType getRenderType(WhiteClothTableDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
