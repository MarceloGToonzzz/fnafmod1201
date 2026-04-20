package net.mcreator.fnafmod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class OnCameraAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"summon block_display ~0.5 ~0.5 ~0.5 {Passengers:[{id:\"minecraft:block_display\",block_state:{Name:\"fnaf_mod:camera_head_block\",Properties:{axis:\"x\"}},transformation:[1f,0f,0f,-0.5f,0f,1f,0f,-0.5f,0f,0f,1f,-0.5f,0f,0f,0f,1f]}]}");
	}
}
