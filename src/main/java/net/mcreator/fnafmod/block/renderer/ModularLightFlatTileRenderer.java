package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.ModularLightFlatBlockModel;
import net.mcreator.fnafmod.block.entity.ModularLightFlatTileEntity;

public class ModularLightFlatTileRenderer extends GeoBlockRenderer<ModularLightFlatTileEntity> {
	public ModularLightFlatTileRenderer() {
		super(new ModularLightFlatBlockModel());
	}

	@Override
	public RenderType getRenderType(ModularLightFlatTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
