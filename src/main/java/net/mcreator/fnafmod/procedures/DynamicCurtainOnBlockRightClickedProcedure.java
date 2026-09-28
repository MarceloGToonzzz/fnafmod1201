package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.fnafmod.init.FnafModModBlocks;

public class DynamicCurtainOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Direction direction, double hitX, double hitZ) {
		if (direction == null)
			return;
		double FaceX = 0;
		double FaceY = 0;
		if (direction == (new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection(blockstate))) {
			if (0 == (blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip4 ? blockstate.getValue(_getip4) : -1)) {
				if ((new Object() {
					public Direction getDirection(BlockPos pos) {
						BlockState _bs = world.getBlockState(pos);
						Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (property != null && _bs.getValue(property) instanceof Direction _dir)
							return _dir;
						else if (_bs.hasProperty(BlockStateProperties.AXIS))
							return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
						else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
							return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
						return Direction.NORTH;
					}
				}.getDirection(BlockPos.containing(x, y, z))) == Direction.NORTH) {
					if (x + 0.25 < Math.round(Math.pow(10, 2) * hitX) / Math.pow(10, 2)) {
						if ((world.getBlockState(BlockPos.containing(x + direction.getStepZ(), y, z - direction.getStepX()))).canBeReplaced() || !((new Object() {
							public Direction getDirection(BlockState _bs) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (_prop instanceof DirectionProperty _dp)
									return _bs.getValue(_dp);
								_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
								return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
										? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
										: Direction.NORTH;
							}
						}.getDirection(blockstate)) == (new Object() {
							public Direction getDirection(BlockState _bs) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (_prop instanceof DirectionProperty _dp)
									return _bs.getValue(_dp);
								_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
								return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
										? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
										: Direction.NORTH;
							}
						}.getDirection((world.getBlockState(BlockPos.containing(x + direction.getStepZ(), y, z - direction.getStepX()))))))) {
							{
								int _value = 1;
								BlockPos _pos = BlockPos.containing(x, y, z);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
									world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
							}
						}
					}
					if (x + 0.25 > Math.round(Math.pow(10, 2) * hitX) / Math.pow(10, 2)) {
						if ((world.getBlockState(BlockPos.containing(x + direction.getStepZ(), y, z - direction.getStepX()))).canBeReplaced()) {
							world.setBlock(BlockPos.containing(x + direction.getStepZ(), y, z - direction.getStepX()), FnafModModBlocks.DYNAMIC_CURTAIN.get().defaultBlockState(), 3);
							{
								Direction _dir = (new Object() {
									public Direction getDirection(BlockState _bs) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
										if (_prop instanceof DirectionProperty _dp)
											return _bs.getValue(_dp);
										_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
										return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
												? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
												: Direction.NORTH;
									}
								}.getDirection(blockstate));
								BlockPos _pos = BlockPos.containing(x + direction.getStepZ(), y, z - direction.getStepX());
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
							{
								int _value = 1;
								BlockPos _pos = BlockPos.containing(x + direction.getStepZ(), y, z - direction.getStepX());
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
									world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
							}
						}
					}
				} else if ((new Object() {
					public Direction getDirection(BlockPos pos) {
						BlockState _bs = world.getBlockState(pos);
						Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (property != null && _bs.getValue(property) instanceof Direction _dir)
							return _dir;
						else if (_bs.hasProperty(BlockStateProperties.AXIS))
							return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
						else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
							return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
						return Direction.NORTH;
					}
				}.getDirection(BlockPos.containing(x, y, z))) == Direction.EAST) {
					if (z + 0.25 < Math.round(Math.pow(10, 2) * hitZ) / Math.pow(10, 2)) {
						if ((world.getBlockState(BlockPos.containing(x + direction.getStepZ(), y, z - direction.getStepX()))).canBeReplaced() || !((new Object() {
							public Direction getDirection(BlockState _bs) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (_prop instanceof DirectionProperty _dp)
									return _bs.getValue(_dp);
								_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
								return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
										? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
										: Direction.NORTH;
							}
						}.getDirection(blockstate)) == (new Object() {
							public Direction getDirection(BlockState _bs) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (_prop instanceof DirectionProperty _dp)
									return _bs.getValue(_dp);
								_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
								return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
										? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
										: Direction.NORTH;
							}
						}.getDirection((world.getBlockState(BlockPos.containing(x + direction.getStepZ(), y, z - direction.getStepX()))))))) {
							{
								int _value = 1;
								BlockPos _pos = BlockPos.containing(x, y, z);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
									world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
							}
						}
					}
					if (z + 0.25 > Math.round(Math.pow(10, 2) * hitZ) / Math.pow(10, 2)) {
						if ((world.getBlockState(BlockPos.containing(x + direction.getStepZ(), y, z - direction.getStepX()))).canBeReplaced()) {
							world.setBlock(BlockPos.containing(x + direction.getStepZ(), y, z - direction.getStepX()), FnafModModBlocks.DYNAMIC_CURTAIN.get().defaultBlockState(), 3);
							{
								Direction _dir = (new Object() {
									public Direction getDirection(BlockState _bs) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
										if (_prop instanceof DirectionProperty _dp)
											return _bs.getValue(_dp);
										_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
										return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
												? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
												: Direction.NORTH;
									}
								}.getDirection(blockstate));
								BlockPos _pos = BlockPos.containing(x + direction.getStepZ(), y, z - direction.getStepX());
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
							{
								int _value = 1;
								BlockPos _pos = BlockPos.containing(x + direction.getStepZ(), y, z - direction.getStepX());
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
									world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
							}
						}
					}
				} else if ((new Object() {
					public Direction getDirection(BlockPos pos) {
						BlockState _bs = world.getBlockState(pos);
						Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (property != null && _bs.getValue(property) instanceof Direction _dir)
							return _dir;
						else if (_bs.hasProperty(BlockStateProperties.AXIS))
							return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
						else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
							return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
						return Direction.NORTH;
					}
				}.getDirection(BlockPos.containing(x, y, z))) == Direction.SOUTH) {
					if (x + 0.75 > Math.round(Math.pow(10, 2) * hitX) / Math.pow(10, 2)) {
						if ((world.getBlockState(BlockPos.containing(x + direction.getStepZ(), y, z - direction.getStepX()))).canBeReplaced() || !((new Object() {
							public Direction getDirection(BlockState _bs) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (_prop instanceof DirectionProperty _dp)
									return _bs.getValue(_dp);
								_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
								return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
										? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
										: Direction.NORTH;
							}
						}.getDirection(blockstate)) == (new Object() {
							public Direction getDirection(BlockState _bs) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (_prop instanceof DirectionProperty _dp)
									return _bs.getValue(_dp);
								_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
								return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
										? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
										: Direction.NORTH;
							}
						}.getDirection((world.getBlockState(BlockPos.containing(x + direction.getStepZ(), y, z - direction.getStepX()))))))) {
							{
								int _value = 1;
								BlockPos _pos = BlockPos.containing(x, y, z);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
									world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
							}
						}
					}
					if (x + 0.75 < Math.round(Math.pow(10, 2) * hitX) / Math.pow(10, 2)) {
						if ((world.getBlockState(BlockPos.containing(x + direction.getStepZ(), y, z - direction.getStepX()))).canBeReplaced()) {
							world.setBlock(BlockPos.containing(x + direction.getStepZ(), y, z - direction.getStepX()), FnafModModBlocks.DYNAMIC_CURTAIN.get().defaultBlockState(), 3);
							{
								Direction _dir = (new Object() {
									public Direction getDirection(BlockState _bs) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
										if (_prop instanceof DirectionProperty _dp)
											return _bs.getValue(_dp);
										_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
										return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
												? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
												: Direction.NORTH;
									}
								}.getDirection(blockstate));
								BlockPos _pos = BlockPos.containing(x + direction.getStepZ(), y, z - direction.getStepX());
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
							{
								int _value = 1;
								BlockPos _pos = BlockPos.containing(x + direction.getStepZ(), y, z - direction.getStepX());
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
									world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
							}
						}
					}
				} else if ((new Object() {
					public Direction getDirection(BlockPos pos) {
						BlockState _bs = world.getBlockState(pos);
						Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (property != null && _bs.getValue(property) instanceof Direction _dir)
							return _dir;
						else if (_bs.hasProperty(BlockStateProperties.AXIS))
							return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
						else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
							return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
						return Direction.NORTH;
					}
				}.getDirection(BlockPos.containing(x, y, z))) == Direction.WEST) {
					if (z + 0.75 > Math.round(Math.pow(10, 2) * hitZ) / Math.pow(10, 2)) {
						if ((world.getBlockState(BlockPos.containing(x + direction.getStepZ(), y, z - direction.getStepX()))).canBeReplaced() || !((new Object() {
							public Direction getDirection(BlockState _bs) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (_prop instanceof DirectionProperty _dp)
									return _bs.getValue(_dp);
								_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
								return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
										? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
										: Direction.NORTH;
							}
						}.getDirection(blockstate)) == (new Object() {
							public Direction getDirection(BlockState _bs) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (_prop instanceof DirectionProperty _dp)
									return _bs.getValue(_dp);
								_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
								return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
										? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
										: Direction.NORTH;
							}
						}.getDirection((world.getBlockState(BlockPos.containing(x + direction.getStepZ(), y, z - direction.getStepX()))))))) {
							{
								int _value = 1;
								BlockPos _pos = BlockPos.containing(x, y, z);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
									world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
							}
						}
					}
					if (z + 0.75 < Math.round(Math.pow(10, 2) * hitZ) / Math.pow(10, 2)) {
						if ((world.getBlockState(BlockPos.containing(x + direction.getStepZ(), y, z - direction.getStepX()))).canBeReplaced()) {
							world.setBlock(BlockPos.containing(x + direction.getStepZ(), y, z - direction.getStepX()), FnafModModBlocks.DYNAMIC_CURTAIN.get().defaultBlockState(), 3);
							{
								Direction _dir = (new Object() {
									public Direction getDirection(BlockState _bs) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
										if (_prop instanceof DirectionProperty _dp)
											return _bs.getValue(_dp);
										_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
										return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
												? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
												: Direction.NORTH;
									}
								}.getDirection(blockstate));
								BlockPos _pos = BlockPos.containing(x + direction.getStepZ(), y, z - direction.getStepX());
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
							{
								int _value = 1;
								BlockPos _pos = BlockPos.containing(x + direction.getStepZ(), y, z - direction.getStepX());
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
									world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
							}
						}
					}
				}
			} else if (1 == (blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip130 ? blockstate.getValue(_getip130) : -1)) {
				if ((new Object() {
					public Direction getDirection(BlockPos pos) {
						BlockState _bs = world.getBlockState(pos);
						Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (property != null && _bs.getValue(property) instanceof Direction _dir)
							return _dir;
						else if (_bs.hasProperty(BlockStateProperties.AXIS))
							return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
						else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
							return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
						return Direction.NORTH;
					}
				}.getDirection(BlockPos.containing(x, y, z))) == Direction.NORTH) {
					if (x + 0.75 < Math.round(Math.pow(10, 2) * hitX) / Math.pow(10, 2)) {
						if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == (world.getBlockState(BlockPos.containing(x - direction.getStepZ(), y, z + direction.getStepX()))).getBlock()) {
							world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
						}
					}
					if (x + 0.75 > Math.round(Math.pow(10, 2) * hitX) / Math.pow(10, 2)) {
						{
							int _value = 0;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
					}
				} else if ((new Object() {
					public Direction getDirection(BlockPos pos) {
						BlockState _bs = world.getBlockState(pos);
						Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (property != null && _bs.getValue(property) instanceof Direction _dir)
							return _dir;
						else if (_bs.hasProperty(BlockStateProperties.AXIS))
							return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
						else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
							return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
						return Direction.NORTH;
					}
				}.getDirection(BlockPos.containing(x, y, z))) == Direction.EAST) {
					if (z + 0.75 < Math.round(Math.pow(10, 2) * hitZ) / Math.pow(10, 2)) {
						if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == (world.getBlockState(BlockPos.containing(x - direction.getStepZ(), y, z + direction.getStepX()))).getBlock()) {
							world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
						}
					}
					if (z + 0.75 > Math.round(Math.pow(10, 2) * hitZ) / Math.pow(10, 2)) {
						{
							int _value = 0;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
					}
				} else if ((new Object() {
					public Direction getDirection(BlockPos pos) {
						BlockState _bs = world.getBlockState(pos);
						Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (property != null && _bs.getValue(property) instanceof Direction _dir)
							return _dir;
						else if (_bs.hasProperty(BlockStateProperties.AXIS))
							return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
						else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
							return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
						return Direction.NORTH;
					}
				}.getDirection(BlockPos.containing(x, y, z))) == Direction.SOUTH) {
					if (x + 0.25 > Math.round(Math.pow(10, 2) * hitX) / Math.pow(10, 2)) {
						if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == (world.getBlockState(BlockPos.containing(x - direction.getStepZ(), y, z + direction.getStepX()))).getBlock()) {
							world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
						}
					}
					if (x + 0.25 < Math.round(Math.pow(10, 2) * hitX) / Math.pow(10, 2)) {
						{
							int _value = 0;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
					}
				} else if ((new Object() {
					public Direction getDirection(BlockPos pos) {
						BlockState _bs = world.getBlockState(pos);
						Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (property != null && _bs.getValue(property) instanceof Direction _dir)
							return _dir;
						else if (_bs.hasProperty(BlockStateProperties.AXIS))
							return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
						else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
							return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
						return Direction.NORTH;
					}
				}.getDirection(BlockPos.containing(x, y, z))) == Direction.WEST) {
					if (z + 0.25 > Math.round(Math.pow(10, 2) * hitZ) / Math.pow(10, 2)) {
						if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == (world.getBlockState(BlockPos.containing(x - direction.getStepZ(), y, z + direction.getStepX()))).getBlock()) {
							world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
						}
					}
					if (z + 0.25 < Math.round(Math.pow(10, 2) * hitZ) / Math.pow(10, 2)) {
						{
							int _value = 0;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
					}
				}
			}
		} else if ((direction.getOpposite()) == (new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection(blockstate))) {
			if (0 == (blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip180 ? blockstate.getValue(_getip180) : -1)) {
				if ((new Object() {
					public Direction getDirection(BlockPos pos) {
						BlockState _bs = world.getBlockState(pos);
						Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (property != null && _bs.getValue(property) instanceof Direction _dir)
							return _dir;
						else if (_bs.hasProperty(BlockStateProperties.AXIS))
							return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
						else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
							return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
						return Direction.NORTH;
					}
				}.getDirection(BlockPos.containing(x, y, z))) == Direction.NORTH) {
					if (x + 0.25 < Math.round(Math.pow(10, 2) * hitX) / Math.pow(10, 2)) {
						if ((world.getBlockState(BlockPos.containing(x - direction.getStepZ(), y, z + direction.getStepX()))).canBeReplaced() || !((new Object() {
							public Direction getDirection(BlockState _bs) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (_prop instanceof DirectionProperty _dp)
									return _bs.getValue(_dp);
								_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
								return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
										? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
										: Direction.NORTH;
							}
						}.getDirection(blockstate)) == (new Object() {
							public Direction getDirection(BlockState _bs) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (_prop instanceof DirectionProperty _dp)
									return _bs.getValue(_dp);
								_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
								return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
										? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
										: Direction.NORTH;
							}
						}.getDirection((world.getBlockState(BlockPos.containing(x - direction.getStepZ(), y, z + direction.getStepX()))))))) {
							{
								int _value = 1;
								BlockPos _pos = BlockPos.containing(x, y, z);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
									world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
							}
						}
					}
					if (x + 0.25 > Math.round(Math.pow(10, 2) * hitX) / Math.pow(10, 2)) {
						if ((world.getBlockState(BlockPos.containing(x - direction.getStepZ(), y, z + direction.getStepX()))).canBeReplaced()) {
							world.setBlock(BlockPos.containing(x - direction.getStepZ(), y, z + direction.getStepX()), FnafModModBlocks.DYNAMIC_CURTAIN.get().defaultBlockState(), 3);
							{
								Direction _dir = (new Object() {
									public Direction getDirection(BlockState _bs) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
										if (_prop instanceof DirectionProperty _dp)
											return _bs.getValue(_dp);
										_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
										return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
												? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
												: Direction.NORTH;
									}
								}.getDirection(blockstate));
								BlockPos _pos = BlockPos.containing(x - direction.getStepZ(), y, z + direction.getStepX());
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
							{
								int _value = 1;
								BlockPos _pos = BlockPos.containing(x - direction.getStepZ(), y, z + direction.getStepX());
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
									world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
							}
						}
					}
				} else if ((new Object() {
					public Direction getDirection(BlockPos pos) {
						BlockState _bs = world.getBlockState(pos);
						Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (property != null && _bs.getValue(property) instanceof Direction _dir)
							return _dir;
						else if (_bs.hasProperty(BlockStateProperties.AXIS))
							return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
						else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
							return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
						return Direction.NORTH;
					}
				}.getDirection(BlockPos.containing(x, y, z))) == Direction.EAST) {
					if (z + 0.25 < Math.round(Math.pow(10, 2) * hitZ) / Math.pow(10, 2)) {
						if ((world.getBlockState(BlockPos.containing(x - direction.getStepZ(), y, z + direction.getStepX()))).canBeReplaced() || !((new Object() {
							public Direction getDirection(BlockState _bs) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (_prop instanceof DirectionProperty _dp)
									return _bs.getValue(_dp);
								_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
								return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
										? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
										: Direction.NORTH;
							}
						}.getDirection(blockstate)) == (new Object() {
							public Direction getDirection(BlockState _bs) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (_prop instanceof DirectionProperty _dp)
									return _bs.getValue(_dp);
								_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
								return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
										? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
										: Direction.NORTH;
							}
						}.getDirection((world.getBlockState(BlockPos.containing(x + direction.getStepZ(), y, z - direction.getStepX()))))))) {
							{
								int _value = 1;
								BlockPos _pos = BlockPos.containing(x, y, z);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
									world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
							}
						}
					}
					if (z + 0.25 > Math.round(Math.pow(10, 2) * hitZ) / Math.pow(10, 2)) {
						if ((world.getBlockState(BlockPos.containing(x - direction.getStepZ(), y, z + direction.getStepX()))).canBeReplaced()) {
							world.setBlock(BlockPos.containing(x - direction.getStepZ(), y, z + direction.getStepX()), FnafModModBlocks.DYNAMIC_CURTAIN.get().defaultBlockState(), 3);
							{
								Direction _dir = (new Object() {
									public Direction getDirection(BlockState _bs) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
										if (_prop instanceof DirectionProperty _dp)
											return _bs.getValue(_dp);
										_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
										return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
												? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
												: Direction.NORTH;
									}
								}.getDirection(blockstate));
								BlockPos _pos = BlockPos.containing(x - direction.getStepZ(), y, z + direction.getStepX());
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
							{
								int _value = 1;
								BlockPos _pos = BlockPos.containing(x - direction.getStepZ(), y, z + direction.getStepX());
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
									world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
							}
						}
					}
				} else if ((new Object() {
					public Direction getDirection(BlockPos pos) {
						BlockState _bs = world.getBlockState(pos);
						Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (property != null && _bs.getValue(property) instanceof Direction _dir)
							return _dir;
						else if (_bs.hasProperty(BlockStateProperties.AXIS))
							return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
						else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
							return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
						return Direction.NORTH;
					}
				}.getDirection(BlockPos.containing(x, y, z))) == Direction.SOUTH) {
					if (x + 0.75 > Math.round(Math.pow(10, 2) * hitX) / Math.pow(10, 2)) {
						if ((world.getBlockState(BlockPos.containing(x + direction.getStepZ(), y, z - direction.getStepX()))).canBeReplaced() || !((new Object() {
							public Direction getDirection(BlockState _bs) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (_prop instanceof DirectionProperty _dp)
									return _bs.getValue(_dp);
								_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
								return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
										? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
										: Direction.NORTH;
							}
						}.getDirection(blockstate)) == (new Object() {
							public Direction getDirection(BlockState _bs) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (_prop instanceof DirectionProperty _dp)
									return _bs.getValue(_dp);
								_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
								return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
										? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
										: Direction.NORTH;
							}
						}.getDirection((world.getBlockState(BlockPos.containing(x - direction.getStepZ(), y, z + direction.getStepX()))))))) {
							{
								int _value = 1;
								BlockPos _pos = BlockPos.containing(x, y, z);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
									world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
							}
						}
					}
					if (x + 0.75 < Math.round(Math.pow(10, 2) * hitX) / Math.pow(10, 2)) {
						if ((world.getBlockState(BlockPos.containing(x - direction.getStepZ(), y, z + direction.getStepX()))).canBeReplaced()) {
							world.setBlock(BlockPos.containing(x - direction.getStepZ(), y, z + direction.getStepX()), FnafModModBlocks.DYNAMIC_CURTAIN.get().defaultBlockState(), 3);
							{
								Direction _dir = (new Object() {
									public Direction getDirection(BlockState _bs) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
										if (_prop instanceof DirectionProperty _dp)
											return _bs.getValue(_dp);
										_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
										return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
												? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
												: Direction.NORTH;
									}
								}.getDirection(blockstate));
								BlockPos _pos = BlockPos.containing(x - direction.getStepZ(), y, z + direction.getStepX());
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
							{
								int _value = 1;
								BlockPos _pos = BlockPos.containing(x - direction.getStepZ(), y, z + direction.getStepX());
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
									world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
							}
						}
					}
				} else if ((new Object() {
					public Direction getDirection(BlockPos pos) {
						BlockState _bs = world.getBlockState(pos);
						Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (property != null && _bs.getValue(property) instanceof Direction _dir)
							return _dir;
						else if (_bs.hasProperty(BlockStateProperties.AXIS))
							return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
						else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
							return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
						return Direction.NORTH;
					}
				}.getDirection(BlockPos.containing(x, y, z))) == Direction.WEST) {
					if (z + 0.75 > Math.round(Math.pow(10, 2) * hitZ) / Math.pow(10, 2)) {
						if ((world.getBlockState(BlockPos.containing(x - direction.getStepZ(), y, z + direction.getStepX()))).canBeReplaced() || !((new Object() {
							public Direction getDirection(BlockState _bs) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (_prop instanceof DirectionProperty _dp)
									return _bs.getValue(_dp);
								_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
								return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
										? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
										: Direction.NORTH;
							}
						}.getDirection(blockstate)) == (new Object() {
							public Direction getDirection(BlockState _bs) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (_prop instanceof DirectionProperty _dp)
									return _bs.getValue(_dp);
								_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
								return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
										? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
										: Direction.NORTH;
							}
						}.getDirection((world.getBlockState(BlockPos.containing(x - direction.getStepZ(), y, z + direction.getStepX()))))))) {
							{
								int _value = 1;
								BlockPos _pos = BlockPos.containing(x, y, z);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
									world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
							}
						}
					}
					if (z + 0.75 < Math.round(Math.pow(10, 2) * hitZ) / Math.pow(10, 2)) {
						if ((world.getBlockState(BlockPos.containing(x - direction.getStepZ(), y, z + direction.getStepX()))).canBeReplaced()) {
							world.setBlock(BlockPos.containing(x - direction.getStepZ(), y, z + direction.getStepX()), FnafModModBlocks.DYNAMIC_CURTAIN.get().defaultBlockState(), 3);
							{
								Direction _dir = (new Object() {
									public Direction getDirection(BlockState _bs) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
										if (_prop instanceof DirectionProperty _dp)
											return _bs.getValue(_dp);
										_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
										return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
												? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
												: Direction.NORTH;
									}
								}.getDirection(blockstate));
								BlockPos _pos = BlockPos.containing(x - direction.getStepZ(), y, z + direction.getStepX());
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
							{
								int _value = 1;
								BlockPos _pos = BlockPos.containing(x - direction.getStepZ(), y, z + direction.getStepX());
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
									world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
							}
						}
					}
				}
			} else if (1 == (blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip306 ? blockstate.getValue(_getip306) : -1)) {
				if ((new Object() {
					public Direction getDirection(BlockPos pos) {
						BlockState _bs = world.getBlockState(pos);
						Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (property != null && _bs.getValue(property) instanceof Direction _dir)
							return _dir;
						else if (_bs.hasProperty(BlockStateProperties.AXIS))
							return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
						else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
							return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
						return Direction.NORTH;
					}
				}.getDirection(BlockPos.containing(x, y, z))) == Direction.NORTH) {
					if (x + 0.75 < Math.round(Math.pow(10, 2) * hitX) / Math.pow(10, 2)) {
						if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == (world.getBlockState(BlockPos.containing(x + direction.getStepZ(), y, z - direction.getStepX()))).getBlock()) {
							world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
						}
					}
					if (x + 0.75 > Math.round(Math.pow(10, 2) * hitX) / Math.pow(10, 2)) {
						{
							int _value = 0;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
					}
				} else if ((new Object() {
					public Direction getDirection(BlockPos pos) {
						BlockState _bs = world.getBlockState(pos);
						Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (property != null && _bs.getValue(property) instanceof Direction _dir)
							return _dir;
						else if (_bs.hasProperty(BlockStateProperties.AXIS))
							return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
						else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
							return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
						return Direction.NORTH;
					}
				}.getDirection(BlockPos.containing(x, y, z))) == Direction.EAST) {
					if (z + 0.75 < Math.round(Math.pow(10, 2) * hitZ) / Math.pow(10, 2)) {
						if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == (world.getBlockState(BlockPos.containing(x + direction.getStepZ(), y, z - direction.getStepX()))).getBlock()) {
							world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
						}
					}
					if (z + 0.75 > Math.round(Math.pow(10, 2) * hitZ) / Math.pow(10, 2)) {
						{
							int _value = 0;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
					}
				} else if ((new Object() {
					public Direction getDirection(BlockPos pos) {
						BlockState _bs = world.getBlockState(pos);
						Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (property != null && _bs.getValue(property) instanceof Direction _dir)
							return _dir;
						else if (_bs.hasProperty(BlockStateProperties.AXIS))
							return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
						else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
							return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
						return Direction.NORTH;
					}
				}.getDirection(BlockPos.containing(x, y, z))) == Direction.SOUTH) {
					if (x + 0.25 > Math.round(Math.pow(10, 2) * hitX) / Math.pow(10, 2)) {
						if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == (world.getBlockState(BlockPos.containing(x + direction.getStepZ(), y, z - direction.getStepX()))).getBlock()) {
							world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
						}
					}
					if (x + 0.25 < Math.round(Math.pow(10, 2) * hitX) / Math.pow(10, 2)) {
						{
							int _value = 0;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
					}
				} else if ((new Object() {
					public Direction getDirection(BlockPos pos) {
						BlockState _bs = world.getBlockState(pos);
						Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (property != null && _bs.getValue(property) instanceof Direction _dir)
							return _dir;
						else if (_bs.hasProperty(BlockStateProperties.AXIS))
							return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
						else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
							return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
						return Direction.NORTH;
					}
				}.getDirection(BlockPos.containing(x, y, z))) == Direction.WEST) {
					if (z + 0.25 > Math.round(Math.pow(10, 2) * hitZ) / Math.pow(10, 2)) {
						if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == (world.getBlockState(BlockPos.containing(x + direction.getStepZ(), y, z - direction.getStepX()))).getBlock()) {
							world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
						}
					}
					if (z + 0.25 < Math.round(Math.pow(10, 2) * hitZ) / Math.pow(10, 2)) {
						{
							int _value = 0;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
					}
				}
			}
		}
	}
}
