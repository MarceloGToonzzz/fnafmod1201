package net.mcreator.fnafmod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class OnCameraAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Direction.NORTH == (new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection((world.getBlockState(BlockPos.containing(x, y, z)))))) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"summon block_display ~0.5 ~0.5 ~0.5 {Passengers:[{id:\"minecraft:block_display\",block_state:{Name:\"fnaf_mod:camera_head_block\",Properties:{axis:\"x\"}},transformation:[1f,0f,0f,-0.5f,0f,1f,0f,-0.5f,0f,0f,1f,-0.5f,0f,0f,0f,1f]}]}");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.5), (y + 0.5), (z + 0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"execute as @e[type=block_display,distance=..0.25] at @s run teleport @s ~ ~ ~ ~0 ~");
		} else if (Direction.SOUTH == (new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection((world.getBlockState(BlockPos.containing(x, y, z)))))) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"summon block_display ~0.5 ~0.5 ~0.5 {Passengers:[{id:\"minecraft:block_display\",block_state:{Name:\"fnaf_mod:camera_head_block\",Properties:{axis:\"x\"}},transformation:[1f,0f,0f,-0.5f,0f,1f,0f,-0.5f,0f,0f,1f,-0.5f,0f,0f,0f,1f]}]}");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.5), (y + 0.5), (z + 0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"execute as @e[type=block_display,distance=..0.25] at @s run teleport @s ~ ~ ~ ~180 ~");
		} else if (Direction.WEST == (new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection((world.getBlockState(BlockPos.containing(x, y, z)))))) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"summon block_display ~0.5 ~0.5 ~0.5 {Passengers:[{id:\"minecraft:block_display\",block_state:{Name:\"fnaf_mod:camera_head_block\",Properties:{axis:\"x\"}},transformation:[1f,0f,0f,-0.5f,0f,1f,0f,-0.5f,0f,0f,1f,-0.5f,0f,0f,0f,1f]}]}");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.5), (y + 0.5), (z + 0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"execute as @e[type=block_display,distance=..0.25] at @s run teleport @s ~ ~ ~ ~-90 ~");
		} else {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"summon block_display ~0.5 ~0.5 ~0.5 {Passengers:[{id:\"minecraft:block_display\",block_state:{Name:\"fnaf_mod:camera_head_block\",Properties:{axis:\"x\"}},transformation:[1f,0f,0f,-0.5f,0f,1f,0f,-0.5f,0f,0f,1f,-0.5f,0f,0f,0f,1f]}]}");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.5), (y + 0.5), (z + 0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"execute as @e[type=block_display,distance=..0.25] at @s run teleport @s ~ ~ ~ ~90 ~");
		}
	}
}
