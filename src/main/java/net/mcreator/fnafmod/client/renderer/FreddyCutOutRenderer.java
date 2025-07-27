
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.FreddyCutOutEntity;
import net.mcreator.fnafmod.client.model.ModelCutoutBase;

public class FreddyCutOutRenderer extends MobRenderer<FreddyCutOutEntity, ModelCutoutBase<FreddyCutOutEntity>> {
	public FreddyCutOutRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCutoutBase<FreddyCutOutEntity>(context.bakeLayer(ModelCutoutBase.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FreddyCutOutEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/freddy_cutout.png");
	}
}
