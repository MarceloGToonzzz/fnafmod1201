package net.mcreator.fnafmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.fnafmod.entity.UnwitheredFreddyEntity;
import net.mcreator.fnafmod.entity.FredbearAnimatronicEntity;

public class SetTextureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		boolean result = false;
		if (entity.getPersistentData().getDouble("fnafmod-skin") == 0) {
			if (entity instanceof UnwitheredFreddyEntity animatable)
				animatable.setTexture("unwithered-freddy");
			if (entity instanceof FredbearAnimatronicEntity animatable)
				animatable.setTexture("fredbear-default");
		} else if (entity.getPersistentData().getDouble("fnafmod-skin") == 1) {
			if (entity instanceof UnwitheredFreddyEntity animatable)
				animatable.setTexture("unwithered-fredbear");
			if (entity instanceof FredbearAnimatronicEntity animatable)
				animatable.setTexture("fredbear-stage01");
		} else if (entity.getPersistentData().getDouble("fnafmod-skin") == 2) {
			if (entity instanceof FredbearAnimatronicEntity animatable)
				animatable.setTexture("fredbear-prototype");
		}
	}
}
