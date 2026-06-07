package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.FredbearsFetchBlockModel;
import net.mcreator.fnafmod.block.entity.FredbearsFetchTileEntity;

public class FredbearsFetchTileRenderer extends GeoBlockRenderer<FredbearsFetchTileEntity> {
	public FredbearsFetchTileRenderer() {
		super(new FredbearsFetchBlockModel());
	}

	@Override
	public RenderType getRenderType(FredbearsFetchTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
