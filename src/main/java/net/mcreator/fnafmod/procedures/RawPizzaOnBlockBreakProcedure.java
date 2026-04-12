package net.mcreator.fnafmod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.fnafmod.init.FnafModModBlocks;

public class RawPizzaOnBlockBreakProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double topping = 0;
		BlockState topping2 = Blocks.AIR.defaultBlockState();
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FnafModModBlocks.PIZZA_DOUGH.get()) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.5), (y + 0.5), (z + 0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						("kill @e[type=block_display,tag=" + "X" + x + "Y" + y + "Z" + z + "]"));
		}
	}
}
