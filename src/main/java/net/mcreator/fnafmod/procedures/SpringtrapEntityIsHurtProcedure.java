package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.fnafmod.init.FnafModModEntities;

import java.util.Random;

public class SpringtrapEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double Random = 0;
		double Random2 = 0;
		double Random3 = 0;
		Random = Mth.nextInt(RandomSource.create(), 1, 7);
		Random2 = Mth.nextInt(RandomSource.create(), 1, 4);
		Random3 = Mth.nextInt(RandomSource.create(), 1, 3);
		if (Random3 == 2) {
			if (Random == 1) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = FnafModModEntities.PHANTOM_FREDDY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			} else if (Random == 2) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = FnafModModEntities.PHANTOM_CHICA.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			} else if (Random == 3) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = FnafModModEntities.PHANTOM_FOXY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			} else if (Random == 4) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = FnafModModEntities.PHANTOM_BB.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			} else if (Random == 5) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = FnafModModEntities.PHANTOM_MANGLE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			} else if (Random == 6) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = FnafModModEntities.PHANTOM_PUPPET.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			} else if (Random == 7) {
				if (Random2 == 1) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.PHANTOM.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
			}
		}
	}
}
