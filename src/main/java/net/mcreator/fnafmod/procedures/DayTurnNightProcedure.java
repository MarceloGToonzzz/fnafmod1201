package net.mcreator.fnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class DayTurnNightProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		String registry = "";
		String command = "";
		String ai = "";
		if (!(world instanceof Level _lvl0 && _lvl0.isDay())) {
			if ((ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).equals("fnaf_mod:day_time_freddy")) {
				registry = "freddy_fazbear";
			} else if ((ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).equals("fnaf_mod:day_time_bonnie")) {
				registry = "bonnie_bunny";
			} else if ((ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).equals("fnaf_mod:daytime_chica")) {
				registry = "chica_chicken";
			} else if ((ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).equals("fnaf_mod:day_time_foxy")) {
				registry = "foxy_pirate";
			}
			if ((ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).equals("fnaf_mod:day_time_toy_freddy")) {
				registry = "toy_freddy";
			} else if ((ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).equals("fnaf_mod:day_time_toy_bonnie")) {
				registry = "toy_bonnie";
			} else if ((ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).equals("fnaf_mod:toy_chica")) {
				registry = "nightime_toy_chica";
			} else if ((ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).equals("fnaf_mod:day_time_toy_foxy")) {
				registry = "toy_foxy";
			} else if ((ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).equals("fnaf_mod:mangle_sitting")) {
				registry = "mangle";
			} else if ((ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).equals("fnaf_mod:day_time_bb")) {
				registry = "bb";
			} else if ((ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).equals("fnaf_mod:day_time_puppet")) {
				registry = "puppet";
			}
			if ((ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).equals("fnaf_mod:ded_withered_freddy")) {
				registry = "withered_freddy";
			} else if ((ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).equals("fnaf_mod:sitting_withered_bonnie")) {
				registry = "withered_bonnie";
			} else if ((ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).equals("fnaf_mod:sitting_withered_chica")) {
				registry = "withered_chica";
			} else if ((ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).equals("fnaf_mod:day_time_withered_foxy")) {
				registry = "withered_foxy";
			}
			if ((ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).equals("fnaf_mod:sitting_daytime_springtrap") || (ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).equals("fnaf_mod:standing_daytime_springtrap")) {
				registry = "springtrap";
			}
			command = ((((("summon REGISTRY XYZ {Brain: {memories: {}}, HurtByTimestamp: 0, ForgeData: {got_coords: 1b, x: ZEX, y: ZEY, z: ZEZ, yaw: YAWd},NoAI:move,Rotation:[YAWf]}".replace("ZEZ", entity.getPersistentData().getDouble("z") + "d"))
					.replace("ZEY", entity.getPersistentData().getDouble("y") + "d")).replace("ZEX", entity.getPersistentData().getDouble("x") + "d")).replace("YAW", "" + entity.getPersistentData().getDouble("yaw")))
					.replace("XYZ", (entity.getPersistentData().getDouble("x") + " ") + "" + (entity.getPersistentData().getDouble("y") + " ") + ("" + entity.getPersistentData().getDouble("z")))).replace("REGISTRY", "fnaf_mod:" + registry);
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), command);
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}
