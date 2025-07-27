
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.SpringBonnieCutOutEntity;
import net.mcreator.fnafmod.client.model.ModelCutoutBase;

public class SpringBonnieCutOutRenderer extends MobRenderer<SpringBonnieCutOutEntity, ModelCutoutBase<SpringBonnieCutOutEntity>> {
	public SpringBonnieCutOutRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCutoutBase<SpringBonnieCutOutEntity>(context.bakeLayer(ModelCutoutBase.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SpringBonnieCutOutEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/spring_bonnie_cutout.png");
	}
}
