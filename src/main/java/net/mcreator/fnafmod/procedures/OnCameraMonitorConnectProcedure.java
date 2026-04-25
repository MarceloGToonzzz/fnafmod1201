package net.mcreator.fnafmod.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

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

import javax.annotation.Nullable;

import java.util.regex.Pattern;

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
			data = itemstack.getOrCreateTag().getString("servers");
			xA = 0;
			while (data.contains(";")) {
				if (xA == itemstack.getOrCreateTag().getDouble("selectedServer")) {
					data2 = data.substring((int) (data.indexOf(";") + 1), (int) ((data.substring((int) (data.indexOf(";") + 0), (int) (data.indexOf(";") + 1))).strip().indexOf(";") - 1));
					xB = 0;
					while (data2.contains(",")) {
						if (xB == 0) {
							dX = new Object() {
								double convert(String s) {
									try {
										return Double.parseDouble(s.trim());
									} catch (Exception e) {
									}
									return 0;
								}
							}.convert(data2.substring((int) (data2.indexOf(",") + 1), (int) ((data2.substring((int) (data2.indexOf(",") + 0), (int) (data2.indexOf(",") + 1))).strip().indexOf(",") - 1)));
						} else if (xB == 1) {
							dY = new Object() {
								double convert(String s) {
									try {
										return Double.parseDouble(s.trim());
									} catch (Exception e) {
									}
									return 0;
								}
							}.convert(data2.substring((int) (data2.indexOf(",") + 1), (int) ((data2.substring((int) (data2.indexOf(",") + 0), (int) (data2.indexOf(",") + 1))).strip().indexOf(",") - 1)));
						} else {
							dZ = new Object() {
								double convert(String s) {
									try {
										return Double.parseDouble(s.trim());
									} catch (Exception e) {
									}
									return 0;
								}
							}.convert(data2.substring((int) (data2.indexOf(",") + 1), (int) ((data2.substring((int) (data2.indexOf(",") + 0), (int) (data2.indexOf(",") + 1))).strip().indexOf(",") - 1)));
						}
						data2 = data2.substring((int) (data2.indexOf(",") + 1), (data2).length());
						xB = xB + 1;
					}
					if (FnafModModBlocks.SERVER.get() == (world.getBlockState(BlockPos.containing(dX, dY, dZ))).getBlock()) {
						data3 = new Object() {
							public String getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getString(tag);
								return "";
							}
						}.getValue(world, BlockPos.containing(dX, dY, dZ), "cameras");
						xB = 0;
						while (data3.contains(";")) {
							if (xB == itemstack.getOrCreateTag().getDouble("selectedCamera")) {
								data2 = data3.substring((int) (data3.indexOf(";") + 1), (int) ((data3.substring((int) (data3.indexOf(";") + 0), (int) (data3.indexOf(";") + 1))).strip().indexOf(";") - 1));
								xC = 0;
								while (data2.contains(",")) {
									if (xC == 0) {
										dX = new Object() {
											double convert(String s) {
												try {
													return Double.parseDouble(s.trim());
												} catch (Exception e) {
												}
												return 0;
											}
										}.convert(data2.substring((int) (data2.indexOf(",") + 1), (int) ((data2.substring((int) (data2.indexOf(",") + 0), (int) (data2.indexOf(",") + 1))).strip().indexOf(",") - 1)));
									} else if (xC == 1) {
										dY = new Object() {
											double convert(String s) {
												try {
													return Double.parseDouble(s.trim());
												} catch (Exception e) {
												}
												return 0;
											}
										}.convert(data2.substring((int) (data2.indexOf(",") + 1), (int) ((data2.substring((int) (data2.indexOf(",") + 0), (int) (data2.indexOf(",") + 1))).strip().indexOf(",") - 1)));
									} else {
										dZ = new Object() {
											double convert(String s) {
												try {
													return Double.parseDouble(s.trim());
												} catch (Exception e) {
												}
												return 0;
											}
										}.convert(data2.substring((int) (data2.indexOf(",") + 1), (int) ((data2.substring((int) (data2.indexOf(",") + 0), (int) (data2.indexOf(",") + 1))).strip().indexOf(",") - 1)));
									}
									data2 = data2.substring((int) (data2.indexOf(",") + 1), (data2).length());
									xB = xB + 1;
								}
								if (FnafModModBlocks.CAMERA_BLOCK.get() == (world.getBlockState(BlockPos.containing(dX, dY, dZ))).getBlock()) {
									{
										Entity _ent = entity;
										_ent.teleportTo(dX, dY, dZ);
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport(dX, dY, dZ, _ent.getYRot(), _ent.getXRot());
									}
								}
							}
							data3 = data3.substring((int) (data3.indexOf(";") + 1), (data3).length());
							xB = xB + 1;
						}
					}
				}
				data = data.substring((int) (data.indexOf(";") + 1), (data).length());
				xA = xA + 1;
			}
		}
	}
}
