package net.mcreator.fnafmod.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;

public class GetCameraMonitorDiscriptionProcedure {
	public static String execute(ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getBoolean("linked")) {
			return Component.translatable("item.fnaf_mod.camera_monitor.linked").getString();
		}
		return Component.translatable("item.fnaf_mod.camera_monitor.unlinked").getString();
	}
}
