package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.ProtonsPlushRatBlockModel;
import net.mcreator.fnafmod.block.entity.ProtonsPlushRatTileEntity;

public class ProtonsPlushRatTileRenderer extends GeoBlockRenderer<ProtonsPlushRatTileEntity> {
	public ProtonsPlushRatTileRenderer() {
		super(new ProtonsPlushRatBlockModel());
	}

	@Override
	public RenderType getRenderType(ProtonsPlushRatTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
