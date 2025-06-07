package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.ConnectingTableBlockModel;
import net.mcreator.fnafmod.block.entity.ConnectingTableTileEntity;

public class ConnectingTableTileRenderer extends GeoBlockRenderer<ConnectingTableTileEntity> {
	public ConnectingTableTileRenderer() {
		super(new ConnectingTableBlockModel());
	}

	@Override
	public RenderType getRenderType(ConnectingTableTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
