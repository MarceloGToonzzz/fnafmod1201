package net.mcreator.fnafmod.procedures;

import net.minecraft.world.entity.Entity;

public class HasToyMovementToggleProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity.getPersistentData().getBoolean("hasToyMovementToggle");
	}
}
