package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import net.mcreator.fnafmod.init.FnafModModBlocks;
import net.mcreator.fnafmod.FnafModMod;

import java.util.Map;

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
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "Dressed") == 1 && (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FnafModModBlocks.CONNECTING_TABLE.get()) {
			if (!((world.getBlockState(BlockPos.containing(x - 0, y, z + 1))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()
					&& (world.getBlockState(BlockPos.containing(x - 0, y, z - 1))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()
					&& (world.getBlockState(BlockPos.containing(x + 1, y, z + 0))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()
					&& (world.getBlockState(BlockPos.containing(x - 1, y, z + 0))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock())) {
				if ((world.getBlockState(BlockPos.containing(x - 0, y, z + 1))).getBlock() == FnafModModBlocks.PURPLE_STRIPE_TABLE.get()
						|| (world.getBlockState(BlockPos.containing(x - 0, y, z - 1))).getBlock() == FnafModModBlocks.PURPLE_STRIPE_TABLE.get()
						|| (world.getBlockState(BlockPos.containing(x + 1, y, z + 0))).getBlock() == FnafModModBlocks.PURPLE_STRIPE_TABLE.get()
						|| (world.getBlockState(BlockPos.containing(x - 1, y, z + 0))).getBlock() == FnafModModBlocks.PURPLE_STRIPE_TABLE.get()) {
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = FnafModModBlocks.PURPLE_STRIPE_TABLE.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						BlockEntity _be = world.getBlockEntity(_bp);
						CompoundTag _bnbt = null;
						if (_be != null) {
							_bnbt = _be.saveWithFullMetadata();
							_be.setRemoved();
						}
						world.setBlock(_bp, _bs, 3);
						if (_bnbt != null) {
							_be = world.getBlockEntity(_bp);
							if (_be != null) {
								try {
									_be.load(_bnbt);
								} catch (Exception ignored) {
								}
							}
						}
					}
				} else if ((world.getBlockState(BlockPos.containing(x - 0, y, z + 1))).getBlock() == FnafModModBlocks.WHITE_CLOTH_TABLE.get()
						|| (world.getBlockState(BlockPos.containing(x - 0, y, z - 1))).getBlock() == FnafModModBlocks.WHITE_CLOTH_TABLE.get()
						|| (world.getBlockState(BlockPos.containing(x + 1, y, z + 0))).getBlock() == FnafModModBlocks.WHITE_CLOTH_TABLE.get()
						|| (world.getBlockState(BlockPos.containing(x - 1, y, z + 0))).getBlock() == FnafModModBlocks.WHITE_CLOTH_TABLE.get()) {
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = FnafModModBlocks.WHITE_CLOTH_TABLE.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						BlockEntity _be = world.getBlockEntity(_bp);
						CompoundTag _bnbt = null;
						if (_be != null) {
							_bnbt = _be.saveWithFullMetadata();
							_be.setRemoved();
						}
						world.setBlock(_bp, _bs, 3);
						if (_bnbt != null) {
							_be = world.getBlockEntity(_bp);
							if (_be != null) {
								try {
									_be.load(_bnbt);
								} catch (Exception ignored) {
								}
							}
						}
					}
				} else if ((world.getBlockState(BlockPos.containing(x - 0, y, z + 1))).getBlock() == FnafModModBlocks.PURPLE_STAR_TABLE.get()
						|| (world.getBlockState(BlockPos.containing(x - 0, y, z - 1))).getBlock() == FnafModModBlocks.PURPLE_STAR_TABLE.get()
						|| (world.getBlockState(BlockPos.containing(x + 1, y, z + 0))).getBlock() == FnafModModBlocks.PURPLE_STAR_TABLE.get()
						|| (world.getBlockState(BlockPos.containing(x - 1, y, z + 0))).getBlock() == FnafModModBlocks.PURPLE_STAR_TABLE.get()) {
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = FnafModModBlocks.PURPLE_STAR_TABLE.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						BlockEntity _be = world.getBlockEntity(_bp);
						CompoundTag _bnbt = null;
						if (_be != null) {
							_bnbt = _be.saveWithFullMetadata();
							_be.setRemoved();
						}
						world.setBlock(_bp, _bs, 3);
						if (_bnbt != null) {
							_be = world.getBlockEntity(_bp);
							if (_be != null) {
								try {
									_be.load(_bnbt);
								} catch (Exception ignored) {
								}
							}
						}
					}
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z + 0))).getBlock() == FnafModModBlocks.CONNECTING_TABLE.get() && new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x + 1, y, z), "Dressed") == 0 || (world.getBlockState(BlockPos.containing(x - 0, y, z + 1))).getBlock() == FnafModModBlocks.CONNECTING_TABLE.get() && new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z + 1), "Dressed") == 0 || (world.getBlockState(BlockPos.containing(x - 0, y, z - 1))).getBlock() == FnafModModBlocks.CONNECTING_TABLE.get() && new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z - 1), "Dressed") == 0 || (world.getBlockState(BlockPos.containing(x - 1, y, z + 0))).getBlock() == FnafModModBlocks.CONNECTING_TABLE.get() && new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x - 1, y, z), "Dressed") == 0) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = FnafModModBlocks.CONNECTING_TABLE.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				BlockEntity _be = world.getBlockEntity(_bp);
				CompoundTag _bnbt = null;
				if (_be != null) {
					_bnbt = _be.saveWithFullMetadata();
					_be.setRemoved();
				}
				world.setBlock(_bp, _bs, 3);
				if (_bnbt != null) {
					_be = world.getBlockEntity(_bp);
					if (_be != null) {
						try {
							_be.load(_bnbt);
						} catch (Exception ignored) {
						}
					}
				}
			}
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("Dressed", 0);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			FnafModMod.queueServerWork(4, () -> {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("Dressed", 1);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			});
		}
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
