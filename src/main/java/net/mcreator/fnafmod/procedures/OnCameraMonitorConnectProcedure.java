package net.mcreator.fnafmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import net.mcreator.fnafmod.init.FnafModModItems;
import net.mcreator.fnafmod.init.FnafModModBlocks;

import javax.annotation.Nullable;

import java.util.regex.Pattern;

@Mod.EventBusSubscriber
public class OnCameraMonitorConnectProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		String usehand = "";
		if (event.getHand() == InteractionHand.MAIN_HAND) {
			usehand = "mainhand";
		} else {
			usehand = "offhand";
		}
		execute(event, event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getLevel().getBlockState(event.getPos()), event.getEntity(), event.getItemStack(), usehand);
	}

	public static void execute(double x, double y, double z, BlockState blockstate, Entity entity, ItemStack itemstack, String usehand) {
		execute(null, x, y, z, blockstate, entity, itemstack, usehand);
	}

	private static void execute(@Nullable Event event, double x, double y, double z, BlockState blockstate, Entity entity, ItemStack itemstack, String usehand) {
		if (entity == null || usehand == null)
			return;
		double xA = 0;
		boolean xSame = false;
		if (FnafModModItems.CAMERA_MONITOR.get() == itemstack.getItem() && FnafModModBlocks.SERVER.get() == blockstate.getBlock()) {
			if (!(itemstack.getOrCreateTag().getString("servers")).isEmpty()) {
				{
					String[] _array = (itemstack.getOrCreateTag().getString("servers")).split(Pattern.quote(";"));
					if (_array.length != 0) {
						for (String stringiterator : _array) {
							if ((x + "," + y + "," + z).equals(stringiterator)) {
								xSame = true;
							}
						}
					} else {
						String stringiterator = (itemstack.getOrCreateTag().getString("servers"));
						for (int _yourmother = 0; _yourmother < 1; _yourmother++) {
							if ((x + "," + y + "," + z).equals(stringiterator)) {
								xSame = true;
							}
						}
					}
				}
			}
			if (!xSame) {
				if (usehand.equals("offhand")) {
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.OFF_HAND, true);
				} else {
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
				}
				itemstack.getOrCreateTag().putBoolean("linked", true);
				itemstack.getOrCreateTag().putDouble("selectedCamera", 0);
				itemstack.getOrCreateTag().putDouble("selectedServer", 0);
				if ((itemstack.getOrCreateTag().getString("servers")).isEmpty()) {
					itemstack.getOrCreateTag().putString("servers", (x + "," + y + "," + z));
				} else {
					itemstack.getOrCreateTag().putString("servers", (itemstack.getOrCreateTag().getString("servers") + ";" + x + "," + y + "," + z));
				}
			}
		}
	}
}
