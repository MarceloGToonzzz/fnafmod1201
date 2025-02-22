package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class NighttimeTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		SetSpawnNbtProcedure.execute(entity);
		NightTurnDayProcedure.execute(world, x, y, z, entity);
		CrawlingFunctionProcedure.execute(world, x, y, z, entity);
	}
}
