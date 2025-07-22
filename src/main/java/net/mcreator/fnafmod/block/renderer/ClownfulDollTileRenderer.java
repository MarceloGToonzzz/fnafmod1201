package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.ClownfulDollBlockModel;
import net.mcreator.fnafmod.block.entity.ClownfulDollTileEntity;

public class ClownfulDollTileRenderer extends GeoBlockRenderer<ClownfulDollTileEntity> {
	public ClownfulDollTileRenderer() {
		super(new ClownfulDollBlockModel());
	}

	@Override
	public RenderType getRenderType(ClownfulDollTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
