package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.entity.SecretNightmareFredbearEntity;

public class SecretNightmareFredbearModel extends GeoModel<SecretNightmareFredbearEntity> {
	@Override
	public ResourceLocation getAnimationResource(SecretNightmareFredbearEntity entity) {
		return new ResourceLocation("fnaf_mod", "animations/accurate_nightmare-fredbear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SecretNightmareFredbearEntity entity) {
		return new ResourceLocation("fnaf_mod", "geo/accurate_nightmare-fredbear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SecretNightmareFredbearEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(SecretNightmareFredbearEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("Head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
