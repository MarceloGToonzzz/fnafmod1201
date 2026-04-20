package net.mcreator.fnafmod.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.client.Minecraft;

import net.mcreator.fnafmod.world.inventory.CameraPanelGUIMenu;
import net.mcreator.fnafmod.init.FnafModModItems;
import net.mcreator.fnafmod.init.FnafModModBlocks;

import javax.annotation.Nullable;

import io.netty.buffer.Unpooled;

import com.mojang.blaze3d.platform.InputConstants;

@Mod.EventBusSubscriber
public class OnCameraRightClickedProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		String usehand = "";
		if (event.getHand() == InteractionHand.MAIN_HAND) {
			usehand = "mainhand";
		} else {
			usehand = "offhand";
		}
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getLevel().getBlockState(event.getPos()), event.getEntity(), event.getItemStack(), usehand);
	}

	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity, ItemStack itemstack, String usehand) {
		execute(null, world, x, y, z, blockstate, entity, itemstack, usehand);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity, ItemStack itemstack, String usehand) {
		if (entity == null || usehand == null)
			return;
		if (FnafModModItems.MAT.get() == itemstack.getItem() && FnafModModBlocks.CAMERA_BLOCK.get() == blockstate.getBlock()) {
			if (("interface").equals(itemstack.getOrCreateTag().getString("mode"))) {
				if (usehand.equals("offhand")) {
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.OFF_HAND, true);
				} else {
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
				}
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("CameraPanelGUI");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new CameraPanelGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			} else if (("rotation").equals(itemstack.getOrCreateTag().getString("mode"))) {
				if (usehand.equals("offhand")) {
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.OFF_HAND, true);
				} else {
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
				}
				if (InputConstants.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), InputConstants.KEY_LCONTROL)) {
					if (entity.isShiftKeyDown()) {
						if (!(-36 > new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(("a" + (new Object() {
							public String getResult(LevelAccessor world, Vec3 pos, String _command) {
								StringBuilder _result = new StringBuilder();
								if (world instanceof ServerLevel _level) {
									CommandSource _dataConsumer = new CommandSource() {
										@Override
										public void sendSystemMessage(Component message) {
											_result.append(message.getString());
										}

										@Override
										public boolean acceptsSuccess() {
											return true;
										}

										@Override
										public boolean acceptsFailure() {
											return true;
										}

										@Override
										public boolean shouldInformAdmins() {
											return false;
										}
									};
									_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(_dataConsumer, pos, Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null), _command);
								}
								return _result.toString();
							}
						}.getResult(world, new Vec3((x + 0.5), (y + 0.5), (z + 0.5)), "data get entity @e[type=block_display,distance=..0.25,limit=1,sort=nearest] Rotation[1]"))).strip()))) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.5), (y + 0.5), (z + 0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"execute as @e[type=block_display,distance=..0.25] at @s run teleport @s ~ ~ ~ ~ ~-5");
						}
					} else {
						if (!(54 < new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(("a" + (new Object() {
							public String getResult(LevelAccessor world, Vec3 pos, String _command) {
								StringBuilder _result = new StringBuilder();
								if (world instanceof ServerLevel _level) {
									CommandSource _dataConsumer = new CommandSource() {
										@Override
										public void sendSystemMessage(Component message) {
											_result.append(message.getString());
										}

										@Override
										public boolean acceptsSuccess() {
											return true;
										}

										@Override
										public boolean acceptsFailure() {
											return true;
										}

										@Override
										public boolean shouldInformAdmins() {
											return false;
										}
									};
									_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(_dataConsumer, pos, Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null), _command);
								}
								return _result.toString();
							}
						}.getResult(world, new Vec3((x + 0.5), (y + 0.5), (z + 0.5)), "data get entity @e[type=block_display,distance=..0.25,limit=1,sort=nearest] Rotation[1]"))).strip()))) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.5), (y + 0.5), (z + 0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"execute as @e[type=block_display,distance=..0.25] at @s run teleport @s ~ ~ ~ ~ ~5");
						}
					}
				} else {
					if (entity.isShiftKeyDown()) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.5), (y + 0.5), (z + 0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"execute as @e[type=block_display,distance=..0.25] at @s run teleport @s ~ ~ ~ ~-22.5 ~");
					} else {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.5), (y + 0.5), (z + 0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"execute as @e[type=block_display,distance=..0.25] at @s run teleport @s ~ ~ ~ ~22.5 ~");
					}
				}
			}
		}
	}
}
