package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.fnafmod.init.FnafModModEntities;
import net.mcreator.fnafmod.init.FnafModModBlocks;

public class FreddlesOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean Bright = false;
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (entity.getPersistentData().getDouble("FNAFTimer") == 0) {
			entity.getPersistentData().putDouble("FNAFTimer", 180);
		} else {
			entity.getPersistentData().putDouble("FNAFTimer", (entity.getPersistentData().getDouble("FNAFTimer") - 1));
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
			if (!entity.level().isClientSide())
				entity.discard();
		}
		if (entity.getPersistentData().getDouble("FNAFTimer") == 0) {
			if (!entity.level().isClientSide())
				entity.discard();
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = FnafModModEntities.NIGHTMARE_FREDDY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		}
	}
}
