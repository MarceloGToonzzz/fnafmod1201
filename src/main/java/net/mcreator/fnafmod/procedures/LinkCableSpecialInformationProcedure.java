package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

public class LinkCableSpecialInformationProcedure {
	public static String execute(LevelAccessor world, ItemStack itemstack) {
		if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BINDING_CURSE, itemstack) != 0) {
			return "Linked to " + (world.getBlockState(BlockPos.containing(itemstack.getOrCreateTag().getDouble("LinkX"), itemstack.getOrCreateTag().getDouble("LinkY"), itemstack.getOrCreateTag().getDouble("LinkZ")))).getBlock().getName().getString()
					+ " at:" + (" X:" + itemstack.getOrCreateTag().getDouble("LinkX")) + (", Y:" + itemstack.getOrCreateTag().getDouble("LinkY")) + (", Z:" + itemstack.getOrCreateTag().getDouble("LinkZ"));
		}
		return "Unlinked";
	}
}
