package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

public class ShadowBonnieNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.END) {
			return true;
		}
		return false;
	}
}
