package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.LargeIndustrialDoorBlockModel;
import net.mcreator.fnafmod.block.entity.LargeIndustrialDoorTileEntity;

public class LargeIndustrialDoorTileRenderer extends GeoBlockRenderer<LargeIndustrialDoorTileEntity> {
	public LargeIndustrialDoorTileRenderer() {
		super(new LargeIndustrialDoorBlockModel());
	}

	@Override
	public RenderType getRenderType(LargeIndustrialDoorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
