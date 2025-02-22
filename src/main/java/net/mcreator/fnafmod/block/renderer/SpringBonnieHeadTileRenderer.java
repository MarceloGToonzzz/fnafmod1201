package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.SpringBonnieHeadBlockModel;
import net.mcreator.fnafmod.block.entity.SpringBonnieHeadTileEntity;

public class SpringBonnieHeadTileRenderer extends GeoBlockRenderer<SpringBonnieHeadTileEntity> {
	public SpringBonnieHeadTileRenderer() {
		super(new SpringBonnieHeadBlockModel());
	}

	@Override
	public RenderType getRenderType(SpringBonnieHeadTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
