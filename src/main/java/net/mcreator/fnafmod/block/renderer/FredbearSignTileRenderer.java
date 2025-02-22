package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.FredbearSignBlockModel;
import net.mcreator.fnafmod.block.entity.FredbearSignTileEntity;

public class FredbearSignTileRenderer extends GeoBlockRenderer<FredbearSignTileEntity> {
	public FredbearSignTileRenderer() {
		super(new FredbearSignBlockModel());
	}

	@Override
	public RenderType getRenderType(FredbearSignTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
