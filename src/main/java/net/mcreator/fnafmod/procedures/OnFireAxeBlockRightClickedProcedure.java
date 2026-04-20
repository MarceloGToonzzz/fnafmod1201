package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

public class OnFireAxeBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ItemStack axe = ItemStack.EMPTY;
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
	}
}
