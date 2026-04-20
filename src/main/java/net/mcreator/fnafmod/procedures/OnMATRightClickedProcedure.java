package net.mcreator.fnafmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import net.mcreator.fnafmod.init.FnafModModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class OnMATRightClickedProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		String usehand = "";
		if (event.getHand() == InteractionHand.MAIN_HAND) {
			usehand = "mainhand";
		} else {
			usehand = "offhand";
		}
		execute(event, event.getLevel().getBlockState(event.getPos()), event.getEntity(), event.getItemStack());
	}

	public static void execute(BlockState blockstate, Entity entity, ItemStack itemstack) {
		execute(null, blockstate, entity, itemstack);
	}

	private static void execute(@Nullable Event event, BlockState blockstate, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (FnafModModItems.MAT.get() == itemstack.getItem() && entity.isShiftKeyDown() && !blockstate.is(BlockTags.create(new ResourceLocation("fnaf_mod:override_mat_mode")))) {
			if (("").equals(itemstack.getOrCreateTag().getString("mode"))) {
				itemstack.getOrCreateTag().putString("mode", "rotation");
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Mode: Rotation"), true);
			} else if (("rotation").equals(itemstack.getOrCreateTag().getString("mode"))) {
				itemstack.getOrCreateTag().putString("mode", "interface");
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Mode: Interface"), true);
			} else if (("interface").equals(itemstack.getOrCreateTag().getString("mode"))) {
				itemstack.getOrCreateTag().putString("mode", "");
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Mode: None"), true);
			}
		}
	}
}
