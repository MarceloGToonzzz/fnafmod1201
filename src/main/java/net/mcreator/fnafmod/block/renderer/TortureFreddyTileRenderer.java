package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.TortureFreddyBlockModel;
import net.mcreator.fnafmod.block.entity.TortureFreddyTileEntity;

public class TortureFreddyTileRenderer extends GeoBlockRenderer<TortureFreddyTileEntity> {
	public TortureFreddyTileRenderer() {
		super(new TortureFreddyBlockModel());
	}

	@Override
	public RenderType getRenderType(TortureFreddyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
