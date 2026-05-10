package net.mcreator.fnafmod.procedures;

import net.minecraft.client.Minecraft;

public class GetSelectPositionProcedure {
	public static String execute() {
		return "X: " + 18 * Math.floor((Minecraft.getInstance().mouseHandler.xpos() / Minecraft.getInstance().getWindow().getGuiScale() - Minecraft.getInstance().getWindow().getGuiScaledWidth() / 2) / 18) + "Y: "
				+ 18 * Math.floor((Minecraft.getInstance().mouseHandler.ypos() / Minecraft.getInstance().getWindow().getGuiScale() - Minecraft.getInstance().getWindow().getGuiScaledHeight() / 2) / 18);
	}
}
