package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.fnafmod.entity.BreadbearEntity;

public class BreadbearOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double DoAttack = 0;
		if (entity instanceof Mob _mob ? _mob.isAggressive() : false) {
			if (0 == (entity instanceof BreadbearEntity _datEntI ? _datEntI.getEntityData().get(BreadbearEntity.DATA_attack) : 0)) {
				if (entity instanceof BreadbearEntity _datEntSetI)
					_datEntSetI.getEntityData().set(BreadbearEntity.DATA_attack, Mth.nextInt(RandomSource.create(), 1, 2));
				entity.getPersistentData().putDouble("animationTick", 0);
			} else if (1 == (entity instanceof BreadbearEntity _datEntI ? _datEntI.getEntityData().get(BreadbearEntity.DATA_attack) : 0)) {
				if (world.getLevelData().getGameRules().getBoolean(GameRules.RULE_MOBGRIEFING)) {
					if (entity instanceof BreadbearEntity) {
						((BreadbearEntity) entity).setAnimation("animation.breadbear.groundpound");
					}
					entity.getPersistentData().putDouble("animationTick", (entity.getPersistentData().getDouble("animationTick") + 1));
					if (30 <= entity.getPersistentData().getDouble("animationTick")) {
						if (entity instanceof BreadbearEntity) {
							((BreadbearEntity) entity).setAnimation("empty");
						}
						if (entity instanceof BreadbearEntity _datEntSetI)
							_datEntSetI.getEntityData().set(BreadbearEntity.DATA_attack, 0);
						if (world instanceof Level _level && !_level.isClientSide())
							_level.explode(null, x, y, z, 3, Level.ExplosionInteraction.MOB);
					}
				} else {
					if (entity instanceof BreadbearEntity _datEntSetI)
						_datEntSetI.getEntityData().set(BreadbearEntity.DATA_attack, 0);
				}
			} else if (2 == (entity instanceof BreadbearEntity _datEntI ? _datEntI.getEntityData().get(BreadbearEntity.DATA_attack) : 0)) {
				if (entity instanceof BreadbearEntity) {
					((BreadbearEntity) entity).setAnimation("animation.breadbear.attack");
				}
				entity.getPersistentData().putDouble("animationTick", (entity.getPersistentData().getDouble("animationTick") + 1));
				if (200 <= entity.getPersistentData().getDouble("animationTick")) {
					if (entity instanceof BreadbearEntity) {
						((BreadbearEntity) entity).setAnimation("empty");
					}
					if (entity instanceof BreadbearEntity _datEntSetI)
						_datEntSetI.getEntityData().set(BreadbearEntity.DATA_attack, 0);
				}
			}
		}
	}
}
