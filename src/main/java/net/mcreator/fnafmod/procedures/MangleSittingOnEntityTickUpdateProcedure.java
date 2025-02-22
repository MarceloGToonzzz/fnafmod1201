package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.fnafmod.init.FnafModModEntities;

public class MangleSittingOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!(entity.getPersistentData().getString("GotCoordinates")).equals("true")) {
			entity.getPersistentData().putDouble("spawnX", (entity.getX()));
			entity.getPersistentData().putDouble("spawnY", (entity.getY()));
			entity.getPersistentData().putDouble("spawnZ", (entity.getZ()));
			entity.getPersistentData().putDouble("spawnYaw", (entity.getYRot()));
			entity.getPersistentData().putString("GotCoordinates", "true");
		}
		if (!(world instanceof Level _lvl10 && _lvl10.isDay())) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = FnafModModEntities.MANGLE.get().spawn(_level, BlockPos.containing(entity.getPersistentData().getDouble("spawnX"), entity.getPersistentData().getDouble("spawnY"), entity.getPersistentData().getDouble("spawnZ")),
						MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot((float) entity.getPersistentData().getDouble("spawnYaw"));
					entityToSpawn.setYBodyRot((float) entity.getPersistentData().getDouble("spawnYaw"));
					entityToSpawn.setYHeadRot((float) entity.getPersistentData().getDouble("spawnYaw"));
				}
			}
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}
