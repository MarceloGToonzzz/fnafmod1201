
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.ToyBonnieCutOutEntity;
import net.mcreator.fnafmod.client.model.ModelCutoutBase;

public class ToyBonnieCutOutRenderer extends MobRenderer<ToyBonnieCutOutEntity, ModelCutoutBase<ToyBonnieCutOutEntity>> {
	public ToyBonnieCutOutRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCutoutBase<ToyBonnieCutOutEntity>(context.bakeLayer(ModelCutoutBase.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ToyBonnieCutOutEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/toy_bonnie_cutout.png");
	}
}
