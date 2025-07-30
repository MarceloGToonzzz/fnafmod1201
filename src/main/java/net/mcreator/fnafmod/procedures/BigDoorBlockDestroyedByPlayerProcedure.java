package net.mcreator.fnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class BigDoorBlockDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		BlockState block = Blocks.AIR.defaultBlockState();
		double sideX = 0;
		double sideZ = 0;
		double sideX2 = 0;
		double sideZ2 = 0;
		if ((new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection(blockstate)) == Direction.SOUTH) {
			sideX = x - 1;
			sideX2 = x - 1;
			sideZ = z;
			sideZ2 = z;
		} else if ((new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection(blockstate)) == Direction.NORTH) {
			sideX = x + 1;
			sideX2 = x + 1;
			sideZ = z;
			sideZ2 = z;
		} else if ((new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection(blockstate)) == Direction.EAST) {
			sideX = x;
			sideX2 = x;
			sideZ = z + 1;
			sideZ2 = z - 1;
		} else if ((new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection(blockstate)) == Direction.WEST) {
			sideX = x;
			sideX2 = x;
			sideZ = z - 1;
			sideZ2 = z - 1;
		}
		if (!(ForgeRegistries.BLOCKS.getKey(blockstate.getBlock()).toString()).startsWith("fnaf_mod:big_wide_")) {
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(sideX, y, sideZ), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(sideX, y + 1, sideZ), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(sideX, y - 1, sideZ), Blocks.AIR.defaultBlockState(), 3);
		} else {
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y + 2, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(sideX, y + 1, sideZ), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(sideX, y + 1, sideZ2), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(sideX2, y + 1, sideZ), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(sideX2, y + 1, sideZ2), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(sideX, y + 2, sideZ), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(sideX, y + 2, sideZ2), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(sideX2, y + 2, sideZ), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(sideX2, y + 2, sideZ2), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}
