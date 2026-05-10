package net.mcreator.fnafmod.procedures;

public class PartyIndexToYPositionProcedure {
	public static double execute(double index) {
		return Math.floor(index / 8) * 18 + -54;
	}
}
