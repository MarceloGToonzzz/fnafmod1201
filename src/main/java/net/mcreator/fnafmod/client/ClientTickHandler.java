package net.mcreator.fnafmod.client;

import net.mcreator.fnafmod.CameraLib;
import net.mcreator.fnafmod.FnafModMod;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FnafModMod.MODID, value = Dist.CLIENT)
public class ClientTickHandler {

    @SubscribeEvent
    public static void onClientTick(TickEvent.ClientTickEvent event) {
        if (event.phase != TickEvent.Phase.END) return;

        var player = Minecraft.getInstance().player;
        if (player == null) return;

        CustomCamera.setToggle(CameraLib.cameraToggle);
        CustomCamera.setPosition(CameraLib.cameraPosition);
        CustomCamera.setRotation(CameraLib.cameraYaw, CameraLib.cameraPitch);
    }
}