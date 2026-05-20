package net.mcreator.fnafmod.procedures;

import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.client.Minecraft;

public class HasToyMovementToggleLookProcedure {
	public static boolean execute() {
		return (Minecraft.getInstance().hitResult instanceof EntityHitResult _entityHitResult ? _entityHitResult.getEntity() : (Entity) null).getPersistentData().getBoolean("hasToyMovementToggle");
	}
}
