package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.fnafmod.network.FnafModModVariables;
import net.mcreator.fnafmod.init.FnafModModEntities;

public class Slot4Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FnafModModVariables.PlayerVariables())).Party4).equals("Freddy")) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = FnafModModEntities.TAMEABLE_ADVENTURE_FREDDY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
		} else if (((entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FnafModModVariables.PlayerVariables())).Party4).equals("Chica")) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = FnafModModEntities.TAMEABLE_CHICA.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
		} else if (((entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FnafModModVariables.PlayerVariables())).Party4).equals("Mangle")) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = FnafModModEntities.TAMEABLE_MANGLE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
		} else if (((entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FnafModModVariables.PlayerVariables())).Party4).equals("Springtrap")) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = FnafModModEntities.TAMEABLE_SPRINGTRAP.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
		} else if (((entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FnafModModVariables.PlayerVariables())).Party4).equals("Fredbear")) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = FnafModModEntities.TAMEABLE_FREDBEAR.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
		}
	}
}
