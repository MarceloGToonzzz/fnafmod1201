package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.BigWideDualColourEntranceDoorDisplayModel;
import net.mcreator.fnafmod.block.display.BigWideDualColourEntranceDoorDisplayItem;

public class BigWideDualColourEntranceDoorDisplayItemRenderer extends GeoItemRenderer<BigWideDualColourEntranceDoorDisplayItem> {
	public BigWideDualColourEntranceDoorDisplayItemRenderer() {
		super(new BigWideDualColourEntranceDoorDisplayModel());
	}

	@Override
	public RenderType getRenderType(BigWideDualColourEntranceDoorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
