package net.mcreator.fnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class NightTurnDayProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		String registry = "";
		String ai = "";
		String command = "";
		String thing = "";
		ai = "1";
		if (world instanceof Level _lvl0 && _lvl0.isDay()) {
			if ((ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).equals("fnaf_mod:freddy_fazbear")) {
				registry = "day_time_freddy";
			} else if ((ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).equals("fnaf_mod:bonnie_bunny")) {
				registry = "day_time_bonnie";
			} else if ((ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).equals("fnaf_mod:chica_chicken")) {
				registry = "daytime_chica";
			} else if ((ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).equals("fnaf_mod:foxy_pirate")) {
				registry = "day_time_foxy";
			}
			if ((ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).equals("fnaf_mod:toy_freddy")) {
				registry = "day_time_toy_freddy";
				ai = "0";
			} else if ((ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).equals("fnaf_mod:toy_bonnie") || (ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).equals("fnaf_mod:crawling_toy_bonnie")) {
				registry = "day_time_toy_bonnie";
				ai = "0";
			} else if ((ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).equals("fnaf_mod:nightime_toy_chica") || (ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).equals("fnaf_mod:crawling_toy_chica")) {
				registry = "toy_chica";
				ai = "0";
			} else if ((ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).equals("fnaf_mod:toy_foxy") || (ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).equals("fnaf_mod:crawling_toy_foxy")) {
				registry = "day_time_toy_foxy";
				ai = "0";
			} else if ((ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).equals("fnaf_mod:mangle") || (ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).equals("fnaf_mod:crawling_mangle")) {
				registry = "mangle_sitting";
			} else if ((ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).equals("fnaf_mod:bb")) {
				registry = "day_time_bb";
			} else if ((ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).equals("fnaf_mod:puppet")) {
				registry = "day_time_puppet";
			}
			if ((ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).equals("fnaf_mod:withered_freddy")) {
				registry = "ded_withered_freddy";
			} else if ((ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).equals("fnaf_mod:withered_bonnie")) {
				registry = "sitting_withered_bonnie";
			} else if ((ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).equals("fnaf_mod:withered_chica")) {
				registry = "sitting_withered_chica";
			} else if ((ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).equals("fnaf_mod:withered_foxy")) {
				registry = "day_time_withered_foxy";
			}
			if ((ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).equals("fnaf_mod:springtrap") || (ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).equals("fnaf_mod:crawling_springtrap")) {
				if (Mth.nextInt(RandomSource.create(), 1, 3) != 2) {
					registry = "sitting_daytime_springtrap";
				} else {
					registry = "standing_daytime_springtrap";
				}
			}
			command = (((((("summon REGISTRY XYZ {Brain: {memories: {}}, HurtByTimestamp: 0, ForgeData: {got_coords: 1b, x: ZEX, y: ZEY, z: ZEZ, yaw: YAWd},NoAI:move,Rotation:[YAWf]}".replace("ZEZ", entity.getPersistentData().getDouble("z") + "d"))
					.replace("ZEY", entity.getPersistentData().getDouble("y") + "d")).replace("ZEX", entity.getPersistentData().getDouble("x") + "d")).replace("move", ai + "b")).replace("YAW", "" + entity.getPersistentData().getDouble("yaw")))
					.replace("XYZ", (entity.getPersistentData().getDouble("x") + " ") + "" + (entity.getPersistentData().getDouble("y") + " ") + ("" + entity.getPersistentData().getDouble("z")))).replace("REGISTRY", "fnaf_mod:" + registry);
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), command);
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}
