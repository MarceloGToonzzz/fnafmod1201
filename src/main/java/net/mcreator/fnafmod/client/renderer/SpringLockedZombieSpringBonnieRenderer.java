
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.fnafmod.entity.SpringLockedZombieSpringBonnieEntity;

public class SpringLockedZombieSpringBonnieRenderer extends HumanoidMobRenderer<SpringLockedZombieSpringBonnieEntity, HumanoidModel<SpringLockedZombieSpringBonnieEntity>> {
	public SpringLockedZombieSpringBonnieRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<SpringLockedZombieSpringBonnieEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(SpringLockedZombieSpringBonnieEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/springlocked_zombie.png");
	}
}
