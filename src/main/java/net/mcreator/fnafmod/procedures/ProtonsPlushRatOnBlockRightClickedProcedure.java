package net.mcreator.fnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class ProtonsPlushRatOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fnaf_mod:protons_rat_noises")), SoundSource.BLOCKS, 1, (float) (0.75 + Mth.nextInt(RandomSource.create(), -5, 5) / 10));
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fnaf_mod:protons_rat_noises")), SoundSource.BLOCKS, 1, (float) (0.75 + Mth.nextInt(RandomSource.create(), -5, 5) / 10), false);
			}
		}
	}
}
