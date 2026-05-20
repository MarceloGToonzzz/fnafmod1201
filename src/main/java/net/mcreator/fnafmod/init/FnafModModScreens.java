
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fnafmod.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.fnafmod.client.gui.WallChange2Screen;
import net.mcreator.fnafmod.client.gui.WallChange1Screen;
import net.mcreator.fnafmod.client.gui.ToyMovementScreen;
import net.mcreator.fnafmod.client.gui.SodaMachineScreen;
import net.mcreator.fnafmod.client.gui.ServerPanelGUIScreen;
import net.mcreator.fnafmod.client.gui.RemnantInfuserScreen;
import net.mcreator.fnafmod.client.gui.PartySystemScreen;
import net.mcreator.fnafmod.client.gui.LolbitShopScreen;
import net.mcreator.fnafmod.client.gui.LockerScreen;
import net.mcreator.fnafmod.client.gui.JumpscareScreen;
import net.mcreator.fnafmod.client.gui.GeneratorCreativeGUIScreen;
import net.mcreator.fnafmod.client.gui.GeneratorBreakerUnpaneledScreen;
import net.mcreator.fnafmod.client.gui.GeneratorBreakerSwitchesScreen;
import net.mcreator.fnafmod.client.gui.GenCreativeConfigGUIScreen;
import net.mcreator.fnafmod.client.gui.FireAxeDataScreen;
import net.mcreator.fnafmod.client.gui.CameraPanelGUIScreen;
import net.mcreator.fnafmod.client.gui.CameraGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FnafModModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(FnafModModMenus.LOCKER.get(), LockerScreen::new);
			MenuScreens.register(FnafModModMenus.WALL_CHANGE_1.get(), WallChange1Screen::new);
			MenuScreens.register(FnafModModMenus.WALL_CHANGE_2.get(), WallChange2Screen::new);
			MenuScreens.register(FnafModModMenus.REMNANT_INFUSER.get(), RemnantInfuserScreen::new);
			MenuScreens.register(FnafModModMenus.CAMERA_GUI.get(), CameraGUIScreen::new);
			MenuScreens.register(FnafModModMenus.SODA_MACHINE.get(), SodaMachineScreen::new);
			MenuScreens.register(FnafModModMenus.JUMPSCARE.get(), JumpscareScreen::new);
			MenuScreens.register(FnafModModMenus.PARTY_SYSTEM.get(), PartySystemScreen::new);
			MenuScreens.register(FnafModModMenus.LOLBIT_SHOP.get(), LolbitShopScreen::new);
			MenuScreens.register(FnafModModMenus.GENERATOR_BREAKER_SWITCHES.get(), GeneratorBreakerSwitchesScreen::new);
			MenuScreens.register(FnafModModMenus.GENERATOR_CREATIVE_GUI.get(), GeneratorCreativeGUIScreen::new);
			MenuScreens.register(FnafModModMenus.GENERATOR_BREAKER_UNPANELED.get(), GeneratorBreakerUnpaneledScreen::new);
			MenuScreens.register(FnafModModMenus.GEN_CREATIVE_CONFIG_GUI.get(), GenCreativeConfigGUIScreen::new);
			MenuScreens.register(FnafModModMenus.CAMERA_PANEL_GUI.get(), CameraPanelGUIScreen::new);
			MenuScreens.register(FnafModModMenus.SERVER_PANEL_GUI.get(), ServerPanelGUIScreen::new);
			MenuScreens.register(FnafModModMenus.FIRE_AXE_DATA.get(), FireAxeDataScreen::new);
			MenuScreens.register(FnafModModMenus.TOY_MOVEMENT.get(), ToyMovementScreen::new);
		});
	}
}
