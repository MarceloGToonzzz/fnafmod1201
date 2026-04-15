package net.mcreator.fnafmod;

import com.mojang.logging.LogUtils;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

public class CameraLib
{
    public static Vec3 cameraPosition = new Vec3(0, 0, 0);
    public static float cameraYaw = 0, cameraPitch = 0;
    public static boolean cameraToggle = false;

    public static void setCameraPosition(float x, float y, float z) { cameraPosition = new Vec3(x, y, z); }
    public static void setCameraRotation(float yaw, float pitch) { cameraYaw = yaw; cameraPitch = pitch; }
    public static void setCameraToggle(boolean toggle) { cameraToggle = toggle; }

    // "net.mcreator.fnafmod.CameraLib.setCameraPosition((float)xPos, (float)yPos, (float)zPos);"
    // "net.mcreator.fnafmod.CameraLib.setCameraRotation((float)yaw, (float)pitch);"
    // "net.mcreator.fnafmod.CameraLib.setCameraToggle(true);"
    // "net.mcreator.fnafmod.CameraLib.setCameraToggle(false);"
}
