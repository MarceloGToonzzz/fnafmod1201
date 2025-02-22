package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.TrashCanBlockModel;
import net.mcreator.fnafmod.block.entity.TrashCanTileEntity;

public class TrashCanTileRenderer extends GeoBlockRenderer<TrashCanTileEntity> {
	public TrashCanTileRenderer() {
		super(new TrashCanBlockModel());
	}

	@Override
	public RenderType getRenderType(TrashCanTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
