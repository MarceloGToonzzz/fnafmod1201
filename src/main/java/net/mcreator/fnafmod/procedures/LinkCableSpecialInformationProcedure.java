package net.mcreator.fnafmod.procedures;

import net.minecraft.world.item.ItemStack;

public class LinkCableSpecialInformationProcedure {
	public static String execute(ItemStack itemstack) {
		return "Linked to generator at:" + (" X-" + itemstack.getOrCreateTag().getDouble("LinkX")) + (", Y-" + itemstack.getOrCreateTag().getDouble("LinkY")) + (", Z-" + itemstack.getOrCreateTag().getDouble("LinkZ"));
	}
}
