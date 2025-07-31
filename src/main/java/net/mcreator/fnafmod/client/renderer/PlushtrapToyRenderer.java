
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.procedures.GetScalesProcedure;
import net.mcreator.fnafmod.entity.PlushtrapToyEntity;
import net.mcreator.fnafmod.client.model.ModelPlushtrapSit;

import com.mojang.blaze3d.vertex.PoseStack;

public class PlushtrapToyRenderer extends MobRenderer<PlushtrapToyEntity, ModelPlushtrapSit<PlushtrapToyEntity>> {
	public PlushtrapToyRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelPlushtrapSit<PlushtrapToyEntity>(context.bakeLayer(ModelPlushtrapSit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(PlushtrapToyEntity entity, PoseStack poseStack, float f) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		float scale = (float) GetScalesProcedure.execute(entity);
		poseStack.scale(scale, scale, scale);
	}

	@Override
	public ResourceLocation getTextureLocation(PlushtrapToyEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/fixedplushtrap.png");
	}
}
