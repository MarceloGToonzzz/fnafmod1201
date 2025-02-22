package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.FreddySignOnBlockModel;
import net.mcreator.fnafmod.block.entity.FreddySignOnTileEntity;

public class FreddySignOnTileRenderer extends GeoBlockRenderer<FreddySignOnTileEntity> {
	public FreddySignOnTileRenderer() {
		super(new FreddySignOnBlockModel());
	}

	@Override
	public RenderType getRenderType(FreddySignOnTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
