package net.mcreator.fnafmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.fnafmod.entity.WitheredGoldenFreddyEntity;
import net.mcreator.fnafmod.entity.WitheredFreddyEntity;
import net.mcreator.fnafmod.entity.WitheredFoxyEntity;
import net.mcreator.fnafmod.entity.WitheredChicaEntity;
import net.mcreator.fnafmod.entity.WitheredBonnieEntity;
import net.mcreator.fnafmod.entity.UnwitheredFreddyEntity;
import net.mcreator.fnafmod.entity.UnwitheredFoxyEntity;
import net.mcreator.fnafmod.entity.UnwitheredChicaEntity;
import net.mcreator.fnafmod.entity.UnwitheredBonnieEntity;
import net.mcreator.fnafmod.entity.ToyFreddyEntity;
import net.mcreator.fnafmod.entity.ToyFoxyEntity;
import net.mcreator.fnafmod.entity.ToyChicaEntity;
import net.mcreator.fnafmod.entity.ToyBonnieEntity;
import net.mcreator.fnafmod.entity.StatueFreddyEntity;
import net.mcreator.fnafmod.entity.StatueFoxyEntity;
import net.mcreator.fnafmod.entity.StatueChicaEntity;
import net.mcreator.fnafmod.entity.StatueBonnieEntity;
import net.mcreator.fnafmod.entity.StandingDaytimeSpringtrapEntity;
import net.mcreator.fnafmod.entity.SpringtrapEntity;
import net.mcreator.fnafmod.entity.SpringBonnieAnimatronicEntity;
import net.mcreator.fnafmod.entity.SittingWitheredChicaEntity;
import net.mcreator.fnafmod.entity.SittingWitheredBonnieEntity;
import net.mcreator.fnafmod.entity.SittingSpringBonnieEntity;
import net.mcreator.fnafmod.entity.SittingPlushtrapEntity;
import net.mcreator.fnafmod.entity.SittingNightmareBBEntity;
import net.mcreator.fnafmod.entity.SittingFredbearEntity;
import net.mcreator.fnafmod.entity.SittingDaytimeSpringtrapEntity;
import net.mcreator.fnafmod.entity.ShadowFreddyEntity;
import net.mcreator.fnafmod.entity.ShadowBonnieEntity;
import net.mcreator.fnafmod.entity.PuppetEntity;
import net.mcreator.fnafmod.entity.PlushtrapToyEntity;
import net.mcreator.fnafmod.entity.PlushtrapEntity;
import net.mcreator.fnafmod.entity.PhantomPuppetEntity;
import net.mcreator.fnafmod.entity.PhantomMangleEntity;
import net.mcreator.fnafmod.entity.PhantomFreddyEntity;
import net.mcreator.fnafmod.entity.PhantomFoxyEntity;
import net.mcreator.fnafmod.entity.PhantomChicaEntity;
import net.mcreator.fnafmod.entity.PhantomBBEntity;
import net.mcreator.fnafmod.entity.PassiveSpringBonnieEntity;
import net.mcreator.fnafmod.entity.PassiveFreddyEntity;
import net.mcreator.fnafmod.entity.PassiveFredbearEntity;
import net.mcreator.fnafmod.entity.PassiveFoxyEntity;
import net.mcreator.fnafmod.entity.PassiveChicaEntity;
import net.mcreator.fnafmod.entity.PassiveBonnieEntity;
import net.mcreator.fnafmod.entity.NightmarionneEntity;
import net.mcreator.fnafmod.entity.NightmarioneStatueEntity;
import net.mcreator.fnafmod.entity.NightmareMangleEntity;
import net.mcreator.fnafmod.entity.NightmareFreddyStatueEntity;
import net.mcreator.fnafmod.entity.NightmareFreddyEntity;
import net.mcreator.fnafmod.entity.NightmareFredbearStatueEntity;
import net.mcreator.fnafmod.entity.NightmareFredbearEntity;
import net.mcreator.fnafmod.entity.NightmareFoxyStatueEntity;
import net.mcreator.fnafmod.entity.NightmareFoxyEntity;
import net.mcreator.fnafmod.entity.NightmareEntity;
import net.mcreator.fnafmod.entity.NightmareChicaStatueEntity;
import net.mcreator.fnafmod.entity.NightmareChicaEntity;
import net.mcreator.fnafmod.entity.NightmareBonnieStatueEntity;
import net.mcreator.fnafmod.entity.NightmareBonnieEntity;
import net.mcreator.fnafmod.entity.NightmareBBEntity;
import net.mcreator.fnafmod.entity.NightimeToyChicaEntity;
import net.mcreator.fnafmod.entity.MangleSittingEntity;
import net.mcreator.fnafmod.entity.MangleEntity;
import net.mcreator.fnafmod.entity.JackOChicaEntity;
import net.mcreator.fnafmod.entity.JackOBonnieEntity;
import net.mcreator.fnafmod.entity.JJEntity;
import net.mcreator.fnafmod.entity.GusPugEntity;
import net.mcreator.fnafmod.entity.GoldenFreddyEntity;
import net.mcreator.fnafmod.entity.GlitchBonnieAnimatronicEntity;
import net.mcreator.fnafmod.entity.FullHostileFreddyEntity;
import net.mcreator.fnafmod.entity.FullHostileFoxyEntity;
import net.mcreator.fnafmod.entity.FullHostileChicaEntity;
import net.mcreator.fnafmod.entity.FullHostileBonnieEntity;
import net.mcreator.fnafmod.entity.FreddyStandEntity;
import net.mcreator.fnafmod.entity.FreddyFazbearEntity;
import net.mcreator.fnafmod.entity.FreddlesEntity;
import net.mcreator.fnafmod.entity.FredbearsFreddyEntity;
import net.mcreator.fnafmod.entity.FredbearsFoxyEntity;
import net.mcreator.fnafmod.entity.FredbearsChicaEntity;
import net.mcreator.fnafmod.entity.FredbearsBonnieEntity;
import net.mcreator.fnafmod.entity.FredbearAnimatronicEntity;
import net.mcreator.fnafmod.entity.FoxyPirateEntity;
import net.mcreator.fnafmod.entity.EndoSkeletonEntity;
import net.mcreator.fnafmod.entity.Endo02Entity;
import net.mcreator.fnafmod.entity.DedWitheredFreddyEntity;
import net.mcreator.fnafmod.entity.DaytimeGusPugEntity;
import net.mcreator.fnafmod.entity.DaytimeChicaEntity;
import net.mcreator.fnafmod.entity.DaytimeBarryPolarEntity;
import net.mcreator.fnafmod.entity.DayTimeWitheredFoxyEntity;
import net.mcreator.fnafmod.entity.DayTimeToyFreddyEntity;
import net.mcreator.fnafmod.entity.DayTimeToyFoxyEntity;
import net.mcreator.fnafmod.entity.DayTimeToyBonnieEntity;
import net.mcreator.fnafmod.entity.DayTimeFreddyEntity;
import net.mcreator.fnafmod.entity.DayTimeFoxyEntity;
import net.mcreator.fnafmod.entity.DayTimeBonnieEntity;
import net.mcreator.fnafmod.entity.DayTimeBBEntity;
import net.mcreator.fnafmod.entity.ChicaChickenEntity;
import net.mcreator.fnafmod.entity.BonnieStandEntity;
import net.mcreator.fnafmod.entity.BonnieBunnyEntity;
import net.mcreator.fnafmod.entity.BarryPolarEntity;
import net.mcreator.fnafmod.entity.BBEntity;
import net.mcreator.fnafmod.configuration.FnafModConfigsConfiguration;

public class GetScalesProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		double result = 0;
		if (FnafModConfigsConfiguration.ACCURATE_HEIGHTS.get() == true) {
			result = 1;
			if (entity instanceof FreddyFazbearEntity || entity instanceof DayTimeFreddyEntity || entity instanceof PassiveFreddyEntity || entity instanceof FullHostileFreddyEntity || entity instanceof StatueFreddyEntity
					|| entity instanceof FreddyStandEntity || entity instanceof GoldenFreddyEntity || entity instanceof PassiveFredbearEntity) {
				result = 0.945;
			} else if (entity instanceof BonnieBunnyEntity || entity instanceof DayTimeBonnieEntity || entity instanceof PassiveBonnieEntity || entity instanceof FullHostileBonnieEntity || entity instanceof StatueBonnieEntity
					|| entity instanceof BonnieStandEntity || entity instanceof PassiveSpringBonnieEntity) {
				result = 0.925;
			} else if (entity instanceof ChicaChickenEntity || entity instanceof DaytimeChicaEntity || entity instanceof PassiveChicaEntity || entity instanceof FullHostileChicaEntity || entity instanceof StatueChicaEntity) {
				result = 0.935;
			} else if (entity instanceof FoxyPirateEntity || entity instanceof DayTimeFoxyEntity || entity instanceof PassiveFoxyEntity || entity instanceof FullHostileFoxyEntity || entity instanceof StatueFoxyEntity) {
				result = 0.925;
			} else if (entity instanceof EndoSkeletonEntity) {
				result = 0.96;
			}
			if (entity instanceof ToyFreddyEntity || entity instanceof DayTimeToyFreddyEntity) {
				result = 0.91;
			} else if (entity instanceof ToyBonnieEntity || entity instanceof DayTimeToyBonnieEntity || entity instanceof ShadowBonnieEntity) {
				result = 0.865;
			} else if (entity instanceof NightimeToyChicaEntity || entity instanceof ToyChicaEntity) {
				result = 0.925;
			} else if (entity instanceof ToyFoxyEntity || entity instanceof DayTimeToyFoxyEntity) {
				result = 0.9;
			} else if (entity instanceof MangleEntity || entity instanceof MangleSittingEntity) {
				result = 0.9;
			} else if (entity instanceof BBEntity || entity instanceof DayTimeBBEntity || entity instanceof JJEntity || entity instanceof JJEntity) {
				result = 0.91;
			} else if (entity instanceof PuppetEntity) {
				result = 0.965;
			}
			if (entity instanceof WitheredFreddyEntity || entity instanceof DedWitheredFreddyEntity || entity instanceof UnwitheredFreddyEntity || entity instanceof FredbearsFreddyEntity || entity instanceof WitheredGoldenFreddyEntity
					|| entity instanceof ShadowFreddyEntity) {
				result = 0.865;
			} else if (entity instanceof WitheredBonnieEntity || entity instanceof SittingWitheredBonnieEntity || entity instanceof UnwitheredBonnieEntity || entity instanceof FredbearsBonnieEntity) {
				result = 0.775;
			} else if (entity instanceof WitheredChicaEntity || entity instanceof SittingWitheredChicaEntity || entity instanceof UnwitheredChicaEntity || entity instanceof FredbearsChicaEntity) {
				result = 0.82;
			} else if (entity instanceof WitheredFoxyEntity || entity instanceof DayTimeWitheredFoxyEntity || entity instanceof UnwitheredFoxyEntity || entity instanceof FredbearsFoxyEntity) {
				result = 0.86;
			} else if (entity instanceof Endo02Entity) {
				result = 0.875;
			}
			if (entity instanceof SpringtrapEntity || entity instanceof SittingDaytimeSpringtrapEntity || entity instanceof StandingDaytimeSpringtrapEntity) {
				result = 0.85;
			}
			if (entity instanceof PhantomFreddyEntity) {
				result = 0.865;
			} else if (entity instanceof PhantomChicaEntity) {
				result = 0.935;
			} else if (entity instanceof PhantomFoxyEntity) {
				result = 0.86;
			} else if (entity instanceof PhantomMangleEntity) {
				result = 0.9;
			} else if (entity instanceof PhantomBBEntity) {
				result = 0.91;
			} else if (entity instanceof PhantomPuppetEntity) {
				result = 0.965;
			}
			if (entity instanceof FredbearAnimatronicEntity || entity instanceof SittingFredbearEntity) {
				result = 0.8;
			} else if (entity instanceof SpringBonnieAnimatronicEntity || entity instanceof SittingSpringBonnieEntity) {
				result = 0.85;
			} else if (entity instanceof GlitchBonnieAnimatronicEntity) {
				result = 0.85;
			}
			if (entity instanceof NightmareFreddyEntity || entity instanceof NightmareFreddyStatueEntity) {
				result = 1.235;
			} else if (entity instanceof FreddlesEntity) {
				result = 0.868;
			} else if (entity instanceof NightmareBonnieEntity || entity instanceof NightmareBonnieStatueEntity || entity instanceof JackOBonnieEntity) {
				result = 1.2725;
			} else if (entity instanceof NightmareChicaEntity || entity instanceof NightmareChicaStatueEntity || entity instanceof JackOChicaEntity) {
				result = 1.1689;
			} else if (entity instanceof NightmareFoxyEntity || entity instanceof NightmareFoxyStatueEntity || entity instanceof NightmareMangleEntity) {
				result = 1.0195;
			} else if (entity instanceof NightmareFredbearEntity || entity instanceof NightmareFredbearStatueEntity || entity instanceof NightmareEntity) {
				result = 0.79;
			} else if (entity instanceof NightmarionneEntity || entity instanceof NightmarioneStatueEntity) {
				result = 0.91;
			} else if (entity instanceof PlushtrapEntity || entity instanceof SittingPlushtrapEntity || entity instanceof PlushtrapToyEntity) {
				result = 0.87;
			} else if (entity instanceof NightmareBBEntity || entity instanceof SittingNightmareBBEntity) {
				result = 0.84;
			}
			if (entity instanceof BarryPolarEntity || entity instanceof DaytimeBarryPolarEntity) {
				result = 0.85;
			} else if (entity instanceof GusPugEntity || entity instanceof DaytimeGusPugEntity) {
				result = 1.015;
			}
		} else {
			result = 1;
		}
		return result;
	}
}
