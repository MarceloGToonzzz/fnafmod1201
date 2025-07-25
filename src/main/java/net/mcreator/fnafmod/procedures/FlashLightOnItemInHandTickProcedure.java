package net.mcreator.fnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.fnafmod.network.FnafModModVariables;
import net.mcreator.fnafmod.init.FnafModModItems;
import net.mcreator.fnafmod.init.FnafModModBlocks;

public class FlashLightOnItemInHandTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double dmg = 0;
		double Y_Val = 0;
		double Z_Val = 0;
		double X_Val = 0;
		double distance = 0;
		if ((entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FnafModModVariables.PlayerVariables())).FlashLightDamage != 0) {
			{
				ItemStack _ist = itemstack;
				if (_ist.hurt((int) (entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FnafModModVariables.PlayerVariables())).FlashLightDamage, RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
			{
				double _setval = 0;
				entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.FlashLightDamage = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (149 == itemstack.getDamageValue()) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FnafModModItems.FLASH_LIGHT_ON.get()) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(FnafModModItems.BROKEN_FLASH_LIGHT.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == FnafModModItems.FLASH_LIGHT_ON.get()) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(FnafModModItems.BROKEN_FLASH_LIGHT.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			}
		}
		if (itemstack.getOrCreateTag().getDouble("TimerFlashLightBatteryFNAFMOD") == 0) {
			{
				ItemStack _ist = itemstack;
				if (_ist.hurt(1, RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		}
		if (itemstack.getOrCreateTag().getDouble("TimerFlashLightBatteryFNAFMOD") == 0) {
			itemstack.getOrCreateTag().putDouble("TimerFlashLightBatteryFNAFMOD", 40);
		} else {
			itemstack.getOrCreateTag().putDouble("TimerFlashLightBatteryFNAFMOD", (itemstack.getOrCreateTag().getDouble("TimerFlashLightBatteryFNAFMOD") - 1));
		}
		if (itemstack.getOrCreateTag().getDouble("distance") == 7
				|| !((world.getBlockState(BlockPos.containing(X_Val, Y_Val, Z_Val))).getBlock() == Blocks.AIR) && !((world.getBlockState(BlockPos.containing(X_Val, Y_Val, Z_Val))).getBlock() == FnafModModBlocks.FLASH_LIGHT_LIGHT.get())) {
			itemstack.getOrCreateTag().putDouble("distance", 0);
		}
		itemstack.getOrCreateTag().putDouble("distance", (itemstack.getOrCreateTag().getDouble("distance") + 1));
		X_Val = entity.level()
				.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((itemstack.getOrCreateTag().getDouble("distance")))), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
				.getBlockPos().getX();
		Y_Val = entity.level()
				.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((itemstack.getOrCreateTag().getDouble("distance")))), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
				.getBlockPos().getY();
		Z_Val = entity.level()
				.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((itemstack.getOrCreateTag().getDouble("distance")))), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
				.getBlockPos().getZ();
		if ((world.getBlockState(BlockPos.containing(X_Val, Y_Val, Z_Val))).getBlock() == Blocks.AIR) {
			world.setBlock(BlockPos.containing(X_Val, Y_Val, Z_Val), FnafModModBlocks.FLASH_LIGHT_LIGHT.get().defaultBlockState(), 3);
		}
		int horizontalRadiusSquare = (int) 10 - 1;
		int verticalRadiusSquare = (int) 10 - 1;
		int yIterationsSquare = verticalRadiusSquare;
		for (int i = -yIterationsSquare; i <= yIterationsSquare; i++) {
			for (int xi = -horizontalRadiusSquare; xi <= horizontalRadiusSquare; xi++) {
				for (int zi = -horizontalRadiusSquare; zi <= horizontalRadiusSquare; zi++) {
					// Execute the desired statements within the square/cube
					if ((world.getBlockState(BlockPos.containing(x + xi, y + i, z + zi))).getBlock() == FnafModModBlocks.FLASH_LIGHT_LIGHT.get() && new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, BlockPos.containing(x + xi, y + i, z + zi), "cooldown") == 0) {
						world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), Blocks.AIR.defaultBlockState(), 3);
					}
				}
			}
		}
	}
}
