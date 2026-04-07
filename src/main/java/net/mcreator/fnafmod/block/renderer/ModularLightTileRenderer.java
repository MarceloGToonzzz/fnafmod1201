package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.ModularLightBlockModel;
import net.mcreator.fnafmod.block.entity.ModularLightTileEntity;

public class ModularLightTileRenderer extends GeoBlockRenderer<ModularLightTileEntity> {
	public ModularLightTileRenderer() {
		super(new ModularLightBlockModel());
	}

	@Override
	public RenderType getRenderType(ModularLightTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
