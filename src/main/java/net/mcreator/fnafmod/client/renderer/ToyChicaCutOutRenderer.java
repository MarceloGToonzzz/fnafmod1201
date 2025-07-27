
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.ToyChicaCutOutEntity;
import net.mcreator.fnafmod.client.model.ModelCutoutBase;

public class ToyChicaCutOutRenderer extends MobRenderer<ToyChicaCutOutEntity, ModelCutoutBase<ToyChicaCutOutEntity>> {
	public ToyChicaCutOutRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCutoutBase<ToyChicaCutOutEntity>(context.bakeLayer(ModelCutoutBase.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ToyChicaCutOutEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/toy_chica_cutout.png");
	}
}
