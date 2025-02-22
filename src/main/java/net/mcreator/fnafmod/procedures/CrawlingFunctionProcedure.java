package net.mcreator.fnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.fnafmod.init.FnafModModEntities;
import net.mcreator.fnafmod.init.FnafModModBlocks;
import net.mcreator.fnafmod.entity.ToyFoxyEntity;
import net.mcreator.fnafmod.entity.ToyBonnieEntity;
import net.mcreator.fnafmod.entity.SpringtrapEntity;
import net.mcreator.fnafmod.entity.NightimeToyChicaEntity;
import net.mcreator.fnafmod.entity.MangleEntity;
import net.mcreator.fnafmod.entity.CrawlingToyFoxyEntity;
import net.mcreator.fnafmod.entity.CrawlingToyChicaEntity;
import net.mcreator.fnafmod.entity.CrawlingToyBonnieEntity;
import net.mcreator.fnafmod.entity.CrawlingSpringtrapEntity;
import net.mcreator.fnafmod.entity.CrawlingMangleEntity;

import java.util.List;
import java.util.Comparator;

public class CrawlingFunctionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean success = false;
		if ((world.getBlockState(BlockPos.containing(x, entity.getY() - 1, z))).getBlock() == FnafModModBlocks.VENT.get()) {
			if (entity instanceof ToyBonnieEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = FnafModModEntities.CRAWLING_TOY_BONNIE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				success = true;
			} else if (entity instanceof NightimeToyChicaEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = FnafModModEntities.CRAWLING_TOY_CHICA.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				success = true;
			} else if (entity instanceof ToyFoxyEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = FnafModModEntities.CRAWLING_TOY_FOXY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				success = true;
			} else if (entity instanceof MangleEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = FnafModModEntities.CRAWLING_MANGLE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				success = true;
			} else if (entity instanceof SpringtrapEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = FnafModModEntities.CRAWLING_SPRINGTRAP.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				success = true;
			}
			if (success == true) {
				if (!entity.level().isClientSide())
					entity.discard();
			}
		} else {
			if (entity instanceof CrawlingToyBonnieEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = FnafModModEntities.TOY_BONNIE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				success = true;
			} else if (entity instanceof CrawlingToyChicaEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = FnafModModEntities.NIGHTIME_TOY_CHICA.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				success = true;
			} else if (entity instanceof CrawlingToyFoxyEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = FnafModModEntities.TOY_FOXY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				success = true;
			} else if (entity instanceof CrawlingMangleEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = FnafModModEntities.MANGLE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				success = true;
			} else if (entity instanceof CrawlingSpringtrapEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = FnafModModEntities.SPRINGTRAP.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				success = true;
			}
			if (success == true) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(2 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if ((ForgeRegistries.ENTITY_TYPES.getKey(entityiterator.getType()).toString()).equals((ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).replace("crawling_", ""))
								|| (ForgeRegistries.ENTITY_TYPES.getKey(entityiterator.getType()).toString()).equals((ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).replace("crawling_", "nighttime_"))
								|| (ForgeRegistries.ENTITY_TYPES.getKey(entityiterator.getType()).toString()).equals("crawling_" + ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString())
								|| (ForgeRegistries.ENTITY_TYPES.getKey(entityiterator.getType()).toString()).equals((ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).replace("nighttime_", "crawling_"))) {
							entityiterator.getPersistentData().putBoolean("got_coords", true);
							entityiterator.getPersistentData().putDouble("x", (entity.getPersistentData().getDouble("x")));
							entityiterator.getPersistentData().putDouble("y", (entity.getPersistentData().getDouble("y")));
							entityiterator.getPersistentData().putDouble("z", (entity.getPersistentData().getDouble("z")));
							entityiterator.getPersistentData().putDouble("yaw", (entity.getPersistentData().getDouble("yaw")));
						}
					}
				}
				if (!entity.level().isClientSide())
					entity.discard();
			}
		}
	}
}
