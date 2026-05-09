
package net.mcreator.fnafmod.command;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.common.util.FakePlayerFactory;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.commands.arguments.coordinates.BlockPosArgument;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.Commands;

import net.mcreator.fnafmod.procedures.TPToFNAFWorldProcedure;
import net.mcreator.fnafmod.procedures.OutletDrainResetProcedure;
import net.mcreator.fnafmod.procedures.DataClientProcedure;
import net.mcreator.fnafmod.procedures.CommandMinPowerConfigProcedure;
import net.mcreator.fnafmod.procedures.CommandCleanupDisplayShelvesProcedure;
import net.mcreator.fnafmod.procedures.CommandAccessChangeProcedure;

import com.mojang.brigadier.arguments.DoubleArgumentType;

@Mod.EventBusSubscriber
public class FnafModCommandsCommand {
	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("fnafmod").requires(s -> s.hasPermission(4)).then(Commands.literal("cleanup").then(Commands.argument("radius", DoubleArgumentType.doubleArg()).executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			CommandCleanupDisplayShelvesProcedure.execute(world, x, y, z, arguments);
			return 0;
		}))).then(Commands.literal("access").then(Commands.argument("target", EntityArgument.entities()).then(Commands.argument("level", DoubleArgumentType.doubleArg(0, 3)).executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			CommandAccessChangeProcedure.execute(arguments, entity);
			return 0;
		})))).then(Commands.literal("power").then(Commands.argument("PowerBlock", BlockPosArgument.blockPos()).then(Commands.literal("percentshutoff").then(Commands.argument("level", DoubleArgumentType.doubleArg(0, 100)).executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			CommandMinPowerConfigProcedure.execute(world, arguments);
			return 0;
		}))).then(Commands.literal("drain_reset").then(Commands.argument("level", DoubleArgumentType.doubleArg(0, 100)).executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			OutletDrainResetProcedure.execute(world, arguments);
			return 0;
		})))).then(Commands.literal("dataClient").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			DataClientProcedure.execute(world);
			return 0;
		}))).then(Commands.literal("fnafworld").then(Commands.argument("target", EntityArgument.entities()).executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			TPToFNAFWorldProcedure.execute(arguments);
			return 0;
		}))));
	}
}
