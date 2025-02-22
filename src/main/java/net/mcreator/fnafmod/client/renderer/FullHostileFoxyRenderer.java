
package net.mcreator.fnafmod.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.entity.model.FullHostileFoxyModel;
import net.mcreator.fnafmod.entity.layer.FullHostileFoxyLayer;
import net.mcreator.fnafmod.entity.FullHostileFoxyEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class FullHostileFoxyRenderer extends GeoEntityRenderer<FullHostileFoxyEntity> {
	public FullHostileFoxyRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new FullHostileFoxyModel());
		this.shadowRadius = 0.5f;
		this.addRenderLayer(new FullHostileFoxyLayer(this));
	}

	@Override
	public RenderType getRenderType(FullHostileFoxyEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, FullHostileFoxyEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
