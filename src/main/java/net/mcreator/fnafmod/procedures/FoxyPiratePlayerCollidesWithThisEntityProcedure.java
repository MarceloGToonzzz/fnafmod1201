package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.Minecraft;

import java.util.Random;

public class FoxyPiratePlayerCollidesWithThisEntityProcedure {
	public static void execute(double x, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		double Random = 0;
		if (!(new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
				} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
				}
				return false;
			}
		}.checkGamemode(sourceentity))) {
			if (entity instanceof Mob _entity && sourceentity instanceof LivingEntity _ent)
				_entity.setTarget(_ent);
		}
		{
			Entity _ent = sourceentity;
			_ent.setYRot((float) (Math.atan((x - sourceentity.getX()) / (z - sourceentity.getZ())) * (180 / 3.14159)));
			_ent.setXRot(0);
			_ent.setYBodyRot(_ent.getYRot());
			_ent.setYHeadRot(_ent.getYRot());
			_ent.yRotO = _ent.getYRot();
			_ent.xRotO = _ent.getXRot();
			if (_ent instanceof LivingEntity _entity) {
				_entity.yBodyRotO = _entity.getYRot();
				_entity.yHeadRotO = _entity.getYRot();
			}
		}
	}
}
