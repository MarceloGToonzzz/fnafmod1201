package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.VassDollBlockModel;
import net.mcreator.fnafmod.block.entity.VassDollTileEntity;

public class VassDollTileRenderer extends GeoBlockRenderer<VassDollTileEntity> {
	public VassDollTileRenderer() {
		super(new VassDollBlockModel());
	}

	@Override
	public RenderType getRenderType(VassDollTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
