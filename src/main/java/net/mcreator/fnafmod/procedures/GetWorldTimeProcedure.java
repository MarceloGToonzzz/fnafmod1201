package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;

public class GetWorldTimeProcedure {
	public static double execute(LevelAccessor world) {
		double end_time = 0;
		double time = 0;
		time = world.dayTime();
		end_time = world.dayTime();
		while (end_time > 24000) {
			end_time = end_time - 24000;
		}
		return end_time;
	}
}
