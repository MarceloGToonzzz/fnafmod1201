package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.PurpleStarTableBlockModel;
import net.mcreator.fnafmod.block.entity.PurpleStarTableTileEntity;

public class PurpleStarTableTileRenderer extends GeoBlockRenderer<PurpleStarTableTileEntity> {
	public PurpleStarTableTileRenderer() {
		super(new PurpleStarTableBlockModel());
	}

	@Override
	public RenderType getRenderType(PurpleStarTableTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
