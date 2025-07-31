package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.fnafmod.init.FnafModModBlocks;
import net.mcreator.fnafmod.entity.ToyFoxyEntity;
import net.mcreator.fnafmod.entity.ToyBonnieEntity;
import net.mcreator.fnafmod.entity.SpringtrapEntity;
import net.mcreator.fnafmod.entity.NightimeToyChicaEntity;
import net.mcreator.fnafmod.entity.MangleEntity;

public class CrawlingFunctionProcedure {
	public static void execute(LevelAccessor world, double x, double z, Entity entity) {
		if (entity == null)
			return;
		boolean success = false;
		String animationName = "";
		if ((world.getBlockState(BlockPos.containing(x, entity.getY() - 1, z))).getBlock() == FnafModModBlocks.VENT.get()) {
			if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("fnaf_mod:animatronic-crawlers")))) {
				success = true;
			}
			if (success == true) {
				entity.getPersistentData().putBoolean("fnafmod-crawling", true);
				if (!(entity.getDeltaMovement().horizontalDistanceSqr() > 1.0E-6D)) {
					if (entity instanceof ToyBonnieEntity) {
						((ToyBonnieEntity) entity).setAnimation("animation.toybonnie.crawlidle");
					}
					if (entity instanceof NightimeToyChicaEntity) {
						((NightimeToyChicaEntity) entity).setAnimation("animation.toychica.crawl");
					}
					if (entity instanceof ToyFoxyEntity) {
						((ToyFoxyEntity) entity).setAnimation("animation.toyfoxy.crawlidle");
					}
					if (entity instanceof MangleEntity) {
						((MangleEntity) entity).setAnimation("animation.model.crawlidle");
					}
					if (entity instanceof SpringtrapEntity) {
						((SpringtrapEntity) entity).setAnimation("animation.springtrap.crawlidle");
					}
				} else {
					if (entity instanceof ToyBonnieEntity) {
						((ToyBonnieEntity) entity).setAnimation("animation.toybonnie.crawl");
					}
					if (entity instanceof NightimeToyChicaEntity) {
						((NightimeToyChicaEntity) entity).setAnimation("animation.toychica.crawl_idle");
					}
					if (entity instanceof ToyFoxyEntity) {
						((ToyFoxyEntity) entity).setAnimation("animation.toyfoxy.crawl");
					}
					if (entity instanceof MangleEntity) {
						((MangleEntity) entity).setAnimation("animation.model.crawl");
					}
					if (entity instanceof SpringtrapEntity) {
						((SpringtrapEntity) entity).setAnimation("animation.springtrap.crawl");
					}
				}
			}
		} else {
			if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("fnaf_mod:animatronic-crawlers")))) {
				success = true;
			}
			if (success == true) {
				if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("fnaf_mod:animatronic-crawlers")))) {
					if (entity instanceof ToyBonnieEntity) {
						animationName = ((ToyBonnieEntity) entity).animationprocedure;
					} else if (entity instanceof NightimeToyChicaEntity) {
						animationName = ((NightimeToyChicaEntity) entity).animationprocedure;
					} else if (entity instanceof ToyFoxyEntity) {
						animationName = ((ToyFoxyEntity) entity).animationprocedure;
					} else if (entity instanceof MangleEntity) {
						animationName = ((MangleEntity) entity).animationprocedure;
					} else if (entity instanceof SpringtrapEntity) {
						animationName = ((SpringtrapEntity) entity).animationprocedure;
					}
					if (animationName.contains("crawl")) {
						if (entity instanceof ToyBonnieEntity) {
							((ToyBonnieEntity) entity).setAnimation("empty");
						}
						if (entity instanceof NightimeToyChicaEntity) {
							((NightimeToyChicaEntity) entity).setAnimation("empty");
						}
						if (entity instanceof ToyFoxyEntity) {
							((ToyFoxyEntity) entity).setAnimation("empty");
						}
						if (entity instanceof MangleEntity) {
							((MangleEntity) entity).setAnimation("empty");
						}
						if (entity instanceof SpringtrapEntity) {
							((SpringtrapEntity) entity).setAnimation("empty");
						}
					}
				}
				entity.getPersistentData().putBoolean("fnafmod-crawling", false);
			}
		}
	}
}
