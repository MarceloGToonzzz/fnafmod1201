package net.mcreator.fnafmod.client;

import net.minecraft.world.phys.Vec3;

public class CustomCamera {

    private static boolean toggleOn = false;
    private static Vec3 position = Vec3.ZERO;

    private static float yaw;
    private static float pitch;

    public static void setPosition(Vec3 pos) {
        position = pos;
    }

    public static Vec3 getPosition() {
        return position;
    }

    public static void setToggle(boolean on) {
        toggleOn = on;
    }

    public static boolean getToggle() {
        return toggleOn;
    }

    public static void move(double x, double y, double z) {
        position = position.add(x, y, z);
    }

    public static void setRotation(float y, float p) {
        yaw = y;
        pitch = p;
    }

    public static float getYaw() {
        return yaw;
    }

    public static float getPitch() {
        return pitch;
    }
}