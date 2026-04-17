package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.DoorButtonFlatDisplayModel;
import net.mcreator.fnafmod.block.display.DoorButtonFlatDisplayItem;

public class DoorButtonFlatDisplayItemRenderer extends GeoItemRenderer<DoorButtonFlatDisplayItem> {
	public DoorButtonFlatDisplayItemRenderer() {
		super(new DoorButtonFlatDisplayModel());
	}

	@Override
	public RenderType getRenderType(DoorButtonFlatDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
