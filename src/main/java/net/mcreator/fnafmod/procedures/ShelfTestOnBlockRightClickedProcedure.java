package net.mcreator.fnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

public class ShelfTestOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ItemStack.EMPTY.getItem())) {
			if (0 == new Object() {
				public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
					return _retval.get();
				}
			}.getAmount(world, BlockPos.containing(x, y, z), 0)) {
				if (!(ForgeRegistries.BLOCKS.getValue(
						new ResourceLocation(((ForgeRegistries.ITEMS.getKey((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()).toString())).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3((x + 1), (y + 1.5), (z + 1)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								("/summon item_display ~-0.5 ~-0.5 ~-0.5 {Passengers:[{id:\"minecraft:block_display\",block_state:{Name:\"" + ""
										+ (ForgeRegistries.ITEMS.getKey((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()).toString())
										+ "\",Properties:{}},transformation:[1.0000f,0.0000f,0.0000f,-0.5000f,0.0000f,1.0000f,0.0000f,0.0000f,0.0000f,0.0000f,1.0000f,-0.5000f,0.0000f,0.0000f,0.0000f,1.0000f]}]}"));
				} else {
					if ((ForgeRegistries.ITEMS.getKey((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()).toString()).contains("decoration")) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3((x + 1), (y + 1.5), (z + 1)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									("/summon block_display ~-0.5 ~-0.5 ~-0.5 {Passengers:[{id:\"minecraft:item_display\",item:{id:\"" + ""
											+ (ForgeRegistries.ITEMS.getKey((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()).toString())
											+ "\",Count:1},item_display:\"none\",transformation:[1.0000f,0.0000f,0.0000f,0.0000f,0.0000f,1.0000f,0.0000f,0.5000f,0.0000f,0.0000f,1.0000f,0.0000f,0.0000f,0.0000f,0.0000f,1.0000f]}]}"));
					} else if ((ForgeRegistries.ITEMS.getKey((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()).toString()).contains("head")) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3((x + 1), (y + 1), (z + 1)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									("/summon block_display ~-0.5 ~-0.5 ~-0.5 {Passengers:[{id:\"minecraft:item_display\",item:{id:\"" + ""
											+ (ForgeRegistries.ITEMS.getKey((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()).toString())
											+ "\",Count:1},item_display:\"none\",transformation:[1.0000f,0.0000f,0.0000f,0.0000f,0.0000f,1.0000f,0.0000f,0.5000f,0.0000f,0.0000f,1.0000f,0.0000f,0.0000f,0.0000f,0.0000f,1.0000f]}]}"));
					} else {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3((x + 1), (y + 1.5), (z + 1)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									("/summon block_display ~-0.5 ~-0.5 ~-0.5 {Passengers:[{id:\"minecraft:item_display\",item:{id:\"" + ""
											+ (ForgeRegistries.ITEMS.getKey((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()).toString())
											+ "\",Count:1},item_display:\"none\",transformation:[1.0000f,0.0000f,0.0000f,0.0000f,0.0000f,1.0000f,0.0000f,0.5000f,0.0000f,0.0000f,1.0000f,0.0000f,0.0000f,0.0000f,0.0000f,1.0000f]}]}"));
					}
				}
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
					if (_ent != null) {
						final int _slotid = 0;
						final ItemStack _setstack = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).copy();
						_setstack.setCount(1);
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
		} else {
			if (entity.isShiftKeyDown()) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.3), (y + 1), (z + 0.3)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/kill @e[type=block_display,limit=1,sort=nearest,distance=..1]");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.3), (y + 1), (z + 0.3)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/kill @e[type=item_display,limit=1,sort=nearest,distance=..1]");
				if (entity instanceof Player _player) {
					ItemStack _setstack = (new Object() {
						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
							return _retval.get();
						}
					}.getItemStack(world, BlockPos.containing(x, y, z), 0)).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
					if (_ent != null) {
						final int _slotid = 0;
						final ItemStack _setstack = ItemStack.EMPTY.copy();
						_setstack.setCount(0);
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
			} else if (1 == new Object() {
				public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
					return _retval.get();
				}
			}.getAmount(world, BlockPos.containing(x, y, z), 0)) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.3), (y + 1), (z + 0.3)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"execute as @e[type=item_display,distance=..1,limit=1,sort=nearest] run execute at @s run teleport @s ~ ~ ~ facing ^1 ^ ^1");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.3), (y + 1), (z + 0.3)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"execute as @e[type=block_display,distance=..1,limit=1,sort=nearest] run execute at @s run teleport @s ~ ~ ~ facing ^1 ^ ^1");
			}
		}
	}
}
