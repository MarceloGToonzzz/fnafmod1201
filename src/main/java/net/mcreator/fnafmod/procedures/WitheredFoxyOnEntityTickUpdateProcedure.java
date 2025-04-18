package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.fnafmod.init.FnafModModEntities;
import net.mcreator.fnafmod.init.FnafModModBlocks;
import net.mcreator.fnafmod.FnafModMod;

public class WitheredFoxyOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean Bright = false;
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (!(entity.getPersistentData().getString("GotCoordinates")).equals("true")) {
			entity.getPersistentData().putDouble("spawnX", (entity.getX()));
			entity.getPersistentData().putDouble("spawnY", (entity.getY()));
			entity.getPersistentData().putDouble("spawnZ", (entity.getZ()));
			entity.getPersistentData().putDouble("spawnYaw", (entity.getYRot()));
			entity.getPersistentData().putString("GotCoordinates", "true");
		}
		if (world instanceof Level _lvl10 && _lvl10.isDay()) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = FnafModModEntities.DAY_TIME_WITHERED_FOXY.get().spawn(_level,
						BlockPos.containing(entity.getPersistentData().getDouble("spawnX"), entity.getPersistentData().getDouble("spawnY"), entity.getPersistentData().getDouble("spawnZ")), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot((float) entity.getPersistentData().getDouble("spawnYaw"));
					entityToSpawn.setYBodyRot((float) entity.getPersistentData().getDouble("spawnYaw"));
					entityToSpawn.setYHeadRot((float) entity.getPersistentData().getDouble("spawnYaw"));
				}
			}
			if (!entity.level().isClientSide())
				entity.discard();
		}
		sx = 0;
		found = false;
		for (int index0 = 0; index0 < 3; index0++) {
			sy = 0;
			for (int index1 = 0; index1 < 3; index1++) {
				sz = 0;
				for (int index2 = 0; index2 < 3; index2++) {
					if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == FnafModModBlocks.FLASH_LIGHT_LIGHT.get()) {
						found = true;
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
		if (found == true) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 8, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 60, 8, false, false));
			entity.setShiftKeyDown(true);
			FnafModMod.queueServerWork(60, () -> {
				entity.setShiftKeyDown(false);
			});
		}
	}
}
