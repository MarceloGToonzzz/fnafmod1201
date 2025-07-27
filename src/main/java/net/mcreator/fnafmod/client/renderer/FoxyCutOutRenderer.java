
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.FoxyCutOutEntity;
import net.mcreator.fnafmod.client.model.ModelCutoutBase;

public class FoxyCutOutRenderer extends MobRenderer<FoxyCutOutEntity, ModelCutoutBase<FoxyCutOutEntity>> {
	public FoxyCutOutRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCutoutBase<FoxyCutOutEntity>(context.bakeLayer(ModelCutoutBase.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FoxyCutOutEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/foxy_cutout.png");
	}
}
