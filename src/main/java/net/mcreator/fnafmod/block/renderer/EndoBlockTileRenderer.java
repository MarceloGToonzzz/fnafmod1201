package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.EndoBlockBlockModel;
import net.mcreator.fnafmod.block.entity.EndoBlockTileEntity;

public class EndoBlockTileRenderer extends GeoBlockRenderer<EndoBlockTileEntity> {
	public EndoBlockTileRenderer() {
		super(new EndoBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(EndoBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
