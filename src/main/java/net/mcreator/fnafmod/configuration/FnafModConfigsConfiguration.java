package net.mcreator.fnafmod.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class FnafModConfigsConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;

	public static final ForgeConfigSpec.ConfigValue<Boolean> ACCURATE_HEIGHTS;
	public static final ForgeConfigSpec.ConfigValue<Boolean> MENU_ANIMATRONIC;
	public static final ForgeConfigSpec.ConfigValue<String> HALLOWEEN;
	static {
		BUILDER.push("TheFnafMod");
		ACCURATE_HEIGHTS = BUILDER.comment("Scales the animatronics to have more  'accurate' heights.").define("accurate_heights", false);
		MENU_ANIMATRONIC = BUILDER.comment("Toggles the animatronic on the title screen.").define("Menu  Animatronic", true);
		HALLOWEEN = BUILDER.comment("Toggles Halloween Nightmare animatronics. Modes: 'off' 'chance' only'").define("Nightmarish Halloween", "chance");
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
