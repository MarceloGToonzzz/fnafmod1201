package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

import net.mcreator.fnafmod.network.FnafModModVariables;

public class DaytimeTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		SetSpawnNbtProcedure.execute(world, entity);
		DayTurnNightProcedure.execute(world, entity);
		if (FnafModModVariables.MapVariables.get(world).SetNBTBuild == true) {
			if (entity instanceof Mob _entity)
				_entity.getNavigation().stop();
		}
		SetTextureProcedure.execute(entity);
	}
}
