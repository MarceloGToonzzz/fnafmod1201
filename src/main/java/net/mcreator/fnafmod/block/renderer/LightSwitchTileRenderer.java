package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.LightSwitchBlockModel;
import net.mcreator.fnafmod.block.entity.LightSwitchTileEntity;

public class LightSwitchTileRenderer extends GeoBlockRenderer<LightSwitchTileEntity> {
	public LightSwitchTileRenderer() {
		super(new LightSwitchBlockModel());
	}

	@Override
	public RenderType getRenderType(LightSwitchTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
