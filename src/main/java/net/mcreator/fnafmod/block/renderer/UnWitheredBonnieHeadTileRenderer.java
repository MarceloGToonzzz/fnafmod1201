package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.UnWitheredBonnieHeadBlockModel;
import net.mcreator.fnafmod.block.entity.UnWitheredBonnieHeadTileEntity;

public class UnWitheredBonnieHeadTileRenderer extends GeoBlockRenderer<UnWitheredBonnieHeadTileEntity> {
	public UnWitheredBonnieHeadTileRenderer() {
		super(new UnWitheredBonnieHeadBlockModel());
	}

	@Override
	public RenderType getRenderType(UnWitheredBonnieHeadTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
