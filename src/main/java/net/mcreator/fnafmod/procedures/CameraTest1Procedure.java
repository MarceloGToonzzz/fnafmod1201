package net.mcreator.fnafmod.procedures;

public class CameraTest1Procedure {
	public static void execute(double x, double y, double z) {
		double xPos = 0;
		double yPos = 0;
		double zPos = 0;
		xPos = x;
		yPos = y;
		zPos = z;
		net.mcreator.fnafmod.CameraLib.setCameraToggle(true);
		net.mcreator.fnafmod.CameraLib.setCameraPosition((float) xPos, (float) yPos, (float) zPos);
	}
}
