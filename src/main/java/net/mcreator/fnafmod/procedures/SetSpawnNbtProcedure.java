package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.fnafmod.network.FnafModModVariables;

public class SetSpawnNbtProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (FnafModModVariables.MapVariables.get(world).SetNBTBuild == false) {
			if (entity.getPersistentData().getBoolean("got_coords") == false) {
				entity.getPersistentData().putDouble("x", (entity.getX()));
				entity.getPersistentData().putDouble("y", (entity.getY()));
				entity.getPersistentData().putDouble("z", (entity.getZ()));
				entity.getPersistentData().putDouble("yaw", (entity.getYRot()));
				entity.getPersistentData().putBoolean("got_coords", true);
			}
		}
	}
}
