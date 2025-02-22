package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.FreddyHeadBlockModel;
import net.mcreator.fnafmod.block.entity.FreddyHeadTileEntity;

public class FreddyHeadTileRenderer extends GeoBlockRenderer<FreddyHeadTileEntity> {
	public FreddyHeadTileRenderer() {
		super(new FreddyHeadBlockModel());
	}

	@Override
	public RenderType getRenderType(FreddyHeadTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
