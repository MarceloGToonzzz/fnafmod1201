package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.MeshTrashCanDisplayModel;
import net.mcreator.fnafmod.block.display.MeshTrashCanDisplayItem;

public class MeshTrashCanDisplayItemRenderer extends GeoItemRenderer<MeshTrashCanDisplayItem> {
	public MeshTrashCanDisplayItemRenderer() {
		super(new MeshTrashCanDisplayModel());
	}

	@Override
	public RenderType getRenderType(MeshTrashCanDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
