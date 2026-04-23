package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.fnafmod.init.FnafModModEntities;
import net.mcreator.fnafmod.entity.ToyChicaEntity;
import net.mcreator.fnafmod.entity.StandingDaytimeSpringtrapEntity;
import net.mcreator.fnafmod.entity.SittingWitheredChicaEntity;
import net.mcreator.fnafmod.entity.SittingWitheredBonnieEntity;
import net.mcreator.fnafmod.entity.SittingDaytimeSpringtrapEntity;
import net.mcreator.fnafmod.entity.MangleSittingEntity;
import net.mcreator.fnafmod.entity.DedWitheredFreddyEntity;
import net.mcreator.fnafmod.entity.DaytimeChicaEntity;
import net.mcreator.fnafmod.entity.DayTimeWitheredFoxyEntity;
import net.mcreator.fnafmod.entity.DayTimeToyFreddyEntity;
import net.mcreator.fnafmod.entity.DayTimeToyFoxyEntity;
import net.mcreator.fnafmod.entity.DayTimeToyBonnieEntity;
import net.mcreator.fnafmod.entity.DayTimePuppetEntity;
import net.mcreator.fnafmod.entity.DayTimeFreddyEntity;
import net.mcreator.fnafmod.entity.DayTimeFoxyEntity;
import net.mcreator.fnafmod.entity.DayTimeBonnieEntity;
import net.mcreator.fnafmod.entity.DayTimeBBEntity;

public class DayTurnNightProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		String registry = "";
		String command = "";
		String ai = "";
		if (!(world instanceof Level _lvl0 && _lvl0.isDay())) {
			if (entity instanceof DayTimeFreddyEntity) {
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = FnafModModEntities.FREDDY_FAZBEAR.get().create(_serverLevel, null, null,
							BlockPos.containing(entity.getPersistentData().getDouble("x"), entity.getPersistentData().getDouble("y"), entity.getPersistentData().getDouble("z")), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						SetCoreDataProcedure.execute(entity, entityinstance, true, false);
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
			} else if (entity instanceof DayTimeBonnieEntity) {
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = FnafModModEntities.BONNIE_BUNNY.get().create(_serverLevel, null, null,
							BlockPos.containing(entity.getPersistentData().getDouble("x"), entity.getPersistentData().getDouble("y"), entity.getPersistentData().getDouble("z")), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						SetCoreDataProcedure.execute(entity, entityinstance, true, false);
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
			} else if (entity instanceof DaytimeChicaEntity) {
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = FnafModModEntities.CHICA_CHICKEN.get().create(_serverLevel, null, null,
							BlockPos.containing(entity.getPersistentData().getDouble("x"), entity.getPersistentData().getDouble("y"), entity.getPersistentData().getDouble("z")), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						SetCoreDataProcedure.execute(entity, entityinstance, true, false);
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
			} else if (entity instanceof DayTimeFoxyEntity) {
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = FnafModModEntities.FOXY_PIRATE.get().create(_serverLevel, null, null,
							BlockPos.containing(entity.getPersistentData().getDouble("x"), entity.getPersistentData().getDouble("y"), entity.getPersistentData().getDouble("z")), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						SetCoreDataProcedure.execute(entity, entityinstance, true, false);
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
			}
			if (entity instanceof DayTimeToyFreddyEntity) {
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = FnafModModEntities.TOY_FREDDY.get().create(_serverLevel, null, null,
							BlockPos.containing(entity.getPersistentData().getDouble("x"), entity.getPersistentData().getDouble("y"), entity.getPersistentData().getDouble("z")), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						SetCoreDataProcedure.execute(entity, entityinstance, true, false);
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
			} else if (entity instanceof DayTimeToyBonnieEntity) {
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = FnafModModEntities.TOY_BONNIE.get().create(_serverLevel, null, null,
							BlockPos.containing(entity.getPersistentData().getDouble("x"), entity.getPersistentData().getDouble("y"), entity.getPersistentData().getDouble("z")), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						SetCoreDataProcedure.execute(entity, entityinstance, true, false);
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
			} else if (entity instanceof ToyChicaEntity) {
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = FnafModModEntities.NIGHTIME_TOY_CHICA.get().create(_serverLevel, null, null,
							BlockPos.containing(entity.getPersistentData().getDouble("x"), entity.getPersistentData().getDouble("y"), entity.getPersistentData().getDouble("z")), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						SetCoreDataProcedure.execute(entity, entityinstance, true, false);
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
			} else if (entity instanceof DayTimeToyFoxyEntity) {
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = FnafModModEntities.TOY_FOXY.get().create(_serverLevel, null, null,
							BlockPos.containing(entity.getPersistentData().getDouble("x"), entity.getPersistentData().getDouble("y"), entity.getPersistentData().getDouble("z")), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						SetCoreDataProcedure.execute(entity, entityinstance, true, false);
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
			}
			if (entity instanceof MangleSittingEntity) {
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = FnafModModEntities.MANGLE.get().create(_serverLevel, null, null,
							BlockPos.containing(entity.getPersistentData().getDouble("x"), entity.getPersistentData().getDouble("y"), entity.getPersistentData().getDouble("z")), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						SetCoreDataProcedure.execute(entity, entityinstance, true, false);
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
			} else if (entity instanceof DayTimeBBEntity) {
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = FnafModModEntities.BB.get().create(_serverLevel, null, null,
							BlockPos.containing(entity.getPersistentData().getDouble("x"), entity.getPersistentData().getDouble("y"), entity.getPersistentData().getDouble("z")), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						SetCoreDataProcedure.execute(entity, entityinstance, true, false);
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
			} else if (entity instanceof DayTimePuppetEntity) {
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = FnafModModEntities.PUPPET.get().create(_serverLevel, null, null,
							BlockPos.containing(entity.getPersistentData().getDouble("x"), entity.getPersistentData().getDouble("y"), entity.getPersistentData().getDouble("z")), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						SetCoreDataProcedure.execute(entity, entityinstance, true, false);
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
			}
			if (entity instanceof DedWitheredFreddyEntity) {
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = FnafModModEntities.WITHERED_FREDDY.get().create(_serverLevel, null, null,
							BlockPos.containing(entity.getPersistentData().getDouble("x"), entity.getPersistentData().getDouble("y"), entity.getPersistentData().getDouble("z")), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						SetCoreDataProcedure.execute(entity, entityinstance, true, false);
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
			} else if (entity instanceof SittingWitheredBonnieEntity) {
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = FnafModModEntities.WITHERED_BONNIE.get().create(_serverLevel, null, null,
							BlockPos.containing(entity.getPersistentData().getDouble("x"), entity.getPersistentData().getDouble("y"), entity.getPersistentData().getDouble("z")), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						SetCoreDataProcedure.execute(entity, entityinstance, true, false);
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
			} else if (entity instanceof SittingWitheredChicaEntity) {
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = FnafModModEntities.WITHERED_CHICA.get().create(_serverLevel, null, null,
							BlockPos.containing(entity.getPersistentData().getDouble("x"), entity.getPersistentData().getDouble("y"), entity.getPersistentData().getDouble("z")), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						SetCoreDataProcedure.execute(entity, entityinstance, true, false);
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
			} else if (entity instanceof DayTimeWitheredFoxyEntity) {
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = FnafModModEntities.WITHERED_FOXY.get().create(_serverLevel, null, null,
							BlockPos.containing(entity.getPersistentData().getDouble("x"), entity.getPersistentData().getDouble("y"), entity.getPersistentData().getDouble("z")), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						SetCoreDataProcedure.execute(entity, entityinstance, true, false);
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
			}
			if (entity instanceof SittingDaytimeSpringtrapEntity || entity instanceof StandingDaytimeSpringtrapEntity) {
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = FnafModModEntities.SPRINGTRAP.get().create(_serverLevel, null, null,
							BlockPos.containing(entity.getPersistentData().getDouble("x"), entity.getPersistentData().getDouble("y"), entity.getPersistentData().getDouble("z")), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						SetCoreDataProcedure.execute(entity, entityinstance, true, false);
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
			}
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}
