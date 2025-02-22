package net.mcreator.fnafmod.procedures;

import net.minecraft.world.entity.Entity;

public class SetSpawnNbtProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("got_coords") == false) {
			entity.getPersistentData().putDouble("x", (entity.getX()));
			entity.getPersistentData().putDouble("y", (entity.getY()));
			entity.getPersistentData().putDouble("z", (entity.getZ()));
			entity.getPersistentData().putDouble("yaw", (entity.getYRot()));
			entity.getPersistentData().putBoolean("got_coords", true);
		}
	}
}
