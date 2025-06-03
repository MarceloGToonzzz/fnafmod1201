package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.WhiteClothTableBlockModel;
import net.mcreator.fnafmod.block.entity.WhiteClothTableTileEntity;

public class WhiteClothTableTileRenderer extends GeoBlockRenderer<WhiteClothTableTileEntity> {
	public WhiteClothTableTileRenderer() {
		super(new WhiteClothTableBlockModel());
	}

	@Override
	public RenderType getRenderType(WhiteClothTableTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
