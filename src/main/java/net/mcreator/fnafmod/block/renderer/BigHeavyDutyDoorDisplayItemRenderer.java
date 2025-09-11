package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.BigHeavyDutyDoorDisplayModel;
import net.mcreator.fnafmod.block.display.BigHeavyDutyDoorDisplayItem;

public class BigHeavyDutyDoorDisplayItemRenderer extends GeoItemRenderer<BigHeavyDutyDoorDisplayItem> {
	public BigHeavyDutyDoorDisplayItemRenderer() {
		super(new BigHeavyDutyDoorDisplayModel());
	}

	@Override
	public RenderType getRenderType(BigHeavyDutyDoorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
