package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.entity.StatueFoxyEntity;

public class StatueFoxyModel extends GeoModel<StatueFoxyEntity> {
	@Override
	public ResourceLocation getAnimationResource(StatueFoxyEntity entity) {
		return new ResourceLocation("fnaf_mod", "animations/foxypirate.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StatueFoxyEntity entity) {
		return new ResourceLocation("fnaf_mod", "geo/foxypirate.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StatueFoxyEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(StatueFoxyEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("Head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
