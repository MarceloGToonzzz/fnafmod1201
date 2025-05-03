
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.entity.BonnieStandEntity;
import net.mcreator.fnafmod.client.model.ModelStandBonnie;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class BonnieStandRenderer extends MobRenderer<BonnieStandEntity, ModelStandBonnie<BonnieStandEntity>> {
	public BonnieStandRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelStandBonnie<BonnieStandEntity>(context.bakeLayer(ModelStandBonnie.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<BonnieStandEntity, ModelStandBonnie<BonnieStandEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("fnaf_mod:textures/entities/bonniestandemissive.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BonnieStandEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(BonnieStandEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/bonniestand.png");
	}
}
