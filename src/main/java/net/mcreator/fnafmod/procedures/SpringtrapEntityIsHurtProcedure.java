package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import java.util.Random;

public class SpringtrapEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double Random = 0;
		double Random2 = 0;
		double Random3 = 0;
		String tag = "";
		Random = Mth.nextInt(RandomSource.create(), 1, 7);
		Random2 = Mth.nextInt(RandomSource.create(), 1, 4);
		Random3 = Mth.nextInt(RandomSource.create(), 1, 3);
		if (Random3 == 2) {
			if (Random == 1) {
				if (Random2 == 1) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.PHANTOM.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
			} else {
				tag = "phantoms";
				net.mcreator.fnafmod.CustomSnippets.spawnRandomTaggedEntity(world, x, y, z, tag);
			}
		}
	}
}
