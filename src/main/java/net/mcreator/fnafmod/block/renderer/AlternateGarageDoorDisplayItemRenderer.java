package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.AlternateGarageDoorDisplayModel;
import net.mcreator.fnafmod.block.display.AlternateGarageDoorDisplayItem;

public class AlternateGarageDoorDisplayItemRenderer extends GeoItemRenderer<AlternateGarageDoorDisplayItem> {
	public AlternateGarageDoorDisplayItemRenderer() {
		super(new AlternateGarageDoorDisplayModel());
	}

	@Override
	public RenderType getRenderType(AlternateGarageDoorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
