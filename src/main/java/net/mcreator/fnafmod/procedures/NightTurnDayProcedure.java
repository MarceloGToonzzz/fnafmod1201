package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.fnafmod.init.FnafModModEntities;
import net.mcreator.fnafmod.entity.WitheredFreddyEntity;
import net.mcreator.fnafmod.entity.WitheredFoxyEntity;
import net.mcreator.fnafmod.entity.WitheredChicaEntity;
import net.mcreator.fnafmod.entity.WitheredBonnieEntity;
import net.mcreator.fnafmod.entity.WallyWalrusEntity;
import net.mcreator.fnafmod.entity.ToyFreddyEntity;
import net.mcreator.fnafmod.entity.ToyFoxyEntity;
import net.mcreator.fnafmod.entity.ToyBonnieEntity;
import net.mcreator.fnafmod.entity.SpringtrapEntity;
import net.mcreator.fnafmod.entity.PuppetEntity;
import net.mcreator.fnafmod.entity.PuffyPuffinsEntity;
import net.mcreator.fnafmod.entity.NightimeToyChicaEntity;
import net.mcreator.fnafmod.entity.MangleEntity;
import net.mcreator.fnafmod.entity.HazyReindeerEntity;
import net.mcreator.fnafmod.entity.GusPugEntity;
import net.mcreator.fnafmod.entity.FreddyFazbearEntity;
import net.mcreator.fnafmod.entity.FoxyPirateEntity;
import net.mcreator.fnafmod.entity.ChicaChickenEntity;
import net.mcreator.fnafmod.entity.BonnieBunnyEntity;
import net.mcreator.fnafmod.entity.BarryPolarEntity;
import net.mcreator.fnafmod.entity.BBEntity;

public class NightTurnDayProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		String registry = "";
		String ai = "";
		String command = "";
		String thing = "";
		if (world instanceof Level _lvl0 && _lvl0.isDay()) {
			if (entity instanceof FreddyFazbearEntity) {
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = FnafModModEntities.DAY_TIME_FREDDY.get().create(_serverLevel, null, null,
							BlockPos.containing(entity.getPersistentData().getDouble("x"), entity.getPersistentData().getDouble("y"), entity.getPersistentData().getDouble("z")), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						SetCoreDataProcedure.execute(entity, entityinstance, true, true);
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
			} else if (entity instanceof BonnieBunnyEntity) {
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = FnafModModEntities.DAY_TIME_BONNIE.get().create(_serverLevel, null, null,
							BlockPos.containing(entity.getPersistentData().getDouble("x"), entity.getPersistentData().getDouble("y"), entity.getPersistentData().getDouble("z")), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						SetCoreDataProcedure.execute(entity, entityinstance, true, true);
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
			} else if (entity instanceof ChicaChickenEntity) {
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = FnafModModEntities.DAYTIME_CHICA.get().create(_serverLevel, null, null,
							BlockPos.containing(entity.getPersistentData().getDouble("x"), entity.getPersistentData().getDouble("y"), entity.getPersistentData().getDouble("z")), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						SetCoreDataProcedure.execute(entity, entityinstance, true, true);
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
			} else if (entity instanceof FoxyPirateEntity) {
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = FnafModModEntities.DAY_TIME_FOXY.get().create(_serverLevel, null, null,
							BlockPos.containing(entity.getPersistentData().getDouble("x"), entity.getPersistentData().getDouble("y"), entity.getPersistentData().getDouble("z")), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						SetCoreDataProcedure.execute(entity, entityinstance, true, true);
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
			}
			if (entity instanceof ToyFreddyEntity) {
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = FnafModModEntities.DAY_TIME_TOY_FREDDY.get().create(_serverLevel, null, null,
							BlockPos.containing(entity.getPersistentData().getDouble("x"), entity.getPersistentData().getDouble("y"), entity.getPersistentData().getDouble("z")), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						SetCoreDataProcedure.execute(entity, entityinstance, true, false);
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
			} else if (entity instanceof ToyBonnieEntity) {
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = FnafModModEntities.DAY_TIME_TOY_BONNIE.get().create(_serverLevel, null, null,
							BlockPos.containing(entity.getPersistentData().getDouble("x"), entity.getPersistentData().getDouble("y"), entity.getPersistentData().getDouble("z")), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						SetCoreDataProcedure.execute(entity, entityinstance, true, false);
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
			} else if (entity instanceof NightimeToyChicaEntity) {
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = FnafModModEntities.TOY_CHICA.get().create(_serverLevel, null, null,
							BlockPos.containing(entity.getPersistentData().getDouble("x"), entity.getPersistentData().getDouble("y"), entity.getPersistentData().getDouble("z")), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						SetCoreDataProcedure.execute(entity, entityinstance, true, false);
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
			} else if (entity instanceof ToyFoxyEntity) {
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = FnafModModEntities.DAY_TIME_TOY_FOXY.get().create(_serverLevel, null, null,
							BlockPos.containing(entity.getPersistentData().getDouble("x"), entity.getPersistentData().getDouble("y"), entity.getPersistentData().getDouble("z")), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						SetCoreDataProcedure.execute(entity, entityinstance, true, false);
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
			}
			if (entity instanceof MangleEntity) {
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = FnafModModEntities.MANGLE_SITTING.get().create(_serverLevel, null, null,
							BlockPos.containing(entity.getPersistentData().getDouble("x"), entity.getPersistentData().getDouble("y"), entity.getPersistentData().getDouble("z")), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						SetCoreDataProcedure.execute(entity, entityinstance, true, true);
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
			} else if (entity instanceof BBEntity) {
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = FnafModModEntities.DAY_TIME_BB.get().create(_serverLevel, null, null,
							BlockPos.containing(entity.getPersistentData().getDouble("x"), entity.getPersistentData().getDouble("y"), entity.getPersistentData().getDouble("z")), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						SetCoreDataProcedure.execute(entity, entityinstance, true, true);
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
			} else if (entity instanceof PuppetEntity) {
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = FnafModModEntities.DAY_TIME_PUPPET.get().create(_serverLevel, null, null,
							BlockPos.containing(entity.getPersistentData().getDouble("x"), entity.getPersistentData().getDouble("y"), entity.getPersistentData().getDouble("z")), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						SetCoreDataProcedure.execute(entity, entityinstance, true, true);
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
			}
			if (entity instanceof WitheredFreddyEntity) {
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = FnafModModEntities.DED_WITHERED_FREDDY.get().create(_serverLevel, null, null,
							BlockPos.containing(entity.getPersistentData().getDouble("x"), entity.getPersistentData().getDouble("y"), entity.getPersistentData().getDouble("z")), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						SetCoreDataProcedure.execute(entity, entityinstance, true, true);
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
			} else if (entity instanceof WitheredBonnieEntity) {
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = FnafModModEntities.SITTING_WITHERED_BONNIE.get().create(_serverLevel, null, null,
							BlockPos.containing(entity.getPersistentData().getDouble("x"), entity.getPersistentData().getDouble("y"), entity.getPersistentData().getDouble("z")), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						SetCoreDataProcedure.execute(entity, entityinstance, true, true);
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
			} else if (entity instanceof WitheredChicaEntity) {
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = FnafModModEntities.SITTING_WITHERED_CHICA.get().create(_serverLevel, null, null,
							BlockPos.containing(entity.getPersistentData().getDouble("x"), entity.getPersistentData().getDouble("y"), entity.getPersistentData().getDouble("z")), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						SetCoreDataProcedure.execute(entity, entityinstance, true, true);
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
			} else if (entity instanceof WitheredFoxyEntity) {
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = FnafModModEntities.DAY_TIME_WITHERED_FOXY.get().create(_serverLevel, null, null,
							BlockPos.containing(entity.getPersistentData().getDouble("x"), entity.getPersistentData().getDouble("y"), entity.getPersistentData().getDouble("z")), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						SetCoreDataProcedure.execute(entity, entityinstance, true, true);
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
			}
			if (entity instanceof SpringtrapEntity) {
				if (Math.random() < (2) / ((float) 3)) {
					if (world instanceof ServerLevel _serverLevel) {
						Entity entityinstance = FnafModModEntities.SITTING_DAYTIME_SPRINGTRAP.get().create(_serverLevel, null, null,
								BlockPos.containing(entity.getPersistentData().getDouble("x"), entity.getPersistentData().getDouble("y"), entity.getPersistentData().getDouble("z")), MobSpawnType.MOB_SUMMONED, false, false);
						if (entityinstance != null) {
							entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
							SetCoreDataProcedure.execute(entity, entityinstance, true, true);
							_serverLevel.addFreshEntity(entityinstance);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverLevel) {
						Entity entityinstance = FnafModModEntities.STANDING_DAYTIME_SPRINGTRAP.get().create(_serverLevel, null, null,
								BlockPos.containing(entity.getPersistentData().getDouble("x"), entity.getPersistentData().getDouble("y"), entity.getPersistentData().getDouble("z")), MobSpawnType.MOB_SUMMONED, false, false);
						if (entityinstance != null) {
							entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
							SetCoreDataProcedure.execute(entity, entityinstance, true, false);
							_serverLevel.addFreshEntity(entityinstance);
						}
					}
				}
			}
			if (entity instanceof BarryPolarEntity) {
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = FnafModModEntities.DAYTIME_BARRY_POLAR.get().create(_serverLevel, null, null,
							BlockPos.containing(entity.getPersistentData().getDouble("x"), entity.getPersistentData().getDouble("y"), entity.getPersistentData().getDouble("z")), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						SetCoreDataProcedure.execute(entity, entityinstance, true, true);
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
			} else if (entity instanceof GusPugEntity) {
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = FnafModModEntities.DAYTIME_GUS_PUG.get().create(_serverLevel, null, null,
							BlockPos.containing(entity.getPersistentData().getDouble("x"), entity.getPersistentData().getDouble("y"), entity.getPersistentData().getDouble("z")), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						SetCoreDataProcedure.execute(entity, entityinstance, true, true);
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
			} else if (entity instanceof PuffyPuffinsEntity) {
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = FnafModModEntities.DAYTIME_PUFFY_PUFFINS.get().create(_serverLevel, null, null,
							BlockPos.containing(entity.getPersistentData().getDouble("x"), entity.getPersistentData().getDouble("y"), entity.getPersistentData().getDouble("z")), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						SetCoreDataProcedure.execute(entity, entityinstance, true, true);
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
			} else if (entity instanceof HazyReindeerEntity) {
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = FnafModModEntities.DAYTIME_HAZY_REINDEER.get().create(_serverLevel, null, null,
							BlockPos.containing(entity.getPersistentData().getDouble("x"), entity.getPersistentData().getDouble("y"), entity.getPersistentData().getDouble("z")), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						SetCoreDataProcedure.execute(entity, entityinstance, true, true);
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
			} else if (entity instanceof WallyWalrusEntity) {
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = FnafModModEntities.DAYTIME_WALLY_WALRUS.get().create(_serverLevel, null, null,
							BlockPos.containing(entity.getPersistentData().getDouble("x"), entity.getPersistentData().getDouble("y"), entity.getPersistentData().getDouble("z")), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						SetCoreDataProcedure.execute(entity, entityinstance, true, true);
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
			}
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}
