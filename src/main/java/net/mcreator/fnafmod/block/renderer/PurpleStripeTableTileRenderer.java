package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.PurpleStripeTableBlockModel;
import net.mcreator.fnafmod.block.entity.PurpleStripeTableTileEntity;

public class PurpleStripeTableTileRenderer extends GeoBlockRenderer<PurpleStripeTableTileEntity> {
	public PurpleStripeTableTileRenderer() {
		super(new PurpleStripeTableBlockModel());
	}

	@Override
	public RenderType getRenderType(PurpleStripeTableTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
