package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.BigHeavyDutyDoorBlockModel;
import net.mcreator.fnafmod.block.entity.BigHeavyDutyDoorTileEntity;

public class BigHeavyDutyDoorTileRenderer extends GeoBlockRenderer<BigHeavyDutyDoorTileEntity> {
	public BigHeavyDutyDoorTileRenderer() {
		super(new BigHeavyDutyDoorBlockModel());
	}

	@Override
	public RenderType getRenderType(BigHeavyDutyDoorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
