package net.mcreator.fnafmod.mixins;

import net.mcreator.fnafmod.client.CustomCamera;
import net.minecraft.client.Camera;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Camera.class)
public class CameraMixin {

    @Inject(method = "getPosition", at = @At("HEAD"), cancellable = true)
    private void overridePosition(CallbackInfoReturnable<Vec3> cir) {
        if (CustomCamera.getToggle())
            cir.setReturnValue(CustomCamera.getPosition());
    }
    @Inject(method = "getXRot", at = @At("HEAD"), cancellable = true)
    private void overrideXRotation(CallbackInfoReturnable<Float> cir) {
        if (CustomCamera.getToggle())
            cir.setReturnValue(CustomCamera.getPitch());
    }
    @Inject(method = "getYRot", at = @At("HEAD"), cancellable = true)
    private void overrideYRotation(CallbackInfoReturnable<Float> cir) {
        if (CustomCamera.getToggle())
            cir.setReturnValue(CustomCamera.getYaw());
    }
}