package net.mcreator.fnafmod.procedures;

import net.minecraft.world.item.ItemStack;

public class LinkCableSpecialInformationProcedure {
	public static String execute(ItemStack itemstack) {
		return "Linked to " + "block" + " at:" + (" X-" + itemstack.getOrCreateTag().getDouble("LinkX")) + (", Y-" + itemstack.getOrCreateTag().getDouble("LinkX")) + (", Z-" + itemstack.getOrCreateTag().getDouble("LinkZ"));
	}
}
