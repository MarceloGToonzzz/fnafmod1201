package net.mcreator.fnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.ItemTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.fnafmod.init.FnafModModBlocks;

import javax.annotation.Nullable;

import java.util.concurrent.atomic.AtomicReference;

@Mod.EventBusSubscriber
public class FramedPosterOnBlockRightClickedProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		String usehand = "";
		if (event.getHand() == InteractionHand.MAIN_HAND) {
			usehand = "mainhand";
		} else {
			usehand = "offhand";
		}
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getLevel().getBlockState(event.getPos()), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		execute(null, world, x, y, z, blockstate, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		if (entity == null)
			return;
		if (blockstate.getBlock() == FnafModModBlocks.FRAMED_POSTER.get()) {
			if (0 == (blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip3 ? blockstate.getValue(_getip3) : -1)
					&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("fnaf_mod:poster")))) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
				if ((entity instanceof LivingEntity _entity) ? _entity.isHolding(FnafModModBlocks.POSTER_2.get().asItem()) : false) {
					{
						int _value = 1;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = (entity instanceof LivingEntity _entUseItem8 ? _entUseItem8.getUseItem() : ItemStack.EMPTY);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (world instanceof Level _level) {
						if (_level.isClientSide()) {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item_frame.add_item")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
				if ((entity instanceof LivingEntity _entity) ? _entity.isHolding(FnafModModBlocks.POSTER_1.get().asItem()) : false) {
					{
						int _value = 2;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = (entity instanceof LivingEntity _entUseItem13 ? _entUseItem13.getUseItem() : ItemStack.EMPTY);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (world instanceof Level _level) {
						if (_level.isClientSide()) {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item_frame.add_item")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
				if ((entity instanceof LivingEntity _entity) ? _entity.isHolding(FnafModModBlocks.POSTER_3.get().asItem()) : false) {
					{
						int _value = 3;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = (entity instanceof LivingEntity _entUseItem18 ? _entUseItem18.getUseItem() : ItemStack.EMPTY);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (world instanceof Level _level) {
						if (_level.isClientSide()) {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item_frame.add_item")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
				if ((entity instanceof LivingEntity _entity) ? _entity.isHolding(FnafModModBlocks.POSTER_4.get().asItem()) : false) {
					{
						int _value = 4;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = (entity instanceof LivingEntity _entUseItem23 ? _entUseItem23.getUseItem() : ItemStack.EMPTY);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (world instanceof Level _level) {
						if (_level.isClientSide()) {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item_frame.add_item")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
				if ((entity instanceof LivingEntity _entity) ? _entity.isHolding(FnafModModBlocks.POSTER_8.get().asItem()) : false) {
					{
						int _value = 5;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = (entity instanceof LivingEntity _entUseItem28 ? _entUseItem28.getUseItem() : ItemStack.EMPTY);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (world instanceof Level _level) {
						if (_level.isClientSide()) {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item_frame.add_item")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
				if ((entity instanceof LivingEntity _entity) ? _entity.isHolding(FnafModModBlocks.POSTER_7.get().asItem()) : false) {
					{
						int _value = 6;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = (entity instanceof LivingEntity _entUseItem33 ? _entUseItem33.getUseItem() : ItemStack.EMPTY);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (world instanceof Level _level) {
						if (_level.isClientSide()) {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item_frame.add_item")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
				if ((entity instanceof LivingEntity _entity) ? _entity.isHolding(FnafModModBlocks.POSTER_11.get().asItem()) : false) {
					{
						int _value = 7;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = (entity instanceof LivingEntity _entUseItem38 ? _entUseItem38.getUseItem() : ItemStack.EMPTY);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (world instanceof Level _level) {
						if (_level.isClientSide()) {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item_frame.add_item")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
				if ((entity instanceof LivingEntity _entity) ? _entity.isHolding(FnafModModBlocks.POSTER_13.get().asItem()) : false) {
					{
						int _value = 8;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = (entity instanceof LivingEntity _entUseItem43 ? _entUseItem43.getUseItem() : ItemStack.EMPTY);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (world instanceof Level _level) {
						if (_level.isClientSide()) {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item_frame.add_item")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
				if ((entity instanceof LivingEntity _entity) ? _entity.isHolding(FnafModModBlocks.POSTER_5.get().asItem()) : false) {
					{
						int _value = 9;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = (entity instanceof LivingEntity _entUseItem48 ? _entUseItem48.getUseItem() : ItemStack.EMPTY);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (world instanceof Level _level) {
						if (_level.isClientSide()) {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item_frame.add_item")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
				if ((entity instanceof LivingEntity _entity) ? _entity.isHolding(FnafModModBlocks.POSTER_6.get().asItem()) : false) {
					{
						int _value = 10;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = (entity instanceof LivingEntity _entUseItem53 ? _entUseItem53.getUseItem() : ItemStack.EMPTY);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (world instanceof Level _level) {
						if (_level.isClientSide()) {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item_frame.add_item")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
				if ((entity instanceof LivingEntity _entity) ? _entity.isHolding(FnafModModBlocks.POSTER_12.get().asItem()) : false) {
					{
						int _value = 11;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = (entity instanceof LivingEntity _entUseItem58 ? _entUseItem58.getUseItem() : ItemStack.EMPTY);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (world instanceof Level _level) {
						if (_level.isClientSide()) {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item_frame.add_item")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
				if ((entity instanceof LivingEntity _entity) ? _entity.isHolding(FnafModModBlocks.FNAF_3_POSTERS_6.get().asItem()) : false) {
					{
						int _value = 12;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = (entity instanceof LivingEntity _entUseItem63 ? _entUseItem63.getUseItem() : ItemStack.EMPTY);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (world instanceof Level _level) {
						if (_level.isClientSide()) {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item_frame.add_item")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
				if ((entity instanceof LivingEntity _entity) ? _entity.isHolding(FnafModModBlocks.FNAF_3_POSTERS_3.get().asItem()) : false) {
					{
						int _value = 13;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = (entity instanceof LivingEntity _entUseItem68 ? _entUseItem68.getUseItem() : ItemStack.EMPTY);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (world instanceof Level _level) {
						if (_level.isClientSide()) {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item_frame.add_item")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
				if ((entity instanceof LivingEntity _entity) ? _entity.isHolding(FnafModModBlocks.FNAF_3_POSTERS_4.get().asItem()) : false) {
					{
						int _value = 14;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = (entity instanceof LivingEntity _entUseItem73 ? _entUseItem73.getUseItem() : ItemStack.EMPTY);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (world instanceof Level _level) {
						if (_level.isClientSide()) {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item_frame.add_item")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
				if ((entity instanceof LivingEntity _entity) ? _entity.isHolding(FnafModModBlocks.FNAF_3_POSTERS.get().asItem()) : false) {
					{
						int _value = 15;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = (entity instanceof LivingEntity _entUseItem78 ? _entUseItem78.getUseItem() : ItemStack.EMPTY);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (world instanceof Level _level) {
						if (_level.isClientSide()) {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item_frame.add_item")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
				if ((entity instanceof LivingEntity _entity) ? _entity.isHolding(FnafModModBlocks.FNAF_3_POSTERS_2.get().asItem()) : false) {
					{
						int _value = 16;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = (entity instanceof LivingEntity _entUseItem83 ? _entUseItem83.getUseItem() : ItemStack.EMPTY);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (world instanceof Level _level) {
						if (_level.isClientSide()) {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item_frame.add_item")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
				if ((entity instanceof LivingEntity _entity) ? _entity.isHolding(FnafModModBlocks.FNAF_3_POSTERS_7.get().asItem()) : false) {
					{
						int _value = 17;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = (entity instanceof LivingEntity _entUseItem88 ? _entUseItem88.getUseItem() : ItemStack.EMPTY);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (world instanceof Level _level) {
						if (_level.isClientSide()) {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item_frame.add_item")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
				if ((entity instanceof LivingEntity _entity) ? _entity.isHolding(FnafModModBlocks.FNAF_3_POSTERS_8.get().asItem()) : false) {
					{
						int _value = 18;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = (entity instanceof LivingEntity _entUseItem93 ? _entUseItem93.getUseItem() : ItemStack.EMPTY);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (world instanceof Level _level) {
						if (_level.isClientSide()) {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item_frame.add_item")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
			} else {
				if (0 < (blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip97 ? blockstate.getValue(_getip97) : -1)
						&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ItemStack.EMPTY.getItem() && entity.isShiftKeyDown()) {
					{
						int _value = 0;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = (new Object() {
							public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
								return _retval.get();
							}
						}.getItemStack(world, BlockPos.containing(x, y, z), 0)).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					if (world instanceof Level _level) {
						if (_level.isClientSide()) {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item_frame.remove_item")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
			}
		}
	}
}
