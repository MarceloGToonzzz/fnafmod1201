package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.SpringBonnieDecorBlockModel;
import net.mcreator.fnafmod.block.entity.SpringBonnieDecorTileEntity;

public class SpringBonnieDecorTileRenderer extends GeoBlockRenderer<SpringBonnieDecorTileEntity> {
	public SpringBonnieDecorTileRenderer() {
		super(new SpringBonnieDecorBlockModel());
	}

	@Override
	public RenderType getRenderType(SpringBonnieDecorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
