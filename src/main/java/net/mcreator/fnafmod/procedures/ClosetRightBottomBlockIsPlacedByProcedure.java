package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.fnafmod.init.FnafModModBlocks;

public class ClosetRightBottomBlockIsPlacedByProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z))) {
			world.setBlock(BlockPos.containing(x, y + 1, z), FnafModModBlocks.CLOSET_RIGHT_TOP.get().defaultBlockState(), 3);
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
				{
					Direction _dir = Direction.NORTH;
					BlockPos _pos = BlockPos.containing(x, y + 1, z);
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
				{
					Direction _dir = Direction.SOUTH;
					BlockPos _pos = BlockPos.containing(x, y + 1, z);
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
				{
					Direction _dir = Direction.WEST;
					BlockPos _pos = BlockPos.containing(x, y + 1, z);
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
				{
					Direction _dir = Direction.EAST;
					BlockPos _pos = BlockPos.containing(x, y + 1, z);
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
		} else {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(FnafModModBlocks.CLOSET_RIGHT_BOTTOM.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}
