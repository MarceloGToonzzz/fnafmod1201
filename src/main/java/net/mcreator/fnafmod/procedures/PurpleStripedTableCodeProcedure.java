package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class PurpleStripedTableCodeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double bottomcenter = 0;
		double centerleft = 0;
		double bottomleft = 0;
		double topleft = 0;
		double topright = 0;
		double centerright = 0;
		double topcenter = 0;
		double bottomright = 0;
		if ((world.getBlockState(BlockPos.containing(x - 0, y, z + 1))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
			topcenter = 1;
		} else {
			topcenter = 0;
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z + 0))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
			centerleft = 1;
		} else {
			centerleft = 0;
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y, z + 0))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
			centerright = 1;
		} else {
			centerright = 0;
		}
		if ((world.getBlockState(BlockPos.containing(x + 0, y, z - 1))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
			bottomcenter = 1;
		} else {
			bottomcenter = 0;
		}
		if (topcenter == 0 && centerright == 0 && centerleft == 0 && bottomcenter == 0) {
			{
				int _value = 10;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		}
		if (topcenter == 0 && centerright == 1 && centerleft == 0 && bottomcenter == 1) {
			{
				int _value = 1;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		}
		if (topcenter == 0 && centerright == 1 && centerleft == 1 && bottomcenter == 1) {
			{
				int _value = 2;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		}
		if (topcenter == 0 && centerright == 0 && centerleft == 1 && bottomcenter == 1) {
			{
				int _value = 3;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		}
		if (topcenter == 1 && centerright == 1 && centerleft == 0 && bottomcenter == 1) {
			{
				int _value = 4;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		}
		if (topcenter == 1 && centerright == 1 && centerleft == 1 && bottomcenter == 1) {
			{
				int _value = 5;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		}
		if (topcenter == 1 && centerright == 0 && centerleft == 1 && bottomcenter == 1) {
			{
				int _value = 6;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		}
		if (topcenter == 1 && centerright == 1 && centerleft == 0 && bottomcenter == 0) {
			{
				int _value = 7;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		}
		if (topcenter == 1 && centerright == 1 && centerleft == 1 && bottomcenter == 0) {
			{
				int _value = 8;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		}
		if (topcenter == 1 && centerright == 0 && centerleft == 1 && bottomcenter == 0) {
			{
				int _value = 9;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		}
		if (topcenter == 0 && centerright == 1 && centerleft == 0 && bottomcenter == 0) {
			{
				int _value = 11;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		}
		if (topcenter == 0 && centerright == 1 && centerleft == 1 && bottomcenter == 0) {
			{
				int _value = 12;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		}
		if (topcenter == 0 && centerright == 0 && centerleft == 1 && bottomcenter == 0) {
			{
				int _value = 13;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		}
		if (topcenter == 0 && centerright == 0 && centerleft == 0 && bottomcenter == 1) {
			{
				int _value = 14;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		}
		if (topcenter == 1 && centerright == 0 && centerleft == 0 && bottomcenter == 1) {
			{
				int _value = 15;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		}
		if (topcenter == 1 && centerright == 0 && centerleft == 0 && bottomcenter == 0) {
			{
				int _value = 16;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		}
	}
}
