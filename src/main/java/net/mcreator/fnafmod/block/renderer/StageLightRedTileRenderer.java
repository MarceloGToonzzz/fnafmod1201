package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.StageLightRedBlockModel;
import net.mcreator.fnafmod.block.entity.StageLightRedTileEntity;

public class StageLightRedTileRenderer extends GeoBlockRenderer<StageLightRedTileEntity> {
	public StageLightRedTileRenderer() {
		super(new StageLightRedBlockModel());
	}

	@Override
	public RenderType getRenderType(StageLightRedTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
