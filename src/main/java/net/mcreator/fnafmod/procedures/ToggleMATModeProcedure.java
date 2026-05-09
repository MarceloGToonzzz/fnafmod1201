package net.mcreator.fnafmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.BlockPos;

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
		execute(event, event.getLevel(), event.getEntity(), event.getItemStack(), usehand);
	}

	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack, String usehand) {
		execute(null, world, entity, itemstack, usehand);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, ItemStack itemstack, String usehand) {
		if (entity == null || usehand == null)
			return;
		if (FnafModModItems.MAT.get() == itemstack.getItem()
				&& Blocks.AIR == (world
						.getBlockState(new BlockPos(
								entity.level()
										.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(
												(entity instanceof LivingEntity _livingEntity2 && _livingEntity2.getAttributes().hasAttribute(ForgeMod.BLOCK_REACH.get()) ? _livingEntity2.getAttribute(ForgeMod.BLOCK_REACH.get()).getValue() : 0))),
												ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
										.getBlockPos().getX(),
								entity.level()
										.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(
												(entity instanceof LivingEntity _livingEntity4 && _livingEntity4.getAttributes().hasAttribute(ForgeMod.BLOCK_REACH.get()) ? _livingEntity4.getAttribute(ForgeMod.BLOCK_REACH.get()).getValue() : 0))),
												ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
										.getBlockPos().getY(),
								entity.level()
										.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(
												(entity instanceof LivingEntity _livingEntity6 && _livingEntity6.getAttributes().hasAttribute(ForgeMod.BLOCK_REACH.get()) ? _livingEntity6.getAttribute(ForgeMod.BLOCK_REACH.get()).getValue() : 0))),
												ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
										.getBlockPos().getZ())))
						.getBlock()) {
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
					itemstack.getOrCreateTag().putString("mode", "death");
				} else if (("death").equals(itemstack.getOrCreateTag().getString("mode"))) {
					itemstack.getOrCreateTag().putString("mode", "rotate_clock");
					itemstack.getOrCreateTag().putString("settings", "y");
				}
			}
		}
	}
}
