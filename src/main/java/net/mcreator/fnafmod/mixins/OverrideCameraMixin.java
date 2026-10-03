package net.mcreator.fnafmod.mixins;

import net.minecraft.client.Camera;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;

import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Camera.class)
public class OverrideCameraMixin {
    @Shadow
    private Entity entity;

    @Shadow
    private Vec3 position;

    @Shadow
    private float xRot;
    @Shadow
    private float yRot;

    @Inject(method = "tick", at = @At("HEAD"))
    private void fnaf_mod$tick(CallbackInfo ci) {
        if (entity != null && entity.getPersistentData().getBoolean("ForgeData.CameraOverride")) {

            double px = entity.getPersistentData().getDouble("ForgeData.CameraPosX");
            double py = entity.getPersistentData().getDouble("ForgeData.CameraPosY");
            double pz = entity.getPersistentData().getDouble("ForgeData.CameraPosZ");
            position = new Vec3(px, py, pz);
            xRot = (float)entity.getPersistentData().getDouble("ForgeData.CameraRotP");
            yRot = (float)entity.getPersistentData().getDouble("ForgeData.CameraRotY");
        }
    }
}
