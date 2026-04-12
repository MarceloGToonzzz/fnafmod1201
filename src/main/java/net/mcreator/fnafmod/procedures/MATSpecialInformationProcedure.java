package net.mcreator.fnafmod.procedures;

import net.minecraft.world.item.ItemStack;

public class MATSpecialInformationProcedure {
	public static String execute(ItemStack itemstack) {
		return "Maintainance Assisting Tablet" + "\n" + "Access Level:" + new java.text.DecimalFormat("#").format(itemstack.getOrCreateTag().getDouble("AccessLevel"));
	}
}
