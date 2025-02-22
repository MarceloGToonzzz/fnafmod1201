package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.MeshTrashCanBlockModel;
import net.mcreator.fnafmod.block.entity.MeshTrashCanTileEntity;

public class MeshTrashCanTileRenderer extends GeoBlockRenderer<MeshTrashCanTileEntity> {
	public MeshTrashCanTileRenderer() {
		super(new MeshTrashCanBlockModel());
	}

	@Override
	public RenderType getRenderType(MeshTrashCanTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
