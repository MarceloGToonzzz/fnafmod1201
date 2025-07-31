package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameRules;
import net.minecraft.network.chat.Component;

import net.mcreator.fnafmod.network.FnafModModVariables;

public class ToggleNBTTagsProcedure {
	public static void execute(LevelAccessor world) {
		if (FnafModModVariables.MapVariables.get(world).SetNBTBuild == false) {
			FnafModModVariables.MapVariables.get(world).SetNBTBuild = true;
			FnafModModVariables.MapVariables.get(world).syncData(world);
			if (world.getLevelData().getGameRules().getBoolean(GameRules.RULE_SENDCOMMANDFEEDBACK)) {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("NBT Positions disabled!"), false);
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList()
							.broadcastSystemMessage(Component.literal("* Warning! This is used to create structures for FNAF Mod, with this disabled, FNAF Mod animatronics will not save their spots when they change night/day states."), false);
			}
		} else {
			FnafModModVariables.MapVariables.get(world).SetNBTBuild = false;
			FnafModModVariables.MapVariables.get(world).syncData(world);
			if (world.getLevelData().getGameRules().getBoolean(GameRules.RULE_SENDCOMMANDFEEDBACK)) {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("NBT Positions enabled!"), false);
			}
		}
	}
}
