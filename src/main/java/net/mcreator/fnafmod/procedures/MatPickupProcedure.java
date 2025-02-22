package net.mcreator.fnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.init.FnafModModItems;
import net.mcreator.fnafmod.entity.ToyChicaEntity;
import net.mcreator.fnafmod.entity.StatueFreddyEntity;
import net.mcreator.fnafmod.entity.StatueFoxyEntity;
import net.mcreator.fnafmod.entity.StatueChicaEntity;
import net.mcreator.fnafmod.entity.StatueBonnieEntity;
import net.mcreator.fnafmod.entity.SittingWitheredChicaEntity;
import net.mcreator.fnafmod.entity.SittingWitheredBonnieEntity;
import net.mcreator.fnafmod.entity.PassiveSpringBonnieEntity;
import net.mcreator.fnafmod.entity.PassiveGoldieEntity;
import net.mcreator.fnafmod.entity.PassiveFreddyEntity;
import net.mcreator.fnafmod.entity.PassiveFredbearEntity;
import net.mcreator.fnafmod.entity.PassiveFoxyEntity;
import net.mcreator.fnafmod.entity.PassiveChicaEntity;
import net.mcreator.fnafmod.entity.PassiveBonnieEntity;
import net.mcreator.fnafmod.entity.MangleSittingEntity;
import net.mcreator.fnafmod.entity.FullHostileFreddyEntity;
import net.mcreator.fnafmod.entity.FullHostileFoxyEntity;
import net.mcreator.fnafmod.entity.FullHostileChicaEntity;
import net.mcreator.fnafmod.entity.FullHostileBonnieEntity;
import net.mcreator.fnafmod.entity.DedWitheredFreddyEntity;
import net.mcreator.fnafmod.entity.DaytimeChicaEntity;
import net.mcreator.fnafmod.entity.DayTimeToyFreddyEntity;
import net.mcreator.fnafmod.entity.DayTimeToyFoxyEntity;
import net.mcreator.fnafmod.entity.DayTimeToyBonnieEntity;
import net.mcreator.fnafmod.entity.DayTimePuppetEntity;
import net.mcreator.fnafmod.entity.DayTimeFreddyEntity;
import net.mcreator.fnafmod.entity.DayTimeFoxyEntity;
import net.mcreator.fnafmod.entity.DayTimeBonnieEntity;
import net.mcreator.fnafmod.entity.DayTimeBBEntity;
import net.mcreator.fnafmod.FnafModMod;

public class MatPickupProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		boolean success = false;
		String item = "";
		if (itemstack.getItem() == FnafModModItems.MAT.get()) {
			if (entity instanceof DayTimeFreddyEntity || entity instanceof DayTimeBonnieEntity || entity instanceof DaytimeChicaEntity || entity instanceof DayTimeFoxyEntity || entity instanceof DayTimeToyFreddyEntity
					|| entity instanceof DayTimeToyBonnieEntity || entity instanceof ToyChicaEntity || entity instanceof DayTimeToyFoxyEntity || entity instanceof MangleSittingEntity || entity instanceof DayTimePuppetEntity
					|| entity instanceof DayTimeBBEntity || entity instanceof DedWitheredFreddyEntity || entity instanceof SittingWitheredBonnieEntity || entity instanceof SittingWitheredChicaEntity || entity instanceof DayTimeFoxyEntity) {
				success = true;
			}
			if (success == true) {
				if (!(ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).contains("passive") && !(ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).contains("full_hostile")
						&& !(ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).contains("statue")) {
					item = (((((ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).replace("fnaf_mod:", "")).replace("ded_", "")).replace("sitting_", "")).replace("daytime_", "")).replace("day_time_", "");
					item = item + "_spawn_item";
				} else {
					if ((ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).contains("passive")) {
						if (entity instanceof PassiveFreddyEntity) {
							item = "freddy";
						} else if (entity instanceof PassiveBonnieEntity) {
							item = "bonnie";
						} else if (entity instanceof PassiveChicaEntity) {
							item = "chica";
						} else if (entity instanceof PassiveFoxyEntity) {
							item = "foxy";
						} else if (entity instanceof PassiveFredbearEntity) {
							item = "fredbear";
						} else if (entity instanceof PassiveSpringBonnieEntity) {
							item = "spring_bonnie";
						} else if (entity instanceof PassiveGoldieEntity) {
							item = "yellowbear";
						}
					} else if ((ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).contains("statue")) {
						if (entity instanceof StatueFreddyEntity) {
							item = "statue_freddy_item";
						} else if (entity instanceof StatueBonnieEntity) {
							item = "statue_bonnie_item";
						} else if (entity instanceof StatueChicaEntity) {
							item = "statue_chica_item";
						} else if (entity instanceof StatueFoxyEntity) {
							item = "statue_foxy_item";
						}
					} else if ((ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).contains("full_hostile")) {
						if (entity instanceof FullHostileFreddyEntity) {
							item = "evil_freddy_spawn";
						} else if (entity instanceof FullHostileBonnieEntity) {
							item = "evil_bonnie";
						} else if (entity instanceof FullHostileChicaEntity) {
							item = "evil_chica_item";
						} else if (entity instanceof FullHostileFoxyEntity) {
							item = "evil_foxy_item";
						}
					}
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation((("fnaf_mod:" + item)).toLowerCase(java.util.Locale.ENGLISH)))));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
				FnafModMod.LOGGER.info(item);
				if (!entity.level().isClientSide())
					entity.discard();
			}
		}
	}
}
