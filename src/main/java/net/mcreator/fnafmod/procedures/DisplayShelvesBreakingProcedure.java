package net.mcreator.fnafmod.procedures;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.fnafmod.init.FnafModModBlocks;
import net.mcreator.fnafmod.FnafModMod;

import java.util.concurrent.atomic.AtomicReference;

public class DisplayShelvesBreakingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 0)).getItem() == ItemStack.EMPTY.getItem())) {
			FnafModMod.queueServerWork(2, () -> {
				if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FnafModModBlocks.DISPLAY_SHELVES.get())) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.3), (y + 1), (z + 0.3)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								("/kill @e[type=item_display, limit=1, sort=nearest, distance=0..1.5, x=" + x + ", y=" + (y + 1) + ", z=" + z + "]"));
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.3), (y + 1), (z + 0.3)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								("/kill @e[type=block_display, limit=1, sort=nearest, distance=0..1.5, x=" + x + ", y=" + (y + 1) + ", z=" + z + "]"));
				}
			});
		}
	}
}
