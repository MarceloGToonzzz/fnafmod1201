package net.mcreator.fnafmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.level.BlockEvent;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RemoveConnectionOnBlockRemovedProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event);
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
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
	}
}
