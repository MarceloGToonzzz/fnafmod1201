package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.IndustrialFanBlockModel;
import net.mcreator.fnafmod.block.entity.IndustrialFanTileEntity;

public class IndustrialFanTileRenderer extends GeoBlockRenderer<IndustrialFanTileEntity> {
	public IndustrialFanTileRenderer() {
		super(new IndustrialFanBlockModel());
	}

	@Override
	public RenderType getRenderType(IndustrialFanTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
