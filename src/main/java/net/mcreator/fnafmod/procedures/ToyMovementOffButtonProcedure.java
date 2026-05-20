package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

public class ToyMovementOffButtonProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel) {
			for (Entity entityiterator : ((ServerLevel) world).getAllEntities()) {
				if (entityiterator == null)
					continue;
				if (Math.floor(x) == Math.floor(entityiterator.getX()) && Math.floor(y) == Math.floor(entityiterator.getY()) && Math.floor(z) == Math.floor(entityiterator.getZ())) {
					entityiterator.getPersistentData().putBoolean("hasToyMovementToggle", true);
				}
			}
		}
	}
}
