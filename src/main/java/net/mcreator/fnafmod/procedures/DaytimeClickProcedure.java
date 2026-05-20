package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class DaytimeClickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity, ItemStack itemstack) {
		if (entity == null || sourceentity == null)
			return;
		MatPickupProcedure.execute(world, x, y, z, entity, itemstack);
		MatRotateProcedure.execute(entity, itemstack);
		if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("fnaf_mod:has_toy_movement")))) {
			MatToyGUIProcedure.execute(world, x, y, z, entity, sourceentity, itemstack);
		}
	}
}
