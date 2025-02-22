package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.StageLightRedOnBlockModel;
import net.mcreator.fnafmod.block.entity.StageLightRedOnTileEntity;

public class StageLightRedOnTileRenderer extends GeoBlockRenderer<StageLightRedOnTileEntity> {
	public StageLightRedOnTileRenderer() {
		super(new StageLightRedOnBlockModel());
	}

	@Override
	public RenderType getRenderType(StageLightRedOnTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
