package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.ConnectingTableDisplayModel;
import net.mcreator.fnafmod.block.display.ConnectingTableDisplayItem;

public class ConnectingTableDisplayItemRenderer extends GeoItemRenderer<ConnectingTableDisplayItem> {
	public ConnectingTableDisplayItemRenderer() {
		super(new ConnectingTableDisplayModel());
	}

	@Override
	public RenderType getRenderType(ConnectingTableDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
