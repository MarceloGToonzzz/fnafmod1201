package net.mcreator.fnafmod.procedures;

import net.minecraft.world.entity.Entity;

public class GetBoundaryScalesProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		double wa = 0;
		double result = 0;
		wa = GetScalesProcedure.execute(entity);
		if (entity.getPersistentData().getBoolean("fnafmod-crawling") == true) {
			result = wa * 0.45;
		} else {
			result = wa;
		}
		return result;
	}
}
