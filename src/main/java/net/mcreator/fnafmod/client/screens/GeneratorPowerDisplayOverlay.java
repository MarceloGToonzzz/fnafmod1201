
package net.mcreator.fnafmod.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.client.Minecraft;

import net.mcreator.fnafmod.procedures.GeneratorPowerDisplayShowProcedure;
import net.mcreator.fnafmod.procedures.GeneratorPowerDisplayNumberProcedure;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class GeneratorPowerDisplayOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		if (true) {
			if (GeneratorPowerDisplayShowProcedure.execute(entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						GeneratorPowerDisplayNumberProcedure.execute(world, entity), w / 2 + -207, h / 2 + 104, -1, false);
		}
	}
}
