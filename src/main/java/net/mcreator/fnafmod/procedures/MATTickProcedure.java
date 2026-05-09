package net.mcreator.fnafmod.procedures;

import net.minecraft.world.item.ItemStack;

public class MATTickProcedure {
	public static void execute(ItemStack itemstack) {
		if (!(("rotate_clock").equals(itemstack.getOrCreateTag().getString("mode")) || ("rotate_counter_clock").equals(itemstack.getOrCreateTag().getString("mode")) || ("interface").equals(itemstack.getOrCreateTag().getString("mode"))
				|| ("death").equals(itemstack.getOrCreateTag().getString("mode")))) {
			itemstack.getOrCreateTag().putString("mode", "rotate_clock");
			itemstack.getOrCreateTag().putString("settings", "y");
		}
	}
}
