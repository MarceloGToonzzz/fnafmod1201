package net.mcreator.fnafmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.fnafmod.entity.UnwitheredFreddyEntity;
import net.mcreator.fnafmod.entity.FredbearAnimatronicEntity;

public class GetSkinAmmountProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		double result = 0;
		result = 0;
		if (entity instanceof UnwitheredFreddyEntity) {
			result = 1;
		}
		if (entity instanceof FredbearAnimatronicEntity) {
			result = 2;
		}
		return result;
	}
}
