package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.FreddysCupcakeBonanzaBlockModel;
import net.mcreator.fnafmod.block.entity.FreddysCupcakeBonanzaTileEntity;

public class FreddysCupcakeBonanzaTileRenderer extends GeoBlockRenderer<FreddysCupcakeBonanzaTileEntity> {
	public FreddysCupcakeBonanzaTileRenderer() {
		super(new FreddysCupcakeBonanzaBlockModel());
	}

	@Override
	public RenderType getRenderType(FreddysCupcakeBonanzaTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
