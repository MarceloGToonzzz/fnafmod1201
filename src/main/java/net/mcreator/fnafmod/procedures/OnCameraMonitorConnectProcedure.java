package net.mcreator.fnafmod.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;

import net.mcreator.fnafmod.init.FnafModModItems;
import net.mcreator.fnafmod.init.FnafModModBlocks;
import net.mcreator.fnafmod.FnafModMod;

import javax.annotation.Nullable;

import java.util.regex.Pattern;
import java.util.concurrent.atomic.AtomicReference;

@Mod.EventBusSubscriber
public class OnCameraMonitorConnectProcedure {
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
		boolean xSame = false;
		String data = "";
		String data2 = "";
		String data3 = "";
		double xA = 0;
		double xB = 0;
		double dX = 0;
		double dY = 0;
		double dZ = 0;
		double xC = 0;
		if (FnafModModItems.CAMERA_MONITOR.get() == itemstack.getItem() && FnafModModBlocks.SERVER.get() == blockstate.getBlock()) {
			if (!(itemstack.getOrCreateTag().getString("servers")).isEmpty()) {
				{
					String[] _array = (itemstack.getOrCreateTag().getString("servers")).split(Pattern.quote(";"));
					if (_array.length != 0) {
						for (String stringiterator : _array) {
							if ((x + "," + y + "," + z).equals(stringiterator)) {
								xSame = true;
							}
						}
					} else {
						String stringiterator = (itemstack.getOrCreateTag().getString("servers"));
						for (int _yourmother = 0; _yourmother < 1; _yourmother++) {
							if ((x + "," + y + "," + z).equals(stringiterator)) {
								xSame = true;
							}
						}
					}
				}
			}
			if (!xSame) {
				if (usehand.equals("offhand")) {
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.OFF_HAND, true);
				} else {
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
				}
				itemstack.getOrCreateTag().putBoolean("linked", true);
				itemstack.getOrCreateTag().putDouble("selectedCamera", 0);
				itemstack.getOrCreateTag().putDouble("selectedServer", 0);
				if ((itemstack.getOrCreateTag().getString("servers")).isEmpty()) {
					itemstack.getOrCreateTag().putString("servers", (x + "," + y + "," + z));
				} else {
					itemstack.getOrCreateTag().putString("servers", (itemstack.getOrCreateTag().getString("servers") + ";" + x + "," + y + "," + z));
				}
			}
		} else if (FnafModModItems.CAMERA_MONITOR.get() == itemstack.getItem()) {
			data = itemstack.getOrCreateTag().getString("servers") + ";";
			xA = 0;
			while (data.contains(";")) {
				if (xA == itemstack.getOrCreateTag().getDouble("selectedServer")) {
					FnafModMod.LOGGER.info(data);
					FnafModMod.LOGGER.info(data.substring(0, (int) data.indexOf(";")));
					data2 = data.substring(0, (int) data.indexOf(";"));
					FnafModMod.LOGGER.info("Pos X: " + data2.substring(0, (int) data2.indexOf(",")));
					FnafModMod.LOGGER.info("Pos Y: " + data2.substring((int) (data2.indexOf(",") + 1), (int) (data2.indexOf(",") + 1 + (data2.substring((int) (data2.indexOf(",") + 1), (data2).length())).indexOf(","))));
					FnafModMod.LOGGER.info("Pos Z: " + data2.substring((int) (data2.indexOf(",") + 1 + (data2.substring((int) (data2.indexOf(",") + 1), (data2).length())).indexOf(",") + 1), (data2).length()));
					dX = new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(data2.substring(0, (int) data2.indexOf(",")));
					dY = new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(data2.substring((int) (data2.indexOf(",") + 1), (int) (data2.indexOf(",") + 1 + (data2.substring((int) (data2.indexOf(",") + 1), (data2).length())).indexOf(","))));
					dZ = new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(data2.substring((int) (data2.indexOf(",") + 1 + (data2.substring((int) (data2.indexOf(",") + 1), (data2).length())).indexOf(",") + 1), (data2).length()));
				}
				if (FnafModModBlocks.SERVER.get() == (world.getBlockState(BlockPos.containing(dX, dY, dZ))).getBlock()) {
					{
						Entity _ent = entity;
						_ent.teleportTo(((new Object() {
							public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
								return _retval.get();
							}
						}.getItemStack(world, BlockPos.containing(dX, dY, dZ), 1)).getOrCreateTag().getDouble("CameraLinkX")), ((new Object() {
							public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
								return _retval.get();
							}
						}.getItemStack(world, BlockPos.containing(dX, dY, dZ), 1)).getOrCreateTag().getDouble("CameraLinkY")), ((new Object() {
							public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
								return _retval.get();
							}
						}.getItemStack(world, BlockPos.containing(dX, dY, dZ), 1)).getOrCreateTag().getDouble("CameraLinkZ")));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(((new Object() {
								public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
									return _retval.get();
								}
							}.getItemStack(world, BlockPos.containing(dX, dY, dZ), 1)).getOrCreateTag().getDouble("CameraLinkX")), ((new Object() {
								public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
									return _retval.get();
								}
							}.getItemStack(world, BlockPos.containing(dX, dY, dZ), 1)).getOrCreateTag().getDouble("CameraLinkY")), ((new Object() {
								public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
									return _retval.get();
								}
							}.getItemStack(world, BlockPos.containing(dX, dY, dZ), 1)).getOrCreateTag().getDouble("CameraLinkZ")), _ent.getYRot(), _ent.getXRot());
					}
					if (usehand.equals("offhand")) {
						if (entity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.OFF_HAND, true);
					} else {
						if (entity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.MAIN_HAND, true);
					}
				}
				data = data.substring((int) (data.indexOf(";") + 1), (data).length());
				xA = xA + 1;
			}
		}
	}
}
