package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.UnWitheredChicaHeadBlockModel;
import net.mcreator.fnafmod.block.entity.UnWitheredChicaHeadTileEntity;

public class UnWitheredChicaHeadTileRenderer extends GeoBlockRenderer<UnWitheredChicaHeadTileEntity> {
	public UnWitheredChicaHeadTileRenderer() {
		super(new UnWitheredChicaHeadBlockModel());
	}

	@Override
	public RenderType getRenderType(UnWitheredChicaHeadTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
