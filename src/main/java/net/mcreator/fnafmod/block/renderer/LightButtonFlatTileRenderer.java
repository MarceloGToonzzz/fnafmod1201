package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.LightButtonFlatBlockModel;
import net.mcreator.fnafmod.block.entity.LightButtonFlatTileEntity;

public class LightButtonFlatTileRenderer extends GeoBlockRenderer<LightButtonFlatTileEntity> {
	public LightButtonFlatTileRenderer() {
		super(new LightButtonFlatBlockModel());
	}

	@Override
	public RenderType getRenderType(LightButtonFlatTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
