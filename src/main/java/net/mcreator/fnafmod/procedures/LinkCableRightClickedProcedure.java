package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.client.Minecraft;

import java.util.Map;

import com.mojang.blaze3d.platform.InputConstants;

public class LinkCableRightClickedProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.isShiftKeyDown()) {
			itemstack.getOrCreateTag().putDouble("LinkX", 0);
			itemstack.getOrCreateTag().putDouble("LinkY", 0);
			itemstack.getOrCreateTag().putDouble("LinkZ", 0);
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Cleared linking selections"), true);
			{
				Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
				if (_enchantments.containsKey(Enchantments.BINDING_CURSE)) {
					_enchantments.remove(Enchantments.BINDING_CURSE);
					EnchantmentHelper.setEnchantments(_enchantments, itemstack);
				}
			}
		} else if (InputConstants.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), InputConstants.KEY_LCONTROL) == true) {
			if (itemstack.getOrCreateTag().getDouble("NameChange") == 16) {
				itemstack.getOrCreateTag().putDouble("NameChange", 1);
			} else {
				itemstack.getOrCreateTag().putDouble("NameChange", (itemstack.getOrCreateTag().getDouble("NameChange") + 1));
			}
			itemstack.setHoverName(Component.literal(("" + new java.text.DecimalFormat("##").format(itemstack.getOrCreateTag().getDouble("NameChange")))));
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("Now set to:" + new java.text.DecimalFormat("##").format(itemstack.getOrCreateTag().getDouble("NameChange")))), true);
		}
	}
}
