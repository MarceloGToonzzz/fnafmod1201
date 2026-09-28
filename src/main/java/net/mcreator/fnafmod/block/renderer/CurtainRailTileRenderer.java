package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.CurtainRailBlockModel;
import net.mcreator.fnafmod.block.entity.CurtainRailTileEntity;

public class CurtainRailTileRenderer extends GeoBlockRenderer<CurtainRailTileEntity> {
	public CurtainRailTileRenderer() {
		super(new CurtainRailBlockModel());
	}

	@Override
	public RenderType getRenderType(CurtainRailTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
