package net.mcreator.fnafmod.procedures;

import net.mcreator.fnafmod.network.FnafModModVariables;
import net.mcreator.fnafmod.configuration.FnafModConfigsConfiguration;

public class TitleTestDisplayOverlayIngameProcedure {
	public static boolean execute() {
		if (FnafModModVariables.TitleCheck == 1 && true == FnafModConfigsConfiguration.MENU_ANIMATRONIC.get()) {
			return true;
		}
		return false;
	}
}
