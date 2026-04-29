package net.mcreator.fnafmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import net.mcreator.fnafmod.init.FnafModModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ToggleMATModeProcedure {
	@SubscribeEvent
	public static void onRightClickWithItem(PlayerInteractEvent.RightClickItem event) {
		String usehand = "";
		if (event.getHand() == InteractionHand.MAIN_HAND) {
			usehand = "mainhand";
		} else {
			usehand = "offhand";
		}
		execute(event, event.getEntity(), event.getItemStack(), usehand);
	}

	public static void execute(Entity entity, ItemStack itemstack, String usehand) {
		execute(null, entity, itemstack, usehand);
	}

	private static void execute(@Nullable Event event, Entity entity, ItemStack itemstack, String usehand) {
		if (entity == null || usehand == null)
			return;
		if (FnafModModItems.MAT.get() == itemstack.getItem()) {
			if (usehand.equals("offhand")) {
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.OFF_HAND, true);
			} else {
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
			}
			if (entity.isShiftKeyDown()) {
				if (("y").equals(itemstack.getOrCreateTag().getString("settings"))) {
					itemstack.getOrCreateTag().putString("settings", "x");
				} else if (("x").equals(itemstack.getOrCreateTag().getString("settings"))) {
					itemstack.getOrCreateTag().putString("settings", "z");
				} else if (("z").equals(itemstack.getOrCreateTag().getString("settings"))) {
					itemstack.getOrCreateTag().putString("settings", "y");
				}
			} else {
				if (("rotate_clock").equals(itemstack.getOrCreateTag().getString("mode"))) {
					itemstack.getOrCreateTag().putString("mode", "rotate_counter_clock");
					itemstack.getOrCreateTag().putString("settings", "y");
				} else if (("rotate_counter_clock").equals(itemstack.getOrCreateTag().getString("mode"))) {
					itemstack.getOrCreateTag().putString("mode", "interface");
				} else if (("interface").equals(itemstack.getOrCreateTag().getString("mode"))) {
					itemstack.getOrCreateTag().putString("mode", "rotate_clock");
					itemstack.getOrCreateTag().putString("settings", "y");
				}
			}
		}
	}
}
