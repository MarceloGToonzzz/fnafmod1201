
package net.mcreator.fnafmod.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.entity.model.FullHostileFreddyModel;
import net.mcreator.fnafmod.entity.layer.FullHostileFreddyLayer;
import net.mcreator.fnafmod.entity.FullHostileFreddyEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class FullHostileFreddyRenderer extends GeoEntityRenderer<FullHostileFreddyEntity> {
	public FullHostileFreddyRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new FullHostileFreddyModel());
		this.shadowRadius = 0.5f;
		this.addRenderLayer(new FullHostileFreddyLayer(this));
	}

	@Override
	public RenderType getRenderType(FullHostileFreddyEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, FullHostileFreddyEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
