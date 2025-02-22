package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.FredbearHeadBlockModel;
import net.mcreator.fnafmod.block.entity.FredbearHeadTileEntity;

public class FredbearHeadTileRenderer extends GeoBlockRenderer<FredbearHeadTileEntity> {
	public FredbearHeadTileRenderer() {
		super(new FredbearHeadBlockModel());
	}

	@Override
	public RenderType getRenderType(FredbearHeadTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
