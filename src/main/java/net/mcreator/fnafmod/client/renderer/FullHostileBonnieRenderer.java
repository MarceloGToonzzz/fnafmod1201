
package net.mcreator.fnafmod.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.entity.model.FullHostileBonnieModel;
import net.mcreator.fnafmod.entity.layer.FullHostileBonnieLayer;
import net.mcreator.fnafmod.entity.FullHostileBonnieEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class FullHostileBonnieRenderer extends GeoEntityRenderer<FullHostileBonnieEntity> {
	public FullHostileBonnieRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new FullHostileBonnieModel());
		this.shadowRadius = 0.5f;
		this.addRenderLayer(new FullHostileBonnieLayer(this));
	}

	@Override
	public RenderType getRenderType(FullHostileBonnieEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, FullHostileBonnieEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
