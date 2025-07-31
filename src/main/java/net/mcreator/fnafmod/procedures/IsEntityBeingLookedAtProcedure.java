package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class IsEntityBeingLookedAtProcedure {
	public static boolean execute(LevelAccessor world, Entity mob, Entity player, double height, double range) {
		if (mob == null || player == null)
			return false;
		boolean result = false;
		double dx = 0;
		double dy = 0;
		double dz = 0;
		double length = 0;
		double nx = 0;
		double ny = 0;
		double nz = 0;
		double dotProduct = 0;
		dx = mob.getX() - player.getX();
		dy = (mob.getY() - 1 + height) - (player.getY() - 1 + player.getEyeHeight());
		dz = mob.getZ() - player.getZ();
		length = Math.sqrt(dx * dx + dy * dy + dz * dz);
		nx = dx / length;
		ny = dy / length;
		nz = dz / length;
		dotProduct = nx * player.getLookAngle().x + ny * player.getLookAngle().y + nz * player.getLookAngle().z;
		if (dotProduct > range) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
}
