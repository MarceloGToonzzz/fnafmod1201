package net.mcreator.fnafmod.procedures;

public class PartyIndexToXPositionProcedure {
	public static double execute(double index) {
		double x = 0;
		return (index % 8) * 18 + -72;
	}
}
