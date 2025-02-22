package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.fnafmod.init.FnafModModEntities;

public class DayTimeToyFreddyOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!(entity.getPersistentData().getString("GotCoordinates2")).equals("true")) {
			entity.getPersistentData().putDouble("spawnX2", (entity.getX()));
			entity.getPersistentData().putDouble("spawnY2", (entity.getY()));
			entity.getPersistentData().putDouble("spawnZ2", (entity.getZ()));
			entity.getPersistentData().putDouble("spawnYaw2", (entity.getYRot()));
			entity.getPersistentData().putString("GotCoordinates2", "true");
		}
		if (!(world instanceof Level _lvl10 && _lvl10.isDay())) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = FnafModModEntities.TOY_FREDDY.get().spawn(_level,
						BlockPos.containing(entity.getPersistentData().getDouble("spawnX2"), entity.getPersistentData().getDouble("spawnY2"), entity.getPersistentData().getDouble("spawnZ2")), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot((float) entity.getPersistentData().getDouble("spawnYaw2"));
					entityToSpawn.setYBodyRot((float) entity.getPersistentData().getDouble("spawnYaw2"));
					entityToSpawn.setYHeadRot((float) entity.getPersistentData().getDouble("spawnYaw2"));
				}
			}
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}
