package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.UnWitheredFreddyHeadBlockModel;
import net.mcreator.fnafmod.block.entity.UnWitheredFreddyHeadTileEntity;

public class UnWitheredFreddyHeadTileRenderer extends GeoBlockRenderer<UnWitheredFreddyHeadTileEntity> {
	public UnWitheredFreddyHeadTileRenderer() {
		super(new UnWitheredFreddyHeadBlockModel());
	}

	@Override
	public RenderType getRenderType(UnWitheredFreddyHeadTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
