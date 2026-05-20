package net.mcreator.fnafmod.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.fnafmod.init.FnafModModItems;

public class MatRotateProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (FnafModModItems.MAT.get() == itemstack.getItem()) {
			if (("rotate_clock").equals(itemstack.getOrCreateTag().getString("mode"))) {
				if (("y").equals(itemstack.getOrCreateTag().getString("settings"))) {
					entity.getPersistentData().putDouble("yaw", (entity.getYRot() + 22.5));
					{
						Entity _ent = entity;
						_ent.setYRot((float) (entity.getYRot() + 22.5));
						_ent.setXRot(0);
						_ent.setYBodyRot(_ent.getYRot());
						_ent.setYHeadRot(_ent.getYRot());
						_ent.yRotO = _ent.getYRot();
						_ent.xRotO = _ent.getXRot();
						if (_ent instanceof LivingEntity _entity) {
							_entity.yBodyRotO = _entity.getYRot();
							_entity.yHeadRotO = _entity.getYRot();
						}
					}
				}
			} else if (("rotate_counter_clock").equals(itemstack.getOrCreateTag().getString("mode"))) {
				if (("y").equals(itemstack.getOrCreateTag().getString("settings"))) {
					entity.getPersistentData().putDouble("yaw", (entity.getYRot() - 22.5));
					{
						Entity _ent = entity;
						_ent.setYRot((float) (entity.getYRot() - 22.5));
						_ent.setXRot(0);
						_ent.setYBodyRot(_ent.getYRot());
						_ent.setYHeadRot(_ent.getYRot());
						_ent.yRotO = _ent.getYRot();
						_ent.xRotO = _ent.getXRot();
						if (_ent instanceof LivingEntity _entity) {
							_entity.yBodyRotO = _entity.getYRot();
							_entity.yHeadRotO = _entity.getYRot();
						}
					}
				}
			}
		}
	}
}
