package net.mcreator.fnafmod.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.level.BlockEvent;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.fnafmod.network.FnafModModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RemoveConnectionOnBlockRemovedProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ());
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		String connect = "";
		String newConnection = "";
		double xPosition = 0;
		double yPosition = 0;
		double yPosition2 = 0;
		double zPosition = 0;
		double zPosition2 = 0;
		double xPosition2 = 0;
		double index = 0;
		double index2 = 0;
		if (!(FnafModModVariables.WorldVariables.get(world).Connections).isEmpty()) {
			connect = FnafModModVariables.WorldVariables.get(world).Connections;
			while (connect.contains("x")) {
				xPosition = new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(connect.substring((int) connect.indexOf("x") + "x".length(), (int) connect.indexOf("a")));
				yPosition = new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(connect.substring((int) connect.indexOf("y") + "y".length(), (int) connect.indexOf("b")));
				zPosition = new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(connect.substring((int) connect.indexOf("z") + "z".length(), (int) connect.indexOf("c")));
				xPosition2 = new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(connect.substring((int) connect.indexOf("u") + "u".length(), (int) connect.indexOf("d")));
				yPosition2 = new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(connect.substring((int) connect.indexOf("v") + "v".length(), (int) connect.indexOf("e")));
				zPosition2 = new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(connect.substring((int) connect.indexOf("w") + "w".length(), (int) connect.indexOf("f")));
				if (x == xPosition && y == yPosition && z == zPosition || x == xPosition2 && y == yPosition2 && z == zPosition2) {
					connect = FnafModModVariables.WorldVariables.get(world).Connections;
					while (connect.contains("x")) {
						xPosition = new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(connect.substring((int) connect.indexOf("x") + "x".length(), (int) connect.indexOf("a")));
						yPosition = new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(connect.substring((int) connect.indexOf("y") + "y".length(), (int) connect.indexOf("b")));
						zPosition = new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(connect.substring((int) connect.indexOf("z") + "z".length(), (int) connect.indexOf("c")));
						xPosition2 = new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(connect.substring((int) connect.indexOf("u") + "u".length(), (int) connect.indexOf("d")));
						yPosition2 = new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(connect.substring((int) connect.indexOf("v") + "v".length(), (int) connect.indexOf("e")));
						zPosition2 = new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(connect.substring((int) connect.indexOf("w") + "w".length(), (int) connect.indexOf("f")));
						connect = connect.substring((int) (connect.indexOf("f") + 1), (connect).length());
						if (index != index2) {
							newConnection = newConnection + "" + connect.substring((int) connect.indexOf("x"), (int) connect.indexOf("f") + "f".length());
						}
						index2 = index2 + 1;
					}
					FnafModModVariables.WorldVariables.get(world).Connections = newConnection;
					FnafModModVariables.WorldVariables.get(world).syncData(world);
					break;
				}
				connect = connect.substring((int) (connect.indexOf("f") + 1), (connect).length());
				index = index + 1;
			}
		}
	}
}
