package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class PondersBallsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double bottomcenter = 0;
		double centerleft = 0;
		double bottomleft = 0;
		double topleft = 0;
		double topright = 0;
		double centerright = 0;
		double topcenter = 0;
		double bottomright = 0;
		if ((world.getBlockState(BlockPos.containing(x - 1, y, z - 1))).is(BlockTags.create(new ResourceLocation("forge:balls_pit")))) {
			topleft = 1;
		} else {
			topleft = 0;
		}
		if ((world.getBlockState(BlockPos.containing(x + 0, y, z - 1))).is(BlockTags.create(new ResourceLocation("forge:balls_pit")))) {
			topcenter = 1;
		} else {
			topcenter = 0;
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z - 1))).is(BlockTags.create(new ResourceLocation("forge:balls_pit")))) {
			topright = 1;
		} else {
			topright = 0;
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y, z + 0))).is(BlockTags.create(new ResourceLocation("forge:balls_pit")))) {
			centerleft = 1;
		} else {
			centerleft = 0;
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z + 0))).is(BlockTags.create(new ResourceLocation("forge:balls_pit")))) {
			centerright = 1;
		} else {
			centerright = 0;
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y, z + 1))).is(BlockTags.create(new ResourceLocation("forge:balls_pit")))) {
			bottomleft = 1;
		} else {
			bottomleft = 0;
		}
		if ((world.getBlockState(BlockPos.containing(x + 0, y, z + 1))).is(BlockTags.create(new ResourceLocation("forge:balls_pit")))) {
			bottomcenter = 1;
		} else {
			bottomcenter = 0;
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z + 1))).is(BlockTags.create(new ResourceLocation("forge:balls_pit")))) {
			bottomright = 1;
		} else {
			bottomright = 0;
		}
		if (topcenter == 0 && centerleft == 0 && centerright == 0 && bottomcenter == 0) {
			{
				int _value = 10;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if (bottomright == 1 && topcenter == 0 && centerleft == 0 && centerright == 1 && bottomcenter == 1) {
			{
				int _value = 1;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if (bottomcenter == 1 && topcenter == 0 && bottomright == 1 && centerleft == 1 && centerright == 1 && bottomleft == 1) {
			{
				int _value = 2;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if (topcenter == 0 && bottomleft == 1 && centerleft == 1 && centerright == 0 && bottomcenter == 1) {
			{
				int _value = 3;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if (bottomright == 1 && topcenter == 1 && topright == 1 && centerleft == 0 && centerright == 1 && bottomcenter == 1) {
			{
				int _value = 4;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if (topleft == 1 && topcenter == 1 && topright == 1 && centerleft == 1 && centerright == 1 && bottomleft == 1 && bottomcenter == 1 && bottomright == 1) {
			{
				int _value = 5;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if (topleft == 1 && topcenter == 1 && bottomcenter == 1 && centerleft == 1 && centerright == 0 && bottomleft == 1) {
			{
				int _value = 6;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if (topcenter == 1 && topright == 1 && centerleft == 0 && centerright == 1 && bottomcenter == 0) {
			{
				int _value = 7;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if (topleft == 1 && topcenter == 1 && topright == 1 && centerleft == 1 && centerright == 1 && bottomcenter == 0) {
			{
				int _value = 8;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if (topcenter == 1 && topleft == 1 && centerleft == 1 && centerright == 0 && bottomcenter == 0) {
			{
				int _value = 9;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if (topcenter == 0 && centerleft == 0 && centerright == 1 && bottomcenter == 1 && bottomright == 0) {
			{
				int _value = 17;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if (topcenter == 0 && centerright == 0 && centerleft == 1 && bottomcenter == 1 && bottomleft == 0) {
			{
				int _value = 18;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if (topcenter == 1 && topright == 0 && centerleft == 0 && centerright == 1 && bottomcenter == 0) {
			{
				int _value = 19;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if (topleft == 0 && topcenter == 1 && centerleft == 1 && centerright == 0 && bottomcenter == 0) {
			{
				int _value = 20;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if (topcenter == 0 && centerleft == 0 && centerright == 1 && bottomcenter == 0) {
			{
				int _value = 11;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if (topcenter == 0 && centerleft == 1 && centerright == 1 && bottomcenter == 0) {
			{
				int _value = 12;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if (topcenter == 0 && centerleft == 1 && centerright == 0 && bottomcenter == 0) {
			{
				int _value = 13;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if (topcenter == 0 && centerleft == 0 && centerright == 0 && bottomcenter == 1) {
			{
				int _value = 14;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if (topcenter == 1 && centerleft == 0 && centerright == 0 && bottomcenter == 1) {
			{
				int _value = 15;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if (topcenter == 1 && centerleft == 0 && centerright == 0 && bottomcenter == 0) {
			{
				int _value = 16;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if (topcenter == 1 && topright == 0 && centerleft == 0 && centerright == 1 && bottomcenter == 1 && bottomright == 0) {
			{
				int _value = 21;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if (topcenter == 0 && centerleft == 1 && centerright == 1 && bottomleft == 0 && bottomcenter == 1 && bottomright == 0) {
			{
				int _value = 22;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if (topleft == 0 && topcenter == 1 && topright == 0 && centerleft == 1 && centerright == 1 && bottomcenter == 0) {
			{
				int _value = 23;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if (topleft == 0 && topcenter == 1 && centerleft == 1 && centerright == 0 && bottomleft == 0 && bottomcenter == 1) {
			{
				int _value = 24;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if (topcenter == 1 && topright == 1 && centerleft == 0 && centerright == 1 && bottomcenter == 1 && bottomright == 0) {
			{
				int _value = 25;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if (topcenter == 0 && centerleft == 1 && centerright == 1 && bottomleft == 0 && bottomcenter == 1 && bottomright == 1) {
			{
				int _value = 26;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if (topleft == 1 && topcenter == 1 && topright == 0 && centerleft == 1 && centerright == 1 && bottomcenter == 0) {
			{
				int _value = 27;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if (topleft == 0 && topcenter == 1 && centerleft == 1 && centerright == 0 && bottomleft == 1 && bottomcenter == 1) {
			{
				int _value = 28;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if (topcenter == 1 && topright == 0 && centerleft == 0 && centerright == 1 && bottomcenter == 1 && bottomright == 1) {
			{
				int _value = 29;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if (topcenter == 0 && centerleft == 1 && centerright == 1 && bottomleft == 1 && bottomcenter == 1 && bottomright == 0) {
			{
				int _value = 30;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if (topleft == 0 && topcenter == 1 && topright == 1 && centerleft == 1 && centerright == 1 && bottomcenter == 0) {
			{
				int _value = 31;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if (topleft == 1 && topcenter == 1 && centerleft == 1 && centerright == 0 && bottomleft == 0 && bottomcenter == 1) {
			{
				int _value = 32;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		}
		if (topleft == 0 && topcenter == 1 && topright == 1 && centerleft == 1 && centerright == 1 && bottomleft == 1 && bottomcenter == 1 && bottomright == 0) {
			{
				int _value = 33;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if (topleft == 0 && topcenter == 1 && topright == 0 && centerleft == 1 && centerright == 1 && bottomleft == 0 && bottomcenter == 1 && bottomright == 0) {
			{
				int _value = 34;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if (topleft == 0 && topcenter == 1 && topright == 1 && centerleft == 1 && centerright == 1 && bottomleft == 0 && bottomcenter == 1 && bottomright == 1) {
			{
				int _value = 35;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if (topleft == 0 && topcenter == 1 && topright == 0 && centerleft == 1 && centerright == 1 && bottomleft == 1 && bottomcenter == 1 && bottomright == 1) {
			{
				int _value = 36;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		}
		if (topleft == 0 && topcenter == 1 && topright == 0 && centerleft == 1 && centerright == 1 && bottomleft == 0 && bottomcenter == 1 && bottomright == 1) {
			{
				int _value = 37;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if (topleft == 0 && topcenter == 1 && topright == 0 && centerleft == 1 && centerright == 1 && bottomleft == 1 && bottomcenter == 1 && bottomright == 0) {
			{
				int _value = 38;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if (topleft == 1 && topcenter == 1 && topright == 1 && centerleft == 1 && centerright == 1 && bottomleft == 1 && bottomcenter == 1 && bottomright == 0) {
			{
				int _value = 39;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if (topleft == 1 && topcenter == 1 && topright == 1 && centerleft == 1 && centerright == 1 && bottomleft == 0 && bottomcenter == 1 && bottomright == 1) {
			{
				int _value = 40;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		}
		if (topleft == 1 && topcenter == 1 && topright == 0 && centerleft == 1 && centerright == 1 && bottomleft == 0 && bottomcenter == 1 && bottomright == 1) {
			{
				int _value = 41;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if (topleft == 1 && topcenter == 1 && topright == 1 && centerleft == 1 && centerright == 1 && bottomleft == 0 && bottomcenter == 1 && bottomright == 0) {
			{
				int _value = 43;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if (topleft == 1 && topcenter == 1 && topright == 0 && centerleft == 1 && centerright == 1 && bottomleft == 1 && bottomcenter == 1 && bottomright == 0) {
			{
				int _value = 44;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		}
		if (topleft == 0 && topcenter == 1 && topright == 1 && centerleft == 1 && centerright == 1 && bottomleft == 0 && bottomcenter == 1 && bottomright == 0) {
			{
				int _value = 45;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if (topleft == 1 && topcenter == 1 && topright == 0 && centerleft == 1 && centerright == 1 && bottomleft == 0 && bottomcenter == 1 && bottomright == 0) {
			{
				int _value = 46;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if (topleft == 1 && topcenter == 1 && topright == 0 && centerleft == 1 && centerright == 1 && bottomleft == 1 && bottomcenter == 1 && bottomright == 1) {
			{
				int _value = 47;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if (topleft == 0 && topcenter == 1 && topright == 1 && centerleft == 1 && centerright == 1 && bottomleft == 1 && bottomcenter == 1 && bottomright == 1) {
			{
				int _value = 48;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		}
	}
}
