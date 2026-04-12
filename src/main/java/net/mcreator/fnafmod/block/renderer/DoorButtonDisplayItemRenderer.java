package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.DoorButtonDisplayModel;
import net.mcreator.fnafmod.block.display.DoorButtonDisplayItem;

public class DoorButtonDisplayItemRenderer extends GeoItemRenderer<DoorButtonDisplayItem> {
	public DoorButtonDisplayItemRenderer() {
		super(new DoorButtonDisplayModel());
	}

	@Override
	public RenderType getRenderType(DoorButtonDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
