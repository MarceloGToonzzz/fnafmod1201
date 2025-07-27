
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.BonnieCutOutEntity;
import net.mcreator.fnafmod.client.model.ModelCutoutBase;

public class BonnieCutOutRenderer extends MobRenderer<BonnieCutOutEntity, ModelCutoutBase<BonnieCutOutEntity>> {
	public BonnieCutOutRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCutoutBase<BonnieCutOutEntity>(context.bakeLayer(ModelCutoutBase.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BonnieCutOutEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/bonnie_cutout.png");
	}
}
