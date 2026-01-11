package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;

public class GeneratorLeftBreakerValueProcedure {
	public static double execute(LevelAccessor world, double x, double y, double z) {
		if (BreakerCheckAllProcedure.execute(world, x, y, z) == true) {
			return 15;
		}
		return 0;
	}
}
