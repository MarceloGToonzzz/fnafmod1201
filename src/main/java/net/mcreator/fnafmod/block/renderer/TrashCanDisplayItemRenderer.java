package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.TrashCanDisplayModel;
import net.mcreator.fnafmod.block.display.TrashCanDisplayItem;

public class TrashCanDisplayItemRenderer extends GeoItemRenderer<TrashCanDisplayItem> {
	public TrashCanDisplayItemRenderer() {
		super(new TrashCanDisplayModel());
	}

	@Override
	public RenderType getRenderType(TrashCanDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
