package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class NighttimeTickProcedure {
	public static void execute(LevelAccessor world, double x, double z, Entity entity) {
		if (entity == null)
			return;
		SetSpawnNbtProcedure.execute(world, entity);
		NightTurnDayProcedure.execute(world, entity);
		CrawlingFunctionProcedure.execute(world, x, z, entity);
		SetTextureProcedure.execute(entity);
	}
}
