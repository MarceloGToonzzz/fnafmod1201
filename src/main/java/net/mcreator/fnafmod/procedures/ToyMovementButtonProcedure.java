package net.mcreator.fnafmod.procedures;

import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.fnafmod.world.inventory.ToyMovementTrueMenu;
import net.mcreator.fnafmod.world.inventory.ToyMovementMenu;

import java.util.UUID;

import io.netty.buffer.Unpooled;

public class ToyMovementButtonProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!(new Object() {
			Entity entityFromStringUUID(String uuid, Level world) {
				Entity _uuidentity = null;
				if (world instanceof ServerLevel _server) {
					try {
						_uuidentity = _server.getEntity(UUID.fromString(uuid));
					} catch (Exception e) {
					}
				}
				return _uuidentity;
			}
		}.entityFromStringUUID((entity.getPersistentData().getString("guiTarget")), (Level) world) == null)) {
			new Object() {
				Entity entityFromStringUUID(String uuid, Level world) {
					Entity _uuidentity = null;
					if (world instanceof ServerLevel _server) {
						try {
							_uuidentity = _server.getEntity(UUID.fromString(uuid));
						} catch (Exception e) {
						}
					}
					return _uuidentity;
				}
			}.entityFromStringUUID((entity.getPersistentData().getString("guiTarget")), (Level) world).getPersistentData().putBoolean("hasToyMovementToggle", (!(new Object() {
				Entity entityFromStringUUID(String uuid, Level world) {
					Entity _uuidentity = null;
					if (world instanceof ServerLevel _server) {
						try {
							_uuidentity = _server.getEntity(UUID.fromString(uuid));
						} catch (Exception e) {
						}
					}
					return _uuidentity;
				}
			}.entityFromStringUUID((entity.getPersistentData().getString("guiTarget")), (Level) world).getPersistentData().getBoolean("hasToyMovementToggle"))));
			if (true == (new Object() {
				Entity entityFromStringUUID(String uuid, Level world) {
					Entity _uuidentity = null;
					if (world instanceof ServerLevel _server) {
						try {
							_uuidentity = _server.getEntity(UUID.fromString(uuid));
						} catch (Exception e) {
						}
					}
					return _uuidentity;
				}
			}.entityFromStringUUID((entity.getPersistentData().getString("guiTarget")), (Level) world).getPersistentData().getBoolean("hasToyMovementToggle"))) {
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("ToyMovementTrue");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new ToyMovementTrueMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			} else {
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("ToyMovement");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new ToyMovementMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
		}
	}
}
