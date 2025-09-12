package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.TortureChairBlockModel;
import net.mcreator.fnafmod.block.entity.TortureChairTileEntity;

public class TortureChairTileRenderer extends GeoBlockRenderer<TortureChairTileEntity> {
	public TortureChairTileRenderer() {
		super(new TortureChairBlockModel());
	}

	@Override
	public RenderType getRenderType(TortureChairTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
