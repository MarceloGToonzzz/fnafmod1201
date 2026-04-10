package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.DisplayMonitorBlockModel;
import net.mcreator.fnafmod.block.entity.DisplayMonitorTileEntity;

public class DisplayMonitorTileRenderer extends GeoBlockRenderer<DisplayMonitorTileEntity> {
	public DisplayMonitorTileRenderer() {
		super(new DisplayMonitorBlockModel());
	}

	@Override
	public RenderType getRenderType(DisplayMonitorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
