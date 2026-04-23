package net.mcreator.fnafmod.procedures;

import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class SetCoreDataProcedure {
	public static void execute(Entity old, Entity target, boolean forceAI, boolean noAI) {
		if (old == null || target == null)
			return;
		target.getPersistentData().putBoolean("got_coords", true);
		target.getPersistentData().putDouble("x", (old.getPersistentData().getDouble("x")));
		target.getPersistentData().putDouble("y", (old.getPersistentData().getDouble("y")));
		target.getPersistentData().putDouble("z", (old.getPersistentData().getDouble("z")));
		target.getPersistentData().putDouble("fnafmod-skin", (old.getPersistentData().getDouble("fnafmod-skin")));
		{
			Entity _ent = target;
			_ent.setYRot((float) old.getPersistentData().getDouble("yaw"));
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
		if (!(old.getType().getDescription().getString()).equals(old.getDisplayName().getString())) {
			target.setCustomName(Component.literal((old.getDisplayName().getString())));
		}
		if (forceAI) {
			if (target instanceof Mob _mobSetNoAi) {
				_mobSetNoAi.setNoAi(noAI);
			}
		} else {
			if (target instanceof Mob _mobSetNoAi) {
				_mobSetNoAi.setNoAi(true);
			}
		}
	}
}
