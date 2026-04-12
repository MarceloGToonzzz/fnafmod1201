package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;

public class HudTimeDisplayProcedure {
	public static String execute(LevelAccessor world) {
		return "" + GetWorldTimeProcedure.execute(world);
	}
}
