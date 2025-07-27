
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.ChicaCutOutEntity;
import net.mcreator.fnafmod.client.model.ModelCutoutBase;

public class ChicaCutOutRenderer extends MobRenderer<ChicaCutOutEntity, ModelCutoutBase<ChicaCutOutEntity>> {
	public ChicaCutOutRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCutoutBase<ChicaCutOutEntity>(context.bakeLayer(ModelCutoutBase.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ChicaCutOutEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/chica_cutout.png");
	}
}
