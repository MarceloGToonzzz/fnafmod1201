package net.mcreator.fnafmod.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.client.Minecraft;

public class PartySelectorSlotButtonPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double x = 0;
		for (int index0 = 0; index0 < (int) (8 * 6); index0++) {
			if (18 * Math.floor((Minecraft.getInstance().mouseHandler.xpos() / Minecraft.getInstance().getWindow().getGuiScale() - Minecraft.getInstance().getWindow().getGuiScaledWidth() / 2) / 18) == PartyIndexToXPositionProcedure.execute(x) && 18
					* Math.floor((Minecraft.getInstance().mouseHandler.ypos() / Minecraft.getInstance().getWindow().getGuiScale() - Minecraft.getInstance().getWindow().getGuiScaledHeight() / 2) / 18) == PartyIndexToYPositionProcedure.execute(x)) {
				PartySelectorAddToListProcedure.execute(entity, x);
			}
			x = x + 1;
		}
	}
}
