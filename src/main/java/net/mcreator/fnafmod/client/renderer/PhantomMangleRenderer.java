
package net.mcreator.fnafmod.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.procedures.GetScalesProcedure;
import net.mcreator.fnafmod.entity.model.PhantomMangleModel;
import net.mcreator.fnafmod.entity.layer.PhantomMangleLayer;
import net.mcreator.fnafmod.entity.PhantomMangleEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PhantomMangleRenderer extends GeoEntityRenderer<PhantomMangleEntity> {
	public PhantomMangleRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new PhantomMangleModel());
		this.shadowRadius = 0.5f;
		this.addRenderLayer(new PhantomMangleLayer(this));
	}

	@Override
	public RenderType getRenderType(PhantomMangleEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, PhantomMangleEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		float scale = (float) GetScalesProcedure.execute(entity);
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
