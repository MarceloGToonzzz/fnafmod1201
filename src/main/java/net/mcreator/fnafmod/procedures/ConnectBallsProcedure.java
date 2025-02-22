package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class ConnectBallsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		Direction direct = Direction.NORTH;
		double state = 0;
		direct = Direction.NORTH;
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()
				&& (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()
				&& (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()
				&& (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
			state = 5;
		} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()
				&& (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
			if (!((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()
					|| (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock())) {
				direct = Direction.NORTH;
				state = 4;
			} else if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
				direct = Direction.NORTH;
				state = 6;
			} else {
				direct = Direction.SOUTH;
				state = 6;
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()
				&& (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
			if (!((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock())
					&& !((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock())) {
				direct = Direction.EAST;
				state = 4;
			} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
				direct = Direction.WEST;
				state = 6;
			} else {
				direct = Direction.EAST;
				state = 6;
			}
		} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()
				&& (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()
				|| (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()
						&& (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()
				|| (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()
						&& (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()
				|| (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()
						&& (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
			if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()
					&& (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
				direct = Direction.NORTH;
			} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()
					&& (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
				direct = Direction.WEST;
			} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()
					&& (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
				direct = Direction.EAST;
			} else {
				direct = Direction.SOUTH;
			}
			state = 3;
		} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()
				|| (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()
				|| (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()
				|| (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
			if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
				direct = Direction.WEST;
			} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
				direct = Direction.EAST;
			} else if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
				direct = Direction.NORTH;
			} else {
				direct = Direction.SOUTH;
			}
			state = 2;
		}
		if (state == 5) {
			{
				int _value = 4;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if (state == 4) {
			{
				int _value = 3;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if (state == 6) {
			{
				int _value = 5;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if (state == 3) {
			{
				int _value = 2;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if (state == 2) {
			{
				int _value = 1;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else {
			{
				int _value = 0;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		}
		{
			Direction _dir = direct;
			BlockPos _pos = BlockPos.containing(x, y, z);
			BlockState _bs = world.getBlockState(_pos);
			Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
			if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
				world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
			} else {
				_property = _bs.getBlock().getStateDefinition().getProperty("axis");
				if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
					world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
			}
		}
	}
}
