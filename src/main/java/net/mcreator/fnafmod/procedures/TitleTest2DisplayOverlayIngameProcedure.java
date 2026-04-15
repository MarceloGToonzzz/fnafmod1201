package net.mcreator.fnafmod.procedures;

import net.mcreator.fnafmod.network.FnafModModVariables;
import net.mcreator.fnafmod.configuration.FnafModConfigsConfiguration;

public class TitleTest2DisplayOverlayIngameProcedure {
	public static boolean execute() {
		if (FnafModModVariables.TitleCheck == 2 && true == FnafModConfigsConfiguration.MENU_ANIMATRONIC.get()) {
			return true;
		}
		return false;
	}
}
