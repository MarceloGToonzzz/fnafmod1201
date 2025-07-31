package net.mcreator.fnafmod.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class FnafModConfigsConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;

	public static final ForgeConfigSpec.ConfigValue<Boolean> ACCURATE_HEIGHTS;
	static {
		BUILDER.push("fnafmodEntityConfigs");
		ACCURATE_HEIGHTS = BUILDER.comment("Scales the animatronics to have more  'accurate' heights.").define("accurate_heights", false);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
