package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.ToyFreddySignOnBlockModel;
import net.mcreator.fnafmod.block.entity.ToyFreddySignOnTileEntity;

public class ToyFreddySignOnTileRenderer extends GeoBlockRenderer<ToyFreddySignOnTileEntity> {
	public ToyFreddySignOnTileRenderer() {
		super(new ToyFreddySignOnBlockModel());
	}

	@Override
	public RenderType getRenderType(ToyFreddySignOnTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
